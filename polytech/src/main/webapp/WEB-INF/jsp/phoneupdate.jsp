<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>list</title>
<h1>전화번호 수정!</h1>

</head>
<body>
<form method="POST" action="upgrade1.html" >
<table cellspacing=1 width=650 border=1>


 <tr>
 <td>전화번호</td><td><input type=input name="number" value="${phone.get().number}"></td>
 </tr>

<%-- <c:forEach var="phone" items="${phone}" varStatus="status2">   --%>

<%-- </c:forEach>  --%>
<input type=hidden name="id" value="${phone.get().id}">
<input type=hidden name="pid" value="${pid}">
</table>

<input type=submit value="수정">
</form>


<input type="reset" value="뒤로" onClick="history.back()">

</body>
</html>