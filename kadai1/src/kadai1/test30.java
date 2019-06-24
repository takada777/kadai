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
 * Servlet implementation class test30
 */
@WebServlet("/test30")
public class test30 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public test30() {
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
	//	MedicineBean mBean=(MedicineBean)session.getAttribute("mBean");
		MedicineArrayBean maBean=(MedicineArrayBean)session.getAttribute("maBean");
		ArrayList<MedicineBean> list =new ArrayList<MedicineBean>();
		String[] qu=request.getParameterValues("kosu");
		int i=0;
		ArrayList<MedicineBean> ma=maBean.getMediArray();

		for(MedicineBean mBean : ma){


		while(i<qu.length){

		mBean.setQu(qu[i]);

		i++;
	//	System.out.println(mBean.getQu());
		}list.add(mBean);
	//	maBean.addMediArray(mBean);
	//	session.setAttribute("mBean", mBean);
		}
		getServletContext().getRequestDispatcher("/test30.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
