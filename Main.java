public class Main{
    public static void main(){

        // 01
        Dog d = new Dog();
        System.out.println("---------------------------------------");

        // 02
        Dog2 d2 = new Dog2();
        d2.sound();




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


// 9. Second use: super.method()

class Animal2{
    void sound(){
        System.out.println("Animal makes sound");
    }

}

class Dog2 extends Animal2{
    void sound(){   // Here the child overrides the parent's sound().

        super.sound();      // you want the parent's version inside the child. --> without super() print only Dog
        System.out.println("Dog say bow");

    }
}