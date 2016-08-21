



import java.util.ArrayList;
import java.util.List;

class Stringprob {


    public static void main (String args[]) {
        String str = "I am a Boy I am a a";
        String[] splitStr = str.split(" ");
        int count = 0;
        List<String> list = new ArrayList<>();
        for (String s : splitStr) {
            if (!list.contains(s)) {
                list.add(s);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < splitStr.length; j++) {
                if (list.get(i).equals(splitStr[j])) {
                    count++;
                }
            }

                System.out.println("Occurrence of " + list.get(i) + " is " + count + " times.");
                count = 0;

        }
    }

}




