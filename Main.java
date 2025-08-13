import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("================================");
            System.out.println("1.Seperate words from sentence\n2.Convert sentence to lowercase\n3.Convert sentence to uppercase\n4.Exit");
            System.out.println("================================");
            System.out.println("Enter your choice:");
            int ch=sc.nextInt();
            sc.nextLine();
            switch(ch){
                case 1:
                System.out.println("Enter a sentence to seperate its words as unique: ");
                String s=sc.nextLine();
                s=s.replaceAll("[^a-zA-Z ]","");
                String[] stringArray=s.split("\\s+");
                ArrayList<String> x=new ArrayList<>(Arrays.asList(stringArray));
                ArrayList<String> unique=new ArrayList<>();
                for(String word:x){
                     if(!unique.contains(word)){
                         unique.add(word);
                      }
                 }
                 System.out.println("After seperating unique words: ");
                System.out.println(unique);
                System.out.println();
                break;

                case 2:
                System.out.println("Enter a sentence to convert it to lowercase:");
                String lowerCase=sc.nextLine();
                System.out.println("Converting to lowercase....");
                lowerCase=lowerCase.toLowerCase();
                System.out.println(lowerCase);
                System.out.println();
                break;

                case 3:
                System.out.println("Enter the sentence to convert it to uppercase:");
                String upperCase=sc.nextLine();
                System.out.println("Converting to uppercase....");
                upperCase=upperCase.toUpperCase();
                System.out.println(upperCase);
                System.out.println();
                break;

                case 4:
                System.out.println("Thank you!");
                return;

            }

        }
    }
}