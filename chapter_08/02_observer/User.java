public class User implements Subscriber{
    private String name;
    
    public User(String name){
        this.name = name;
    }
    
    public void notify(String videoTitle) {
        System.out.println(name + " got a notification: " + videoTitle);
    }
}
