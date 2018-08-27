<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>list</title>
</head>
<body>
<form method="POST" action="upgrade.html" >
<table cellspacing=1 width=650 border=1>
<tr><td>번호</td><td><input type=text name="id" value="${users.get().getId()}" readonly></td></tr>
<tr><td>이름</td><td><input type=input name="name" value="${users.get().getName()}"></td></tr>
<tr><td>주소</td><td><input type=input name="addr" value="${users.get().getAddr()}"></td></tr>
<tr><td>이메일</td><td><input type=input name="email" value="${users.get().getEmail()}"></td></tr>


<!-- <tr><td>전화번호</td></tr> -->


<%-- <c:forEach var="user" items="${users}" varStatus="status1">  --%>


<%-- <c:forEach var="phone" items="${users.get().getPhoneList()}" varStatus="status2">  --%> 


<tr>
<!-- <td>전화번호
</td> -->
<%-- <td>
<input type=hidden name="pid" value="${phone.id}">
<input type=input name="number" value="${phone.number}">
</td> --%>

<%-- </tr>
</c:forEach>  --%>


</table>

<input type=submit value="수정">
</form>

<input type="reset" value="뒤로" onClick="history.back()">


</body>
</html>