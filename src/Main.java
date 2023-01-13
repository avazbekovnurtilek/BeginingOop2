import java.util.Scanner;

public class Main {
    public static void main(String[] args){
//        Students student = new Students();
//        student.setName("Nurtilek");
//        student.setAge(101);
//        student.setSurName("Avazbekov");
//        student.setEmail("navazbekov99@gmail.com");
//        System.out.println("аты: " +student.getName());
//        System.out.println("жаашы: " +student.getAge());
//        System.out.println("Фамилия: "+student.getSurName());
//        System.out.println("почта : " +student.getEmail());
        Scanner sc = new Scanner(System.in);

//        Pectance rectange = new Pectance();
//      rectange.setSideA(sc.nextDouble());
//      rectange.setSideB(sc.nextDouble());
//        System.out.println(area(rectange.getSideA(),rectange.getSideB()));
//
//    }
//    static double area(double sideA, double sideB){
//        return sideA*sideB;


//        Cat cat = new Cat();
//        cat.setName(sc.nextLine());
//        cat.age = sc.nextInt();
//        cat.setWeight(sc.nextDouble());
//        System.out.println(cat.getName());
//        System.out.println(cat.age);
//        System.out.println(cat.getWeight());

        Person person = new Person();
        person.setLastName(sc.nextLine());
        person.setName(sc.nextLine());

        Cat cat = new Cat();
        cat.setOnwer(sc.nextLine());
        cat.setName(sc.nextLine());
        cat.setAge(sc.nextInt());
        cat.setWeight(sc.nextDouble());
        cat.setPerson(person);

        cat.hasOwner();

    }



}