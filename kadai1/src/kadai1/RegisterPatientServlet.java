package kadai1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RegisterPatientServlet
 */
@WebServlet("/RegisterPatientServlet")
public class RegisterPatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterPatientServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String patid=request.getParameter("patid");
		String patfname=request.getParameter("patfname");
		String patlname=request.getParameter("patlname");
		String hokenmei=request.getParameter("hokenmei");
		String hokenexp=request.getParameter("hokenexp");





		HttpSession session=request.getSession();
		session.setAttribute("patid", patid);
		session.setAttribute("patfname", patfname);
		session.setAttribute("patlname", patlname);
		session.setAttribute("hokenmei", hokenmei);
		session.setAttribute("hokenexp", hokenexp);


		getServletContext().getRequestDispatcher("/kakunin.jsp").forward(request, response);

		}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
