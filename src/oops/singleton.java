package oops;




public class singleton {
    public static class Singleton{
        private Singleton(){
            System.out.println("Yooo");
        }
        private static Singleton instance;

        public static Singleton getInstance(){
            if(instance==null){
                instance=new Singleton();
            }
            return instance;
        }
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
    }
}
