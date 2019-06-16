package kadai1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Dao1;

/**
 * Servlet implementation class UpdateHokenServlet
 */
@WebServlet("/UpdateHokenServlet")
public class UpdateHokenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateHokenServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String hokenmei = request.getParameter("newhokenmei");
		 String hokenexp = request.getParameter("newhokenexp");
		//String hokenmei = request.getParameter("hokenmei");
		//String hokenexp = request.getParameter("hokenexp");
		String patid = request.getParameter("patid");
		Dao1 dao1=new Dao1();
		dao1.hokenUpdate(hokenmei, hokenexp, patid);
		getServletContext().getRequestDispatcher("/test6.jsp").forward(request, response);
		dao1.close();}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
