package Remove_Spaces_String;

public class Remove_spaces {

    public static void main(String[] args) {

        String string= "i am nitin bahagt ";

        String Result ="";

        for(int i=0;i<string.length();i++){

            char ch = string.charAt(i);
            if(ch !=' ')
            {
                Result = Result +ch;
            }

        }

        System.out.println(" "+ Result );


    }
}
