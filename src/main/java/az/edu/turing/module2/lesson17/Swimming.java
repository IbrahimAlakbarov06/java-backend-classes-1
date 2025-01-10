package az.edu.turing.module2.lesson17;

 interface Swimming {
     void swim();

     void foo();

     default void dive(){
         System.out.println("Diving");
     }
     static void takeBreathe(){
         System.out.println("Taking a breathe");
     }
}
