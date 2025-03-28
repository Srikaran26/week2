public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person other){

        this.name=other.name;
        this.age=other.age;
    }

    public void display(){

        System.out.println("NAME: "+name);
        System.out.println("AGE: "+age);
    }

    public static void main(String[] args) {
        String name="Jhon";
        int age=19;

        Person p1=new Person(name,age);
        Person p2=new Person(p1);

        p1.display();
        p2.display();

    }
}
