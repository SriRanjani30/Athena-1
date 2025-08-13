import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence to seperate its words as unique: ");
        String s=sc.nextLine();
        s.replaceAll("\\?","");
        String[] stringArray=s.split(" ");
        ArrayList<String> x=new ArrayList<>(Arrays.asList(stringArray));
        ArrayList<String> unique=new ArrayList<>();
        for(String word:x){
            if(!unique.contains(word)){
                unique.add(word);
            }
        }
        System.out.println(unique);


    }
}