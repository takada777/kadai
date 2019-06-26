<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="java.util.ArrayList" %>
<%@ page import="kadai1.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>病院検索結果</title>
</head>
<%
HttpSession httpSession=request.getSession();

//String tabyouinaddress=(String)session.getAttribute("tabyouinaddress");
%>
<body>
<jsp:useBean id="taBean" class="kadai1.TabyouinArrayBean" scope="session"/>
<table border="1">
<tr><th>病院ID</th><th>病院名</th><th>住所</th><th>電話番号</th><th>資本金</th><th>救急</th></tr>
<%
ArrayList<TabyouinBean> TA=taBean.getTabyouinArray();
for(TabyouinBean TBean : TA){
	%>
 <tr>
    <td><%= TBean.getTabyouinid() %></td>
    <td><%= TBean.getTabyouinmei() %></td>
    <td><%= TBean.getTabyouinaddress()%></td>
    <td><%= TBean.getTabyouintel() %></td>
    <td><%= TBean.getTabyouinshihonkin() %></td>
    <td><%= TBean.getKyukyu() %></td>



  </tr>
<%
  }
%>
</table>

<form action="AdminMain.jsp" method="post">
<input type="submit" value="メニューへ">
</form>
</body>
</html>