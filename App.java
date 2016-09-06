import java.io.Console;

public class App {
  public static void main(String[] args){
    Console myConsole = System.console();

    System.out.println("What's the dimensions for your package?");

    System.out.println("Height:");
    Integer userPackageHeight = Integer.parseInt(myConsole.readLine());

    System.out.println("Width:");
    Integer userPackageWidth = Integer.parseInt(myConsole.readLine());

    System.out.println("Length:");
    Integer userPackageLength = Integer.parseInt(myConsole.readLine());

    System.out.println("How much does your package weigh?");
    Integer userPackageWeight = Integer.parseInt(myConsole.readLine());

    System.out.println("Would you like an overnight delivery or five-day delivery?");
    String userDeliverySpeed = myConsole.readLine();

    System.out.println("Is this a domestic package? Yes or No");
    String userPackageLocation = myConsole.readLine();

    Parcel userParcel = new Parcel(userPackageHeight, userPackageWidth, userPackageWidth, userPackageWeight);

    System.out.println("Your parcel will cost $" + userParcel.costToShip(userDeliverySpeed, userPackageLocation));

  }
}
