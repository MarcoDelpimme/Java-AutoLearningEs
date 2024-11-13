public class Main {
    public static void main(String[] args) {
        VeiclePark park = new VeiclePark();

        park.addVeicle(new Bicicletta("BIKE001 ", "City Bike ", 20, true));

        park.addVeicle(new Moto("MOTO001 ", "Sport Bike ", 50, false));
        park.addVeicle(new Van("VAN001 ", "Cargo Van ", 80, 1200, true));
        park.addVeicle(new Car("CAR001 ", "Sedan ", 80, false, false));

        park.showAvailableVeicles();

        double cost = park.rentVeicle("MOTO001 ", 3);
        System.out.println("Cost of rent: " + cost);

        park.showAvailableVeicles();

        park.showTotalProfit();
    }
}
