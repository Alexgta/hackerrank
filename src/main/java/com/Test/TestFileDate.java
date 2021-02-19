package com.Test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestFileDate {


    public static void main(String[] args) throws IOException {

        /*drwxrwxrwt  11 root     sys         7652 Dec  7 17:48 ..
        -rwxr-xr-x   1 alevas   bns          621 Dec  7 16:37 MM205_prd.sh
        drwxr-xr-x   3 alevas   bns          249 Dec  7 16:37 .
        drwxr-xr-x   2 alevas   bns          248 Dec  7 16:23 source*/

        String[] lines = {
                "drwxrwxrwt  11 root     sys         7652 Dec  7 17:48 ..",
                "-rwxr-xr-x   1 alevas   bns          621 Dec_ 7=16:37+MM205_prd.sh",
                "-rwxr-xr-x   1 alevas   bns          621 Dec  7 16:55 test.txt",
                "drwxr-xr-x   3 alevas   bns          249 Dec  7 16:37 .",
                "drwxr-xr-x   2 alevas   bns          248 Dec  7 16:23 source",
                "-rw-r--r--   1 wssprdop wssprd        65 Oct 26 10:56 DIARY02_AS4_20201026.mrk",
                "-rw-r--r--   1 wssprdop wssprd     17054 Oct 26 10:56 DIARY02_AS4_20201026.CSV"
        };

        for (String line : lines) {
            //line.replaceAll("  ", " ");
            Pattern pattern = Pattern.compile("Oct|Dec");
            Matcher matcher;
            String date;
            String fileName;

            if (line.startsWith("-")) {
                matcher = pattern.matcher(line);
                if (matcher.find()) {
                    line = line.substring(matcher.start());
                }
                if (line.substring(4,5).equals(" "))
                    line = line.substring(0, 4) + "0" + line.substring(5);
                date = "2020 " + line.substring(0, 12);
                fileName = line.substring(13);

                System.out.println(line + " - '" + line.substring(4,5) + "'" + ". Date: " + date + ", fileName:" + fileName);
            }
        }


        System.out.println("main start");

        File file = new File("C:/tmp/dateTest.txt");
        FileWriter fileWriter = new FileWriter(file, true);
        long time = 100000000;
        fileWriter.write("Hello world");
        fileWriter.flush();
        fileWriter.close();
        System.out.println(file.setLastModified(time));

    }


}
