public class Singer extends Person{
    private String bandName;
    public Singer(String name,String designation,String bandName){
        super (name, designation);
        this.bandName=bandName;
    }
    public void setBandName(String bandName){
        this.bandName=bandName;
    }public String getBandName(){
        return bandName;
    }
    public void singing(){
        super.learn();
        super.walk();
        super.eat();
        System.out.println(getName()+" sings well.");
    }public  void playGuitar(){
        System.out.println(getName()+" plays the guitar very well.");
    }
    public  String toString (){
        return "Person s name= "+getName()+"Person s designation= "+getDesignation()+
                "Person s bandGroup= "+bandName;

    }
}
