package ua.nic.Cursova.model;

import javax.persistence.*;

@Entity
@Table(name = "bmp", schema = "cursova", catalog = "")
public class BmpEntity {
    private long id;
    private String name;
    private Long number;
    private Long armamentId;
    private Long combatAndTransportVehilclesId;

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
    @Column(name = "combat_and_transport_vehilcles_id", nullable = true)
    public Long getCombatAndTransportVehilclesId () {
        return combatAndTransportVehilclesId;
    }

    public void setCombatAndTransportVehilclesId (Long combatAndTransportVehilclesId) {
        this.combatAndTransportVehilclesId = combatAndTransportVehilclesId;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BmpEntity bmpEntity = (BmpEntity) o;

        if (id != bmpEntity.id) return false;
        if (name != null ? !name.equals(bmpEntity.name) : bmpEntity.name != null) return false;
        if (number != null ? !number.equals(bmpEntity.number) : bmpEntity.number != null) return false;
        if (armamentId != null ? !armamentId.equals(bmpEntity.armamentId) : bmpEntity.armamentId != null) return false;
        if (combatAndTransportVehilclesId != null ? !combatAndTransportVehilclesId.equals(bmpEntity.combatAndTransportVehilclesId) : bmpEntity.combatAndTransportVehilclesId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode () {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (armamentId != null ? armamentId.hashCode() : 0);
        result = 31 * result + (combatAndTransportVehilclesId != null ? combatAndTransportVehilclesId.hashCode() : 0);
        return result;
    }
}
