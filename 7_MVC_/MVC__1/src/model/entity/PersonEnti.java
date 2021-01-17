package model.entity;

public class PersonEnti {
    private Long id;
    private String name;
    private String car ;
    private Long price;

    public Long getId() {
        return id;
    }

    public PersonEnti setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public PersonEnti setName(String name) {
        this.name = name;
        return this;
    }

    public String getCar() {
        return car;
    }

    public PersonEnti setCar(String car) {
        this.car = car;
        return this;
    }

    public Long getPrice() {
        return price;
    }

    public PersonEnti setPrice(Long price) {
        this.price = price;
        return this;
    }
}
