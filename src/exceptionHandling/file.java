package exceptionHandling;

public class file {
    public static void main(String[] args) {
        int a=5;
        int b=0;

        try{
            System.out.println(divide(a,b));

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("always executes");
        }
    }
    public static int divide(int a,int b) throws Exception{
        if(b==1){
            throw new Exception("b is 0");
        }
        return a/b;
    }
}
