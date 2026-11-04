public class RedState implements LightState {
    public void next(TrafficLight light) {
        System.out.println("RED: Stop. Changing to GREEN");
        light.setState(new GreenState());
    }
}