package kadai1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			String empid=request.getParameter("empid");
			String empfname=request.getParameter("empfname");
			String emplname=request.getParameter("emplname");
			String emppasswd=request.getParameter("emppasswd");
			String emprole=request.getParameter("yakuwari");
			//String action=request.getParameter("action");
			//int emprole=Integer.parseInt(request.getParameter("emprole"));
			ToSHA2 sha2=new ToSHA2();
			sha2.getDigest(emppasswd);



			HttpSession session=request.getSession();
			session.setAttribute("empid", empid);
			session.setAttribute("empfname", empfname);
			session.setAttribute("emplname", emplname);
			session.setAttribute("emppasswd", emppasswd);
			session.setAttribute("emprole", emprole);
			//session.setAttribute("yakuwari", yakuwari);
			//EmpBean eBean=new EmpBean();
			//session.setAttribute("eBean", eBean);
			//System.out.print(eBean.emppasswd);

			getServletContext().getRequestDispatcher("/confirm.jsp").forward(request, response);

			}



	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
