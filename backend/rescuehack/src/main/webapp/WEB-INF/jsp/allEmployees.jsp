<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<h1>persons page</h1>

<ul>
    <c:forEach items="${persons}" var="person">
        <li>${person}</li>
    </c:forEach>
</ul>