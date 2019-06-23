<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import="kadai1.*"%>
     <%@ page import="java.util.ArrayList" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%
HttpSession httpSession=request.getSession();
String medicineid=(String)session.getAttribute("medicineid");

%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="maBean" class="kadai1.MedicineArrayBean" scope="session"/>
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
    <td><%= mBean.getKosu()%>
    <% } %>

  </tr>
</table>
<jsp:useBean id="maBean2" class="kadai1.MedicineArrayBean" scope="session"/>
<br>
<br>
<br>
<br>
<br>
<table border="1">
<tr><th>薬剤ID</th><th>薬剤名</th><th>単位</th><th>個数</th><th></th></tr>
<%
ArrayList<MedicineBean> ma2=maBean2.getMediArray();

for(MedicineBean mBean2 : ma2){

	%>

 <tr>
    <td><%= mBean2.getMedicineid()%></td>
    <td><%= mBean2.getMedicinename() %></td>
    <td><%= mBean2.getUnit()%></td>
 <form action="Test11" method="post">
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
<td><input type="submit" value="投与">
	<input type="hidden" name="medicineid" value="<%=mBean2.getMedicineid()%>">
	<input type="hidden" name="medicinename" value="<%=mBean2.getMedicinename()%>">
	<input type="hidden" name="unit" value="<%=mBean2.getUnit()%>"></td>
	</form>
  </tr>





<%


} %>

</table>
</body>
</html>