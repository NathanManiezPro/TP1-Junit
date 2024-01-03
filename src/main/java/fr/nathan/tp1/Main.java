package fr.nathan.tp1;
import fr.nathan.tp1.exo1.Moyenne;
public class Main {
    public static void main(String[]args){
        Moyenne moyenne = new Moyenne();
        int[] notes = {12,10,20,20};
        System.out.println(moyenne.moyenne(notes));
    }
    }

