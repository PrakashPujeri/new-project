 class Student {
    String name;
    int regno;
    Student(){
        name="Prakash";
        regno=15;
    }
    Student(String n,int r)
    {
        name=n;
        regno=r;

    }
    Student(Student s){
        name=s.name;
        regno=s.regno;
    }
    void display()
    {
        System.out.println(name+"\t"+regno);
    }
    
}
/**
 * StudentDemo
 */
class StudentDemo {
    public static void main(String[] args) {
        
    


    Student s1=new Student();
    Student s2=new Student("Praksh",15);
    Student s3=new Student(s1);
    s1.display();
    s2.display();
    s3.display();
}
}