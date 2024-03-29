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
 * Servlet implementation class OutputMedicine
 */
@WebServlet("/OutputMedicine")
public class OutputMedicine extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public OutputMedicine() {
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
		String patlname=request.getParameter("patlname");
		String patfname=request.getParameter("patfname");
		Dao1 dao1=new Dao1();
		MedicineArrayBean maBean=dao1.outputMedicine();

		HttpSession session=request.getSession();
		session. setAttribute("maBean", maBean);
		session. setAttribute("patid", patid);
		session. setAttribute("patlname", patlname);
		session. setAttribute("patfname", patfname);
		System.out.println(patfname);
		//session.setAttribute("patname", patname);

			getServletContext().getRequestDispatcher("/outputmedicine.jsp").forward(request, response);
			dao1.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
