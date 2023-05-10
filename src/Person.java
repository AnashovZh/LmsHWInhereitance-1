public class Person {
    private String name;
    private String designation;

    public Person(String name,String designation){
        this.name=name;
        this.designation=designation;
    }
    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public void learn(){
        System.out.println(name+" speaks fluent English.");
    }
    public  void walk(){
        System.out.println(name+" likes to walk through the garden.");
    }
    public void eat(){
        System.out.println(name+" likes to eat pizza.");
    }
    public String toString(){
        return "Person name= "+name+"Person designation= "+designation;
    }


}
