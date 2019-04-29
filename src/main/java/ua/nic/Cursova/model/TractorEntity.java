package ua.nic.Cursova.model;

import javax.persistence.*;

@Entity
@Table(name = "tractor", schema = "cursova", catalog = "")
public class TractorEntity {
    private long id;
    private String name;
    private Long number;
    private Long armamentId;
    private Long combatAndTransportVehiclesId;

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
    @Column(name = "number", nullable = true)
    public Long getNumber () {
        return number;
    }

    public void setNumber (Long number) {
        this.number = number;
    }

    @Basic
    @Column(name = "armament_id", nullable = true)
    public Long getArmamentId () {
        return armamentId;
    }

    public void setArmamentId (Long armamentId) {
        this.armamentId = armamentId;
    }

    @Basic
    @Column(name = "combat_and_transport_vehicles_id", nullable = true)
    public Long getCombatAndTransportVehiclesId () {
        return combatAndTransportVehiclesId;
    }

    public void setCombatAndTransportVehiclesId (Long combatAndTransportVehiclesId) {
        this.combatAndTransportVehiclesId = combatAndTransportVehiclesId;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TractorEntity that = (TractorEntity) o;

        if (id != that.id) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;
        if (armamentId != null ? !armamentId.equals(that.armamentId) : that.armamentId != null) return false;
        if (combatAndTransportVehiclesId != null ? !combatAndTransportVehiclesId.equals(that.combatAndTransportVehiclesId) : that.combatAndTransportVehiclesId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode () {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (armamentId != null ? armamentId.hashCode() : 0);
        result = 31 * result + (combatAndTransportVehiclesId != null ? combatAndTransportVehiclesId.hashCode() : 0);
        return result;
    }
}
