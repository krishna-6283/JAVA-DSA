import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class arrayList2D {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        for(int i =0;i<3;i++){
            list.add(new ArrayList<>());
        }

        for(int i =0;i<list.size();i++){
            for(int j = 0;j<3;j++){
                list.get(i).add(in.nextInt());
            }
        }
        for(int i =0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);

    }
}
