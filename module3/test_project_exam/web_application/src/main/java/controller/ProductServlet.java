package controller;

import bean.Product;
import repository.impl.ProductRepository;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/productServlet")
public class ProductServlet extends HttpServlet {
    private ProductRepository productRepository = new ProductRepository();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
//            case "create":
//                create(request, response);
//                break;
//            case "edit":
//                update(request, response);
//                break;

//            case "findCustomer":
//                findCustomer(request, response);
//                break;
            default:
                showList(request, response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreate(request, response);
                break;
            case "edit":
                showUpdate(request, response);
                break;
            case "delete":
                showDelete(request, response);
                break;
            case "findCustomer":
                findProduct(request, response);
                break;
            case "delete":
                delete(request, response);
                break;
            default:
                showList(request, response);
                break;

        }
    }

    public void showList(HttpServletRequest request, HttpServletResponse response) {
        List<Product> productsList = productRepository.showList();
        request.setAttribute("productList", productsList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void showCreate(HttpServletRequest request, HttpServletResponse response){

    }

    public void showUpdate(HttpServletRequest request, HttpServletResponse response){

    }

    public void showDelete(HttpServletRequest request, HttpServletResponse response){

    }

    public void findProduct(HttpServletRequest request, HttpServletResponse response){

    }

    public void delete(HttpServletRequest request, HttpServletResponse response){

    }
}
