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
 * Servlet implementation class Test20
 */
@WebServlet("/Test20")
public class Test20 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test20() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String medicineid=request.getParameter("medicineid");
		int kosu=Integer.parseInt(request.getParameter("kosu"));
		Dao1 dao1=new Dao1();


		HttpSession session = request.getSession();
		MedicineBean mBean=dao1.outputMedicine3(medicineid, kosu);


		MedicineArrayBean maBean = (MedicineArrayBean)session.getAttribute("maBean");


		if (maBean == null) {
		    maBean = new MedicineArrayBean();
		    session.setAttribute("maBean", maBean);

		}
		maBean.addMediArray(mBean);
		session.setAttribute("maBean", maBean);



		getServletContext().getRequestDispatcher("/test20.jsp").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
