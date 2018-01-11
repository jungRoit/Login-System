package com.roit.demoApp.coreModule.entity;

import com.roit.demoApp.coreModule.entity.Admins;
import com.roit.demoApp.coreModule.entity.Users;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-01-04T18:17:36")
@StaticMetamodel(AssignedTo.class)
public class AssignedTo_ { 

    public static volatile SingularAttribute<AssignedTo, Admins> createdBy;
    public static volatile SingularAttribute<AssignedTo, Users> userId;
    public static volatile SingularAttribute<AssignedTo, Integer> assignedId;

}