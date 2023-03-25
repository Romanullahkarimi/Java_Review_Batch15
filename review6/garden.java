package review6;

public class garden {
    public static void main(String[] args) {
       flower flower= new flower();
        System.out.println(flower.pretty);
       flower.name="gul";
       flower.price=12;

        System.out.println(flower.price);
       flower.color="red";
       flower.smell();
       flower.bloom();
       flower.grow();


       //acess methods of flower
        System.out.println("second object");
        flower flower2= new flower();
        flower2.name="gulap";
        flower2.price=122;
        flower2.color="white";
        flower2.smell();
        flower2.bloom();
        flower2.grow();

       flower flower3= new flower();
        for (int i = 1; i <=3; i++) {
            System.out.println(i);

        }


    }
}
