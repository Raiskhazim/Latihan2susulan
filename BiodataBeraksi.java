public class Biodata {
    // Atribut
    private String namaLengkap;
    private String npm;
    private String programStudi;
    private int angkatan;

    // Constructor
    public Biodata(String namaLengkap, String npm, String programStudi, int angkatan) {
        this.namaLengkap = namaLengkap;
        this.npm = npm;
        this.programStudi = programStudi;
        this.angkatan = angkatan;
    }

    // Method untuk menampilkan biodata
    public void tampilkanBiodata() {
        System.out.println("===== BIODATA MAHASISWA =====");
        System.out.println("Nama Lengkap   : " + namaLengkap);
        System.out.println("NPM            : " + npm);
        System.out.println("Program Studi  : " + programStudi);
        System.out.println("Angkatan       : " + angkatan);
    }

    // Method main
    public static void main(String[] args) {
        // Membuat objek dari class Biodata
        Biodata rais = new Biodata("Rais Khazim", "2312345678", "Teknik Informatika", 2023);

        // Menjalankan method untuk menampilkan data
        rais.tampilkanBiodata();
    }
}
