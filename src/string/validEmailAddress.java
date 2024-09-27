package string;
import java.util.*;
public class validEmailAddress {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "test.email+alex@gmail.com",
                "test.e.mail+bob.cathy@gmail.com",
                "testemail+david@g.mail.com"
        );
        Set<String> unique=new HashSet<>();
        for(String email:list){
            String[] parts=email.split("@");
            String local=parts[0];
            String domain=parts[1];
            local=local.split("\\+")[0];
            local=local.replace(".","");
            unique.add(local+"@"+domain);

        }
        System.out.println(unique.size());
    }
}