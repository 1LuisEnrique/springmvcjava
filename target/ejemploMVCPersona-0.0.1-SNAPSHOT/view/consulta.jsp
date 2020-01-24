<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
     <head>
          <title>Consulta Persona</title>
          <link rel="stylesheet" href="css/bootstrap.min.css">
    	  <link rel="stylesheet" href="css/all.min.css">
     </head>
     <body>
     <h2>Consulta Persona</h2>
     <h3><a href="index.jsp">index</a></h3>
         <table>
              <tr>
                   <th>Id</th>
                   <th>Nombre</th>
                   <th>A. Paterno</th>
                   <th>A. Materno</th>
                   <th>Edad</th>
                   <th>Telefono</th>
              </tr>
         <c:forEach items="${model.listaPersonas}" var="p">
              <tr>
                   <td><c:out value="${p.idPersona}" /></td>
                   <td><c:out value="${p.nombre}" /></td>
                   <td><c:out value="${p.apPaterno}" /></td>
                   <td><c:out value="${p.apMaterno}" /></td>
                   <td><c:out value="${p.edad}" /></td>
                   <td><c:out value="${p.telefono}" /></td>
              </tr>
         </c:forEach>
         </table>
         
     </body>
</html>