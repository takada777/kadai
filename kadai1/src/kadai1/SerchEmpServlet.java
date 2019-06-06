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
 * Servlet implementation class SerchEmpServlet
 */
@WebServlet("/SerchEmpServlet")
public class SerchEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public SerchEmpServlet() {
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

		Dao1 dao=new Dao1();
		EmpBean eBean;
		eBean=dao.SerchEmp(empid);
		if (eBean!=null){



		HttpSession httpSession=request.getSession();
		httpSession.setAttribute("empid", empid);
		httpSession.setAttribute("eBean", eBean);

		getServletContext().getRequestDispatcher("/UpDate.jsp").forward(request, response);
		dao.close();
		}else{
			getServletContext().getRequestDispatcher("/SerchEmpFailed.jsp").forward(request, response);
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
