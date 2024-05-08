class room
{
    int l,b;
    room(int x,int y)
    {
        l=x;
        b=y;
    }
}
    int area()
    {
        return (l*b);
    }
class Classroom extends room
{
    int height;
    Classroom(int x,int y,int z)
    {
        super(x,y);
        height=z;
    }
}
    int volume()
    {
        return(l*b*h);
    }
class subclass
{
    public static void main(String args[])
    {
        Classroom cr = new Classroom(10,20,30);
        int area=cr.area
        int volume=cr.volume
        System.out.println("Area"+area);
        System.out.println("volume"+volume);
    }
}    