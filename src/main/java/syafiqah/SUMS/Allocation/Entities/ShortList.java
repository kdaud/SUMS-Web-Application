/**
 * This file was generated by the JPA Modeler
 */
package syafiqah.SUMS.Allocation.Entities;

import Entities.FinalProject;
import Entities.Staff;
import Entities.Student;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;

/**
 * @author a
 */
@Entity
@NamedQueries({
    @NamedQuery(name="ShortList.getRankedShortlist", query="Select s FROM ShortList s Join s.student std WHERE s.rank = :shortListRank and s.isProject = TRUE and std.id = :stdID"),
    @NamedQuery(name="ShortList.getRankedShortlistSv", query="Select s FROM ShortList s Join s.student std WHERE s.rank = :shortListRank and s.isSupervisor = TRUE and std.id = :stdID"),
    @NamedQuery(name="ShortList.sortByRank", query="Select s FROM ShortList s Join s.student std Where std.id = :stdID and s.isProject = TRUE Order By s.rank"),
    @NamedQuery(name="ShortList.sortSvByRank", query="Select s FROM ShortList s Join s.student std Where std.id = :stdID and s.isSupervisor = TRUE Order By s.rank"),
    @NamedQuery(name="ShortlList.checkExistingProject", query="Select s FROM ShortList s Where s.student.id = :stdID and s.finalProject.id = :fpID"),
    @NamedQuery(name="ShortList.getProjectSize", query="SELECT s FROM ShortList s JOIN s.student std WHERE std.id = :stdID AND s.isProject = TRUE"),
    @NamedQuery(name="ShortList.getSupervisorSize", query="SELECT s FROM ShortList s JOIN s.student std WHERE std.id = :stdID AND s.isSupervisor = TRUE"),
    @NamedQuery(name="ShortList.checkExistingSv", query="SELECT s FROM ShortList s WHERE s.student.id = :stdID and s.supervisor.id = :svID"),
    @NamedQuery(name="Student.getByProjectID", query="SELECT s FROM Student s JOIN s.shortLists sl WHERE sl.finalProject.id = :fpID")
})
public class ShortList implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(targetEntity = FinalProject.class)
    private FinalProject finalProject;
    
    @OneToOne(targetEntity = Student.class)
    private Student student;
    
    @OneToOne(targetEntity = Staff.class)
    private Staff supervisor;
    
    @Basic
    private Boolean isProject;
    
    @Basic
    private Boolean isSupervisor;
    
    @Basic
    private int rank;

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public FinalProject getFinalProject() {
        return this.finalProject;
    }

    public void setFinalProject(FinalProject finalProject) {
        this.finalProject = finalProject;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Staff getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Staff supervisor) {
        this.supervisor = supervisor;
    }

    public Boolean getIsProject() {
        return isProject;
    }

    public void setIsProject(Boolean isProject) {
        this.isProject = isProject;
    }

    public Boolean getIsSupervisor() {
        return isSupervisor;
    }

    public void setIsSupervisor(Boolean isSupervisor) {
        this.isSupervisor = isSupervisor;
    }

}
