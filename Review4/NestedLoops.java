package Review4;

public class NestedLoops {
    public static void main(String[] args) {

        for (int i = 1; i <=3; i++) {
            //inner loop always depends on outer loops
            System.out.println(i);

            for (int j = 0; j <=4 ; j++) {

                System.out.println(j);

            }
            System.out.println("__________________");
            //outer loops control numbers of execution for inner loop
            for (int j = 1; j  <=2; j++) {
                System.out.println("bye");
                for (int k = 1; k <=2 ; k++) {
                    System.out.println("Hello");

                }



            }

        }
    }
}
