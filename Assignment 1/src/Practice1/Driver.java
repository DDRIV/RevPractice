package Practice1;

import Practice1.OtherPackage.ClassProtected;

public class Driver extends ClassProtected{
    public static void main(String[] args) {
        ClassParent parent = new ClassParent();
        ClassProtected.changeName("Bill", parent);
        ClassDefault.changeName(32,parent);
        System.out.println(parent.getName());
        System.out.println(parent.age);
    }
}
