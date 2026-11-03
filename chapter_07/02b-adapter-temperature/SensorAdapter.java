// Adapter: looks like a TemperatureSensor, uses OldUsSensor inside
public class SensorAdapter implements TemperatureSensor {
    private OldUsSensor oldSensor;

    public SensorAdapter(OldUsSensor oldSensor) {
        this.oldSensor = oldSensor;
    }

    public double getCelsius() {
        double f = oldSensor.readFahrenheit();
        return (f - 32) * 5 / 9;
    }
}