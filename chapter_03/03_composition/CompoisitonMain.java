public class CompoisitonMain {
    public static void main(String[] args) {
        House house = new House("12 MG Road", "Kitchen", "Bedroom", "Hall");
        house.printRooms();

        

        house = null;
        // The house is gone, and so are its rooms.
        // There is no other variable pointing to "Kitchen", so it can't be used anywhere else.

        house.getRooms().add(new Room("Garage"));  // crashes: rooms belong to the house only
        System.out.println("House demolished. Its rooms are gone with it.");
    }
}
