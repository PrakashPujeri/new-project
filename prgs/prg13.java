package prgs;

class Room {
    int l,b;
    Room(int x, int y)
    {
        l  = x;
        b = y;

    }
    int area()
    {
        return (l *b);
    }
}

class Classroom extends Room
{
    int h;
    Classroom(int x, int y , int z)
    {
        super(x, y);
        h = z;

    }
    int volume()
    {
        return l * b *h;

    }

}


class subclass
{
    public static void main(String[] args) {
        Classroom cr = new Classroom(10,20,30);
        int area = cr.area();
        int volume = cr.volume();
        System.out.println(area);
        System.out.println(9065930090 );
    }
}