import java.util.*;
public class JavaApplication1 {
    public static void main(String[] args) {

        ArrayList<Integer> nilai = new ArrayList();
        Scanner scan = new Scanner(System.in);
        System.out.print("Inputkan Panjang array : ");
        int panjang = scan.nextInt();

        for (int i = 0; i < panjang; i++) {
            System.out.print("Nilai index ke "+i+" : ");
            int angka = scan.nextInt();
            nilai.add(angka);
        }
        System.out.println("Sebelum Di Sorting"+ nilai);
        for (int i = 0; i < nilai.size(); i++) {
            for (int j = 0; j < nilai.size()-1; j++) {
                if (nilai.get(j) > nilai.get(j+1)) {
                    int temp = nilai.get(j);
                    nilai.set(j, nilai.get(j+1));
                    nilai.set(j+1, temp);
                }
            }
        }
        System.out.println("Setelah Di Sorting : "+nilai);
    }
}
