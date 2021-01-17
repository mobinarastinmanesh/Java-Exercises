package model.entity;

/**
 * Created by Asus on 11/20/2019.
 */
public class FarshEnti {
    private String name;
    private Long id;
    private Long tedad;
    private Long gheymat_koll;
    private String keshvar;

    public String getName() {
        return name;
    }

    public FarshEnti setName(String name) {
        this.name = name;
        return this;
    }

    public Long getId() {
        return id;
    }

    public FarshEnti setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getTedad() {
        return tedad;
    }

    public FarshEnti setTedad(Long tedad) {
        this.tedad = tedad;
        return this;
    }

    public Long getGheymat_koll() {
        return gheymat_koll;
    }

    public FarshEnti setGheymat_koll(Long gheymat_koll) {
        this.gheymat_koll = gheymat_koll;
        return this;
    }

    public String getKeshvar() {
        return keshvar;
    }

    public FarshEnti setKeshvar(String keshvar) {
        this.keshvar = keshvar;
        return this;
    }
}
