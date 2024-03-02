/**
 * <Tugas W4 Exercise 3 task 3.1>
 * Nama    : Nobby Dharma Khaulid
 * Kelas   : 1A - TIF4
 * NIM     : 231524020
 * Tanggal : 2 Maret 2024
 */

/**
 * Kelas Employee merepresentasikan seorang karyawan.
 * Setiap karyawan memiliki atribut nama, gaji, dan tanggal masuk kerja.
 */
public class Employee implements Sortable {
    // Atribut nama, gaji, dan tanggal masuk kerja
    private String name;
    private double salary;
    private int hireday;
    private int hiremonth;
    private int hireyear;

    
    //Konstruktor untuk objek Employee.
    //Inisialisasi atribut nama, gaji, dan tanggal masuk kerja.
    public Employee(String n, double s, int day, int month, int year){
        name = n;
        salary = s;
        hireday = day;
        hiremonth = month;
        hireyear = year;
    }

    //Prosedur untuk mencetak informasi karyawan.
    public void print(){
        System.out.println(name + " " + salary + " " + hireYear());
    }

    //prosedur untuk menaikkan gaji karyawan.
    public void raiseSalary(double byPercent){
        salary *= 1 + byPercent / 100;
    }

    //fungsi untuk mendapatkan tahun masuk kerja karyawan.
    public int hireYear(){
        return hireyear;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //fungsi untuk membandingkan gaji karyawan dengan objek Sortable lainnya.
    @Override
    public int compare(Sortable staff) {
        Employee eb = (Employee) staff;
        if (salary < eb.salary) return -1;
        if (salary > eb.salary) return 1;
        return 0;
    }
}

