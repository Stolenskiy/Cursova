package ua.nic.Cursova.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "pettyofficer", schema = "cursova", catalog = "")
public class PettyofficerEntity {
    private long id;
    private long personId;
    private Date theDateOfTheAssignmentOfTheRankOfSeniorOfficer;

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
    @Column(name = "the_date_of_the_assignment_of_the_rank_of_senior_officer", nullable = false)
    public Date getTheDateOfTheAssignmentOfTheRankOfSeniorOfficer () {
        return theDateOfTheAssignmentOfTheRankOfSeniorOfficer;
    }

    public void setTheDateOfTheAssignmentOfTheRankOfSeniorOfficer (Date theDateOfTheAssignmentOfTheRankOfSeniorOfficer) {
        this.theDateOfTheAssignmentOfTheRankOfSeniorOfficer = theDateOfTheAssignmentOfTheRankOfSeniorOfficer;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PettyofficerEntity that = (PettyofficerEntity) o;

        if (id != that.id) return false;
        if (personId != that.personId) return false;
        if (theDateOfTheAssignmentOfTheRankOfSeniorOfficer != null ? !theDateOfTheAssignmentOfTheRankOfSeniorOfficer.equals(that.theDateOfTheAssignmentOfTheRankOfSeniorOfficer) : that.theDateOfTheAssignmentOfTheRankOfSeniorOfficer != null)
            return false;

        return true;
    }

    @Override
    public int hashCode () {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (personId ^ (personId >>> 32));
        result = 31 * result + (theDateOfTheAssignmentOfTheRankOfSeniorOfficer != null ? theDateOfTheAssignmentOfTheRankOfSeniorOfficer.hashCode() : 0);
        return result;
    }
}
