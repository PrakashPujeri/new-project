class Encapsulate {
    private String geekName;
    private int geekRoll;
    private int geekAge;

    public void setAge(int newAge) {
        geekAge = newAge;
    }

    public void setName(String newName) {
        geekName = newName;
    }

    public void setRoll(int newRoll) {
        geekRoll = newRoll;

    }

    public String getName() {
        return geekName;
    }

    public int getRoll() {
        return geekRoll;
    }

    public int getAge() {
        return geekAge;
    }

}

public class EncapsulateDemo {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate();
        obj.setName("Prakash");
        obj.setAge(18);
        obj.setRoll(15);
        System.out.println("Geeks name:" + obj.getName());
        System.out.println("Geeks age:" + obj.getAge());
        System.out.println("Geeks name:" + obj.getRoll());

    }

}
