package ChapterOne;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class quickUpFirst {

//    public static void main(String [] args) {
//        ChapterOne.quickUpFirst ChapterOne.quickUpFirst = new ChapterOne.quickUpFirst();
//        ChapterOne.quickUpFirst.tryQuickUp();
//    }

    public void tryQuickUp()
    {
        System.out.println("begin.........");
        int size = 27;
        String name = "Fido";
        Dog myDog = new Dog(name, size);
        int x = size - 5;
        if (x < 15) {
            myDog.bark(8);
        }

        while (x > 3) {
            x = myDog.play(x);
        }
        System.out.println("have began.........");

        int[] numList = {2, 4, 6, 8};
        System.out.println("Hello");
        System.out.println("Dog:"+name);
        String num ="8";
        int z = Integer.parseInt(num);
        try {
//            readTheFile("myFile.txt");
            System.out.println("going to try...............");
            new BufferedReader(new FileReader("myFile.txt"));
            System.out.println("trying...............");
        } catch (FileNotFoundException ex) {
            System.out.println("File not Found");
        }
    }

    private class Dog {
        public Dog(String name, int size) {
        }

        public int play(int i) {
            i -= 5;
            System.out.println("play---------"  + i);
            return i;
        }

        public void bark(int i) {
        }
    }
}
