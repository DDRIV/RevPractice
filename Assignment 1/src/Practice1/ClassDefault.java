package Practice1;

import Practice1.OtherPackage.ClassProtected;

public class ClassDefault extends ClassParent{
    protected String parentNameProtect(ClassParent p){
        return p.getName();
    }
}
