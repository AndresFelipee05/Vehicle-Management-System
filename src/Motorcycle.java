public class Motorcycle extends Vehicle implements Movable{

    private int engineCapacity;

    public Motorcycle(String brand, int year, String model, int engineCapacity) {
        super(brand, year, model);
        this.engineCapacity = engineCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String showInfo() {
        return super.showInfo() + ", engine capacity: " + engineCapacity;
    }

    @Override
    public void move() {
        System.out.println("The motorcycle is moving");
    }
}
