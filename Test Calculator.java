import java.util.Scanner;

public class TestCalculator {
	public static void main(String[] args) {
	    
	Scanner sc = new Scanner(System.in);
	    
	// Luas Bidang
	int luasPersegi;
	int luasPersegiPanjang;
	double luasLingkaran;
	double luasSegitiga;
	int volumeKubus;
	int volumeBalok;
	double volumeTabung;
	int panjang, lebar, alas, tinggi, jariLingkaran, sisi;
	    
	int pilihan;
	int pilihBidang;
    
    // Enter username and press Enter
    System.out.println("Silahkan Pilih Menu");
    System.out.println("1. Luas Bidang");
    System.out.println("2. Volume Bidang");
    System.out.println("3. Exit");
    pilihan = sc.nextInt();   
       
    System.out.println("Anda memilih nomer : " + pilihan); 
    
    if (pilihan == 1) {
    System.out.println("Silahkan Pilih Bidang yang ingin dihitung");
    System.out.println("1. Persegi");
    System.out.println("2. Persegi Panjang");
    System.out.println("3. Lingkaran");
    System.out.println("4. Segitiga");
    System.out.println("5. Kembali ke menu sebelumnya");
    pilihBidang = sc.nextInt();
    
    System.out.println("Anda memilih bidang nomer : " + pilihBidang); 
    
        if (pilihBidang == 1) {
            System.out.println("Anda memilih Persegi. Silahkan enter dan masukan nilai sisi bidang");
            sisi = sc.nextInt();
            
            luasPersegi = sisi * sisi;
            System.out.println("Luas Persegi Anda: " + luasPersegi);
        } else if (pilihBidang == 2) {
            System.out.println("Anda memilih Persegi Panjang. Silahkan enter dan masukan nilai panjang bidang");
            panjang = sc.nextInt();
            System.out.println("Anda memilih Persegi Panjang. Silahkan enter dan masukan nilai lebar bidang");
            lebar = sc.nextInt();
            
            luasPersegiPanjang = panjang * lebar;
            System.out.println("Luas Persegi Panjang Anda: " + luasPersegiPanjang);
        } else if (pilihBidang == 3) {
            System.out.println("Anda memilih Lingkaran. Silahkan enter dan masukan nilai jari-jari bidang");
            jariLingkaran = sc.nextInt();
            
            luasLingkaran = 3.14 * jariLingkaran * jariLingkaran;
            System.out.println("Luas Lingkaran Anda: " + luasLingkaran);
        } else if (pilihBidang == 4) {
            System.out.println("Anda memilih Segitiga. Silahkan enter dan masukan nilai alas bidang");
            alas = sc.nextInt();
            System.out.println("Anda memilih Segitiga. Silahkan enter dan masukan nilai tinggi bidang");
            tinggi = sc.nextInt();
            
            luasSegitiga = 0.5 * alas * tinggi;
            System.out.println("Luas Segitiga Anda: " + luasSegitiga);
        } else if (pilihBidang == 5) {
            System.out.println("Silahkan Pilih Menu");
            System.out.println("1. Luas Bidang");
            System.out.println("2. Volume Bidang");
            System.out.println("3. Exit");
            pilihan = sc.nextInt();   
       
            System.out.println("Anda memilih nomer : " + pilihan);
        }
    } else if (pilihan == 2) {
        System.out.println("Silahkan Pilih Bidang yang ingin dihitung");
        System.out.println("1. Kubus");
        System.out.println("2. Balok");
        System.out.println("3. Tabung");
        System.out.println("4. Kembali ke menu sebelumnya");
        pilihBidang = sc.nextInt();
    
        System.out.println("Anda memilih bidang nomer : " + pilihBidang);
        
        if (pilihBidang == 1) {
            System.out.println("Anda memilih Kubus. Silahkan enter dan masukan nilai sisi bidang");
            sisi = sc.nextInt();
            
            volumeKubus = sisi * sisi * sisi;
            System.out.println("Volume Kubus Anda: " + volumeKubus);
        } else if (pilihBidang == 2) {
            System.out.println("Anda memilih Balok. Silahkan enter dan masukan nilai panjang bidang");
            panjang = sc.nextInt();
            System.out.println("Anda memilih Balok. Silahkan enter dan masukan nilai lebar bidang");
            lebar = sc.nextInt();
            System.out.println("Anda memilih Balok. Silahkan enter dan masukan nilai tinggi bidang");
            tinggi = sc.nextInt();
            
            volumeBalok = panjang * lebar * tinggi;
            System.out.println("Volume Balok Anda: " + volumeBalok);
        } else if (pilihBidang == 3) {
            System.out.println("Anda memilih Tabung. Silahkan enter dan masukan nilai jari-jari bidang");
            jariLingkaran = sc.nextInt();
            System.out.println("Anda memilih Tabung. Silahkan enter dan masukan nilai tinggi bidang");
            tinggi = sc.nextInt();
            
            volumeTabung = 3.14 * tinggi * jariLingkaran * jariLingkaran;
            System.out.println("Valume Tabung Anda: " + volumeTabung);
        } else if (pilihBidang == 4) {
            System.out.println("Silahkan Pilih Menu");
            System.out.println("1. Luas Bidang");
            System.out.println("2. Volume Bidang");
            System.out.println("3. Exit");
            pilihan = sc.nextInt();   
       
            System.out.println("Anda memilih nomer : " + pilihan);
        }
    } else if (pilihan == 3) {
        System.out.println("Terima kasih telah mempercayai kami :)");
    }
    
	}
}
