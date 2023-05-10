public class Dancer extends Person{
    private String groupName;

    public Dancer (String name ,String designation,String groupName){
        super(name, designation);
        this.groupName=groupName;
    }
    public void setGroupName(String groupName){
        this.groupName=groupName;
    }public String getGroupName(){
        return groupName=groupName;
    }
    public  void dancing(){
        super.learn();
        super.walk();
        super.eat();
        System.out.println(getName()+" can dance very well.");
    }
    public String toString(){
        return "Person d name= "+getName()+"Person d designation = "+getDesignation()
                +"Dancer dancing = "+getGroupName();
    }
}
