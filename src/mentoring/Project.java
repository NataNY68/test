package mentoring;

import java.util.Random;

public class Project {
    public static void main(String[] args) {
        String str = "abcdefghijklmnopqrstuvwxyz0123456789";
        String id = "";
        for (int i = 0; i < str.length(); i++) {
            Random random = new Random(str.length());
            while (id.length() < 23){
                if(id.length()==8 || id.length()==13 || id.length() == 18)
                    id+="-";
            id += "" + str.charAt(random.nextInt(str.length()));
        }
        }System.out.println(id);


    }
}
