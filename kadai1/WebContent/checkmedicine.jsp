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
<%
HttpSession session2 =request.getSession();
String kosu5=request.getParameter("kosu5");
String kosu6=request.getParameter("kosu6");
String kosu7=request.getParameter("kosu7");
System.out.println(kosu5);
//int kazu=Integer.parseInt(request.getParameterValues("kosu"));
 %>
<jsp:useBean id="maBean" class="kadai1.MedicineArrayBean" scope="session"/>

<table border="1">
<tr><th>薬剤ID</th><th>薬剤名</th><th>単位</th><th>個数</th></tr>
<%
int i=0;
String kazu[] = request.getParameterValues("kosu");
ArrayList<MedicineBean> ma=maBean.getMediArray();

for(MedicineBean mBean : ma){

	%>

 <tr>
    <td><%= mBean.getMedicineid()%></td>
    <td><%= mBean.getMedicinename() %></td>
    <td><%= mBean.getUnit()%></td>
    <td>
		<%mBean.getKazu();
		//System.out.println(mBean.getKosu2());




	} %></td>















  </tr>







</table>
</body>
</html>