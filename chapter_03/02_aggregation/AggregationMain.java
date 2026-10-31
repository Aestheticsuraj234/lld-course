public class AggregationMain {
    public static void main(String[] args) {
        Player virat = new Player("Virat");
        Player rohit = new Player("Rohit");


        Team rcb = new Team("RCB");
        rcb.addPlayer(rohit);
        rcb.addPlayer(virat);

        rcb.printPlayers();

        rcb.disband();
        rcb = null;

        Team india = new Team("India");
        india.addPlayer(rohit);
        india.addPlayer(virat);

        india.printPlayers();
    }
}
