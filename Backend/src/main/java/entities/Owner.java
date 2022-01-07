package entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "owner")
public class Owner implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "owner_id", length = 25)
    private int id;

    @Basic(optional = false)
    @NotNull
    @Column(name = "owner_name", length = 50)
    private String name;

    @Basic(optional = false)
    @NotNull
    @Column(name = "owner_address", length = 100)
    private String address;

    @Basic(optional = false)
    @NotNull
    @Column(name = "owner_phone", length = 50)
    private String phone;

    @ManyToMany
    private List<Boat> boatList = new ArrayList<>();

    public Owner() {
    }

    public Owner(int id, String name, String address, String phone) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
