package com.roit.demoApp.coreModule.entity;

import com.roit.demoApp.coreModule.entity.Admins;
import com.roit.demoApp.coreModule.entity.SuperAdmins;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-04T18:17:36")
@StaticMetamodel(AssignedAdmins.class)
public class AssignedAdmins_ { 

    public static volatile SingularAttribute<AssignedAdmins, SuperAdmins> createdBy;
    public static volatile SingularAttribute<AssignedAdmins, Admins> adminId;
    public static volatile SingularAttribute<AssignedAdmins, Integer> assignedId;

}