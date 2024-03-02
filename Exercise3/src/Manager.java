/**
 * <Tugas W4 Exercise 3 task 3.1>
 * Nama    : Nobby Dharma Khaulid
 * Kelas   : 1A - TIF4
 * NIM     : 231524020
 * Tanggal : 2 Maret 2024
 */

 import java.util.GregorianCalendar;
 import java.util.Calendar;
 
/**
* Kelas Manager merupakan turunan dari kelas Employee dan merepresentasikan karyawan dengan jabatan manajer.
* Kelas ini memiliki tambahan atribut secretaryName untuk menyimpan nama sekretaris manajer.
*/
public class Manager extends Employee {
 
    /**
    * Konstruktor untuk objek Manager dengan parameter nama, gaji, tanggal masuk.
    * Memanggil konstruktor kelas Employee untuk menginisialisasi atribut nama, gaji, dan tanggal masuk.
    * Menginisialisasi secretaryName dengan nilai awal string kosong.
    */
    public Manager(String n, double s, int d, int m, int y) {
        super(n, s, d, m, y);
        secretaryName = "";
    }
 
    //Prosedur untuk menaikkan gaji manajer.
    //Tambahan 0.5% bonus untuk setiap tahun masa kerja.
    public void raiseSalary(double byPercent) {
        // Tambahkan bonus 0.5% untuk setiap tahun masa kerja
        GregorianCalendar todaysDate = new GregorianCalendar();
        int currentYear = todaysDate.get(Calendar.YEAR);
        double bonus = 0.5 * (currentYear - hireYear());
        // Panggil prosedur raiseSalary dari kelas Employee untuk menaikkan gaji
        super.raiseSalary(byPercent + bonus);
    }
 
    //fungsi untuk mengambil nama sekretaris manajer.
    public String getSecretaryName(){
        return secretaryName;
    }
 
     // Atribut untuk menyimpan nama sekretaris manajer
     private String secretaryName;
 }