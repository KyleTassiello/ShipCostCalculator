import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double cost=0;
        double SHIPPING_COST=.02;
        double shipping=0;
        double total=0;
        String trash="";

        System.out.print("What is the cost of your item? $");

        if (in.hasNextDouble()){
            cost=in.nextDouble();
            in.nextLine();
            System.out.println("You said the item cost $" + cost);
            if (cost<100){
                shipping=cost*SHIPPING_COST;
                total= shipping + cost;
                System.out.println("Shipping is: $" + shipping + ". Your total cost is: $" + total);
            }
            else{
                System.out.println("Shipping is free! Your total cost is: $" + cost);
            }
        }
        else {
            trash=in.nextLine();
            System.out.println("You said the item cost $" + trash);
            System.out.println("This is an invalid input. Rerun and try again. ");
        }
    }
}