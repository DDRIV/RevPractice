package Practice1.OtherPackage;

import Practice1.*;

public class ClassProtected extends ClassParent {
    protected static void changeName(String name, ClassParent p){
        p.setName(name);
    }
}
