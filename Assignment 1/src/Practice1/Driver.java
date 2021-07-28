package Practice1;

import Practice1.OtherPackage.ClassProtected;

public class Driver {
    public static void main(String[] args) {
        ClassParent parent = new ClassParent();
        ClassProtected protect = new ClassProtected();
        protect.parentName("Bill", parent);
    }
}
