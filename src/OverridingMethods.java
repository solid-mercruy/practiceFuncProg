public class OverridingMethods {
    void method1(){
        System.out.println("Method 1 from parent non-static");
    }
    static void method2(){
        System.out.println("Method 2 form parent static");
    }

}
class child extends OverridingMethods{
    @Override
    void method1() {
        System.out.println("Method 1 from child non-static");
    }
    static void method2(){
        System.out.println("Method2 from child static");
    }
    public static void main(String[] args){
        child childoo = new child();
        childoo.method1();
        childoo.method2();


    }
}
