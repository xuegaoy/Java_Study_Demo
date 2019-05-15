<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>
<html>
<body>
欢迎用户，${username}<br/>
以下是网站的功能：<br/>
<security:authorize access="hasAuthority('ROLE_ADD_PRODUCT')">
<a href="${pageContext.request.contextPath}/product/add">product add</a><br/>
</security:authorize>
<security:authorize access="hasAuthority('ROLE_UPDATE_PRODUCT')">
<a href="${pageContext.request.contextPath}/product/update">product update</a><br/>
</security:authorize>
<security:authorize access="hasAuthority('ROLE_LIST_PRODUCT')">
<a href="${pageContext.request.contextPath}/product/list">product list</a><br/>
</security:authorize>
<security:authorize access="hasAuthority('ROLE_DELETE_PRODUCT')">
<a href="${pageContext.request.contextPath}/product/delete">product delete</a><br/>
</security:authorize>
</body>
</html>
