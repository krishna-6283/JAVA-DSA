public class string {
    public static void main(String[] args) {
        String a = new String("Gopal");
        String b = new String("Gopal");
        String c="Gopal";
        String d="Gopal";
        System.out.println(a.equals(b));
        System.out.println(c==d);
        Integer num=56;
        System.out.println(num.toString());
        StringBuilder str= new StringBuilder("gopal");
        System.out.println(str.length());
        str.reverse();
        String s=str.substring(0,3);
        System.out.println(s);
        System.out.println(str.subSequence(0,3));

        System.out.println(str);
        String temp="abcdchba";
        StringBuilder temp1=new StringBuilder(temp);
        StringBuilder temp2=new StringBuilder(temp);
        temp2.reverse();
        System.out.println(temp1.compareTo(temp2) == 0);
    }
}
