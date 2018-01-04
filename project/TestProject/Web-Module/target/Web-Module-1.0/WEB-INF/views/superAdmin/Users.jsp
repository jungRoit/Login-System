<%@include file="/WEB-INF/assets/includes/header.jsp" %>
<div>
<h1>Hello Super Admin!</h1>

<button class="btn btn-info pull-right" onclick="submitForm()">Logout</button><br>
<form id="logoutForm" method="post" action="${SITE_URL}/j_spring_security_logout">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>

</div>

<div class="col-md-1">
     <a href="${SITE_URL}/superAdmin" class="btn btn-warning pull-left">Back</a>
</div>
<div class="col-md-10">
    <a href="${SITE_URL}/superAdmin/user/add" class="btn btn-primary pull-left">Add</a>
     <a href="${SITE_URL}/superAdmin/assign" class="btn btn-primary ">Assign Users</a>
    
<table class="table table-bordered">
    <tr class="bg-success">
        <th>ID</th>
        <th>First Name</th>
        <th>Last name</th>
        <th>Email</th>
        <th>Contact No</th>
        <th>Username</th>
        <th>Password</th>
        <th>Role</th>
        <th>Added Date</th>
        <th>Created By</th>
        <th>Status</th>
        <th>Action</th>
    </tr>
    <c:forEach var="user" items="${user}">
            <tr>
                <td>${user.getUserId()}</td>
                <td>${user.getFirstName()}</td>
                <td>${user.getLastName()}</td>
                <td>${user.getEmail()}</td>
                <td>${user.getContactNo()}</td>
                <td>${user.getUsername()}</td>
                <td>${user.getPassword()}</td>
                <td>${user.getRole()}</td>
                <td>${user.getAddedDate()}</td>
                <td>${user.getCreatedBy()}</td>
                <td>${user.getStatus()}</td>
                <td>
                    <a class="btn btn-warning btn-xs" href="${SITE_URL}/superAdmin/user/edit/${user.userId}">Edit</a>
                    <a class="btn btn-danger btn-xs" href="${SITE_URL}/superAdmin/user/delete/${user.userId}"> Delete</a>
                </td>
            </tr>
    </c:forEach>


</table>
</div>
<div class="col-md-1"></div>


<script>
    function submitForm() {
        document.getElementById('logoutForm').submit();
    }
</script>

<%@include file="/WEB-INF/assets/includes/footer.jsp" %>
