package stringBuilder;

public class Practice7 {
    //create a method
    //pas a StringBuilder as a parameter
    //that method will return sum of digits from given StringBuilder
    //"SDFGbnm$%&*!235*JHGF" = 2+3+5=10;

    public static int sum(StringBuilder str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)>='0' && str.charAt(i)<='9'){
                sum += Integer.parseInt(""+str.charAt(i));
                //sum+=Integer.parseInt(String.valueOf(str.charAt(i)))
            }
        }System.out.println(sum);
        return sum;

    }

    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("SDFGbnm$%&*!235*JHGF81");
        sum(str);

        Character ch = '5';
        System.out.println(Character.isDigit(ch));
    }
}
