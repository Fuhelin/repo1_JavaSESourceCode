package cn.myTestCode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("F:\\资源\\图片\\TIM截图20200303213951.png");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\1024\\Desktop\\付河林.png");
        byte[] bytes = new byte[1024];
        int len = 0;
       while((len = fis.read(bytes))!= -1){
            fos.write(bytes,0,len);
        }
       long end = System.currentTimeMillis();
        System.out.println("一共花费了"+(end-start)+"毫秒");
       fos.close();
       fis.close();
        System.out.println("使用git");
    }
}
