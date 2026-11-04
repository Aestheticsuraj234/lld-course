public class Main {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();
        light.next();
        light.next();
        light.next();
        light.next();
    }
}

// RED: Stop. Changing to GREEN
// GREEN: Go. Changing to YELLOW
// YELLOW: Slow down. Changing to RED
// RED: Stop. Changing to GREEN