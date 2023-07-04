package net.codejava.ProductManager;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Product {
    private Long id;
    private String name;
    private String brand;
    private String madein;
    private float price;

    protected Product() {
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }
    // other getters and setters are hidden for brevity

    public String getName() {
        return name;
    }
    public String getBrand() {
        return brand;
    }
    public String getMadein() {
        return madein;
    }
    public float getPrice() {
        return price;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setMadein(String madein) {
        this.madein = madein;
    }
    public void setPrice(float price) {
        this.price = price;
    }


}

