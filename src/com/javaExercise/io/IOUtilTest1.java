package com.javaExercise.io;

import java.io.IOException;

/**
 * Created by yuanyin on 16/1/27.
 */
public class IOUtilTest1 {
    public static void main(String[] args)  {
        try {
            IOUtil.printHex("./javaExercise.iml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
