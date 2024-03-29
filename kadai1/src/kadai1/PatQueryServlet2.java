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
 * Servlet implementation class PatQueryServlet2
 */
@WebServlet("/PatQueryServlet2")
public class PatQueryServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatQueryServlet2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String patname=request.getParameter("patname");

		Dao1 dao1=new Dao1();
		PatArrayBean paBean=dao1.serchpat(patname);

		HttpSession session=request.getSession();
		session. setAttribute("paBean", paBean);
		session.setAttribute("patname", patname);

		if(paBean.getArraysize()==0){
			getServletContext().getRequestDispatcher("/patfailed2.jsp").forward(request, response);

			dao1.close();

		}else{
			getServletContext().getRequestDispatcher("/PatRetrieval2.jsp").forward(request, response);

			dao1.close();
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
