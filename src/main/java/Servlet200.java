import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

@WebServlet( name= "HelloServlet",
        urlPatterns = {"/zoom"},
        loadOnStartup = 1)

public class Servlet200 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //request.getCookies();


        // установить в хедере что возр странаца
        // возврат 302 404 200
        // возврат обыч страниц

        response.setStatus(200);
        response.setContentType("text/html");

        String htmlPage = "";

        String name = request.getParameter("name");
        String age = request.getParameter("age");

        if (name == null || age == null){
            htmlPage = "<h2>Could not get name and age</h2>";
        }
        else{
            htmlPage = "<h2>Name: " + name + " Age: " + age + "</h2>";
        }

        response.getWriter().println(htmlPage);

        response.getWriter().println("<br/> \t<a href=\"http://localhost:8081/ServletGradle/main\">Go to main page</a>\n");

        //response.addHeader("Set-Coockie", "my_cookie=123");
    }
}
