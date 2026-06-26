import java.util.*;

class findpermutationOfString{


    public static void permutation(String s, String a){
        if(s.length()==0){
            System.out.println(a);
            return;
    
        }

        for(int i=0;i<s.length();i++){
        char c= s.charAt(i);
        String s1=s.substring(0,i)+s.substring(i+1);
        permutation(s1, a+c);

        }

    }
    public static void main(String[] durga){
        String s = "abc";
        permutation(s,"");



    }
}