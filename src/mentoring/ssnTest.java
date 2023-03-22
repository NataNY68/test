package mentoring;

import java.util.Arrays;

public class ssnTest {
    public static void main(String[] args) {
        String ssn = "123-45-6789";

        for (int i = 0; i<ssn.lastIndexOf("-"); i++){
            if(Character.isDigit(ssn.charAt(i))){
                ssn=ssn.replace(ssn.charAt(i), 'x');
            }
        }System.out.println(ssn);

        String[] sn = ssn.split("-");
        System.out.println(Arrays.toString(sn));
        String str = "";

        for (int i = 0; i < sn.length; i++) {
            for (int j=0; j<sn[i].length(); j++) {
                if(i==sn.length-2){
                    break;
                }
                sn[i]=sn[i].replace(sn[i].charAt(j), 'x');
            }
            System.out.print(sn[i]);
        }











    }
}
