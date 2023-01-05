import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/")
public class Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();

        Cookie[] cookies = request.getCookies();
        for(Cookie cookie : cookies){
            String name = cookie.getName();
            String value = cookie.getValue();
            if(name.equals("oldUser") && value.equals("visited")){
                writer.println("Hi, Welcome to FromZerotoExpert Again!");
            }
        }
        writer.println("Hi, Welcome to FromZerotoExpert.");

        Cookie visited = new Cookie("oldUser", "visited");
        visited.setMaxAge(60*60*24);
        response.addCookie(visited);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }
}
