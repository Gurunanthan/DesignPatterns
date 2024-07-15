package designpatterns;

public class singletonclass {
    public static void main(String[] args) {
        Singleton singletonInstance = Singleton.getInstance("MySingleton");

        singletonInstance.showMessage();

        Singleton anotherSingletonInstance = Singleton.getInstance("AnotherSingleton");

        anotherSingletonInstance.showMessage();

        if (singletonInstance == anotherSingletonInstance) {
            System.out.println("Both instances are the same.");
        } else {
            System.out.println("Instances are different.");
        }
    }
}

class Singleton {
    private String name;
    private static Singleton instance;

    private Singleton(String name) {
        this.name = name;
    }

    public static Singleton getInstance(String name) {
        if (instance == null) {
            instance = new Singleton(name);
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton Instance: " + name);
    }
}
