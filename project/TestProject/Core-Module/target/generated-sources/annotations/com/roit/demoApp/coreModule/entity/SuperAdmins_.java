package com.roit.demoApp.coreModule.entity;

import com.roit.demoApp.coreModule.entity.AssignedAdmins;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-04T18:17:36")
@StaticMetamodel(SuperAdmins.class)
public class SuperAdmins_ { 

    public static volatile SingularAttribute<SuperAdmins, String> lastName;
    public static volatile SingularAttribute<SuperAdmins, String> role;
    public static volatile SingularAttribute<SuperAdmins, Date> addedDate;
    public static volatile SingularAttribute<SuperAdmins, Integer> superAdminId;
    public static volatile SingularAttribute<SuperAdmins, String> firstName;
    public static volatile SingularAttribute<SuperAdmins, String> password;
    public static volatile SingularAttribute<SuperAdmins, String> createdBy;
    public static volatile SingularAttribute<SuperAdmins, Date> modifiedDate;
    public static volatile ListAttribute<SuperAdmins, AssignedAdmins> assignedAdminsList;
    public static volatile SingularAttribute<SuperAdmins, String> email;
    public static volatile SingularAttribute<SuperAdmins, String> contactNo;
    public static volatile SingularAttribute<SuperAdmins, String> username;
    public static volatile SingularAttribute<SuperAdmins, Boolean> status;

}