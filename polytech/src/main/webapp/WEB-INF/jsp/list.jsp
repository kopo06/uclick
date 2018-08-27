<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">

<script>
        document.getElementByName("check").value
        document.getElementByName("keyword").text
</script>

<title>list</title>
</head>
<body>

<h2>사용자검색</h2>

<table cellspacing=1 width=800 border=1>
<form method="post" name="fm" action="search.html">
<tr>
<td>
<select name="check">
              <option value="checkname">이름</option>
              <option value="checkphone">전화번호</option>
</select>

사용자검색
</td>
<td><input type=text name="keyword"></td>
</tr>

</table>
<td><input type=submit value="찾기"></td>
</form>
<br><br><br><br>

<table cellspacing=1 width=800 border=1>
<tr>
<td>구분</td>
<td>이름</td>
<td>주소</td>
<td>이메일</td>
<td>(대표)전화번호</td>
<td>상세정보</td>
</tr>

<c:forEach var="user" items="${users}" varStatus="status1">
<tr>
<td>
<form method="post" name="fm" action="delete.html?id=${user.id}">
<input type=submit value="삭제">
</form>
</td>

<td>${user.name}</td>
<td>${user.addr}</td>
<td>${user.email}</td>

<td>${user.phoneList[0].number}</td>

<td>
<form method="post" name="fm" action="view.html?id=${user.id}">
<input type=submit value="상세정보">
</form>
</td>
</tr>
 </c:forEach> 

<form method="POST" action="newForm.html" >
<input type=submit name=id value="신규">
</form>

</table>
</body>
</html>