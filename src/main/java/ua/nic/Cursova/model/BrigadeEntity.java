package ua.nic.Cursova.model;

import javax.persistence.*;

@Entity
@Table(name = "brigade", schema = "cursova", catalog = "")
public class BrigadeEntity {
    private long id;
    private String name;
    private Long armyId;

    @Id
    @Column(name = "id", nullable = false)
    public long getId () {
        return id;
    }

    public void setId (long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 20)
    public String getName () {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "army_id", nullable = true)
    public Long getArmyId () {
        return armyId;
    }

    public void setArmyId (Long armyId) {
        this.armyId = armyId;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BrigadeEntity that = (BrigadeEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (armyId != null ? !armyId.equals(that.armyId) : that.armyId != null) return false;

        return true;
    }

    @Override
    public int hashCode () {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (armyId != null ? armyId.hashCode() : 0);
        return result;
    }
}
