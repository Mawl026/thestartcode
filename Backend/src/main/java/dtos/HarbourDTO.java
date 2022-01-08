package dtos;

import entities.Harbour;

public class HarbourDTO {

    private int id;
    private String name;
    private String address;
    private String capacity;

    public HarbourDTO(Harbour H) {
        this.id = H.getId();
        this.name = H.getName();
        this.address = H.getAddress();
        this.capacity = H.getCapacity();
    }

    public HarbourDTO(int id, String name, String address, String capacity) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.capacity = capacity;
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
