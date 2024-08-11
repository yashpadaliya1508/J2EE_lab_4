import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*; 

public class pro27 extends HttpServlet {
    public pro27(){super();}
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        if(username.equals(password) && username!=null && password != null){
            out.println("Hello"+username);
            HttpSession hs = req.getSession();
            hs.setAttribute("session", username);


        }else{
         res.sendRedirect("http://localhost:8080/");
        }
        public void doPost(HttpServletRequest req , HttpServletResponse res)
        throws IOException, ServletException{
            doGet(req , res);
        }
    }
}