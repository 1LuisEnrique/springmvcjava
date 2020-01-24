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
	<s:form action="registrarAlumno.html" method="POST" commandName="command">
               <table>
                    <tr>
                         <td>Nombre:</td>
                         <td><s:input path="nombre" value=""/></td>
                    </tr>
                    <tr>
                         <td>A. Paterno:</td>
                         <td><s:input path="apPaterno"/></td>
                    </tr>
                    <tr>
                         <td>A. Materno:</td>
                         <td><s:input path="apMaterno"/></td>
                    </tr>
                    <tr>
                         <td>Edad:</td>
                         <td><s:input path="edad" value=""/></td>
                    </tr>
                    <tr>
                         <td>Carrera:</td>
                         <td><s:input path="Carrera"/></td>
                    </tr>
                    	
                         <td colspan="2"><input type="submit" value="Guardar" /></td> 
                   
               </table>
          </s:form>
</body>
</html>