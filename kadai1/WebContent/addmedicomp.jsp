<%@page import="dao.Dao1"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>完了</title>
</head>
<body>
<%String medicineid=request.getParameter("medicineid");
String medicinename=request.getParameter("medicinename");
String unit=request.getParameter("unit");
Dao1 dao=new Dao1();
if(dao.SerchMedicine(medicineid)){
%>
<p>入力されたIDは使用されています</p>
<input type="button" value="戻る"
			onclick="location.href='addmedicine.jsp'" />
<%
}else { %>
<p>登録完了しました</p>
<%

Dao1 dao2=new Dao1();
dao2.medicineRegister(medicineid, medicinename, unit);
dao2.close();

%>

<input type="button" value="続けて登録"
			onclick="location.href='addmedicine.jsp'" />
			<br>
			<input type="button" value="メニューへ"
			onclick="location.href='IshiMain.jsp'" />
			<% } %>
</body>
</html>