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

<jsp:useBean id="maBean" class="kadai1.MedicineArrayBean" scope="session"/>
 <form action="Checkmedicine" method="post">
<table border="1">
<tr><th>薬剤ID</th><th>薬剤名</th><th>単位</th><th>個数</th></tr>
<%
ArrayList<MedicineBean> ma=maBean.getMediArray();

for(MedicineBean mBean : ma){

	%>

 <tr>
    <td><%= mBean.getMedicineid()%></td>
    <td><%= mBean.getMedicinename() %></td>
    <td><%= mBean.getUnit()%></td>

	<th><select name="kosu">
				<option value="0">-</option>
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
				<option value="6">6</option>
				<option value="7">7</option>
				<option value="8">8</option>
				<option value="9">9</option>
			</select>
			</th>

  </tr>





<%
HttpSession httpSession=request.getSession();
session. setAttribute("mBean", mBean);

} %>

</table>



		<input type="submit" value="投与">
<% for(MedicineBean mBean : ma){%>
	<input type="hidden" name="medicineid" value="<%=mBean.getMedicineid()%>">


<%
}%>

    	 </form>


<form action="IshiMain.jsp" method="post">
<input type="submit" value="メニューに戻る">
</form>
</body>
</html>