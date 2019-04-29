package ua.nic.Cursova.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "pettyofficercolonel", schema = "cursova", catalog = "")
public class PettyofficercolonelEntity {
    private long id;
    private long personId;
    private Date graduationDateOfTheLieutenantColonelAcademy;
    private Date dateOfTheLieutenantColonelsTitle;

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
    @Column(name = "graduation_date_of_the_lieutenant_colonel_Academy", nullable = true)
    public Date getGraduationDateOfTheLieutenantColonelAcademy () {
        return graduationDateOfTheLieutenantColonelAcademy;
    }

    public void setGraduationDateOfTheLieutenantColonelAcademy (Date graduationDateOfTheLieutenantColonelAcademy) {
        this.graduationDateOfTheLieutenantColonelAcademy = graduationDateOfTheLieutenantColonelAcademy;
    }

    @Basic
    @Column(name = "date_of_the_lieutenant_colonels_title", nullable = false)
    public Date getDateOfTheLieutenantColonelsTitle () {
        return dateOfTheLieutenantColonelsTitle;
    }

    public void setDateOfTheLieutenantColonelsTitle (Date dateOfTheLieutenantColonelsTitle) {
        this.dateOfTheLieutenantColonelsTitle = dateOfTheLieutenantColonelsTitle;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PettyofficercolonelEntity that = (PettyofficercolonelEntity) o;

        if (id != that.id) return false;
        if (personId != that.personId) return false;
        if (graduationDateOfTheLieutenantColonelAcademy != null ? !graduationDateOfTheLieutenantColonelAcademy.equals(that.graduationDateOfTheLieutenantColonelAcademy) : that.graduationDateOfTheLieutenantColonelAcademy != null)
            return false;
        if (dateOfTheLieutenantColonelsTitle != null ? !dateOfTheLieutenantColonelsTitle.equals(that.dateOfTheLieutenantColonelsTitle) : that.dateOfTheLieutenantColonelsTitle != null)
            return false;

        return true;
    }

    @Override
    public int hashCode () {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (personId ^ (personId >>> 32));
        result = 31 * result + (graduationDateOfTheLieutenantColonelAcademy != null ? graduationDateOfTheLieutenantColonelAcademy.hashCode() : 0);
        result = 31 * result + (dateOfTheLieutenantColonelsTitle != null ? dateOfTheLieutenantColonelsTitle.hashCode() : 0);
        return result;
    }
}
