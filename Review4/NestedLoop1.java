package Review4;

public class NestedLoop1 {
    public static void main(String[] args) {

       /* for (int n = 0; n <24; n++) {
            for (int o = 0; o <=59; o++) {
                for (int p = 0; p <=59; p++) {
                    System.out.println(n+" : "+o+" : "+p);

                }*/
        for (int h1 = 0; h1 <=2 ; h1++) {
            for (int h2 = 0; h2 <= 9; h2++) {
                if(h1==2&&h2==4){
                    break;
                }
                for (int m = 0; m <= 59; m++) {
                    if(m<10){
                        System.out.println(2);
                    }
            }


            }

        }
    }}











