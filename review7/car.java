package review7;

public class car {
    String make, model;
    int year, horsePower;
    public car(String make, String model){
        this.make=make;
        this.model=model;
    }
  public   car (String make, String model, int year, int horsePower){
        this.make=make;
        this.model=model;

    }
   public void start(){
        System.out.println(make+" starts");
    }
   public void drive(int speed){
        System.out.println(make+" drive with speed "+speed);
    }
    }
