package pl.waw.sgh;

import java.io.*;
import java.util.Scanner;

public class Hw3 {

    public static void main(String[] args) throws IOException {
        File inFile = new File("d:/CP_homework/H3");

        if (inFile.isDirectory()) {
            File[] files = inFile.listFiles();
            for (File f : files)
            {
                if (f.isFile()) {
                    File myFile = new File("d:/CP_homework/H3/exported_file_" + f.getName());
                    FileWriter fw = new FileWriter(myFile, true);
                    BufferedWriter bw = new BufferedWriter(fw);

                    float op = 0;
                    float cl = 0;
                    float ch = 0;
                    String chtxt;
                    String linia1;
                    String line;
                    Scanner scanner = new Scanner(f);

                    for (int w = 0; w < 23; w++)
                    {
                        line = scanner.nextLine();
                        bw.write(line);
                        String[] elems = line.split(",");
                        if (w == 0)
                        {
                            bw.write(",Percentage_change");
                        }
                        if (w > 0)
                        {
                            for (int j = 0; j < 6; j++)
                            {
                                linia1 = elems[j];
                                if (j == 4) cl = Float.parseFloat(linia1);
                                if (j == 1) op = Float.parseFloat(linia1);
                            }
                        }
                        if ((cl != 0) && (op != 0))
                        {
                            ch = (cl - op) / cl;
                            chtxt = String.valueOf(ch);
                            bw.write("," + chtxt);
                        }
                        cl = 0;
                        op = 0;
                        bw.newLine();
                    }
                    bw.close();
                    fw.close();
                }
            }
        }
    }
}