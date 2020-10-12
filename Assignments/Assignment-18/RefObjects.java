interface MyInterface {
}

class MyClass1 {
}

class MyClass2 extends MyClass1 implements MyInterface {
}

class MyClass3 implements MyInterface {
}

class ReferenceDemo {
    public static void main(String args[]) {
        MyClass1 class1Object = new MyClass1();
        MyClass1 class2Object = new MyClass2();
        MyClass3 class3Object = new MyClass3();
        // class2Object = class3Object;
        // class3Object = class2Object;
        MyInterface InterfaceRef = class3Object;
        // class3Object = (MyClass3) class2Object;
        // class2Object = class1Object;
    }
}
