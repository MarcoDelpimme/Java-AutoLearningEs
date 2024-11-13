public class Moto extends Veicle implements Rent {

    public Moto(String plate, String model, double dailyCost, boolean available) {
        super(plate, model, dailyCost, available);
    }

    public void calculateDailyCost(int day) {
        dailyCost = 50 * day;
    }

    @Override
    public boolean rent(Veicle veicle) {
        return true;
    }
}
