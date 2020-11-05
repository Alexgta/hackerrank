package com.IKMnet.Second28;

import java.io.*;
import java.util.Optional;

public class Quastion52 {

    public static void main(String[] args) throws FileNotFoundException {
        Optional<String> f = Optional.of("file.java");
        File f1 = new File(f.get());

        Reader ioutA = new FileReader(f1);

        /*InputStream ioutB = new InputStream(f1) {
            @Override
            public int read() throws IOException {
                return 0;
            }
        };*/

        InputStream ioutC = new FileInputStream(f1);
        //RandomAccessFile rfD = new RandomAccessFile(f1);
        FileOutputStream ioutE = new FileOutputStream(f1);

    }

}
