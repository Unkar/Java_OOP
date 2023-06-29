//5) Переписать код в соответствии с Dependency Inversion Principle:
//public class Car {
//    private PetrolEngine engine;
//    public Car(PetrolEngine engine) {
//        this.engine = engine;
//    }
//    public void start() {
//        this.engine.start();
//    }
//}
//public class PetrolEngine {
//    public void start() {
//    }
//}
//    Разорвать зависимость классов Car и PetrolEngine. У машины же может быть DieselEngine.
package Task5;

public class Task5 {
}

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        this.engine.start();
    }
}

public interface Engine {
    void start();
}

public class PetrolEngine implements Engine {
    public void start() {
    }
}

public class DieselEngine implements Engine {
    public void start() {
    }


}