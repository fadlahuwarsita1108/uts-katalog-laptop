package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Asus;
import simple.example.hewanpedia.model.Dell;
import simple.example.hewanpedia.model.Laptop;
import simple.example.hewanpedia.model.Lenovo;

public class DataProvider {
    private static List<Laptop> laptop = new ArrayList<>();

    private static List<Lenovo> initDataLenovo(Context ctx) {
        List<Lenovo> lenovos = new ArrayList<>();
        lenovos.add(new Lenovo(" Lenovo ","Lenovo IdeaPad 310S",
                "Salah satu keunggulan yang dimiliki oleh laptop ini yaitu adanya dukungan dari prosesor Intel generasi terbaru, yakni Brawsell..", R.drawable.lenovo_1));
        lenovos.add(new Lenovo( "Lenovo","Lenovo IdeaPad 320",
                "Lenovo IdeaPad 320 menjadi salah satu laptop buruan bagi banyak orang karena desainnya yang elegan serta dimensi bodinya yang tipis.", R.drawable.lenovo_2));
        lenovos.add(new Lenovo("Lenovo","Lenovo Yoga 310-11IAP-80U200-35ID",
                "Lenovo Yoga 310-11IAP-80U200-35ID merupakan sebuah notebook hybird yang dapat berubah bentuk menjadi tablet. ", R.drawable.lenovo_3));
        lenovos.add(new Lenovo( "Lenovo","Lenovo V110-15ISK",
                "Cari laptop yang bagus untuk mahasiswa atau pekerja kantoran dikisaran harga 5 juta? Mungkin Lenovo V110-15ISK menjadi sebuah pilihan yang tepat.", R.drawable.lenovo_7));
        lenovos.add(new Lenovo( "Lenovo","Lenovo G50-80",
                "Lenovo G50-80 menjadi salah satu laptop dengan dukungan prosesor Core i3 yang dijual dengan harga terjangkau.", R.drawable.lenovo_5));
        lenovos.add(new Lenovo( "Lenovo","Lenovo Yoga Book Android",
                "Lenovo Yoga Book Android sejatinya dirancang khusus untuk mereka yang memiliki kebutuhan istimewa, misalnya para seniman. ", R.drawable.lenovo_6));
        return lenovos;
    }

    private static List<Asus> initDataAsus(Context ctx) {
        List<Asus> asuses= new ArrayList<>();
        asuses.add(new Asus( "Asus","ASUS Vivobook A412",
                "Asus Vivobook A412 merupakan laptop Asus terbaru 14 inci yang memiliki daya gedor kuat untuk digunakan sehari-hari.", R.drawable.asus_1));
        asuses.add(new Asus("Asus","ASUS Vivobook A409",
                "ASUS VivoBook A409 diperkuat prosesor Core i5 hingga i7 dengan RAM DDR4 2400MHz hingga 16GB serta diperkuat oleh chip grafis Nvidia GeForce MX230. ", R.drawable.asus_2));
        asuses.add(new Asus( "Asus","ASUS Vivobook Pro F570",
                "ASUS VivoBook Pro F570 merupakan laptop tipis dan ringan. Layarnya berukuran 15,6 inci mendukung resolusi FullHD rasio 16:9 dengan resolusi 1920x1080 pixel. ", R.drawable.asus_3));
        asuses.add(new Asus( "Asus","ASUS VivoBook Flip TP412",
                "ASUS VivoBook Flip TP412 hadir dengan sistem operasi Windows 10 lengkap dengan fingerprint sensor yang terletak di touchpad. ", R.drawable.asus_4));
        asuses.add(new Asus( "Asus","ASUS ZenBook S UX392",
                "ZenBook S UX392 dilengkapi layar FHD berukuran 13,9 inci dengan bezel yang sangat tipis dengan screen-to-body ratio hingga 97%.", R.drawable.asus_5));
        asuses.add(new Asus( "Asus","ASUS ZenBook Flip UX362",
                "Performa ZenBook Flip UX362 ditenagai prosesor Core i7-8565U generasi ke-8. Selain itu ada juga opsi dengan prosesor Core i5-8265U dan Core i3-8145U. ", R.drawable.asus_6));
        return asuses;
    }
    private static List<Dell> initDataDell(Context ctx) {
        List<Dell> dells= new ArrayList<>();
        dells.add(new Dell( "Dell","Dell Latitude 3380",
                "Laptop ini hadir menawarkan kinerja yang sangat tangguh untuk kebutuhan kerja.", R.drawable.dell_1));
        dells.add(new Dell("Dell","Dell Latitude 3490",
                "Dari fisiknya Dell Latitude 3490 ini tak jauh berbeda jauh dari seri sebelumnya yang masih mengandalkan ciri khas berwarna hitam. ", R.drawable.dell_2));
        dells.add(new Dell("Dell","Dell Latitude 5290",
                "Laptop yang dirancang untuk bisnis ini ditenagai oleh prosesor Intel Core i5-8250U yang memiliki kecepatan proses minimal 1,7GHz.", R.drawable.dell_3));
        dells.add(new Dell( "Dell","Dell Latitude 5490",
                "Laptop ini memiliki ukuran layar 14 inci lengkap dengan teknologi Full HD dan Anti-Glare untuk memberikan kenyamanan pada mata. ", R.drawable.dell_4));
        dells.add(new Dell( "Dell","Dell Latitude 7390",
                "Terakhir ada laptop Dell Latitude 7390 yang hadir dengan bentang layar 13,3 inci Full HD beresolusi 1920 x 1080 piksel.", R.drawable.dell_5));
        return dells;
    }

    private static void initAllLaptops(Context ctx) {
        laptop.addAll(initDataLenovo(ctx));
        laptop.addAll(initDataAsus(ctx));
        laptop.addAll(initDataDell(ctx));
    }

    public static List<Laptop> getAlllaptop(Context ctx) {
        if (laptop.size() == 0) {
            initAllLaptops(ctx);
        }
        return  laptop;
    }

    public static List<Laptop> getHewansByTipe(Context ctx, String model) {
        List<Laptop> hewansByType = new ArrayList<>();
        if (laptop.size() == 0) {
            initAllLaptops(ctx);
        }
        for (Laptop h : laptop) {
            if (h.getModel().equals(model)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
