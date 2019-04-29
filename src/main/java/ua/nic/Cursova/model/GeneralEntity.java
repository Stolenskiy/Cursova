package ua.nic.Cursova.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "general", schema = "cursova", catalog = "")
public class GeneralEntity {
    private long id;
    private long personId;
    private Date graduationDateOfTheGeneralAcademy;
    private Date dateOfTheGeneralsTitle;

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
    @Column(name = "graduation_date_of_the_General_Academy", nullable = true)
    public Date getGraduationDateOfTheGeneralAcademy () {
        return graduationDateOfTheGeneralAcademy;
    }

    public void setGraduationDateOfTheGeneralAcademy (Date graduationDateOfTheGeneralAcademy) {
        this.graduationDateOfTheGeneralAcademy = graduationDateOfTheGeneralAcademy;
    }

    @Basic
    @Column(name = "date_of_the_generals_title", nullable = false)
    public Date getDateOfTheGeneralsTitle () {
        return dateOfTheGeneralsTitle;
    }

    public void setDateOfTheGeneralsTitle (Date dateOfTheGeneralsTitle) {
        this.dateOfTheGeneralsTitle = dateOfTheGeneralsTitle;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GeneralEntity that = (GeneralEntity) o;

        if (id != that.id) return false;
        if (personId != that.personId) return false;
        if (graduationDateOfTheGeneralAcademy != null ? !graduationDateOfTheGeneralAcademy.equals(that.graduationDateOfTheGeneralAcademy) : that.graduationDateOfTheGeneralAcademy != null)
            return false;
        if (dateOfTheGeneralsTitle != null ? !dateOfTheGeneralsTitle.equals(that.dateOfTheGeneralsTitle) : that.dateOfTheGeneralsTitle != null)
            return false;

        return true;
    }

    @Override
    public int hashCode () {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (personId ^ (personId >>> 32));
        result = 31 * result + (graduationDateOfTheGeneralAcademy != null ? graduationDateOfTheGeneralAcademy.hashCode() : 0);
        result = 31 * result + (dateOfTheGeneralsTitle != null ? dateOfTheGeneralsTitle.hashCode() : 0);
        return result;
    }
}
