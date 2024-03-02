/**
 * <Tugas W4 Exercise 3 task 3.1>
 * Nama    : Nobby Dharma Khaulid
 * Kelas   : 1A - TIF4
 * NIM     : 231524020
 * Tanggal : 2 Maret 2024
 */

//Kelas abstrak Sortable digunakan untuk merepresentasikan objek yang dapat dibandingkan dan diurutkan.
abstract class Sortable {
    //Metode untuk membandingkan objek ini dengan objek lain untuk urutan.
    //Mengembalikan bilangan negatif jika objek ini lebih kecil dari objek lain,Z
    //0 jika objek ini sama dengan objek lain, dan bilangan positif jika objek ini lebih besar.
    public abstract int compare(Sortable b);
    
    
    //Prosedur untuk mengurutkan sebuah array objek Sortable menggunakan algoritma Shell sort.
    public static void shell_sort(Sortable[] a){
        int n = a.length;
        
        for(int jarak = n/2; jarak > 0; jarak /= 2){
            for(int i = jarak; i < n; i++){
                Sortable temp = a[i];
                int j;
                for(j = i; j >= jarak && a[j - jarak].compare(temp) < 0; j -= jarak){
                    a[j] = a[j - jarak];
                }
                a[j] = temp;
            }
        }
    }
    
    //Prosedur untuk mencetak elemen-elemen dari array objek Sortable.
    public static void printperson(Sortable[] A){
        for(Sortable person : A){
            System.out.println(person);
        }
    }
}