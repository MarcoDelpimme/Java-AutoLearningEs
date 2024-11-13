abstract class Veicle {
    String plate;
    String model;
    double dailyCost;
    boolean available;
    int rentCount = 0;

    public Veicle(String plate, String model, double dailyCost, boolean available) {
        this.plate = plate;
        this.model = model;
        this.dailyCost = dailyCost;
        this.available = available;
    }

    public double getDailyCost() {
        return dailyCost;
    }

    public String getPlate() {
        return plate;
    }

    public boolean isAvailable() {
        return available;
    }

    public void rent() {
        this.available = false;
        rentCount++;
    }

    public void showDetails() {
        System.out.println("PLATE:" + plate + "MODEL:" + model + "DAILY COST " + dailyCost + " euro" + " disponibile"
                + (available ? " si" : " No"));
    }

    abstract void calculateDailyCost(int day);
}