package string;

public class reverseWordsInAString {
    public static void main(String[] args) {
        String str="a good   example";
        String[] arr=str.split(" ");
        StringBuilder result= new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i].length());
            if(arr[i].length()>0){
                result.append(arr[i].trim());
                result.append(" ");
            }

        }
        String ans=new String(result);
        System.out.println(ans.trim());
    }
}
