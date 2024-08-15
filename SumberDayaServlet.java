import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/SumberDayaServlet"})
public class SumberDayaServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("<title>Sumber Daya Teknologi</title>");
            out.println("<style>");
            out.println("body { font-family: Arial, sans-serif; margin: 0; padding: 0; background-color: #f4f4f4; }");
            out.println("header { background-color: #333; color: #fff; padding: 10px 0; text-align: center; }");
            out.println("nav { background: #444; color: #fff; padding: 10px; text-align: center; }");
            out.println("nav a { color: #fff; margin: 0 15px; text-decoration: none; }");
            out.println("main { padding: 20px; }");
            out.println("footer { background-color: #333; color: #fff; text-align: center; padding: 10px; position: fixed; width: 100%; bottom: 0; }");
            out.println("h1 { color: #fff; }");
            out.println("h2 { color: #333; }");
            out.println(".content { background: #fff; padding: 20px; border-radius: 8px; box-shadow: 0 0 10px rgba(0, 0, 0, 0.1); }");
            out.println(".resource-item { margin-bottom: 15px; }");
            out.println(".resource-item h3 { margin: 0 0 5px; }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<header>");
            out.println("<h1>Sumber Daya Teknologi</h1>");
            out.println("</header>");
            out.println("<nav>");
            out.println("<a href=\"NewServlet\">Berita Terbaru</a>");
            out.println("<a href=\"ArtikelServlet\">Artikel</a>");
            out.println("<a href=\"SumberDayaServlet\">Sumber Daya</a>");
            out.println("</nav>");
            out.println("<main>");
            out.println("<div class=\"content\">");

            // Konten Sumber Daya
            out.println("<div class=\"resource-item\">");
            out.println("<h2>Tools dan Sumber Daya</h2>");
            out.println("<h3>Tool 1: IDE untuk Pengembangan Java</h3>");
            out.println("<p>Temukan beberapa IDE terbaik yang dapat digunakan untuk pengembangan aplikasi Java...</p>");
            out.println("</div>");
            out.println("<div class=\"resource-item\">");
            out.println("<h3>Tool 2: Framework Web Modern</h3>");
            out.println("<p>Pelajari framework web yang sedang tren saat ini, termasuk Spring Boot dan lainnya...</p>");
            out.println("</div>");
            out.println("<div class=\"resource-item\">");
            out.println("<h3>Tool 3: Perangkat Pembelajaran AI</h3>");
            out.println("<p>Eksplorasi berbagai perangkat dan pustaka yang dapat membantu dalam pembelajaran AI...</p>");
            out.println("</div>");

            out.println("</div>");
            out.println("</main>");
            out.println("<footer>");
            out.println("<p>&copy; 2024 Teknologi Informasi. All rights reserved.</p>");
            out.println("</footer>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Servlet providing technology resources";
    }
}
