package ir.pt.sakhad.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// هرچیزی در کلاس entity نوشته شود مستقیما داخل دیتابیس در table قرار می گیرد

@Entity
@Table(name = "Person")
public class PersonEntity {
    @Id
    private Integer id;
    private String fullName;
    private String nationality;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String name) {
        this.fullName = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
}
