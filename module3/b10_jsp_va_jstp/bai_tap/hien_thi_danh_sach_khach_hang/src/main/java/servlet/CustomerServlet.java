package servlet;

import bean.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = {""})
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();

        customerList.add(new Customer (1,"Nguyen Van A","1998-03-03","Da Nang","https://img2.thuthuatphanmem.vn/uploads/2018/11/30/anh-dai-dien-anime-dep_104204759.jpg"));
        customerList.add(new Customer (2,"Mai Van Hoan","1983-08-20","Ha Noi","https://img2.thuthuatphanmem.vn/uploads/2018/12/12/anh-naruto-be-bong-dep_104804081.jpg"));
        customerList.add(new Customer (3,"Nguyen Thai Hoa","1983-06-05","Ho Chi Minh","https://genk.mediacdn.vn/2018/8/7/chibiborutouzumakibymarcinha20-d9zr2wg-15336116374061737469053.png"));
        customerList.add(new Customer (4,"Tran Dang Khoa","1998-12-13","Nha Trang","https://img.lovepik.com/original_origin_pic/18/12/03/c64ff9e080279eec14f6710d986f68f0.png_wh860.png"));
        customerList.add(new Customer (5,"Nguyen Van Nam","1998-08-26","Hue","https://mondaycareer.com/wp-content/uploads/2020/11/%E1%BA%A3nh-%C4%91%E1%BA%A1i-di%E1%BB%87n-%C4%91%E1%BA%B9p-g%C3%A1i-xinh-%C4%91eo-k%C3%ADnh.jpg"));
        customerList.add(new Customer (6,"Nguyen Dinh Thi","1998-09-23","Quang Nam","https://img.thuthuat123.com/uploads/2019/10/17/hinh-nen-gai-xinh-danh-cho-dien-thoai_110154619.jpg"));

        request.setAttribute("customerListServlet", customerList);
        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
