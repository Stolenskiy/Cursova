package ua.nic.Cursova.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "colonel", schema = "cursova", catalog = "")
public class ColonelEntity {
    private long id;
    private long personId;
    private Date graduationDateOfTheColonelAcademy;
    private Date dateOfTheColonelsTitle;

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
    @Column(name = "graduation_date_of_the_Colonel_Academy", nullable = true)
    public Date getGraduationDateOfTheColonelAcademy () {
        return graduationDateOfTheColonelAcademy;
    }

    public void setGraduationDateOfTheColonelAcademy (Date graduationDateOfTheColonelAcademy) {
        this.graduationDateOfTheColonelAcademy = graduationDateOfTheColonelAcademy;
    }

    @Basic
    @Column(name = "date_of_the_Colonels_title", nullable = false)
    public Date getDateOfTheColonelsTitle () {
        return dateOfTheColonelsTitle;
    }

    public void setDateOfTheColonelsTitle (Date dateOfTheColonelsTitle) {
        this.dateOfTheColonelsTitle = dateOfTheColonelsTitle;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ColonelEntity that = (ColonelEntity) o;

        if (id != that.id) return false;
        if (personId != that.personId) return false;
        if (graduationDateOfTheColonelAcademy != null ? !graduationDateOfTheColonelAcademy.equals(that.graduationDateOfTheColonelAcademy) : that.graduationDateOfTheColonelAcademy != null)
            return false;
        if (dateOfTheColonelsTitle != null ? !dateOfTheColonelsTitle.equals(that.dateOfTheColonelsTitle) : that.dateOfTheColonelsTitle != null)
            return false;

        return true;
    }

    @Override
    public int hashCode () {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (personId ^ (personId >>> 32));
        result = 31 * result + (graduationDateOfTheColonelAcademy != null ? graduationDateOfTheColonelAcademy.hashCode() : 0);
        result = 31 * result + (dateOfTheColonelsTitle != null ? dateOfTheColonelsTitle.hashCode() : 0);
        return result;
    }
}
