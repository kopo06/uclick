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
<form method="post" name="fm" action="save.html" onSubmit="checkForm();return false">
<table cellspacing=1 width=700 border=1>
<tr>
<td width=100>번호</td>
<td> <input type=text name=id value="신규" style="border:none" readonly></td>
</tr>
<tr>
<td width=100>이름</td>
<td><input type=text name=name value="" style="width:600" maxlength="70" required></td>
</tr>
<tr>
<td width=100>주소</td>
<td> <input type=text name=addr value="" style="border:none"></td>
</tr>

<tr>
<td width=100 >이메일</td>
<td><input type=text name=email value="" style="border:none"></td>
</tr>

<tr>
<td width=100>전화번호</td>
<td><input type=text name=number value="" style="border:none"></td>
</tr>

</table>
<table cellspacing=1 width=700 border=0>
<tr>
<td height=10px;><p align=right><input type=button value=취소 width=600 OnClick=location.href="list.html">  
<input type=submit value=쓰기 width=600></p></td>
</tr>   


</form>
</table>
</body>
</html>