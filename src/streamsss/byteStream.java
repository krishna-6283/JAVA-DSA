package streamsss;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class byteStream {
    public static class Streams {
        public static void main(String[] args) throws Exception {
            FileInputStream in = new FileInputStream("input");
            FileOutputStream ou=new FileOutputStream("output");
            int data;
            while ((data=in.read())!=-1){
                ou.write(data);
            }
            in.close();
            ou.close();
        }
    }
}
