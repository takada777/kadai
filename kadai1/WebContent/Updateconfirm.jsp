<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>a</title>
</head>
<body>
<form action="ChangeName.jsp" method="post">
<jsp:useBean id="eBean" class="kadai1.EmpBean" scope="session"/>
<%  eBean.getEmpfname();
if(eBean.getEmpfname()!=null){%>
<% String emplname = request.getParameter("emplname");
 String empfname = request.getParameter("empfname");
 String empid = request.getParameter("empid");%>
<p>変更後の苗字または名前を入力してください</p>
苗字
<br>
<input type="text" name="newemplname" size="20">
<br>名前
<br><input type="text" name="newempfname" size="20">

<br>
<input type="submit" value="送信">
<input type="hidden" name="originemplname" value="<%= emplname%>">
<input type="hidden" name="originempfname" value="<%= empfname%>">
<input type="hidden" name="empid" value="<%=empid%>">
</form>
<form action="UpDate.jsp" method="post">
<input type="submit" value="戻る">
<%} else{ %>
			<p>ログインしてください</p>
			<input type="button" value="ログイン画面へ"
			onclick="location.href='Select.html'" />
			<% } %>
</form>
</body>
</html>