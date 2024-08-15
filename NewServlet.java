import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/NewServlet"})
public class NewServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"UTF-8\">");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("<title>Informasi Teknologi</title>");
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
            out.println(".section { margin-bottom: 20px; }");
            out.println(".news-item, .article-item { margin-bottom: 15px; }");
            out.println(".news-item h3, .article-item h3 { margin: 0 0 5px; }");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<header>");
            out.println("<h1>Informasi Teknologi</h1>");
            out.println("</header>");
            out.println("<nav>");
            out.println("<a href=\"NewServlet\">Berita Terbaru</a>");
            out.println("<a href=\"ArtikelServlet\">Artikel</a>");
            out.println("<a href=\"SumberDayaServlet\">Sumber Daya</a>");
            out.println("</nav>");
            out.println("<main>");
            out.println("<div class=\"content\">");

            // Section Berita Terbaru
            out.println("<div class=\"section\">");
            out.println("<h2>Berita Teknologi Terbaru</h2>");
            out.println("<div class=\"news-item\">");
            out.println("<h3>Berita 1: Inovasi Teknologi AI</h3>");
            out.println("<p>Teknologi AI terus berkembang dengan cepat, membawa inovasi baru di berbagai bidang...</p>");
            out.println("</div>");
            out.println("<div class=\"news-item\">");
            out.println("<h3>Berita 2: Perkembangan 5G di Dunia</h3>");
            out.println("<p>Jaringan 5G semakin meluas, memberikan kecepatan internet yang jauh lebih cepat dan lebih stabil...</p>");
            out.println("</div>");
            out.println("<div class=\"news-item\">");
            out.println("<h3>Berita 3: Keamanan Cyber di Era Digital</h3>");
            out.println("<p>Keamanan cyber menjadi perhatian utama dengan semakin meningkatnya ancaman digital...</p>");
            out.println("</div>");
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
        return "Servlet providing technology information";
    }
}
