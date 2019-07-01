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
 * Servlet implementation class AdominLoginServlet
 */
@WebServlet("/AdominLoginServlet")
public class AdominLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdominLoginServlet() {
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
		String emppasswd=request.getParameter("emppasswd");
		ToSHA2 sha2=new ToSHA2();
		emppasswd= sha2.getDigest(emppasswd);
		Dao1 dao=new Dao1();
		if (dao.Adminlogin(empid, emppasswd)) {


			HttpSession session=request.getSession();
		session.setAttribute("empid", empid);

		session.setAttribute("emppasswd", emppasswd);
		EmpBean eBean=dao.Adminlogin2(empid, emppasswd);

		session.setAttribute("eBean", eBean);


		getServletContext().getRequestDispatcher("/AdminMain.jsp").forward(request, response);
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
