package ua.nic.Cursova.model;

import javax.persistence.*;

@Entity
@Table(name = "platoon", schema = "cursova", catalog = "")
public class PlatoonEntity {
    private long id;
    private String name;
    private Long rotaId;

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
    @Column(name = "rota_id", nullable = true)
    public Long getRotaId () {
        return rotaId;
    }

    public void setRotaId (Long rotaId) {
        this.rotaId = rotaId;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlatoonEntity that = (PlatoonEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (rotaId != null ? !rotaId.equals(that.rotaId) : that.rotaId != null) return false;

        return true;
    }

    @Override
    public int hashCode () {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (rotaId != null ? rotaId.hashCode() : 0);
        return result;
    }
}
