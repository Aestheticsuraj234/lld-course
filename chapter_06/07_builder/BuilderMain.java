public class BuilderMain {
    public static void main(String[] args) {
        Pizza p1 = new Pizza.Builder("Large")
        .cheese()
        .paneer()
        .build();

        Pizza p2 = new Pizza.Builder("Small").build(); 

        System.out.println(p1);
        System.out.println(p2);
    }
}

// Large pizza | cheese: true | paneer: true | olives: false
// Small pizza | cheese: false | paneer: false | olives: false