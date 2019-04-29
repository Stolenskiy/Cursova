package ua.nic.Cursova.model;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "person", schema = "cursova", catalog = "")
public class PersonEntity {
    private long id;
    private String firstName;
    private String lastName;
    private String fatherName;
    private Date birthDate;
    private Byte sex;

    @Id
    @Column(name = "id", nullable = false)
    public long getId () {
        return id;
    }

    public void setId (long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "first_name", nullable = false, length = 20)
    public String getFirstName () {
        return firstName;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "last_name", nullable = false, length = 20)
    public String getLastName () {
        return lastName;
    }

    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "father_name", nullable = true, length = 20)
    public String getFatherName () {
        return fatherName;
    }

    public void setFatherName (String fatherName) {
        this.fatherName = fatherName;
    }

    @Basic
    @Column(name = "birth_date", nullable = true)
    public Date getBirthDate () {
        return birthDate;
    }

    public void setBirthDate (Date birthDate) {
        this.birthDate = birthDate;
    }

    @Basic
    @Column(name = "sex", nullable = true)
    public Byte getSex () {
        return sex;
    }

    public void setSex (Byte sex) {
        this.sex = sex;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonEntity that = (PersonEntity) o;

        if (id != that.id) return false;
        if (firstName != null ? !firstName.equals(that.firstName) : that.firstName != null) return false;
        if (lastName != null ? !lastName.equals(that.lastName) : that.lastName != null) return false;
        if (fatherName != null ? !fatherName.equals(that.fatherName) : that.fatherName != null) return false;
        if (birthDate != null ? !birthDate.equals(that.birthDate) : that.birthDate != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;

        return true;
    }

    @Override
    public int hashCode () {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (fatherName != null ? fatherName.hashCode() : 0);
        result = 31 * result + (birthDate != null ? birthDate.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        return result;
    }
}
