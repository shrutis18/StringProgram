


import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.*;
import java.util.Scanner;

class Stringprob {


    public static void main(String args[]) throws IOException {
        try {
            String filename = getFileName();
            int cutoff = getThreshold();

            WordCount sb = new WordCount();
            sb.wordCount(filename);
            sb.display(cutoff);
        }
        catch(NumberFormatException e){
            System.out.println(e.getMessage());

        }
    }

    public static String getFileName() throws IOException {

        Scanner reader = new Scanner(System.in);
        System.out.print("Enter the name of your file .... ");
        String fileName;
        File file;
        while (true) {
            fileName = reader.nextLine();
            file = new File(fileName);
            if (!file.exists() || fileName.isEmpty()) {
                System.out.println("Enter A Valid File Name:");

            }
            else if(file.length()<=0)
                System.out.println("file is empty");
            else if(file.isDirectory())
            {
                System.out.println("Its a directory not a file,Please provide a filename");
            }
            else break;
        }
        assert (fileName != null) : "File Name is null";
        assert (fileName.trim().isEmpty() != true) : "File name is empty";
        return fileName;
    }

    public static int getThreshold() {


        Scanner reader = new Scanner(System.in);
           int threshold=0;

        boolean flag = true;
                  while(true) {
                      System.out.println("please enter threshold");



                      try {

                          threshold = Integer.parseInt(reader.next());
                          int  check = threshold;
                          if (check <= 0) {

                              System.out.println("input is not a positive Integer ");
                              System.out.println("Please enter a positive integer seed value: ");
                              continue;
                          } else {
                              System.out.println("threshold is" + threshold);

                          }
                      }
                      catch(NumberFormatException e){
                            throw new NumberFormatException("Input must be an integer");

                          }
                          return threshold;
                      }
                  }




    }





















