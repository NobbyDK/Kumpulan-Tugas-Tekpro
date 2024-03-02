/**
 * <Tugas W4 Exercise 3 task 3.1>
 * Nama    : Nobby Dharma Khaulid
 * Kelas   : 1A - TIF4
 * NIM     : 231524020
 * Tanggal : 2 Maret 2024
 */

/**
 * Kelas EmployeeTest digunakan untuk menguji fungsionalitas kelas Employee dan Sortable.
 * Array kemudian diurutkan menggunakan prosedur shell_sort dari kelas Sortable.
 * Gaji semua karyawan dinaikkan sebesar indeks array.
 * Informasi semua karyawan kemudian dicetak menggunakan prosedur print.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0] = new Employee("Antonio Rossi", 2000000, 1, 10, 1989);
        staff[1] = new Employee("Maria Bianchi", 2500000, 1, 12, 1991);
        staff[2] = new Employee("Isabel Vidal", 3000000, 1, 11, 1993);
        
        // Mengurutkan array staff berdasarkan gaji menggunakan shell_sort
        Sortable.shell_sort(staff);

        // Menaikkan gaji semua karyawan sesuai dengan indeks array
        int i;
        for (i = 0; i < 3; i++)
            staff[i].raiseSalary(i);
        
        // Mencetak informasi semua karyawan setelah kenaikan gaji
        for (i = 0; i < 3; i++)
            staff[i].print();
    }
}
