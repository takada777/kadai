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
//int kosu=Integer.parseInt(request.getParameterValues("kosu"));
//System.out.println(kosu);
int kazu=Integer.parseInt(request.getParameterValues("kosu"));
 %>
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
    <%for (int i = 0 ; i < kazu.length ; i++){ %>
    <td><%=mBean.getKazu(kazu[i])%></td>
    <% } %>












  </tr>


<%
	//System.out.println(pBean.getHokenmei());
  }
%>




</table>
</body>
</html>