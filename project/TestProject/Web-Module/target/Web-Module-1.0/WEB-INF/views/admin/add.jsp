<%@include file="/WEB-INF/assets/includes/header.jsp" %>
<div>
    

    <button class="btn btn-primary pull-right" onclick="submitForm()">Logout</button><br>
    <form id="logoutForm" method="post" action="${SITE_URL}/j_spring_security_logout">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </form>

</div>

<div class="col-md-1">
    <div>
        <a href="${SITE_URL}/admin" class="btn btn-warning pull-left">Back</a>
    </div>
</div>
<div class="col-md-10">

    <form method="post" action="${SITE_URL}/admin/save" class="form">
        <div class="form-group">
            <label>First Name</label>
            <input type="text" name="firstName" class="form-control" required="required"/>
        </div>
        <div class="form-group">
            <label>Last Name</label>
            <input type="text" name="lastName" class="form-control" required="required"/>
        </div>
        <div class="form-group">
            <label>Email</label>
            <input type="email" name="email" class="form-control" required="required"/>
        </div>
        <div class="form-group">
            <label>Contact No</label>
            <input type="text" name="contactNo" class="form-control" required="required"/>
        </div>
        <div class="form-group">
            <label>Username</label>
            <input type="text" name="username" class="form-control" required="required"/>
        </div>
        <div class="form-group">
            <label>password</label>
            <input type="password" name="password" class="form-control" required="required"/>
        </div>
        <div class="form-group">
            <label>Role</label>
            <select class="form-control" name="role" required="required">
                <option>ROLE_USER</option>
            </select>
        </div>
        <div class="form-group">
            <label>Created By</label>
            <input type="text" name="createdBy" class="form-control" required="required"/>
        </div>
        <div class="form-group">
            <label>Status</label>
            <input type="text" name="status" class="form-control" required="required"/>
        </div>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>

            <button type="submit" class="btn btn-success">Save</button>
            <button type="reset" class="btn btn-danger">Clear</button>

    </form>

</div>
<div class="col-md-1"></div>


<script>
    function submitForm() {
        document.getElementById('logoutForm').submit();
    }
</script>

<%@include file="/WEB-INF/assets/includes/footer.jsp" %>
