package collections;

public class Value {
    public static void main(String[] args) {
        // MyClass<String, Double> cl = new MyClass<>("Hello", 3.2);
        // MyClass<Double, String> ck = new MyClass<>(3.2, "Hello");
        // cl.display();
        // ck.display();
        myFunc("Hello", 2.3);
    }

    public static <T, P> void myFunc(T value, P value2){
        System.out.println("You entered: " + value + " and: " + value2);
    }
}

// class MyClass<T, P> {
//     private T value;
//     private P value2;
//     public MyClass(T value, P value2){
//     this.value = value;
//     this.value2 = value2;
//     }

//     public void display(){
//         System.out.println("You entered: " + value + " and: " + value2);
//     }
// }
