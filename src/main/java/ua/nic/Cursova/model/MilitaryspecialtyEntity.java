package ua.nic.Cursova.model;

import javax.persistence.*;

@Entity
@Table(name = "militaryspecialty", schema = "cursova", catalog = "")
public class MilitaryspecialtyEntity {
    private long id;
    private String name;
    private long personId;

    @Id
    @Column(name = "id", nullable = false)
    public long getId () {
        return id;
    }

    public void setId (long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = false, length = 100)
    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "person_id", nullable = false)
    public long getPersonId () {
        return personId;
    }

    public void setPersonId (long personId) {
        this.personId = personId;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MilitaryspecialtyEntity that = (MilitaryspecialtyEntity) o;

        if (id != that.id) return false;
        if (personId != that.personId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode () {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int) (personId ^ (personId >>> 32));
        return result;
    }
}
