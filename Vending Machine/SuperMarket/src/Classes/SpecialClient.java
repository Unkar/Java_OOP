package Classes;

import javax.swing.*;

public class SpecialClient extends Actor {
    private Integer idVip;
    public SpecialClient(String name, Integer idVip) {
        super(name);
        this.idVip = idVip;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public Integer getIdVip() {
        return idVip;
    }

}
