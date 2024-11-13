public class Bicicletta extends Veicle implements Rent {

    public Bicicletta(String plate, String model, double dailyCost, boolean available) {
        super(plate, model, dailyCost, available);
    }

    @Override
    void calculateDailyCost(int day) {
        dailyCost = 20 * day;

    }

    @Override
    public boolean rent(Veicle veicle) {
        return true;
    }

}
