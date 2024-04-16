public class stringreverse {
    public static void main(String[] args) {
        String str="anubhav.strivastav";
        String str1="";
        String str2="";
        for(int i=str.length()-1;i>=0;i--)
        {
            str1+=str.charAt(i);
        }
        System.out.println(str1);
       String str3="";
        for(int i=str1.length()-1;i>=0;i--)
        {
            str3+=str1.charAt(i);

        }
        System.out.println(str3);
    }
re}
