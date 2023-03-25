package Review9;

public interface DrawAble {
    //inteface is a collection of public
  public static final   String Tool="pencil";
    void draw();// by defult this methods is public abstract
    default void print(){
        System.out.println("we are drawing object  "+Tool);
    }
    static  void erase(){
        System.out.println("All drwing are erasable");
    }

    //above id how interface used to be before java 8
    //after  java 8 static and defult methods were added to the interface
}
 abstract class shape{
    String color;
    double width, length;
    shape(String color, double length, double width){
        this.color=color;
                this.length=length;
        this.width=width;
    }
public abstract double   calculatearea();
}
