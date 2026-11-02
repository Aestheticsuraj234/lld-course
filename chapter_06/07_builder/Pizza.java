public class Pizza {
    private final String size;
    private final boolean cheese;
    private final boolean paneer;
    private final boolean olives;


    private Pizza(Builder builder){
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.paneer = builder.paneer;
        this.olives = builder.olives;
    }

    public String toString() {
        return size + " pizza | cheese: " + cheese + " | paneer: " + paneer + " | olives: " + olives;
    }

    public static class Builder{
        private final String size;     // must give
        private boolean cheese;        // optional (default false)
        private boolean paneer;        // optional
        private boolean olives;        // optional

        public Builder ( String size){
            this.size = size;
        }

        public Builder cheese() {
            this.cheese = true;
            return this;               // return "this" so we can chain the next step
        }

        public Builder paneer() {
            this.paneer = true;
            return this;
        }

        public Builder olives() {
            this.olives = true;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
