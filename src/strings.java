public class strings {
    public static void main(String[] args) {
        String a= "Gopal";
        String b = "Gopal";
        b="krishna";
        System.out.println(b);
        String series="";
        for(int i=0;i<26;i++){
            char ch = (char)('a' + i);
            series+=ch;

        }
        System.out.println(series);
        //n square complexity

        StringBuilder builder = new StringBuilder();
        for(int i=0;i<26;i++){
            char ch = (char)('a' + i);
            builder.append(ch);

        }
        System.out.println(builder.toString());
        System.out.println(builder.reverse());

    }
}
