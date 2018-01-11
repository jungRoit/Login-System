<%@page  import="com.roit.demoApp.coreModule.entity.Users" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
          
<%@include file="/WEB-INF/assets/includes/header.jsp" %>



<h1>
   Hi <c:out value="${user.firstName} ${user.lastName}" />
     <sec:authentication property="name" />!! You are our valued customer 
</h1>
 
        <button onclick="submitForm()">Logout</button>
        <form id="logoutForm" method="post" action="${SITE_URL}/j_spring_security_logout">
             <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        </form>
                
        <script>
          function submitForm(){
              document.getElementById('logoutForm').submit();
          }
        </script>
             
             
             
<%@include file="/WEB-INF/assets/includes/footer.jsp" %>