package model.entity;

public class MihanEnti {
    private Long id;
    private String name;
    private String tarikh ;
    private Long price;

    public Long getId() {
        return id;
    }

    public MihanEnti setId(Long id) {
        this.id = id;
        return this;
    }
////////////////////////////////////////////////
    public String getName() {
        return name;
    }

    public MihanEnti setName(String name) {
        this.name = name;
        return this;
    }
///////////////////////////////////////////////
    public String getTarikh() {

        return tarikh;
    }

    public MihanEnti setTaikh(String tarikh) {
        this.tarikh = tarikh;
        return this;
    }
///////////////////////////////////////////////
    public Long getPrice() {

        return price;
    }

    public MihanEnti setPrice(Long price) {
        this.price = price;
        return this;
    }
    ///////////////////////////////////////////////
}
