<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<% String newhokenmei = request.getParameter("newhokenmei");
 String newhokenexp = request.getParameter("newhokenexp");
String hokenmei = request.getParameter("hokenmei");
String hokenexp = request.getParameter("hokenexp");
String patid = request.getParameter("patid");
//String empid = request.getParameter("empid");
%>
<TABLE >
<TR>
<TD ALIGN="LEFT">変更前
<TD ALIGN="CEnter">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<TD ALIGN="RIGHT">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;変更後
</TABLE>

 <TABLE>
<TR>
<TD ALIGN="CENTER"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;保険証記号番号
<TD ALIGN="RIGHT">
</TABLE>

<TABLE>
<TR>
<TD ALIGN="LEFT"><%=hokenmei%>
<TD ALIGN="CENTER">&nbsp;&nbsp;&nbsp;→
<TD ALIGN="RIGHT">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <%=newhokenmei %>
</TABLE>

<TABLE>
<TR>
<TD ALIGN="CENTER"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;有効期限
<TD ALIGN="RIGHT">
</TABLE>



<TABLE>
<TR>
<TD ALIGN="LEFT"><%=hokenexp %>
<TD ALIGN="CENTER">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;→
<TD ALIGN="RIGHT">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <%=newhokenexp %>
</TABLE>
<form action="Updateconfirm.jsp" method="post">
<input type="submit" value="戻る">
</form>
<form action="UpdateHokenServlet" method="post">
<input type="submit" value="送信">
<input type="hidden" name="hokenmei" value="<%=hokenmei%>">
<input type="hidden" name="newhokenmei" value="<%= newhokenmei%>">
<input type="hidden" name="hokenexp" value="<%= hokenexp%>">
<input type="hidden" name="newhokenexp" value="<%= newhokenexp%>">
<input type="hidden" name="patid" value="<%= patid%>">

</form>
</body>
</html>