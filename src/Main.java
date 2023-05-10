import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Write name programmist:");
        String name1= scanner.nextLine();

        System.out.print("Write designation:");
        String name2= scanner.nextLine();
        System.out.print("Write the company:");
        String name3=scanner.nextLine();

        Programmer programmer=new Programmer(name1,name2,name3);
        System.out.println(programmer.getName()+" 's designation "+programmer.getDesignation()+" and he works at "+programmer.getCompanyName());
        programmer.coding();
        System.out.println("**************************");

        System.out.print("Write name dancer:");
        String name4=scanner.nextLine();
        System.out.print("Write designation:");
        String name5=scanner.nextLine();
        System.out.print("Write group band:");
        String name6=scanner.nextLine();
        Dancer dancer=new Dancer(name4,name5,name6);
        System.out.println(dancer.getName()+"'s designation "+dancer.getDesignation()+" and he performs on his  "+dancer.getGroupName());
        dancer.dancing();
        System.out.println("**************************");

        System.out.print("Write name singer:");
        String name7=scanner.nextLine();
        System.out.print("Write designation:");
        String name8=scanner.nextLine();
        System.out.print("Write band name:");
        String name9=scanner.nextLine();
        Singer singer=new Singer(name7,name8,name9);
        System.out.println(singer.getName()+"'s designation "+singer.getDesignation()+" he is in this group "+singer.getBandName());
        singer.singing();
        singer.playGuitar();


    }
}