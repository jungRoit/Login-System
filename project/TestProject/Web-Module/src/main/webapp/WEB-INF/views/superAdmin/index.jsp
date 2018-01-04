<%@include file="/WEB-INF/assets/includes/header.jsp" %>
<div>
<h1>Hello Super Admin!</h1>

<button class="btn btn-info pull-right" onclick="submitForm()">Logout</button><br>
<form id="logoutForm" method="post" action="${SITE_URL}/j_spring_security_logout">
    <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>

</div>

<div class="col-md-1"></div>
<div class="col-md-10">
    <a href="${SITE_URL}/superAdmin/add" class="btn btn-primary pull-left">Add</a>
     <a href="${SITE_URL}/superAdmin/assign" class="btn btn-primary ">Assign Users</a>
    
<table class="table table-bordered">
    <tr class="bg-success">
        <th>Views</th>
        <th>ID</th>
        <th>First Name</th>
        <th>Last name</th>
        <th>Email</th>
        <th>Contact No</th>
        <th>Username</th>
        <th>Password</th>
        <th>Role</th>
        <th>Added Date</th>
        <th>Modified Date</th>
        <th>Created By</th>
        <th>Action</th>
    </tr>
    <c:forEach var="user" items="${user}">
            <tr>
                <td>
                    <a href="${SITE_URL}/superAdmin/user/${user.adminId}" class="btn btn-success">View</a>
                </td>
                <td>${user.adminId}</td>
                <td>${user.firstName}</td>
                <td>${user.lastName}</td>
                <td>${user.email}</td>
                <td>${user.contactNo}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
                <td>${user.role}</td>
                <td>${user.addedDate}</td>
                <td>${user.createdBy}</td>
                <td>${user.status}</td>
                <td>
                    <a class="btn btn-warning btn-xs" href="${SITE_URL}/superAdmin/edit/${user.adminId}">Edit</a>
                    <a class="btn btn-danger btn-xs" href="${SITE_URL}/superAdmin/delete/${user.adminId}"> Delete</a>
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
