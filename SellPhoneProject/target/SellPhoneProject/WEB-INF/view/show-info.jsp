<%--
  Created by IntelliJ IDEA.
  User: HoangHuy
  Date: 4/23/2019
  Time: 9:05 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Info </title>
</head>
<body>
<div class="container">
    <nav aria-label="breadcrumb">
        <ol class="breadcrumb">
            <li class="breadcrumb-item"><a href="#">Home</a></li>
            <li class="breadcrumb-item"><a href="#">Hãng</a></li>
            <li class="breadcrumb-item active" aria-current="page">Tên điện thoại</li>
        </ol>
    </nav>

    <h3 class="title"><span>Tên điện thoại</span> <span class="share-button"><i class="fas fa-share"></i></span></h3>
    <div class="row show-info">

        <div class="col-sm-4">
            <div class="img-thumbnail main-img"><img
                    src="https://cellphones.com.vn/media/catalog/product/cache/7/thumbnail/9df78eab33525d08d6e5fb8d27136e95/s/9/s9plus-purple_1.jpg"
                    width="100%" height="100%">
            </div>

            <!-- Slide -->
            <div id="carouselExampleControls" class="carousel slide mt-4" data-ride="carousel">
                <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img class="d-block w-100"
                             src="https://cellphones.com.vn/media/catalog/product/cache/7/thumbnail/115x/9df78eab33525d08d6e5fb8d27136e95/s/9/s9plus-blue.jpg"
                             alt="First slide">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100"
                             src="https://cellphones.com.vn/media/catalog/product/cache/7/thumbnail/115x/9df78eab33525d08d6e5fb8d27136e95/s/9/s9plus-black-back.png"
                             alt="Second slide">
                    </div>
                    <div class="carousel-item">
                        <img class="d-block w-100"
                             src="https://cellphones.com.vn/media/catalog/product/cache/7/thumbnail/115x/9df78eab33525d08d6e5fb8d27136e95/s/m/sm-g965n_002_back_burgundy_red_1.jpg"
                             alt="Third slide">
                    </div>
                </div>
                <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
                    <span class="fas fa-chevron-left next-prev" aria-hidden="true"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next " href="#carouselExampleControls" role="button" data-slide="next">
                    <span class="fas fa-chevron-right next-prev" aria-hidden="true"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
        </div>

        <div class="col-sm-4">
            <h6>
                <label>Giá: </label> <span class="price"> 100đ</span> <br>
                <label>Giá niêm yết:</label><span class="discount"> 200đ </span>
            </h6>
            <label>Mô tả: </label><span> Description</span>
            <button class="btn btn-outline-primary buynow">Mua ngay</button>
        </div>

        <div class="col-sm-4">
            <table class="table table-hover ">
                <tr class="table-dark">
                    <th scope="col">Thông số kỹ thuật</th>
                </tr>
                <tr>
                    <td scope="row">RAM:</td>
                </tr>
                <tr>
                    <td scope="row">Bộ nhớ trong:</td>
                </tr>
                <tr>
                    <td scope="row">Chip:</td>
                </tr>
                <tr>
                    <td scope="row">Camera:</td>
                </tr>
            </table>
        </div>
    </div>
    <div class="row show-info">
        <div class="col-sm-8">
            <h4>Điện thoại Samsung Galaxy S9 Plus 64GB - Smartphone thiết kế sang trọng và nhiều nâng cấp vượt trội</h4>
            <p class="info-main">Điện thoại Samsung Galaxy S9 Plus 64GB - Smartphone thiết kế sang trọng và nhiều nâng
                cấp vượt trội
                Sam Fan đã được diện kiến Samsung Galaxy S9 Plus vào tháng 2/2018 và gây ấn tượng mạnh mẽ. Thiết kế lẫn
                hiệu năng của S9 Plus đã chứng tỏ đây xứng đáng là một trong những smartphone siêu phẩm trên thế giới.

                Thiết kế màn hình tràn viền hiện đại và tinh tế
                Samsung trang bị cho Galaxy S9 Plus màn hình vô cực đúng với xu hướng smartphone hiện nay, tỉ lệ 18:5:9
                kích thước 6.2 inch - tương đương với S8. Cùng với đó là tấm nền Super AMOLED đặc trưng của Samsung kèm
                độ phân giải QuadHD+ và công nghệ HDR 10, tổng thể cho người dùng trải nghiệm thị giác rất thú vị kể cả
                xem phim hay chơi các game đồ họa với chất ảnh rực rỡ, hình ảnh sắc nét, độ tương phản có chiều sâu.</p>

        </div>
    </div>
</div>
</body>
</html>
