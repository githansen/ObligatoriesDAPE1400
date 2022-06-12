package Oblig2;

import static javax.swing.JOptionPane.showInputDialog;

public class Main {
    public static void main(String [] args){
        String nedregrense = showInputDialog("SKriv inn et tall, nedre grense");
        String øvregrense = showInputDialog("Skriv inn et tall, øvre grense");
        try {
            int n = Integer.parseInt(nedregrense);
            int u = Integer.parseInt(øvregrense);
            int sum = n;
            System.out.print(n);
            int t = 1;
            for(int i = n+1; i <= u; i++){
                System.out.print(" + " + i);
                if(t%10 == 0) System.out.println();
                sum += i;
                t++;
            }
            System.out.print(" = " + sum);
        }catch (Exception e){
            System.out.println("Feil skjedde");
        }
        Tallspill t = new Tallspill();
        t.kjørSpill();
    }
}
