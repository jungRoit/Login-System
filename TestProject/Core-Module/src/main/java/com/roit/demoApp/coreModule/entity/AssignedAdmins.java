/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.roit.demoApp.coreModule.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author User
 */
@Entity
@Table(name = "tbl_assigned_admins")
@NamedQueries({
    @NamedQuery(name = "AssignedAdmins.findAll", query = "SELECT a FROM AssignedAdmins a")})
public class AssignedAdmins implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   
    @Column(name = "assigned_id")
    private Integer assignedId;
    @JoinColumn(name = "created_by", referencedColumnName = "username")
    @ManyToOne(optional = false)
    private SuperAdmins createdBy;
    @JoinColumn(name = "admin_id", referencedColumnName = "admin_id")
    @OneToOne(optional = false)
    private Admins adminId;

    public AssignedAdmins() {
    }

    public AssignedAdmins(Integer assignedId) {
        this.assignedId = assignedId;
    }

    public AssignedAdmins(Integer assignedId, SuperAdmins createdBy, Admins adminId) {
        this.assignedId = assignedId;
        this.createdBy = createdBy;
        this.adminId = adminId;
    }
    

    public Integer getAssignedId() {
        return assignedId;
    }

    public void setAssignedId(Integer assignedId) {
        this.assignedId = assignedId;
    }

    public SuperAdmins getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(SuperAdmins createdBy) {
        this.createdBy = createdBy;
    }

    public Admins getAdminId() {
        return adminId;
    }

    public void setAdminId(Admins adminId) {
        this.adminId = adminId;
    }

    
}
