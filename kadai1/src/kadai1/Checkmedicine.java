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
 * Servlet implementation class Checkmedicine
 */
@WebServlet("/Checkmedicine")
public class Checkmedicine extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Checkmedicine() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		int kosu=Integer.parseInt(request.getParameter("kosu"));

		String medicineid=request.getParameter("medicineid");

		Dao1 dao1=new Dao1();
		MedicineArrayBean maBean=dao1.outputMedicine2(medicineid, kosu);
		HttpSession session=request.getSession();
		session. setAttribute("maBean", maBean);
		getServletContext().getRequestDispatcher("/checkmedicine.jsp").forward(request, response);
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
