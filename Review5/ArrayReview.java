package Review5;

public class ArrayReview {
    public static void main(String[] args) {

        //array is a collection  of type like int value String value,we can store values then
        //we can access by using index
        int arr=10;
        int[]arr1=new int[3];
        arr1[0]=10;
        arr1[1]=20;
        arr1[2]=30;
        System.out.println(arr1[2]);
        System.out.println("the size of "+arr1.length);
        //how to get all value from the array
        //arr[0]     arr[1]       arr[3];
        for (int a = 0; a < arr1.length; a++) {
            System.out.println(arr1[a]);

            //whenever we have arrays we can use enhanced for loop
            //we can use enhance for loop when we know how many times should it repeat
        }
        String []colors={"white","red","black","blue"};
        for (String color:colors){
            System.out.println(color+" ");
            System.out.println("~~~~~~~~~~~~~~~~~~");
            for (int i = 0; i < colors.length; i++) {
                System.out.println(colors[i]);


            }

            System.out.println("print in reverse way");
            for(int i=colors.length-1;i>=0;i--){
                System.out.print(colors[i]);
            }
        }

    }
}