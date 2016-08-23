import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class WordCount {

    private List list = null;
    private int[] frequency;

                public  void wordCount(String fileName) throws IOException {
                    String singleLine = null;
                    String fullDataFromFile = null;
                        int flag = 0;
                        FileReader file = new FileReader(fileName);
                        BufferedReader reader = new BufferedReader(file);
                        try {
                            singleLine = reader.readLine();
                        } catch (FileNotFoundException e) {
                            flag = 1;
                            e.printStackTrace();
                        }
                        /*System.out.println(flag);
                        if (flag == 1) {
                            System.out.println("please enter full path");


                        } else {
                            System.out.println("exit successfully");

                        }*/

                    while (singleLine != null) {
                        fullDataFromFile = fullDataFromFile + singleLine;
                        singleLine = reader.readLine();
                    }
                    String[] splitStr = fullDataFromFile.split(" ");
                    int counter = 0;
                     int storefrequency=0;
                    List<String> list = new ArrayList<>();
                    for (String s : splitStr) {
                        if (!list.contains(s)) {
                            list.add(s);
                        }
                    }
                    int[] frequency = new int[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        for (int j = 0; j < splitStr.length; j++) {
                            if (list.get(i).equals(splitStr[j])) {

                                storefrequency = counter++;

                            }

                        }
                        frequency[i] = storefrequency;
                        counter = 0;
                        this.frequency = frequency;
                        this.list = list;


                    }

                }

                public void display(int cutoff)
            {
                for(int iterator=0;iterator<list.size();iterator++)
                {
                   if(frequency[iterator]>=cutoff)
                    System.out.println("Occurrence of " + list.get(iterator) + " is " + frequency[iterator] + " times.");


                }
            }
}