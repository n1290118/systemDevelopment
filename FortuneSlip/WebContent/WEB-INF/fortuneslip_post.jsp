<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>おみくじ</title>
<style type="text/css">
	body{
		text-align: center;
		background-image: url(/image/foxbck.gif);
	}
	tr.fox{
		vertical-align: bottom;
	}
	div{
		text-align: right;
	}
	table{
		width: 70%;
  		margin: 0 auto;
	}
</style>
</head>
<body>
	<br><hr>
	<h1>< c:out value=" ${name} " />さんの今日の運勢</h1>
	<hr><br>
	<table>
		<tr>
			<th></th>
			<th>勉強運</th>
			<th>金銭運</th>
			<th>健康運</th>
			<th>異性運</th>
		</tr>
		<tr class="fox">
			<th><img src='/image/fox1.gif'></th>
			<c:forEach begin="0" end="3" var="i">
				<td><img src='<c:out value=" ${itemName[i]} " />'></td>
			</c:forEach>
			<th><img src='/image/fox2.gif'></th>
		</tr>
	</table>
	<hr><div>当たるも八卦当たらぬも八卦</div>
</body>
</html>
