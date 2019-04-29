package ua.nic.Cursova.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "ordinary", schema = "cursova", catalog = "")
public class OrdinaryEntity {
    private long id;
    private long personId;
    private Date dateOfAssignmentOfAOrdinaryRank;

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
    @Column(name = "date_of_assignment_of_a_Ordinary_rank", nullable = false)
    public Date getDateOfAssignmentOfAOrdinaryRank () {
        return dateOfAssignmentOfAOrdinaryRank;
    }

    public void setDateOfAssignmentOfAOrdinaryRank (Date dateOfAssignmentOfAOrdinaryRank) {
        this.dateOfAssignmentOfAOrdinaryRank = dateOfAssignmentOfAOrdinaryRank;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrdinaryEntity that = (OrdinaryEntity) o;

        if (id != that.id) return false;
        if (personId != that.personId) return false;
        if (dateOfAssignmentOfAOrdinaryRank != null ? !dateOfAssignmentOfAOrdinaryRank.equals(that.dateOfAssignmentOfAOrdinaryRank) : that.dateOfAssignmentOfAOrdinaryRank != null)
            return false;

        return true;
    }

    @Override
    public int hashCode () {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (personId ^ (personId >>> 32));
        result = 31 * result + (dateOfAssignmentOfAOrdinaryRank != null ? dateOfAssignmentOfAOrdinaryRank.hashCode() : 0);
        return result;
    }
}
