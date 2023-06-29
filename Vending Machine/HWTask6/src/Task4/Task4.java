//4) Переписать код в соответствии с Liskov Substitution Principle:
//public class Rectangle {
//    private int width;
//    private int height;
//    public void setWidth(int width) {
//        this.width = width;
//    }
//    public void setHeight(int height) {
//        this.height = height;
//    }
//    public int area() {
//        return this.width * this.height;
//    }
//}
//public class Square extends Rectangle {
//    @Override
//    public void setWidth(int width) {
//        super.width = width;
//        super.height = width;
//    }
//    @Override
//    public void setHeight(int height) {
//        super.width = height;
//        super.height = height;
//    }
//}
package Task4;


public class Task4 {
}

public abstract class Shape{
    private int width;
    private int height;


    public int area() {
        return this.width * this.height;
    }


}
public class Rectangle extends Shape {

    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }

}
public class Square extends Shape {

    public void setSide(ind side){
        this.width = side;
        this.height = side;
    }
}