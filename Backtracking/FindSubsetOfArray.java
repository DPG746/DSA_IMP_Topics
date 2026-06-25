import java.util.*;
class FindSubsetOfArray{

    public static void findsub(String str, String ans, int i){
        if(i==str.length()){
            System.out.println(ans);
            return;

        }

        //yes
        findsub(str, ans+str.charAt(i), i+1);

        //no
        findsub(str,ans,i+1);

    }

    public static void main(String[] durga){
        String str="abc";
        findsub(str,"",0);
    }

}