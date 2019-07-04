import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

@WebServlet( name= "dota 3",
        urlPatterns = {"/dota3"},
        loadOnStartup = 1)

public class Servlet404 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //request.getCookies();

        response.setStatus(404);
        response.setContentType("text/html");

        String htmlPage = "";
        Scanner in = new Scanner(new File("/Users/zzoomm/Desktop/Git/Java/ServletGradle/pages/404.html"));
        while(in.hasNext())
            htmlPage += in.nextLine() + "\r\n";
        in.close();

        response.getWriter().println(htmlPage);

        //response.addHeader("Set-Coockie", "my_cookie=123");
    }
}
