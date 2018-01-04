package com.roit.demoApp.coreModule.entity;

import com.roit.demoApp.coreModule.entity.AssignedAdmins;
import com.roit.demoApp.coreModule.entity.AssignedTo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-04T18:17:36")
@StaticMetamodel(Admins.class)
public class Admins_ { 

    public static volatile SingularAttribute<Admins, String> lastName;
    public static volatile SingularAttribute<Admins, String> role;
    public static volatile SingularAttribute<Admins, Date> addedDate;
    public static volatile SingularAttribute<Admins, AssignedAdmins> assignedAdmins;
    public static volatile SingularAttribute<Admins, String> firstName;
    public static volatile SingularAttribute<Admins, String> password;
    public static volatile SingularAttribute<Admins, String> createdBy;
    public static volatile ListAttribute<Admins, AssignedTo> assignedToList;
    public static volatile SingularAttribute<Admins, Integer> adminId;
    public static volatile SingularAttribute<Admins, Date> modifiedDate;
    public static volatile SingularAttribute<Admins, String> email;
    public static volatile SingularAttribute<Admins, String> contactNo;
    public static volatile SingularAttribute<Admins, String> username;
    public static volatile SingularAttribute<Admins, Boolean> status;

}