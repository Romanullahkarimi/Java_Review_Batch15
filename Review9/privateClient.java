package Review9;

public class privateClient {
    private  String name;
    private  long ssn;
    privateClient(String name, long ssn){
        if (name!=null&& !name.isEmpty()){
            this.name=name;
        }
        if (ssn!=0){
            this.ssn=ssn;
        }
    }
    public String getName(){
        return name;
    }
    public long getSsn(){
        return ssn;
    }

}
