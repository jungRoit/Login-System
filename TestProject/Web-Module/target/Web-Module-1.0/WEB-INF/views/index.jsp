<%@include file="/WEB-INF/assets/includes/header.jsp" %>
        <h1>Hello World!</h1>
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