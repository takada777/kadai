<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="dao.Dao1"%>
    <%@page import="kadai1.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>変更画面</title>

</head>
<body>
<jsp:useBean id="eBean" class="kadai1.EmpBean" scope="session"/>
<%  String empfname777= (String)session.getAttribute("empfname777");
if(empfname777!=null){%>
<% String newemppasswd = request.getParameter("newemppasswd");
 String emppasswd = request.getParameter("emppasswd");
 String newemppasswd2 = request.getParameter("newemppasswd2");
 System.out.println(newemppasswd);
 System.out.println(newemppasswd2);
 //System.out.println(eBean.getBeforepass());
if(!newemppasswd.equals(newemppasswd2)){%>

<p>パスワードが一致していません</p>
<form action="DisAdmin.jsp" method="post">
<input type="submit" value="戻る">
</form>
<%}else if(newemppasswd==""||newemppasswd2==""){ %>
<p>バスワードを入力してください</p>
<input type="button" value="戻る"
			onclick="location.href='UpdatePass.jsp'" />
<%}else{ %>
<p>パスワードを変更しますか？</p>







<form action="DisAdmin.jsp" method="post">
<input type="submit" value="戻る">
</form>
<form action="UpdatePassServlet2" method="post">
<input type="hidden" name="newemppasswd" value="<%= newemppasswd%>">
<input type="hidden" name="empid" value="<%= eBean.getEmpid()%>">
<input type="submit" value="変更する">
</form>
<% } %>
<%} else{ %>
			<p>ログインしてください</p>
			<input type="button" value="ログイン画面へ"
			onclick="location.href='Select.html'" />
			<% } %>
</body>
</html>