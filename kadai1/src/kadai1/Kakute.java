package kadai1;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.Dao1;

/**
 * Servlet implementation class Kakute
 */
@WebServlet("/Kakute")
public class Kakute extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Kakute() {
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
		Dao1 dao1=new Dao1();
		HttpSession session=request.getSession();
		MedicineArrayBean maBean=(MedicineArrayBean)session.getAttribute("maBean");
	//	MedicineBean mBean=(MedicineBean)session.getAttribute("mBean");

	//	String medicinename=mBean.getMedicinename();
		//String unit=mBean.getUnit();
		//String medicineid=(String)session.getAttribute("medicineid");
		String kosu[]=request.getParameterValues("kosu");
		ArrayList<MedicineBean> ma=maBean.getMediArray();

		int i=0;
		for(MedicineBean mBean2 : ma){
	//	String medicinename=mBean2.getMedicinename();
	//	String unit=mBean2.getUnit();




		System.out.println(mBean2.getMedicinename());

		dao1.SyochiRegister(patid, patlname, patfname, mBean2.getMedicinename(), mBean2.getUnit(), kosu[i]);
		i++;


		}
		dao1.close();
		getServletContext().getRequestDispatcher("/kakutei.jsp").forward(request, response);



	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
