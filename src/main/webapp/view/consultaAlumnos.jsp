<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Alumnos Registrados</h2>
	<h3><a href="index.jsp">index</a></h3>
         <table>
              <tr>
                   <th>Id</th>
                   <th>Nombre</th>
                   <th>Ap. Paterno</th>
                   <th>Ap. Materno</th>
                   <th>Edad</th>
                   <th>Carrera</th>
                   <th>Pasatiempo Favorito</th>>
              </tr>
         <c:forEach items="${model.listaAlumnos}" var="p">
              <tr>
                   <td><c:out value="${p.id}" /></td>
                   <td><c:out value="${p.nombre}" /></td>
                   <td><c:out value="${p.apPaterno}" /></td>
                   <td><c:out value="${p.apMaterno}" /></td>
                   <td><c:out value="${p.edad}" /></td>
                   <td><c:out value="${p.carrera}" /></td>
                   <td><c:out value="${p.pasatiempo}" /></td>
              </tr>
         </c:forEach>
         </table>
</body>
</html>