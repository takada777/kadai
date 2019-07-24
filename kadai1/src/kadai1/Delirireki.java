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
 * Servlet implementation class Delirireki
 */
@WebServlet("/Delirireki")
public class Delirireki extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delirireki() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Dao1 dao1=new Dao1();
		String patid=request.getParameter("patid");
		String patlname=request.getParameter("patlname");
		String patfname=request.getParameter("patfname");
		String medicinename=request.getParameter("medicinename");
		String unit=request.getParameter("unit");
		String kosu=request.getParameter("kosu");
	//	System.out.println(patid);
		String delete=request.getParameter("i");

		HttpSession session=request.getSession();
		SyochiArrayBean saBean =(SyochiArrayBean)session.getAttribute("saBean");
		saBean.delisyochiArray(delete);
	//	System.out.print(saBean.getArraysize());
		dao1.deleterireki(patid, patlname, patfname, medicinename, unit, kosu);
		dao1.close();
		//System.out.print(saBean.getArraysize());
		getServletContext().getRequestDispatcher("/outputsyochi.jsp").forward(request, response);

		//response.sendRedirect("outputsyochi.jsp") ;
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
