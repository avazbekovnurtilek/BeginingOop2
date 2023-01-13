public class Students {
    private String name;
    private String surName;
    private String email;
    private  int age;


    public void setName(String aty){
        name = aty;
    }
    public String getName(){
        return name;
    }
    public void setSurName(String familia){
        surName = familia;
    }
    public String getSurName(){
        return surName;
    }
    public void setEmail(String mail){
        email = mail;
    }
    public String getEmail(){
        return email;
    }
    public void setAge(int zhash){
        if (zhash<100 && zhash >0){
        age = zhash;
    }else {
            System.out.println("Tuura emes !");
        }
    }
    public int getAge(){
        return age;
    }
}

