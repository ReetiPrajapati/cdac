//package com.spring.implementation.model;
package com.example.swh_back.mentor_allotment;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Date;

@Entity
@Table(name = "mentor_reg")
public class MentorReg extends User{

    public MentorReg(User user) {
        super(user);
    }

    public MentorReg() {
    }

    private String college;

    private Boolean isAllotted;

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public Boolean getIsAllotted() {
        return isAllotted;
    }

    public void setIsAllotted(Boolean isAllotted) {
        this.isAllotted = isAllotted;
    }

}

