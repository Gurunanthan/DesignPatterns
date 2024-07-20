package designpatterns;

public class FactoryClass {

    public static void main(String[] args) {

        god wish = new god();

        instanceCreatorClass wish1 = wish.creation(1);
        System.out.println(wish1);
        wish1.calls();
        System.out.println("______________________________________");
        System.err.println();
        instanceCreatorClass wish2 = wish.creation(2);
        System.out.println(wish2);
        wish2.calls();
        System.err.println();
        System.out.println("______________________________________");
        System.err.println();
        wish1.callForHelp();
        System.out.println("______________________________________");
        wish2.callForHelp();
        System.out.println("______________________________________");

    }
}


class god {
    public instanceCreatorClass creation(int i)
    {
        if(i==1)
        {
            class1 class1Object = new class1();
            return class1Object;

        }
        else if(i==2)
        {
            class2 class2Object = new class2();
            return class2Object;

        }
        else {
            return null;
        }
    }
}


abstract class instanceCreatorClass{
    abstract instanceCreatorClass instanceCreatingFunction();
    abstract void calls();
    void callForHelp(){
        System.out.println("Reply from the abstract class it can be accesed by both the class");
    }
}

class class1 extends instanceCreatorClass{
    instanceCreatorClass instanceCreatingFunction(){
        return new class1();
    }

    void calls(){
        System.out.println("this is specific to the class 1");
    }
}

class class2 extends instanceCreatorClass{
    instanceCreatorClass instanceCreatingFunction(){
        return new class2();
    }

    void calls(){
        System.out.println("this is specific to the class 2");
    }
}