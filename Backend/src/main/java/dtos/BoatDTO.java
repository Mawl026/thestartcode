package dtos;

import entities.Boat;

public class BoatDTO {

    private int id;
    private String brand;
    private String make;
    private String name;
    private String image;

    public BoatDTO(Boat B) {
        this.id = B.getId();
        this.brand = B.getBrand();
        this.make = B.getBrand();
        this.name = B.getName();
        this.image = B.getImage();
    }

    public BoatDTO(int id, String brand, String make, String name, String image) {
        this.id = id;
        this.brand = brand;
        this.make = make;
        this.name = name;
        this.image = image;
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
