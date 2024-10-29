public abstract class Vehicle implements Movable{

    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, int year, String model) {
        this.brand = brand;
        this.year = year;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void move() {
    }

    public String showInfo(){
        return "Brand: " + brand + ", model: " + model + ", year: " + year;
    }

    @Override
    public String toString() {
        return showInfo();
    }
}
