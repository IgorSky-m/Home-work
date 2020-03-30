package edu.academy;

public class MassivesAndCycles {
    //do...while
    public void doWhile(int[] a) {
        int i = 0;
        do {
            if (i%2 !=0) System.out.print(a[i]+ " ");
            i++;

        } while (i< a.length);
        System.out.println("");
    }
//While
    public void withWhile (int[] a) {
        int i = 0;
        while (i<a.length) {
            if (i%2 !=0) System.out.print(a[i]+ " ");
            i++;
        }
        System.out.println("");
    }
//for
    public void withFor (int[] a) {
        for (int i = 0; i <a.length ; i++) {
            if (i%2 != 0) System.out.print(a[i] + " "); //
        }
        System.out.println("");
    }

//forearch
    public void forEach (int[] a) {
        int count = 0;
        for (int i:a) {
           if (count%2 != 0) System.out.print(i + " ");
            count++;
        }
        System.out.println("");
    }

}
