package review6;

public class stirngBulder {
    public static void main(String[] args) {
        //this class is changeable on the same object
        StringBuilder sb=new StringBuilder("hello");
        //all change happens on the sme object
        sb.reverse();
        System.out.println(sb);
        sb.toString();
        System.out.println(sb);
        

    }
}
