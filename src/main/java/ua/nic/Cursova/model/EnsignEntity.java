package ua.nic.Cursova.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "ensign", schema = "cursova", catalog = "")
public class EnsignEntity {
    private long id;
    private long personId;
    private Date dateOfAssignmentOfAEnsignRank;

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
    @Column(name = "date_of_assignment_of_a_Ensign_rank", nullable = false)
    public Date getDateOfAssignmentOfAEnsignRank () {
        return dateOfAssignmentOfAEnsignRank;
    }

    public void setDateOfAssignmentOfAEnsignRank (Date dateOfAssignmentOfAEnsignRank) {
        this.dateOfAssignmentOfAEnsignRank = dateOfAssignmentOfAEnsignRank;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EnsignEntity that = (EnsignEntity) o;

        if (id != that.id) return false;
        if (personId != that.personId) return false;
        if (dateOfAssignmentOfAEnsignRank != null ? !dateOfAssignmentOfAEnsignRank.equals(that.dateOfAssignmentOfAEnsignRank) : that.dateOfAssignmentOfAEnsignRank != null)
            return false;

        return true;
    }

    @Override
    public int hashCode () {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (personId ^ (personId >>> 32));
        result = 31 * result + (dateOfAssignmentOfAEnsignRank != null ? dateOfAssignmentOfAEnsignRank.hashCode() : 0);
        return result;
    }
}
