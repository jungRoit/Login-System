<%@include file="/WEB-INF/assets/includes/header.jsp" %>

            <h1>Hello Login!</h1>
            <h2 style="color: red">${msg}</h2>
            <div class="col-md-2"></div>
            <div class="col-mg-8">
        <form method="post" action="${SITE_URL}/j_spring_security_check">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            Username
            <input type="text" name="username" required="required"/>
            Password
            <input type="password" name="password" required="required"/>
            <button type="submit">Login</button>
        </form>
            </div>
            <div class="col-md-2">
            </div>

<%@include file="/WEB-INF/assets/includes/footer.jsp" %>