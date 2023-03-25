package Review5;

public class TwoDArrayReview {
    public static void main(String[] args) {
        int[][]array={{1,2,3},
                {12,34,54},
                {24,34,54}};

        //getting all value from 2 d array
        for(int[] arr1:array){//iterates over arrays
            for (int num:arr1){
                System.out.println(num);//iterates over each element
                if(num%2==0){
                    System.out.println(num+" ");
                }
            }
            System.out.println();
        }


     /*   System.out.println("__________________________");
       int numberofthearrray = arr.length;
        System.out.println(numberofthearrray);


       int numberofelementin1Array= arr[0].length;
        System.out.println(numberofelementin1Array);
        int numberOfElementIn3array=arr[1].length;
        System.out.println(numberofelementin1Array);
*/
    }
}
