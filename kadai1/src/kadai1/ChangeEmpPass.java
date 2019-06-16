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
 * Servlet implementation class ChangeEmpPass
 */
@WebServlet("/ChangeEmpPass")
public class ChangeEmpPass extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangeEmpPass() {
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
		Dao1 dao1=new Dao1();
		EmpBean eBean= dao1.SerchEmp(empid);
		HttpSession httpSession=request.getSession();
		httpSession. setAttribute("eBean", eBean);
		httpSession. setAttribute("empid", empid);

		getServletContext().getRequestDispatcher("/ChangeEmpPass.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
