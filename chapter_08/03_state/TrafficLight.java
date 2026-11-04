public class TrafficLight {
    private LightState state = new RedState();
    
    public void setState(LightState state){
        this.state = state;
    }
    
    public void next(){
        state.next(this);
    }
}
