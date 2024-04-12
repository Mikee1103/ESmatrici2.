import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] m1;
        int r1, c1;
        int[][] m2;
        int r2, c2;
        int[][] m3;
        int r3, c3;
        int[][] m4;
        int r4, c4;
        int ind1, ind2;
        int rig1, rig2;

        System.out.println("inserisci numero di righe");
        r1 = in.nextInt();
        System.out.println("insericsci numero di colonne");
        c1 = in.nextInt();
        if (c1 == r1)
            System.out.println("inserisci due valori diversi");
        else {
            m1 = new int[r1][c1];
            for (int i = 0; i < c1; i++) {
                for (int j = 0; j < r1; j++) {
                    System.out.println("valore da inseire");
                    m1[i][j] = in.nextInt();
                }
            }

            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m1[i].length; j++) {
                    System.out.print(m1[i][j] + " ");
                }
                System.out.println();
            }
            // es1
            System.out.println("quale colonna vuoi invertire?");
            ind1 = in.nextInt();
            System.out.println("con quale colonna vuoi invertirla");
            ind2 = in.nextInt();
            InversioneColonne(m1, ind1, ind2);


            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m1[i].length; j++) {
                    System.out.print(m1[i][j] + " ");
                }
                System.out.println();
            }

            // es2
            System.out.println("che riga vuoi invertire?");
            rig1 = in.nextInt();
            System.out.println("con quale riga vuoi invertirla");
            rig2 = in.nextInt();
            InversioneRighe(m1, rig1, rig2);


            for (int i = 0; i < m1.length; i++) {
                for (int j = 0; j < m1[i].length; j++) {
                    System.out.print(m1[j][i] + " ");
                }
                System.out.println();
            }
        }
        System.out.println("inserisci numero di righe");
        r2 = in.nextInt();
        System.out.println("inserisci numero di colonne");
        c2 = in.nextInt();
        if (c2 != r2)
            System.out.println("devi darmi due valori uguali");
        else {
            m2 = new int[r2][c2];
            for (int i = 0; i < c2; i++) {
                for (int j = 0; j < r2; j++) {
                    System.out.println("valore da inseire");
                    m2[i][j] = in.nextInt();
                }
            }


            for (int i = 0; i < m2.length; i++) {
                for (int j = 0; j < m2[i].length; j++) {
                    System.out.print(m2[j][i] + " ");
                }
                System.out.println();
            }

            // es3
            if (Simmetria(m2))
                System.out.println("la matrice è simmetrica rispetto alla diagonale");
            else
                System.out.println("la matrice non è simmetrica rispetto alla diagonale");


            for (int i = 0; i < m2.length; i++) {
                for (int j = 0; j < m2[i].length; j++) {
                    System.out.print(m2[j][i] + " ");
                }
                System.out.println();
            }
        }
        // es4
        modifica(m3);

        for (int i = 0; i < m3.length; i++) {
            for (int j = 0; j < m3[i].length; j++) {
                System.out.print(m3[j][i] + " ");
            }
            System.out.println();
        }

        System.out.println("damminumero di righe");
        r4 = in.nextInt();
        System.out.println("dammi numerodi colonne");
        c4 = in.nextInt();
        if (c4 == r4)
            System.out.println("devi darmi due valori diversi");
        else {
            m4 = new int[r4][c4];
            for (int i = 0; i < c4; i++) {
                for (int j = 0; j < r4; j++) {
                    System.out.println("dammi valore da inseire");
                    m4[i][j] = in.nextInt();
                }
            }

            for (int i = 0; i < m4.length; i++) {
                for (int j = 0; j < m4[i].length; j++) {
                    System.out.print(m4[j][i] + " ");
                }
                System.out.println();
            }

        }
    }

            private static void InversioneColonne ( int[][] m1, int ind1, int ind2){
                int appoggio = 0;
                for (int i = 0; i < m1.length; i++) {
                    appoggio = m1[i][ind1];
                    m1[i][ind1] = m1[i][ind2];
                    m1[i][ind2] = appoggio;
                }
            }

            private static void InversioneRighe ( int[][] m1, int rig1, int rig2){
                int appoggio = 0;
                for (int i = 0; i < m1[0].length; i++) {
                    appoggio = m1[rig1][i];
                    m1[rig1][i] = m1[rig2][i];
                    m1[rig2][i] = appoggio;
                }
            }

            private static boolean Simmetria ( int[][] m1){
                boolean uguali = true;
                for (int i = 0; i < m1.length; i++) {
                    for (int j = 0; j < m1[i].length; j++) {
                        if (m1[i][j] != m1[j][i]) {
                            uguali = false;
                            break;
                        }
                    }
                }
                return uguali;
            }

            private static void modifica(int[][] m1) {
                int appoggio = 0;
                for (int i = 0; i < m1[0].length; i++) {
                    for (int j = 0; j < m1.length; j++) {
                        appoggio = m1[i][j];
                        m1[i][j] = m1[i][j];
                        m1[j][i] = appoggio;
                    }
                }
            }
        }