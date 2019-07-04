import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

@WebServlet( name= "main",
        urlPatterns = {"/main"},
        loadOnStartup = 1)

public class ServletMain extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setStatus(200);
        response.setContentType("text/html");

        String htmlPage = "";
        Scanner in = new Scanner(new File("/Users/zzoomm/Desktop/Git/Java/ServletGradle/pages/main.html"));
        while(in.hasNext())
            htmlPage += in.nextLine() + "\r\n";
        in.close();

        response.getWriter().println(htmlPage);
    }
}
