<%@include file="/WEB-INF/assets/includes/header.jsp" %>

<div>
    

    <button class="btn btn-primary pull-right" onclick="submitForm()">Logout</button><br>
    <form id="logoutForm" method="post" action="${SITE_URL}/j_spring_security_logout">
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
    </form>

</div>

<div class="col-md-1">
    <div>
        <a href="${SITE_URL}/superAdmin" class="btn btn-warning pull-left">Back</a>
    </div>
</div>
<div class="col-md-10">

    <form method="post" action="${SITE_URL}/superAdmin/update" class="form" id="user">
        <div class="form-group">
            <label>First Name</label>
            <input type="text" name="firstName" class="form-control" required="required" value="${user.firstName}"/>
        </div>
        <div class="form-group">
            <label>Last Name</label>
            <input type="text" name="lastName" class="form-control" required="required" value="${user.lastName}"/>
        </div>
        <div class="form-group">
            <label>Email</label>
            <input type="email" name="email" class="form-control" required="required" value="${user.email}"/>
        </div>
        <div class="form-group">
            <label>Contact No</label>
            <input type="text" name="contactNo" class="form-control" required="required" value="${user.contactNo}"/>
        </div>
        <div class="form-group">
            <label>Username</label>
            <input type="text" name="username" class="form-control" required="required" value="${user.username}"/>
        </div>
        <div class="form-group">
            <label>password</label>
            <input type="password" name="password" class="form-control" required="required" value="${user.password}"/>
        </div>
        <div class="form-group">
            <label>Role</label>
            <select class="form-control" name="role" required="required" value="${user.role}">
                <option>ROLE_ADMIN</option>
            </select>
        </div>
        <div class="form-group">
            <label>Created By</label>
            <input type="text" name="createdBy" class="form-control" required="required" value="${user.createdBy}"/>
        </div>
        <div class="form-group">
            <label>Status</label>
            <input type="text" name="status" class="form-control" required="required" value="${user.status}"/>
        </div>
        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
        <input type="hidden" name="adminId" value="${user.adminId}"/>
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
