package Review4;

public class NestedLoop {
    public static void main(String[] args) {

        for (int i = 1; i <=3; i++) {
            //inner loop always depends on outer loops
            System.out.println(i);

            for (int j = 0; j <=4 ; j++) {

                System.out.println(j);

            }
            System.out.println("__________________");
            //outer loops control numbers of execution for inner loop
            for (int j = 1; j  <=3; j++) {
                System.out.println(i);
                for (int k = 1; k <=2 ; k++) {
                    System.out.println(i);

                }
                System.out.println("__________________");
                for (int k = 0; k <=9 ; k++) {
                    for (int l = 0; l <=9 ; l++) {
                        for (int m = 0; m <=9 ; m++) {
                            for (int n = 0; n <=9 ; n++) {
                                System.out.println(k+""+l+" "+m+" "+n);

                            }
                            System.out.println("+++++++++++++++");

                            for (int n = 0; n <24; n++) {
                                for (int o = 0; o <=59; o++) {
                                    System.out.println(n+" "+o+" ");

                                }

                            }

                        }

                    }}}}}}










