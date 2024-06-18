public class Main {
    private static void sayHello(){
        System.out.println("Hello World!");
    }

    private static void sayHelloManyTimes(int times){
        for (int i = 0; i<times;i++){
            System.out.println("Hello World!");
        }
    }

    public static void main(String[] args) {
        sayHello();
        sayHelloManyTimes(10);
    }

}