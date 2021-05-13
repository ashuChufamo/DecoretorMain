public abstract class ShapeDecoretor implements Shape {
    protected Shape decoratedShape;
    public ShapeDecoretor(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }
    public void draw(){
        decoratedShape.draw();
    }
}