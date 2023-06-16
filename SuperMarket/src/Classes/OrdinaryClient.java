package Classes;

public class OrdinaryClient extends Actor {
    public OrdinaryClient(String name) {
        super(name);
    }

    @Override
    public Actor getActor() {
        return this;
    }

    @Override
    public String getName() {
        return super.name;
    }
}
