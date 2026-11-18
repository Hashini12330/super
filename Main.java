public class Main{
    public static void main(){
        Dog d = new Dog();
        

    }

}

// 4. First use: super() → Parent Constructor

class Animal{
    int age;
    
    Animal(){
        System.out.println("Animal constructor");
    }

    Animal(int age){
        this();     // this() calls another constructor in the same class.
        System.out.println("Age: " + age);
    }
}

class Dog extends Animal{

    Dog(){
        // super(...) must be the first statement in a constructor.

        // super();    // Calls the parent class constructor.   --> Java treats it approximately like
                    // Even without writing super(), Java automatically calls the parent constructor.

        super(10);  // super() calls a parent class constructor.
        System.out.println("Dog constructor");

    }
}