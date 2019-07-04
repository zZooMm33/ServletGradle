import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

@WebServlet( name= "dota2",
        urlPatterns = {"/dota2"},
        loadOnStartup = 1)

public class Servlet302 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        //request.getCookies();

        response.setStatus(302);
        response.setHeader( "Location", "http://localhost:8081/ServletGradle/zoom" );
        response.setContentType("text/html");

        String htmlPage = "";
        Scanner in = new Scanner(new File("/Users/zzoomm/Desktop/Git/Java/ServletGradle/pages/302.html"));
        while(in.hasNext())
            htmlPage += in.nextLine() + "\r\n";
        in.close();

        response.getWriter().println(htmlPage);

        response.sendRedirect ( "http://localhost:8081/ServletGradle/zoom");
    }

}
