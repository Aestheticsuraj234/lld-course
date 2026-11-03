public class Circle extends Shape{
    public Circle(Renderer renderer) {
        super(renderer);
    }
    
    public void draw(){
        renderer.render("Circle");
    }
}
