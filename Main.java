public class Main {
    public static void main(String[] args) {
        Dosen dsn = new Dosen();
        dsn.setNama("Bryan S.I.Kom");
        dsn.setJurusan("Ilmu Komunikasi");
        dsn.setNidn(2098904);
        dsn.setTtl("Yogyakarta 29-04-1999");
        dsn.setJenkel("Laki-Laki");
        dsn.setAlamat("Yogyakarta");
        dsn.setTahunMasuk(2018);

        Tendik tndk = new Tendik();
        tndk.setNama("Refa");
        tndk.setNip(892895);
        tndk.setTtl("Jakarta, 10-03-1999");
        tndk.setAlamat("Jakarta");
        tndk.setJenkel("Perempuan");
        tndk.setTahunMasuk(2000);

        System.out.println("Nama Dosen             : "+ dsn.getNama());
        System.out.println("Jurusan                : "+ dsn.getJurusan());
        System.out.println("NIDN                   : "+ dsn.getNidn());
        System.out.println("Tempat, Tanggal Lahir  : "+ dsn.getTtl());
        System.out.println("Jenis Kelamin          : "+ dsn.getJenkel());
        System.out.println("Alamat Dosen           : "+ dsn.getAlamat());
        System.out.println("Tahun masuk            : "+ dsn.getTahunMasuk());
        System.out.println("Gaji pokok             : "+ dsn.gajiTotal());
        System.out.println("Kelas lebih (6 SKS)    : "+ dsn.mengajarLebih(6));
        System.out.println("Gaji total             : "+ dsn.gajiTotal(6));

        System.out.println("\n");
        System.out.println("Nama Tendik             : "+ tndk.getNama());
        System.out.println("NIP  Tendik             : "+ tndk.getNip());
        System.out.println("Tempat, Tanggal Lahir   : "+ tndk.getTtl());
        System.out.println("Jenis Kelamin           : "+ tndk.getJenkel());
        System.out.println("Alamat                  : "+ tndk.getAlamat());
        System.out.println("Tahun masuk             : "+ tndk.getTahunMasuk());
        System.out.println("Gaji pokok              : "+ tndk.gajiTotal());
        System.out.println("Upah lembur(20 jam)     : "+ tndk.lembur(20));
        System.out.println("Gaji total              : "+ tndk.gajiTotal(20));
    }
}

//Bunga Syahira Najla
//2100018215
//Kelas D