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
 * Servlet implementation class Test21
 */
@WebServlet("/Test21")
public class Test21 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test21() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String medicineid=request.getParameter("medicineid");
		String kosu1 ;
	//	int kosu2;
		int kosu3;
		String kosu4;

		Dao1 dao1=new Dao1();


		HttpSession session = request.getSession();
		//MedicineBean mBean=dao1.outputMedicine3(medicineid, kosu1);


		MedicineArrayBean maBean = (MedicineArrayBean)session.getAttribute("maBean");
		String kosu[]=request.getParameterValues("kosu");
		String kosu2[]=request.getParameterValues("kosu2");
			ArrayList<MedicineBean> mArrayList=new ArrayList<MedicineBean>();

			int i=0;
		 kosu1=kosu[0];
		//	kosu2=Integer.parseInt(kosu[1]);
		//	kosu3=Integer.parseInt(kosu[2]);

			session.setAttribute("kosu1",kosu1);
			session.setAttribute("kosu",kosu);
			session.setAttribute("kosu2",kosu2);
			MedicineBean mBean = (MedicineBean)session.getAttribute("mBean");
		//	mBean.setL3i




	//	maBean.addMediArray(mBean);
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
