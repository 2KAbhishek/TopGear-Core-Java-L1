class Parent {
}

class Child extends Parent {
}

public class TypecastDemo {
    public static void main(String args[]) {
        Parent[] arrParent;
        Child[] arrChild;
        arrParent = new Parent[10];
        arrChild = new Child[20];
        arrParent = arrChild; // 1
        arrChild = (Child[]) arrParent; // 2
        arrParent = new Parent[10];
        // arrChild = (Child[]) arrParent; // 3
    }
}
