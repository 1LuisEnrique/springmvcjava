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
	<s:form action="eliminaAlumno.html" method="POST" commandName="command">
               <table>
                    <tr>
                    <h3><a href="index.jsp">index</a></h3>
                         <td>Ingresa ID del alumno a eliminar:</td>
                         <td><s:input path="id" value=""/></td>
                    </tr>
                    	
                     <td colspan="2"><input type="submit" value="  Eliminar Alumno" /></td> 
                   
               </table>
          </s:form>
</body>
</html>