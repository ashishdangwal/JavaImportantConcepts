package com.javapractice.serialdeserial;

import java.io.*;
class DeserializationExample{
    public static void main(String args[]){
        try{
            //Creating stream to read the object
            ObjectInputStream in=new ObjectInputStream(new FileInputStream("C:\\JavaPractice\\obj.txt"));
            Student s=(Student)in.readObject();
            //printing the data of the serialized object
            System.out.println(s.id+" "+s.name);
            //closing the stream
            in.close();
        }catch(Exception e){System.out.println(e);}
    }
}
