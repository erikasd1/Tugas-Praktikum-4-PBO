package Overloading;

public class HitungDemoVolumeLuasPermukaan {
    public static void main(String[] args){
        HitungVolumeLuasPermukaan hitung = new HitungVolumeLuasPermukaan();
        System.out.println("Volume Kubus: " +hitung.hitungVolume(3));
        System.out.println("Volume Balok: " +hitung.hitungVolume(3,2,4));
        System.out.println("Luas Permukaan Kubus: " +hitung.hitungLuasPermukaan(3));
        System.out.println("Luas Permukaan Balok: " +hitung.hitungLuasPermukaan(3,2,4));
    }
}