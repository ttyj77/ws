<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<%
	request.setCharacterEncoding("UTF-8");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>나라목록</title>
<style>
.cls1 {
	text-decoration: none;
}

.cls2 {
	text-align: center;
	font-size: 30px;
	display: block;
}
</style>
</head>
<body>

	<table align="center" border="1" width="80%">
		<thead>
			<tr height="10" align="center" bgcolor="lightgreen">
				<th>나라번호</th>
				<th>나라이름</th>
				<th>도시이름</th>
				
			</tr>
		</thead>
		<c:choose>
			<c:when test="${countryList == null}">
				<tbody>
					<tr height="10">
						<td colspan="4">
							<p align="center">
								<b><span style="font-size: 9pt;"> 등록된 글이 없습니다.</span></b>
							</p>
						</td>
					</tr>
				</tbody>
			</c:when>
			<c:otherwise>
			<tbody>
				<c:forEach var="country" items="${countryList}" varStatus="countryNum">
					<tr align="center">
					<td width="5%">${countryNum.count}</td>
					<td width="10%">${country.country}</td>
					<td align="left" width="35%">
						<span style="padding-right: 30px"></span>
						<a class="cls1" href="${countryList}/country">
						${country.city}
						</a>
					</td>

					</tr>
					
				</c:forEach>
			</tbody>
			</c:otherwise>
		</c:choose>
	</table>

</body>
</html>