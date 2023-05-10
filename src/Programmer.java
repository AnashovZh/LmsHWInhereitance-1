public class Programmer extends Person{
    private String companyName ;
    public Programmer(String name,String designation,String companyName){
        super(name, designation);
        this.companyName=companyName;
    }
    public void setCompanyName(String companyName){
        this.companyName=companyName;
    }
    public String getCompanyName() {
        return companyName;
    }
    public void coding(){
        super.learn();
        super.eat();
        super.walk();
        System.out.println(getName()+" writes great code. ");
    }
    public String toString(){
 return "Programmer company name "+companyName+super.toString();

    }
}
