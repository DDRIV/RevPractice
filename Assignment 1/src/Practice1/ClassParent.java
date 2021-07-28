package Practice1;

public class ClassParent {
    private String name;
    int age;

    public ClassParent(){};

    public ClassParent(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
