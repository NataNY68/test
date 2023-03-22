package stringBuilder;

public class Practice3 {
    public static void main(String[] args) {
        StringBuilder success = new StringBuilder("Tech");
        System.out.println(success.length()); //4

        success.append("nology");
        System.out.println(success.substring(5)); //logy

        System.out.println(success);        // Technology
        String str = success.substring(5);

        //StringBuilder bl1 = success.substring(5);

        StringBuilder bl2 = new StringBuilder(success.substring(5));

        System.out.println(bl2);//ology
        System.out.println(  bl2.equals(str)   ); //false
        System.out.println(   str.equals( bl2 )); //false

        str.concat(" is not a word");
        System.out.println(str); // ology
        System.out.println("==============");

        bl2.append(" is not a word");
        System.out.println(bl2); // ology is not a word

        //insert() ->
        success.insert(5, "TRUE");
        System.out.println(success);

        success.insert(4, true);
        System.out.println(success);

        //TechtruenTRUEology
        //delete() - deleteCharAt()

        success.delete(4,8);
        System.out.println(success);

        //success.delete(5, 9);
        System.out.println(success);

        //what if you dont know index of 'T'
        System.out.println(success.delete(success.indexOf("T", 1), success.indexOf("E")+1));
        System.out.println(success);


        System.out.println("-------------------");
        success.insert(5, "TRUE");
        System.out.println(success);
        success.delete(  success.lastIndexOf("T"), success.indexOf("E")+1 );
        System.out.println(success);

        success.deleteCharAt(1);
        System.out.println(success);




    }
}
