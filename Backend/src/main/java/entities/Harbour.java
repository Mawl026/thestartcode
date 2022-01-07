package entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "harbour")
public class Harbour implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "harbour_id")
    private int id;


    @Basic(optional = false)
    @NotNull
    @Column(name = "harbour_name")
    private String name;


    @Basic(optional = false)
    @NotNull
    @Column(name = "harbour_address")
    private String address;


    @Basic(optional = false)
    @Column(name = "harbour_capacity")
    private String capacity;

    @OneToMany(mappedBy = "harbour", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Boat> boatList;

    public Harbour() {
    }

    public Harbour(int id, String name, String address, String capacity) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.capacity = capacity;
        this.boatList = boatList;
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

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }
}
