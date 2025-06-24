public class biodata {
    // Atribut
    private String namaLengkap;
    private String npm;
    private String programStudi;
    private int angkatan;

    // Constructor
    public biodata(String namaLengkap, String npm, String programStudi, int angkatan) {
        this.namaLengkap = namaLengkap;
        this.npm = npm;
        this.programStudi = programStudi;
        this.angkatan = angkatan;
    }

    // Method untuk menampilkan data mahasiswa
    public void tampilkanData() {
        System.out.println("=== biodata ===");
        System.out.println("Nama Lengkap : " + namaLengkap);
        System.out.println("NPM          : " + npm);
        System.out.println("Program Studi: " + programStudi);
        System.out.println("Angkatan     : " + angkatan);
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek biodata
        biodata mhs1 = new biodata("Rais Khazim", "2312345678", "Informatika", 2023);

        // Menampilkan data
        biodata1.tampilkanData();
    }
}
