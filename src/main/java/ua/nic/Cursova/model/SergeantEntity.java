package ua.nic.Cursova.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "sergeant", schema = "cursova", catalog = "")
public class SergeantEntity {
    private long id;
    private long personId;
    private Date dateOfAssignmentOfASergeantRank;

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
    @Column(name = "date_of_assignment_of_a_sergeant_rank", nullable = false)
    public Date getDateOfAssignmentOfASergeantRank () {
        return dateOfAssignmentOfASergeantRank;
    }

    public void setDateOfAssignmentOfASergeantRank (Date dateOfAssignmentOfASergeantRank) {
        this.dateOfAssignmentOfASergeantRank = dateOfAssignmentOfASergeantRank;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SergeantEntity that = (SergeantEntity) o;

        if (id != that.id) return false;
        if (personId != that.personId) return false;
        if (dateOfAssignmentOfASergeantRank != null ? !dateOfAssignmentOfASergeantRank.equals(that.dateOfAssignmentOfASergeantRank) : that.dateOfAssignmentOfASergeantRank != null)
            return false;

        return true;
    }

    @Override
    public int hashCode () {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (personId ^ (personId >>> 32));
        result = 31 * result + (dateOfAssignmentOfASergeantRank != null ? dateOfAssignmentOfASergeantRank.hashCode() : 0);
        return result;
    }
}
