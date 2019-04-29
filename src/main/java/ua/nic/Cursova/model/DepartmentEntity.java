package ua.nic.Cursova.model;

import javax.persistence.*;

@Entity
@Table(name = "department", schema = "cursova", catalog = "")
public class DepartmentEntity {
    private long id;
    private String name;
    private Long personId;
    private Long platoonId;

    @Id
    @Column(name = "id", nullable = false)
    public long getId () {
        return id;
    }

    public void setId (long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 30)
    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "person_id", nullable = true)
    public Long getPersonId () {
        return personId;
    }

    public void setPersonId (Long personId) {
        this.personId = personId;
    }

    @Basic
    @Column(name = "platoon_id", nullable = true)
    public Long getPlatoonId () {
        return platoonId;
    }

    public void setPlatoonId (Long platoonId) {
        this.platoonId = platoonId;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DepartmentEntity that = (DepartmentEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (personId != null ? !personId.equals(that.personId) : that.personId != null) return false;
        if (platoonId != null ? !platoonId.equals(that.platoonId) : that.platoonId != null) return false;

        return true;
    }

    @Override
    public int hashCode () {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (personId != null ? personId.hashCode() : 0);
        result = 31 * result + (platoonId != null ? platoonId.hashCode() : 0);
        return result;
    }
}
