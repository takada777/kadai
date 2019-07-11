<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="kadai1.*"%>
     <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="saBean" class="kadai1.SyochiArrayBean" scope="session"/>
 <form action="Test21" method="post">
<table border="1">
<tr><th>患者ID</th><th>苗字</th><th>名前</th><th>薬名</th><th>単位</th><th>個数</th></tr>
<%
String empfname111=(String)session.getAttribute("empfname111");
if(empfname111!=null){
ArrayList<SyochiBean> sa=saBean.getsyochiArray();

for(SyochiBean sBean : sa){

	%>

 <tr>

   <td><%= sBean.getPatid()%></td>
    <td><%= sBean.getPatlname()%></td>
    <td><%= sBean.getPatfname()%></td>
     <td><%= sBean.getMedicinename()%></td>
    <td><%= sBean.getUnit()%></td>
    <td><%= sBean.getKosu()%></td>



  </tr>





<%


} %>

</table>





    	 </form>



<form action="IshiMain.jsp" method="post">
<input type="submit" value="メニューに戻る">
</form>
<% }else{ %>
			<p>ログインしてください</p>
			<input type="button" value="ログイン画面へ"
			onclick="location.href='Select.html'" />
			<%} %>
</body>
</html>