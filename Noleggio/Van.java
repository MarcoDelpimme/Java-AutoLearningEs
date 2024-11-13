public class Van extends Veicle implements Rent {
    int capacity;

    public Van(String plate, String model, double dailyCost, int capacity, boolean available) {
        super(plate, model, dailyCost, available);
        this.capacity = capacity;
    }

    public void calculateDailyCost(int day) {
        if (capacity > 1000) {
            dailyCost = dailyCost * 1.15 * day;
        } else {
            dailyCost = 80 * day;
        }
    }

    public boolean rent(Veicle veicle) {
        return true;
    }
}
