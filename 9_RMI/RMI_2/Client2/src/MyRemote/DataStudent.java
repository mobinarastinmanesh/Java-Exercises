package MyRemote;

import java.io.Serializable;

public class DataStudent implements Serializable {
    public  Long mande;
    public  Long pardakhti;
    public  Long sid;

    public Long getMande() {
        return mande;
    }

    public void setMande(Long mande) {
        this.mande = mande;
    }

    public Long getPardakhti() {
        return pardakhti;
    }

    public void setPardakhti(Long pardakhti) {
        this.pardakhti = pardakhti;
    }

    public Long getSid(long l) {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }
}
