package kadai1;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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
		HttpSession session=request.getSession();
		String medicineid=request.getParameter("medicineid");
		MedicineArrayBean maBean=new MedicineArrayBean();
		MedicineBean mBean=new MedicineBean();
		maBean= (MedicineArrayBean)session.getAttribute("maBean");
		mBean = (MedicineBean)session.getAttribute("mBean");


		int i=0;

		//String medicineid=request.getParameter("medicineid");
		String medicinename=request.getParameter("medicinename");
		String unit=request.getParameter("unit");

		ArrayList<MedicineBean > ma=new ArrayList<>();
		ArrayList<MedicineBean > ma2=new ArrayList<>();
		ma=maBean.getMediArray();
		String kazu[] = request.getParameterValues("kosu");


		while(i<maBean.getArraysize()){
			//System.out.println(kazu[i]);
			mBean.setKosu2(kazu);
			maBean.addMediArray(mBean);
			//
			i++;



		}
		System.out.println(mBean.getKosu2());
		//Dao1 dao1=new Dao1();
	//	MedicineArrayBean maBean=dao1.outputMedicine2(medicineid, kosu);
	//	HttpSession session=request.getSession();
	//	session. setAttribute("maBean", maBean);
	getServletContext().getRequestDispatcher("/checkmedicine.jsp").forward(request, response);
	//	dao1.close();



	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
