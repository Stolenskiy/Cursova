package ua.nic.Cursova.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "lieutenant", schema = "cursova", catalog = "")
public class LieutenantEntity {
    private long id;
    private long personId;
    private Date graduationDateOfTheLieutenantAcademy;
    private Date dateOfTheLieutenantsTitle;

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
    @Column(name = "graduation_date_of_the_Lieutenant_Academy", nullable = true)
    public Date getGraduationDateOfTheLieutenantAcademy () {
        return graduationDateOfTheLieutenantAcademy;
    }

    public void setGraduationDateOfTheLieutenantAcademy (Date graduationDateOfTheLieutenantAcademy) {
        this.graduationDateOfTheLieutenantAcademy = graduationDateOfTheLieutenantAcademy;
    }

    @Basic
    @Column(name = "date_of_the_Lieutenants_title", nullable = false)
    public Date getDateOfTheLieutenantsTitle () {
        return dateOfTheLieutenantsTitle;
    }

    public void setDateOfTheLieutenantsTitle (Date dateOfTheLieutenantsTitle) {
        this.dateOfTheLieutenantsTitle = dateOfTheLieutenantsTitle;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LieutenantEntity that = (LieutenantEntity) o;

        if (id != that.id) return false;
        if (personId != that.personId) return false;
        if (graduationDateOfTheLieutenantAcademy != null ? !graduationDateOfTheLieutenantAcademy.equals(that.graduationDateOfTheLieutenantAcademy) : that.graduationDateOfTheLieutenantAcademy != null)
            return false;
        if (dateOfTheLieutenantsTitle != null ? !dateOfTheLieutenantsTitle.equals(that.dateOfTheLieutenantsTitle) : that.dateOfTheLieutenantsTitle != null)
            return false;

        return true;
    }

    @Override
    public int hashCode () {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (personId ^ (personId >>> 32));
        result = 31 * result + (graduationDateOfTheLieutenantAcademy != null ? graduationDateOfTheLieutenantAcademy.hashCode() : 0);
        result = 31 * result + (dateOfTheLieutenantsTitle != null ? dateOfTheLieutenantsTitle.hashCode() : 0);
        return result;
    }
}
