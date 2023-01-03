# FromZerotoExpert

## Implement a minimal web page

Create a web service and enter the address *http://localhost:8080/FromZerotoExpert* into the browser and the page will show *Hi, Welcome to FromZerotoExpert.*

Steps:
- Create a web project and import Servlet dependencies in *pom.xml* file.
- Create a Servlet class and extend HttpServlet implementation class. Then override doGet and doPost methods.(Principle: Get the request method and execute different doXXX methods according to the different request methods.)
- Configure the access path of the Servlet. (Use *@WebServlet* annotation)

Tips:
- Servlet is created by the web server. 
- Servlet method is called by the web server.
- Our custom servlet must implement the Servlet interface and override its methods, and the Servlet interface has the *service()* method.