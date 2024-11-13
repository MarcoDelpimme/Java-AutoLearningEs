public class SpecialPromo {
    public static double calculateSpecialPromo(Veicle veicle, int day) {

        double total = veicle.getDailyCost() * day;

        if (day > 7) {
            total = total *= 0.85;
        }

        return total;
    }
}
