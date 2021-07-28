package Practice1.OtherPackage;

import Practice1.ClassDefault;
import Practice1.ClassParent;

public class ClassProtected extends ClassDefault {
    public void parentName(String name, ClassParent p){
        p.setName(name);
        System.out.println(this.parentNameProtect(p));
    }
}
