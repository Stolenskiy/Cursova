package ua.nic.Cursova.model;

import javax.persistence.*;

@Entity
@Table(name = "building", schema = "cursova", catalog = "")
public class BuildingEntity {
    private long id;
    private String name;
    private Long militaryBaseId;
    private Long number;

    @Id
    @Column(name = "id", nullable = false)
    public long getId () {
        return id;
    }

    public void setId (long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 50)
    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "militaryBase_id", nullable = true)
    public Long getMilitaryBaseId () {
        return militaryBaseId;
    }

    public void setMilitaryBaseId (Long militaryBaseId) {
        this.militaryBaseId = militaryBaseId;
    }

    @Basic
    @Column(name = "number", nullable = true)
    public Long getNumber () {
        return number;
    }

    public void setNumber (Long number) {
        this.number = number;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BuildingEntity that = (BuildingEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (militaryBaseId != null ? !militaryBaseId.equals(that.militaryBaseId) : that.militaryBaseId != null)
            return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;

        return true;
    }

    @Override
    public int hashCode () {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (militaryBaseId != null ? militaryBaseId.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }
}
