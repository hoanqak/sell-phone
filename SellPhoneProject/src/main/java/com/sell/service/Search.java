package com.sell.service;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.sell.entity.Product;
import com.sell.hibernate.HibernateUI;
@Service
public class Search {
	int total = 12;
	public List<Product> getResultSearch(String keyword) {
		Session session = HibernateUI.getSessionFactory().openSession();
		Query query = session.createQuery("From Product as P Where P.name like '%" + keyword + "%'");
		@SuppressWarnings("unchecked")
		List<Product> list = query.getResultList();
		session.close();
		return list;

	}

	@SuppressWarnings("static-access")
	public String push(String keyword, Model model, int page) {
		Pagination pagination = new Pagination();
		List<Product> list = getResultSearch(keyword);
		if(list.size() == 0) {
			model.addAttribute("notResult", "Không có kết quả nào cho " + keyword);
			return "view/ResultSearch";
		}
		model.addAttribute("page", pagination.Page(list, 12));
		model.addAttribute("result", "Có " + getResultSearch(keyword).size() + " kết quả tìm kiếm cho " + keyword);
		model.addAttribute("listResult", pagination.pagination(total, page));
		return "view/ResultSearch";
	}

	public static void main(String[] args) {
		Search s = new Search();
		for (Product p : s.getResultSearch("Ipho")) {
			System.out.println(p.getName());
		}
	}
}
