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
 * Servlet implementation class TabyouinQueryServlet
 */
@WebServlet("/TabyouinQueryServlet")
public class TabyouinQueryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public TabyouinQueryServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String tabyouinaddress=request.getParameter("tabyouinaddress");
		Dao1 dao1=new Dao1();
		TabyouinArrayBean TABean=dao1.serchtabyouin(tabyouinaddress);

		HttpSession session=request.getSession();
		session. setAttribute("TABean", TABean);
		session.setAttribute("tabyouinaddress", tabyouinaddress);
		getServletContext().getRequestDispatcher("/TabyouinRetrieval.jsp").forward(request, response);

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