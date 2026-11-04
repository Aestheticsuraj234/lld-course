public class GreenState implements LightState {
    public void next(TrafficLight light) {
        System.out.println("GREEN: Go. Changing to YELLOW");
        light.setState(new YellowState());
    }
}