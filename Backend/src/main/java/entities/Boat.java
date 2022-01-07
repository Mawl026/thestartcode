package entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "boat")
public class Boat implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Basic(optional = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    @Column(name = "boat_id")
    private int id;


    @Basic(optional = false)
    @NotNull
    @Column(name = "boat_brand")
    private String brand;


    @Basic(optional = false)
    @NotNull
    @Column(name = "boat_make")
    private String make;


    @Basic(optional = false)
    @NotNull
    @Column(name = "boat_name")
    private String name;


    @Basic(optional = false)
    @NotNull
    @Column(name = "boat_image")
    private String image;

    @ManyToMany(mappedBy = "boatList")
    private List<Owner> ownerList;

    @ManyToOne
    private Harbour harbour;

    public Boat(int id, String brand, String make, String name, String image) {
        this.id = id;
        this.brand = brand;
        this.make = make;
        this.name = name;
        this.image = image;
        this.ownerList = new ArrayList<>();
    }

    public Boat() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
