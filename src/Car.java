public class Car extends Vehicle implements Movable{

    private int numDoors;

    public Car(String brand, int year, String model, int numDoors) {
        super(brand, year, model);
        this.numDoors = numDoors;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    @Override
    public String showInfo() {
        return super.showInfo() + ", num of doors: " + numDoors;
    }

    @Override
    public void move() {
        System.out.println("The car is moving");
    }
}
