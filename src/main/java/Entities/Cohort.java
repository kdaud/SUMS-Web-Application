/**
 * This file was generated by the JPA Modeler
 */
package Entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 * @author a
 */
@Entity
public class Cohort implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Basic
    private String Title;

    @Basic
    @Temporal(javax.persistence.TemporalType.DATE)
    private  Date RegisterStart;

    @Basic
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date RegisterStop;

    @Basic
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date ProjectStart;

    @Basic
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date ProjectStop;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return this.Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public Date getRegisterStart() {
        return RegisterStart;
    }

    public void setRegisterStart(Date RegisterStart) {
        this.RegisterStart = RegisterStart;
    }

    public Date getRegisterStop() {
        return RegisterStop;
    }

    public void setRegisterStop(Date RegisterStop) {
        this.RegisterStop = RegisterStop;
    }

    public Date getProjectStart() {
        return ProjectStart;
    }

    public void setProjectStart(Date ProjectStart) {
        this.ProjectStart = ProjectStart;
    }

    public Date getProjectStop() {
        return ProjectStop;
    }

    public void setProjectStop(Date ProjectStop) {
        this.ProjectStop = ProjectStop;
    }

   

}
