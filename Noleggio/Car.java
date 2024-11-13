public class Car extends Veicle implements Rent {
    boolean automatic = false;

    public Car(String plate, String model, double dailyCost, boolean automatic, boolean available) {
        super(plate, model, dailyCost, available);
        this.automatic = automatic;
    }

    public void calculateDailyCost(int day) {
        if (automatic) {
            dailyCost = 100 * day;
        } else {
            dailyCost = 80 * day;
        }
    }

    @Override
    public boolean rent(Veicle veicle) {
        return true;
    }
}
