package ua.nic.Cursova.model;

import javax.persistence.*;

@Entity
@Table(name = "rankandfile", schema = "cursova", catalog = "")
public class RankandfileEntity {
    private long id;
    private long personId;
    private Long departmentСommanderId;
    private Long platoonСommanderId;

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
    @Column(name = "department_сommander_id", nullable = true)
    public Long getDepartmentСommanderId () {
        return departmentСommanderId;
    }

    public void setDepartmentСommanderId (Long departmentСommanderId) {
        this.departmentСommanderId = departmentСommanderId;
    }

    @Basic
    @Column(name = "platoon_сommander_id", nullable = true)
    public Long getPlatoonСommanderId () {
        return platoonСommanderId;
    }

    public void setPlatoonСommanderId (Long platoonСommanderId) {
        this.platoonСommanderId = platoonСommanderId;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RankandfileEntity that = (RankandfileEntity) o;

        if (id != that.id) return false;
        if (personId != that.personId) return false;
        if (departmentСommanderId != null ? !departmentСommanderId.equals(that.departmentСommanderId) : that.departmentСommanderId != null)
            return false;
        if (platoonСommanderId != null ? !platoonСommanderId.equals(that.platoonСommanderId) : that.platoonСommanderId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode () {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (personId ^ (personId >>> 32));
        result = 31 * result + (departmentСommanderId != null ? departmentСommanderId.hashCode() : 0);
        result = 31 * result + (platoonСommanderId != null ? platoonСommanderId.hashCode() : 0);
        return result;
    }
}
