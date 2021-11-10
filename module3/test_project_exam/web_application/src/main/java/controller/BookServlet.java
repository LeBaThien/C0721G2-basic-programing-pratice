package controller;

import bean.Book;
import bean.BookCard;
import bean.Student;
import repository.impl.BookRepository;
import utils.CheckValidate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", urlPatterns = "/productServlet")
public class BookServlet extends HttpServlet {
    private BookRepository bookRepository = new BookRepository();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                create(request, response);
                break;
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
//            case "delete":
//                showDelete(request, response);
//                break;
//            case "findCustomer":
//                findProduct(request, response);
//                break;
//            case "delete":
//                delete(request, response);
//                break;
            default:
                showList(request, response);
                break;

        }
    }

    public void showList(HttpServletRequest request, HttpServletResponse response) {
        List<Book> bookList = bookRepository.showList();
        request.setAttribute("bookList", bookList);
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
        List<Book> bookList ;
        bookList = bookRepository.showList();
        request.setAttribute("bookList", bookList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("create.jsp");
        try {
            dispatcher.forward(request, response);
        } catch (ServletException | IOException e) {
            e.printStackTrace();
        }
    }

    public void create(HttpServletRequest request, HttpServletResponse response){

        String nameError = null;
        String idError = null;
        String dateError = null;
        boolean flag = false;
        String id = request.getParameter("idBookCard");
        if(!CheckValidate.validateIdCard(id)){
            idError="Id is not right format";
            flag = true;
        }
        String status = request.getParameter("status");
        String nameStudent = request.getParameter("name");
        if(!CheckValidate.validateName(nameStudent)){
            nameError="Name is not right format";
            flag = true;
        }

        String startDate = request.getParameter("startDate");
        if(startDate.equals(java.time.LocalDate.now())){
            dateError="Date is not suite";
            flag=true;
        }
        String endDate = request.getParameter("endDate");
//        Integer bookCardId, Book book, Student student, String status, String startDate, String endDate

//        BookCard bookCard = new BookCard(id, new Book())

        try {
            if(flag) {
                request.setAttribute("nameError", nameError);
                request.setAttribute("idError", idError);
                request.setAttribute("dateError", dateError);
                RequestDispatcher dispatcher = request.getRequestDispatcher("create.jsp");
                dispatcher.forward(request, response);
            } else {
//                bookRepository.insert(bookCard);
                RequestDispatcher dispatcher = request.getRequestDispatcher("create.jsp");
//            request.setAttribute("message", "Da xoa");
                dispatcher.forward(request, response);
            }

        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

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
