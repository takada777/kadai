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
HttpSession httpSession=request.getSession();
String empfname555=(String)session.getAttribute("empfname555");
if(empfname555!=null){



%>
<jsp:useBean id="paBean" class="kadai1.PatArrayBean" scope="session"/>

<table border="1">
<tr><th>患者ID</th><th>苗字</th><th>名前</th><th>保険証名記号番号</th><th>有効期限</th><th></th></tr>
<%
ArrayList<PatBean> pa=paBean.getPatArray();

for(PatBean pBean : pa){

	%>

 <tr>
    <td><%= pBean.getPatid() %></td>
    <td><%= pBean.getPatlname() %></td>
    <td><%= pBean.getPatfname()%></td>
    <td><%= pBean.getHokenmei() %></td>
    <td><%= pBean.getHokenexp() %></td>

    <td><form action="UpdateHokenServlet.jsp" method="post"><input type="submit" value="編集">


    	<input type="hidden" name="hokenmei" value="<%=pBean.getHokenmei()%>">
    	<input type="hidden" name="hokenexp" value="<%=pBean.getHokenexp()%>">
    	<input type="hidden" name="patid" value="<%=pBean.getPatid()%>">
    	 </form>
    </td>








  </tr>


<%
	//System.out.println(pBean.getHokenmei());
  }
%>

</table>
<form action="UketsukeMain.jsp" method="post">
<input type="submit" value="メニューに戻る">
</form>
<% }else{ %>
			<p>ログインしてください</p>
			<input type="button" value="ログイン画面へ"
			onclick="location.href='Select.html'" />
			<%} %>
</body>
</html>