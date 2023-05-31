public class MarsExpedition {

    public void MarsExpedition() {

        // Mars info here
        String colonyName = "SpaceY";
        int shipPopulation = 300;
        double meals = 4000.00;
        boolean landing = true;
        System.out.println(colonyName);

        meals = meals - (shipPopulation * 0.75);
        meals = meals - (shipPopulation * 0.75);
        System.out.println(meals);
        meals = meals + (meals * .5);
        shipPopulation = shipPopulation + 5;

        String landingLocation = "The Hill";
        if (landingLocation.equalsIgnoreCase("The Plain")) {
            System.out.println("Bzzz landing on The Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on The Plain");
        }

    }

}
