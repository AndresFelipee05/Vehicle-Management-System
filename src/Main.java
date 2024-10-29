import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Vehicle car1 = new Car("Audi", 2005, "A4", 4);
        Vehicle car2 = new Car("Mercedes", 2008, "AA", 4);

        Vehicle moto1 = new Motorcycle("Suzuki" , 2010, "GSRX",  125);
        Vehicle moto2 = new Motorcycle("Kawasaki" , 2015, "Ninja", 200);

        boolean repeat = true;
        while(repeat){
            System.out.println("--- Vehicle Management System ---");
            System.out.println("1. Add a Car\n" +
                                "2. Add a Motorcycle\n" +
                                "3. Show all vehicles in the garage.\n" +
                                "4. Move all vehicles.\n" +
                                "5. Exit.\n");
            int option = sc.nextInt();
            switch (option){

                case 1:
                    Garage.addCar();
                    break;

                case 2:
                    Garage.addMotorCycle();
                    break;

                case 3:
                    Garage.showVehicles();
                    break;

                case 4:
                    Garage.moveAll();
                    break;

                case 5:
                    repeat = false;
                    System.out.println("Has salido del programa");
                    break;

                default:
                    System.out.println("Opción no disponible");
            }
        }
        System.out.println("Fin del programa");
    }
}