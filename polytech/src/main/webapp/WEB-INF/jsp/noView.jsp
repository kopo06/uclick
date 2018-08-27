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

<table cellspacing=1 width=650 border=1>
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
<tr><td><input type=submit value="찾기"></td></tr>
</form>
<br><br><br><br>




<h1>등록된 사용자가 없습니다</h1>








<table cellspacing=1 width=650 border=0>
<form method="POST" action="list.html" >
<td><p align="left"><input type=submit value="뒤로"></p></td>


</form>
</table>
</body>
</html>