package Overloading;

public class HitungVolumeLuasPermukaan {
    int s, p, l, t;
            
    public int hitungVolume(int s){
        return s * s * s;
    }
    public int hitungVolume(int p, int l, int t){
        return p * l * t;
    }
    public int hitungLuasPermukaan(int s){
        return 6 * s * s;
    }
    public int hitungLuasPermukaan(int p, int l, int t){
        return 2 * ((p*l) + (p*t) + (l*t));
    }
}
