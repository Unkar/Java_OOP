package Classes;

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

    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder();
    }

    @Override
    public Actor getActor() {
        return this;
    }

    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder();
    }
}
