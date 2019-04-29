package ua.nic.Cursova.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "major", schema = "cursova", catalog = "")
public class MajorEntity {
    private long id;
    private long personId;
    private Date graduationDateOfTheMajorAcademy;
    private Date dateOfTheMajorsTitle;

    @Id
    @Column(name = "id", nullable = false)
    public long getId () {
        return id;
    }

    public void setId (long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "person_id", nullable = false)
    public long getPersonId () {
        return personId;
    }

    public void setPersonId (long personId) {
        this.personId = personId;
    }

    @Basic
    @Column(name = "graduation_date_of_the_Major_Academy", nullable = true)
    public Date getGraduationDateOfTheMajorAcademy () {
        return graduationDateOfTheMajorAcademy;
    }

    public void setGraduationDateOfTheMajorAcademy (Date graduationDateOfTheMajorAcademy) {
        this.graduationDateOfTheMajorAcademy = graduationDateOfTheMajorAcademy;
    }

    @Basic
    @Column(name = "date_of_the_Majors_title", nullable = false)
    public Date getDateOfTheMajorsTitle () {
        return dateOfTheMajorsTitle;
    }

    public void setDateOfTheMajorsTitle (Date dateOfTheMajorsTitle) {
        this.dateOfTheMajorsTitle = dateOfTheMajorsTitle;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MajorEntity that = (MajorEntity) o;

        if (id != that.id) return false;
        if (personId != that.personId) return false;
        if (graduationDateOfTheMajorAcademy != null ? !graduationDateOfTheMajorAcademy.equals(that.graduationDateOfTheMajorAcademy) : that.graduationDateOfTheMajorAcademy != null)
            return false;
        if (dateOfTheMajorsTitle != null ? !dateOfTheMajorsTitle.equals(that.dateOfTheMajorsTitle) : that.dateOfTheMajorsTitle != null)
            return false;

        return true;
    }

    @Override
    public int hashCode () {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (personId ^ (personId >>> 32));
        result = 31 * result + (graduationDateOfTheMajorAcademy != null ? graduationDateOfTheMajorAcademy.hashCode() : 0);
        result = 31 * result + (dateOfTheMajorsTitle != null ? dateOfTheMajorsTitle.hashCode() : 0);
        return result;
    }
}
