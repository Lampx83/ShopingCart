import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/product")
public class ProductServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public ProductServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList products = new ArrayList();
        products.add(new Product("1", "Samsung S9", "https://www.viettablet.com/image/cache/data/dien-thoai-samsung/galaxy-s9/samsung-galaxy-s9-chinh-hang-64gb-128x128.jpg", 525));
        products.add(new Product("2", "Iphone X", "https://www.viettablet.com/image/cache/data/0-hinh-moi/iphone-x-cu-128x128.png", 725));
        request.setAttribute("products", products);
        request.getRequestDispatcher("product.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

}