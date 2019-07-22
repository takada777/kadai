<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="eBean" class="kadai1.EmpBean" scope="session"/>
<% String newemppasswd = request.getParameter("newemppasswd");
 String emppasswd = request.getParameter("emppasswd");
 String newemppasswd2 = request.getParameter("newemppasswd2");
 HttpSession session2=request.getSession();
// String empfname111=(String)session.getAttribute("empfname111");
 String empfname555=(String)session.getAttribute("empfname555");
 if(empfname555!=null){
if(!newemppasswd.equals(newemppasswd2)){%>

<p>パスワードが一致していません</p>
<form action="ChangeEmpPass.jsp" method="post">
<input type="submit" value="戻る">
</form>
<%}else if(newemppasswd==""||newemppasswd2==""){ %>
<p>バスワードを入力してください</p>
<input type="button" value="戻る"
			onclick="location.href='ChangeEmpPass.jsp'" />
<%}else{ %>
<p>パスワードを変更しますか？</p>
<form action="ChangeEmpPass.jsp" method="post">
<input type="submit" value="戻る">
</form>
<form action="ChangeEmppass2" method="post">
<input type="hidden" name="newemppasswd" value="<%= newemppasswd%>">
<input type="hidden" name="empid" value="<%= eBean.getEmpid()%>">
<input type="submit" value="変更する">
<% } %>
<% }else{ %>
			<p>ログインしてください</p>
			<input type="button" value="ログイン画面へ"
			onclick="location.href='Select.html'" />
			<%} %>
</form>
</body>
</html>