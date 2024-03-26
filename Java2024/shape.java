abstract class shape {

    abstract void draw();

}
/**
 *  
 */
 class Rectangle extends shape{
    void draw()
    {
        System.out.println("drawing rectangle");
    }
}
class Circle extends shape{
    void draw()
    {
        System.out.println("The drawing Circle");
    }
}
class TestAbstraction{
    public static void main(String[] args) {
        shape s=new Circle();
        s.draw();
            
     }
    }
