package kadai1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Dao1;

/**
 * Servlet implementation class EmpLoginServlet
 */
@WebServlet("/EmpLoginServlet")
public class EmpLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmpBean eBean=new EmpBean();
		String empid=request.getParameter("empid");
		String emppasswd=request.getParameter("emppasswd");
		Dao1 dao=new Dao1();
		if (dao.Emplogin(empid, emppasswd)) {

			eBean.getEmprole();
			System.out.println(eBean.emprole);
			ToSHA2 sha2=new ToSHA2();
			sha2.getDigest(emppasswd);



			HttpSession session=request.getSession();
		session.setAttribute("empid", empid);

		session.setAttribute("emppasswd", emppasswd);

		getServletContext().getRequestDispatcher("/test2.html").forward(request, response);
		dao.close();}
		else{
			getServletContext().getRequestDispatcher("/AdminFailed.jsp").forward(request, response);
			dao.close();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
