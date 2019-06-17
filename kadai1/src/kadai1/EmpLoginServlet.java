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
 * Servlet implementation class EmpLoginServlet
 */
@WebServlet("/EmpLoginServlet")
public class EmpLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpLoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//EmpBean eBean=new EmpBean();
		String empid=request.getParameter("empid");
		String emppasswd=request.getParameter("emppasswd");
		ToSHA2 sha2=new ToSHA2();
	emppasswd= sha2.getDigest(emppasswd);
		Dao1 dao=new Dao1();
	if (dao.Emplogin(empid, emppasswd)) {
		EmpBean eBean2=new EmpBean();


			//ToSHA2 sha2=new ToSHA2();
			sha2.getDigest(emppasswd);




			HttpSession session=request.getSession();
		session.setAttribute("empid", empid);

		session.setAttribute("emppasswd", emppasswd);
		eBean2=dao.Emplogin2(empid, emppasswd);
		int emprole= eBean2.getEmprole();

		if (emprole==2) {


		getServletContext().getRequestDispatcher("/UketsukeMain.jsp").forward(request, response);
		dao.close();
		}
		else if(emprole==3){
			getServletContext().getRequestDispatcher("/IshiMain.jsp").forward(request, response);
			dao.close();
			}
		else if(emprole==1){
			getServletContext().getRequestDispatcher("/AdminMain.jsp").forward(request, response);
			dao.close();

			}
		}
	else{
			getServletContext().getRequestDispatcher("/EmpFailed.jsp").forward(request, response);
			dao.close();
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
