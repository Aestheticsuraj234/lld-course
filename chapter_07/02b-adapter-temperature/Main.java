public class Main {
    public static void main(String[] args) {
        TemperatureSensor sensor = new SensorAdapter(new OldUsSensor());
        System.out.printf("Temperature: %.1f C%n", sensor.getCelsius());
    }
}