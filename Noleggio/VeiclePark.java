import java.util.ArrayList;
import java.util.List;

public class VeiclePark {

    List<Veicle> veicles;

    public VeiclePark() {
        this.veicles = new ArrayList<>();
    }

    public void addVeicle(Veicle veicle) {
        this.veicles.add(veicle);
    }

    public double rentVeicle(String plate, int day) {
        for (Veicle veicle : veicles) {
            if (veicle.getPlate().equals(plate) && veicle.isAvailable()) {

                double cost = SpecialPromo.calculateSpecialPromo(veicle, day);
                veicle.rent();
                return cost;
            }
        }
        System.out.println("veicolo not available");
        return 0;
    }

    public void showAvailableVeicles() {
        boolean findIt = false;
        for (Veicle veicle : veicles) {
            if (veicle.isAvailable()) {
                veicle.showDetails();
                findIt = true;
            }
        }
        if (!findIt) {
            System.out.println("not available veicle for rent");
        }
    }

    public void showTotalProfit() {
        double totalProfit = 0;
        for (Veicle veicle : veicles) {
            if (!veicle.isAvailable()) {
                totalProfit += veicle.getDailyCost();
            }
        }
        System.out.println("Total profit: " + totalProfit);
    }

}
