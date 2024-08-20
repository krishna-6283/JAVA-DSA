import java.util.ArrayList;
import java.util.Scanner;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        ArrayList<Integer> list2 = new ArrayList<>(5);
        Scanner in = new Scanner(System.in);
        list.add(4);
        list.add(5);
        list.add(6);
//        for(int i=0;i<list.size();i++){
//            list.add(in.nextInt());
//        }

        while(true){
            int input= in.nextInt();
            if(input == -1){
                break;
            }
            list.add(input);
        }



//        System.out.println(list.get(1));

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println(list.contains(5));
        list.set(0,9);
        list.remove(1);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }


    }
}
