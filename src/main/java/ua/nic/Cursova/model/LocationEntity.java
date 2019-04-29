package ua.nic.Cursova.model;

import javax.persistence.*;

@Entity
@Table(name = "location", schema = "cursova", catalog = "")
public class LocationEntity {
    private long id;
    private String country;
    private String district;
    private String region;
    private String street;
    private String number;

    @Id
    @Column(name = "id", nullable = false)
    public long getId () {
        return id;
    }

    public void setId (long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "country", nullable = true, length = 20)
    public String getCountry () {
        return country;
    }

    public void setCountry (String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "district", nullable = true, length = 20)
    public String getDistrict () {
        return district;
    }

    public void setDistrict (String district) {
        this.district = district;
    }

    @Basic
    @Column(name = "region", nullable = true, length = 20)
    public String getRegion () {
        return region;
    }

    public void setRegion (String region) {
        this.region = region;
    }

    @Basic
    @Column(name = "street", nullable = true, length = 20)
    public String getStreet () {
        return street;
    }

    public void setStreet (String street) {
        this.street = street;
    }

    @Basic
    @Column(name = "number", nullable = true, length = 10)
    public String getNumber () {
        return number;
    }

    public void setNumber (String number) {
        this.number = number;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LocationEntity that = (LocationEntity) o;

        if (id != that.id) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (district != null ? !district.equals(that.district) : that.district != null) return false;
        if (region != null ? !region.equals(that.region) : that.region != null) return false;
        if (street != null ? !street.equals(that.street) : that.street != null) return false;
        if (number != null ? !number.equals(that.number) : that.number != null) return false;

        return true;
    }

    @Override
    public int hashCode () {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (region != null ? region.hashCode() : 0);
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }
}
