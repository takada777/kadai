package kadai1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TabyouinRegisterServlet
 */
@WebServlet("/TabyouinRegisterServlet")
public class TabyouinRegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public TabyouinRegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String tabyouinid=request.getParameter("tabyouinid");
		String tabyouinmei=request.getParameter("tabyouinmei");
		String tabyouinaddress=request.getParameter("tabyouinaddress");
		String tabyouintel=request.getParameter("tabyouintel");
		int tabyouinshihonkin=Integer.parseInt(request.getParameter("tabyouinshihonkin"));
		int kyukyu=Integer.parseInt(request.getParameter("kyukyu"));




		HttpSession session=request.getSession();
		session.setAttribute("tabyouinid", tabyouinid);
		session.setAttribute("tabyouinmei", tabyouinmei);
		session.setAttribute("tabyouinaddress", tabyouinaddress);
		session.setAttribute("tabyouintel", tabyouintel);
		session.setAttribute("tabyouinshihonkin",tabyouinshihonkin);
		session.setAttribute("kyukyu", kyukyu);


		getServletContext().getRequestDispatcher("/Tabyouinconfirm.jsp").forward(request, response);

		}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
