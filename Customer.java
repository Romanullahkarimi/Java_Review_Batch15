public class Customer {
    //topic ecapsulation
    private String name;
    private  long ssn;
    public  void setName(String name){
        if (name!=null&& !name.isEmpty()){
            this.name=name;
        }
    }
    public  String getName(){
        return name;
    }
    public  void setSsn(long ssn){
        if (ssn!=0){
            this.ssn=ssn;
        }
    }
    public long getSsn(long ssn){
        return ssn;
    }
}
