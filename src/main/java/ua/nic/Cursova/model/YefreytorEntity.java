package ua.nic.Cursova.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "yefreytor", schema = "cursova", catalog = "")
public class YefreytorEntity {
    private long id;
    private long personId;
    private Date dateOfAssignmentOfAYefreytorRank;

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
    @Column(name = "date_of_assignment_of_a_Yefreytor_rank", nullable = false)
    public Date getDateOfAssignmentOfAYefreytorRank () {
        return dateOfAssignmentOfAYefreytorRank;
    }

    public void setDateOfAssignmentOfAYefreytorRank (Date dateOfAssignmentOfAYefreytorRank) {
        this.dateOfAssignmentOfAYefreytorRank = dateOfAssignmentOfAYefreytorRank;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        YefreytorEntity that = (YefreytorEntity) o;

        if (id != that.id) return false;
        if (personId != that.personId) return false;
        if (dateOfAssignmentOfAYefreytorRank != null ? !dateOfAssignmentOfAYefreytorRank.equals(that.dateOfAssignmentOfAYefreytorRank) : that.dateOfAssignmentOfAYefreytorRank != null)
            return false;

        return true;
    }

    @Override
    public int hashCode () {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (personId ^ (personId >>> 32));
        result = 31 * result + (dateOfAssignmentOfAYefreytorRank != null ? dateOfAssignmentOfAYefreytorRank.hashCode() : 0);
        return result;
    }
}
