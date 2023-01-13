public class Cat {
    private int age;
    private double weight;
    private String name;

    private String onwer;
    private Person person;

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOnwer() {
        return onwer;
    }

    public void setOnwer(String onwer) {
        this.onwer = onwer;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void hasOwner(){
        if (onwer.equals(person.getName())){
            System.out.println("Ээси бар");
        }else {
            System.out.println("Ээси жок");
        }
    }
}
