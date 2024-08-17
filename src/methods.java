import java.util.Arrays;

public class methods {
    public static void main(String[] args) {
        String name="Gopal";
        change(name);
        int[] arr={1,2,5,3,7};
        charngearr(arr);
        System.out.println(name);
        System.out.println(Arrays.toString(arr));
        int a=9;
        changeint(a);
        System.out.println(a);
        varargs(2,3,3,5,6,3,787);
        multiple(2,4,"gopal", "krishna");
    }

    static void charngearr(int[] arr) {
        arr[0]=20;
    }
    static  void changeint(int a){
        a=5;
    }

    static void change(String name){
        name="Krishna";

    }
    static void varargs(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a, int b, String ...v){
        System.out.println(a+b +" "+ Arrays.toString(v));
    }
}
// METHOD OVERLOADING
// SAME NAME - DIFFERENT PARAMETERS