package com.demo.exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResourceDemo {
    public static void main(String[] args) {
       /* FileInputStream fis=null;

        try{
            fis=new FileInputStream("demo1.txt");
            int b=0;
            while((b=fis.read())!=-1){
                System.out.print((char)b);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            try {
                fis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }*/

        //try with resource

        try(FileInputStream  fis=new FileInputStream("demo1.txt");




        ){

            int b=0;
            while((b=fis.read())!=-1){
                System.out.print((char)b);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
