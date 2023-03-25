package Review8;

public class Furniture {
    public void assemble(){
        System.out.println("Furniture need to be assemled");
    }


    public void comfort(){
        System.out.println(" funitures need t be comfortable");
    }
}
class Chair extends Furniture{
    public void comfort(){
        System.out.println("not every chair in comfortable");//this methods is orverriding
    }
    protected  void loveSeat(){
        System.out.println("this is the best chair");
    }}
    class table extends Furniture{
        public void comfort(){
            System.out.println("Table cannot be comfortable");
        }
        protected void buildTable(){
            System.out.println("we can easly built a table");
        }
      protected   void builtTable(String materail){
            System.out.println("we built table  from materal"+materail);
        }
    }


