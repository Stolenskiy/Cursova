package ua.nic.Cursova.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "captain", schema = "cursova", catalog = "")
public class CaptainEntity {
    private long id;
    private long personId;
    private Date graduationDateOfTheCaptainAcademy;
    private Date dateOfTheCaptainsTitle;

    @Id
    @Column(name = "id", nullable = false)
    public long getId () {
        return id;
    }

    public void setId (long id) {
        this.id = id;
    }

    @Override
    public String toString () {
        return "CaptainEntity{" +
                "id=" + id +
                ", personId=" + personId +
                ", graduationDateOfTheCaptainAcademy=" + graduationDateOfTheCaptainAcademy +
                ", dateOfTheCaptainsTitle=" + dateOfTheCaptainsTitle +
                '}';
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
    @Column(name = "graduation_date_of_the_Captain_Academy", nullable = true)
    public Date getGraduationDateOfTheCaptainAcademy () {
        return graduationDateOfTheCaptainAcademy;
    }

    public void setGraduationDateOfTheCaptainAcademy (Date graduationDateOfTheCaptainAcademy) {
        this.graduationDateOfTheCaptainAcademy = graduationDateOfTheCaptainAcademy;
    }

    @Basic
    @Column(name = "date_of_the_Captains_title", nullable = false)
    public Date getDateOfTheCaptainsTitle () {
        return dateOfTheCaptainsTitle;
    }

    public void setDateOfTheCaptainsTitle (Date dateOfTheCaptainsTitle) {
        this.dateOfTheCaptainsTitle = dateOfTheCaptainsTitle;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CaptainEntity that = (CaptainEntity) o;

        if (id != that.id) return false;
        if (personId != that.personId) return false;
        if (graduationDateOfTheCaptainAcademy != null ? !graduationDateOfTheCaptainAcademy.equals(that.graduationDateOfTheCaptainAcademy) : that.graduationDateOfTheCaptainAcademy != null)
            return false;
        if (dateOfTheCaptainsTitle != null ? !dateOfTheCaptainsTitle.equals(that.dateOfTheCaptainsTitle) : that.dateOfTheCaptainsTitle != null)
            return false;

        return true;
    }

    @Override
    public int hashCode () {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (personId ^ (personId >>> 32));
        result = 31 * result + (graduationDateOfTheCaptainAcademy != null ? graduationDateOfTheCaptainAcademy.hashCode() : 0);
        result = 31 * result + (dateOfTheCaptainsTitle != null ? dateOfTheCaptainsTitle.hashCode() : 0);
        return result;
    }
}
