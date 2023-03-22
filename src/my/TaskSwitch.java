package my;

public class TaskSwitch {
    public static void main(String[] args) {
        int a = 3;
        int b = 10;

        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a >> "+ a);
        System.out.println("b >> " +b);

        String s = "soap";
        String str = "";

        for(int i = 0; i<s.length();i++){
           if (s.charAt(i)!='a' &&  s.charAt(i)!='o' && s.charAt(i)!='p'  ){
               str +=s.charAt(i);
           }
       }System.out.println(str);

        String st = "soap";

        for(int i = 0; i < st.length();i++){
            int flag = 0;
            if(st.charAt(i)=='a' || st.charAt(i)=='o' || st.charAt(i)=='p'){
                st = st.replace(st.charAt(i)+ "","");
            }
        }System.out.println(st);


        }
}
