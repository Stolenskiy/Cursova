package ua.nic.Cursova.model;

import javax.persistence.*;

@Entity
@Table(name = "militarybase", schema = "cursova", catalog = "")
public class MilitarybaseEntity {
    private long id;
    private String name;
    private long locationId;
    private Long divisionId;
    private Long brigadeId;

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
    @Column(name = "location_id", nullable = false)
    public long getLocationId () {
        return locationId;
    }

    public void setLocationId (long locationId) {
        this.locationId = locationId;
    }

    @Basic
    @Column(name = "division_id", nullable = true)
    public Long getDivisionId () {
        return divisionId;
    }

    public void setDivisionId (Long divisionId) {
        this.divisionId = divisionId;
    }

    @Basic
    @Column(name = "brigade_id", nullable = true)
    public Long getBrigadeId () {
        return brigadeId;
    }

    public void setBrigadeId (Long brigadeId) {
        this.brigadeId = brigadeId;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MilitarybaseEntity that = (MilitarybaseEntity) o;

        if (id != that.id) return false;
        if (locationId != that.locationId) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (divisionId != null ? !divisionId.equals(that.divisionId) : that.divisionId != null) return false;
        if (brigadeId != null ? !brigadeId.equals(that.brigadeId) : that.brigadeId != null) return false;

        return true;
    }

    @Override
    public int hashCode () {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int) (locationId ^ (locationId >>> 32));
        result = 31 * result + (divisionId != null ? divisionId.hashCode() : 0);
        result = 31 * result + (brigadeId != null ? brigadeId.hashCode() : 0);
        return result;
    }
}
