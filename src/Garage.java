import java.util.ArrayList;
import java.util.Scanner;

public class Garage {

    Scanner sc = new Scanner(System.in);

    private static ArrayList<Vehicle> lista  = new ArrayList<>();

    public static void addCar(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los datos del coche:");
        System.out.println("Marca");
        String marca = sc.next();

        System.out.println("Año");
        int ano = sc.nextInt();

        System.out.println("Modelo");
        String modelo = sc.next();

        System.out.println("Numero de ruedas");
        int numDoors = sc.nextInt();

        Vehicle coche = new Car(marca, ano, modelo, numDoors);
        lista.add(coche);
    }

    public static void addMotorCycle(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce los datos de la moto:");
        System.out.println("Marca");
        String marca = sc.next();

        System.out.println("Año");
        int ano = sc.nextInt();

        System.out.println("Modelo");
        String modelo = sc.next();

        System.out.println("Engine capacity");
        int capacity = sc.nextInt();

        Vehicle moto = new Motorcycle(marca, ano, modelo, capacity);
        lista.add(moto);
    }

    public static void showVehicles(){
        System.out.println("La lista es:");
        System.out.println(lista.toString());
    }

    public static void moveAll(){
        for(int i = 0; i < lista.size();i++){
            System.out.print(lista.get(i).getBrand() + " " + lista.get(i).getModel() + ": ");
            lista.get(i).move();
        }
    }
}
