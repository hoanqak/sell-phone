package com.sell.service;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import com.sell.entity.Product;
import com.sell.hibernate.HibernateUI;

public class Search {
	public List<Product> getResultSearch(String keyword) {
		Session session = HibernateUI.getSessionFactory().openSession();
		@SuppressWarnings("unchecked")
		Query query = session.createQuery("From Product as P Where P.name like '%" + keyword + "%'");
		List<Product> list = query.getResultList();
		session.close();
		return list;

	}

	public boolean check(List<Product> list) {
		if (list.size() == 0) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		Search s = new Search();
		for (Product p : s.getResultSearch("Ipho")) {
			System.out.println(p.getName());
		}
	}
}
