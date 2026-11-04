public class YellowState implements LightState {
    public void next(TrafficLight light) {
        System.out.println("YELLOW: Slow down. Changing to RED");
        light.setState(new RedState());
    }
}