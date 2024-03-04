 class ClassRoom {
    int length,breadth;
    Room(int x,int y);
    {
        length=x;
        breadth=y;
    }
    int area()
    {
        return (length*breadth);
    }
}
/**
 * InnerclassRoom
 */
public class ClassRoom extends Room{
    int height;
    

    
}
