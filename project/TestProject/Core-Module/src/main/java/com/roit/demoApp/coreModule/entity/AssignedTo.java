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
@Table(name = "tbl_assigned_to")
@NamedQueries({
    @NamedQuery(name = "AssignedTo.findAll", query = "SELECT a FROM AssignedTo a")})
public class AssignedTo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "assigned_id")
    private Integer assignedId;
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    @OneToOne(optional = false)
    private Users userId;
    @JoinColumn(name = "created_by", referencedColumnName = "username")
    @ManyToOne(optional = false)
    private Admins createdBy;

    public AssignedTo() {
    }

    public AssignedTo(Integer assignedId) {
        this.assignedId = assignedId;
    }

    public AssignedTo(Integer assignedId, Users userId, Admins createdBy) {
        this.assignedId = assignedId;
        this.userId = userId;
        this.createdBy = createdBy;
    }
    

    public Integer getAssignedId() {
        return assignedId;
    }

    public void setAssignedId(Integer assignedId) {
        this.assignedId = assignedId;
    }

    public Users getUserId() {
        return userId;
    }

    public void setUserId(Users userId) {
        this.userId = userId;
    }

    public Admins getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Admins createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (assignedId != null ? assignedId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AssignedTo)) {
            return false;
        }
        AssignedTo other = (AssignedTo) object;
        if ((this.assignedId == null && other.assignedId != null) || (this.assignedId != null && !this.assignedId.equals(other.assignedId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.roit.demoApp.coreModule.dao.AssignedTo[ assignedId=" + assignedId + " ]";
    }
    
}
