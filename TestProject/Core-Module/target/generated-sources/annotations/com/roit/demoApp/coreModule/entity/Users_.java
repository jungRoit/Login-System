package com.roit.demoApp.coreModule.entity;

import com.roit.demoApp.coreModule.entity.AssignedTo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-04T18:17:36")
@StaticMetamodel(Users.class)
public class Users_ { 

    public static volatile SingularAttribute<Users, String> lastName;
    public static volatile SingularAttribute<Users, String> role;
    public static volatile SingularAttribute<Users, Date> addedDate;
    public static volatile SingularAttribute<Users, Integer> userId;
    public static volatile SingularAttribute<Users, AssignedTo> assignedTo;
    public static volatile SingularAttribute<Users, String> firstName;
    public static volatile SingularAttribute<Users, String> password;
    public static volatile SingularAttribute<Users, String> createdBy;
    public static volatile SingularAttribute<Users, Date> modifiedDate;
    public static volatile SingularAttribute<Users, String> email;
    public static volatile SingularAttribute<Users, String> contactNo;
    public static volatile SingularAttribute<Users, String> username;
    public static volatile SingularAttribute<Users, Boolean> status;

}