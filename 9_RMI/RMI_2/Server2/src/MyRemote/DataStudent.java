package MyRemote;

import java.io.Serializable;

public class DataStudent implements Serializable {

    public  Long pardakhti;
    public  String sid;


    public Long getPardakhti() {
        return pardakhti;
    }

    public void setPardakhti(Long pardakhti) {
        this.pardakhti = pardakhti;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }
}
