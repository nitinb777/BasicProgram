package Repalce_String;

public class string_replace {


    public static void main(String[] args) {


        String original=" i work in abc and i love pabc" ;
        String target= "abc";
        String replace= "wipro";
        String Result="";

        Boolean match=true;

        for (int i=0 ; i<original.length();){

            if(i<=original.length()-target.length()){

                if(original.charAt(i)==target.charAt(0) && original.charAt(i+1)== target.charAt(1)
                        && original.charAt(i+2)== target.charAt(2)){

                    Result=Result+replace;
                    i = i+ target.length();
                }else {
                    Result=Result+original.charAt(i);
                    i++;
                }

            }else {
                Result=Result+original.charAt(i);
                i++;
            }
        }
        System.out.println("" + Result);

    }
}
