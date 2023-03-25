package Review5;

public class TwoDArrayReview1 {
    public static void main(String[] args) {
        int[][]array={{1,2,3},
                {12,34,54},
                {24,34,54}};

        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println(array[i][j]);

                //i want to print only odd number
                if(i%2==1){
                    System.out.print(array[i][j]);
                }
            }
            System.out.println();

        }
    }
}
