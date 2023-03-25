package Review8;

public class Store {
    public static void main(String[] args) {
        Furniture chair=new Chair();
        chair.assemble();
        chair.comfort();//runtime polymorphism
        Furniture furniture=new table();
        furniture.comfort();
        furniture.assemble();


        table t=new table();
        t.assemble();
        t.comfort();
        t.buildTable();

    }
}
