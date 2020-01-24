<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
     <head>
          <title>Add Persona</title>
     </head>
     <body>
          <h2>Agregar Personas</h2>
          <h3><a href="index.jsp">index</a></h3>
          <f:form action="persona.html" method="POST" commandName="command">
               <table>
                    <tr>
                         <td>id_Persona:</td>
                         <td><f:input path="idPersona"/></td>
                    </tr>
                    <tr>
                         <td>Nombre:</td>
                         <td><f:input path="nombre" value=""/></td>
                    </tr>
                    <tr>
                         <td>A. Paterno:</td>
                         <td><f:input path="apPaterno"/></td>
                    </tr>
                    <tr>
                         <td>A. Materno:</td>
                         <td><f:input path="apMaterno"/></td>
                    </tr>
                    <tr>
                         <td>Edad:</td>
                         <td><f:input path="edad" value=""/></td>
                    </tr>
                    <tr>
                         <td>Telefono:</td>
                         <td><f:input path="telefono"/></td>
                    </tr>
                    <tr>
                         <td colspan="2"><input type="submit" value="Guardar" /></td> 
                    </tr>
               </table>
               
          </f:form>
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