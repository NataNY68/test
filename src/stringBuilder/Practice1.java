package stringBuilder;

public class Practice1 {
    public static void main(String[] args) {

        System.out.println(alpha());
        String str1 = alpha();
        System.out.println(str1.charAt(5));

        StringBuilder builder = new StringBuilder("Sunny");
        System.out.println(builder);//Sunny

        StringBuilder builder1 =new StringBuilder();
       // builder1="wInter"   // Compile Time Error

        builder1.append("Winter");
        System.out.println(builder1);
        builder1.append(" is not having snow for this year");
        System.out.println(builder1);

        builder1= builder1.append(" is not having snow for this year");
        System.out.println(builder1);

        builder1.append(builder1.append("    888   "));
        System.out.println(builder1);




        //create a program to print uppercase alphabet, as a single string
        //by using the StringBuilder object to print lowercase alphabet
        StringBuilder al = new StringBuilder();

        for (char c = 'a'; c<='z'; c++){
            al.append(c);
        }
        System.out.println(al);

        alpabet2();

    }

    public static String  alpha(){
        String str = "";
        for (char ch = 'A'; ch<='Z'; ch++){
            str+=ch;
        }
        return str;
    }

    static public void alpabet2(){
        StringBuilder builder = new StringBuilder();
        for (char c = 'a'; c<='z'; c++){
            builder.append(c);
        }
        System.out.println(builder);
    }
}
