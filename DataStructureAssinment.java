package datastructureassinment;
import java.util.Scanner;

public class DataStructureAssinment {

    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("enter A sentance: ");
        String sen = in.nextLine();
        System.out.print("what is the shift amount ? ");
        int shi = in.nextInt();
        Cipher n1 = new Cipher();
        System.out.println("plain text: "+sen);
        System.out.println("the encoded sentenace is: "+n1.encoder(sen, shi));        
        System.out.println("the decoded sentance again: "+n1.decoder(n1.encoder(sen, shi), shi));
          Duplicate<String> d1 = new Duplicate<String>();
        d1.addFirst("apple");
        d1.addFirst("bee");
        System.out.println("\nthe list contains (apple, bee) ");
        System.out.println("when there is no duplicates in the list: ");
        System.out.println(d1.checkDuplicate(d1.head()));
        d1.addFirst("apple");
        System.out.println("now the list is (apple, bee, apple) ");
        System.out.println("when there is duplicates in the list: ");
        System.out.println(d1.checkDuplicate(d1.head()));
    }
    }
    
}
