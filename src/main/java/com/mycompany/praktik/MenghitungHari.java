import java.util.Scanner;

class hitung{
    // Atribut
    double j;
    int tanggal, bulan, tahun, k, h;
    String day;
    // Metode
    void input(){
    Scanner myInput = new Scanner(System.in);
    System.out.println("Masukkann Tanggal, Bulan, Tahun");
    tanggal = myInput.nextInt();
    bulan = myInput.nextInt();
    tahun = myInput.nextInt();
    }
    
    void hitung(){
 
    int tahunTemp = tahun;
    if(bulan<=2){
        tahunTemp -= 1;
    }    
    
    switch(bulan){
    case 1 -> bulan = 13;
    case 2 -> bulan = 14;
    }
    k = tahunTemp%100;
    j = tahun/100;
    h = (int)((tanggal+(13*(bulan+1)/5)+k+(k/4)+(j/4)+5*j)%7);
    }
    
    void hari(){
    switch(h){
    case 0 -> day = "Sabtu";
    case 1 -> day = "Minggu";
    case 2 -> day = "Senin";
    case 3 -> day = "Selasa";
    case 4 -> day = "Rabu";
    case 5 -> day = "Kamis";
    case 6 -> day = "Jumat";
    }
    }
    
    void output(){
        System.out.print(tanggal+"/"+bulan+"/"+tahun+" adalah hari "+day);
    }
}

public class MenghitungHari {

    public static void main(String[] args) {
        hitung obj1 = new hitung();
        obj1.input();
        obj1.hitung();
        obj1.hari();
        obj1.output();
    }
    
}
