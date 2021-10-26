import java.io.IOException;

@javax.servlet.annotation.WebServlet(name = "ServletPriceDiscountCalculator", urlPatterns = "/calculator")
public class ServletPriceDiscountCalculator extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        double listPrice = Double.parseDouble(request.getParameter("listPrice"));
        double discountPercent = Double.parseDouble(request.getParameter("discountPercent"));

        double discountAmount = listPrice * discountPercent;
        double discountPrice = listPrice - discountAmount;

        request.setAttribute("resultDiscountAmount",discountAmount);
        request.setAttribute("resultDiscountPrice",discountPrice);
        request.getRequestDispatcher("result_final.jsp").forward(request,response);


//Discount Amount: Lượng chiết khấu
//Discount Price: Giá sau khi đã được chiết khấu
//    Discount Amount = List Price * Discount Percent * 0.01
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
