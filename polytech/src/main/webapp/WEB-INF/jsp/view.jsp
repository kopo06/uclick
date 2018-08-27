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


<table cellspacing=1 width=800 border=1>
<tr>
<td>분류</td>
<td>내용</td>
<td>설정</td>
</tr>
<tr><td>번호</td><td>${users.get().getId()}</td>
<td rowspan="4">
<form method="POST" action="update.html?id=${users.get().getId()}" >
<input type=submit value="수정">
</form>
</td>

</tr>
<tr><td>이름</td><td>${users.get().getName()}</td></tr>
<tr><td>주소</td><td>${users.get().getAddr()}</td></tr>
<tr><td>이메일</td><td>${users.get().getEmail()}</td></tr>

<c:forEach var="phone" items="${users.get().getPhoneList()}" varStatus="status2">  



<tr><td>전화번호
<form method="post" name="fm" action="phonedelete.html?id=${phone.id}">

<input type=submit value="삭제">
<input type=hidden name="pid" value="${users.get().getId()}">
</form>

</td>


<td>${phone.number}</td>

<td>
<form method="POST" action="phoneupdate.html?id=${phone.id}" >
<input type=submit value="수정">
<input type=hidden name="pid" value="${users.get().getId()}">
</form>
</td>
</tr>
</c:forEach> 

</table>


<table cellspacing=1 width=800 border=1>
<tr>
<form method="POST" action="newphone.html?id=${users.get().getId()}" >
<td witch=400>전화번호 추가</td><td><input type=input name="number" value=""></td>

<td>
<input type=submit name=id value="전화번호추가"></td>

</tr>
</form>
</table>

<input type=button value=뒤로 width=600 OnClick=location.href="list.html"> 





</body>
</html>
