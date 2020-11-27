package simple.example.hewanpedia;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import simple.example.hewanpedia.model.Laptop;

public class GaleriActivity extends AppCompatActivity {

    List<Laptop> laptops;
    int indeksTampil = 0;
    String jenislaptop;
    Button btnPertama,btnTerakhir,btnSebelumnya,btnBerikutnya;
    TextView txModel,txSeri,txDeskripsi,txJudul;
    ImageView ivFotoLaptop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_ras);
        Intent intent = getIntent();
        jenislaptop = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        laptops = DataProvider.getHewansByTipe(this,jenislaptop);
        inisialisasiView();
        tampilkanProfil();
    }

    private void inisialisasiView() {
        btnPertama = findViewById(R.id.btnPertama);
        btnSebelumnya = findViewById(R.id.btnSebelumnya);
        btnBerikutnya = findViewById(R.id.btnBerikutnya);
        btnTerakhir = findViewById(R.id.btnTerakhir);

        btnPertama.setOnClickListener(view -> hewanPertama());
        btnTerakhir.setOnClickListener(view -> hewanTerakhir());
        btnSebelumnya.setOnClickListener(view -> hewanSebelumnya());
        btnBerikutnya.setOnClickListener(view -> hewanBerikutnya());

        txModel = findViewById(R.id.txModel);
        txSeri = findViewById(R.id.txSeri);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoLaptop = findViewById(R.id.gambarHewan);

        txJudul = findViewById(R.id.txJudul);
        txJudul.setText("Berbagai Macam Laptop "+jenislaptop);
    }


    private void tampilkanProfil() {
        Laptop k = laptops.get(indeksTampil);
        Log.d("LAPTOP","Menampilkan laptop"+k.getModel());
        txModel.setText(k.getModel());
        txSeri.setText(k.getSeri());
        txDeskripsi.setText(k.getDeskripsi());
        ivFotoLaptop.setImageDrawable(this.getDrawable(k.getDrawableRes()));
    }

    private void hewanPertama() {
        int posAwal = 0;
        if (indeksTampil == posAwal) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAwal;
            tampilkanProfil();
        }
    }

    private void hewanTerakhir() {
        int posAkhir = laptops.size() - 1;
        if (indeksTampil == posAkhir) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAkhir;
            tampilkanProfil();
        }
    }

    private void hewanBerikutnya() {
        if (indeksTampil == laptops.size() - 1) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil++;
            tampilkanProfil();
        }
    }

    private void hewanSebelumnya() {
        if (indeksTampil == 0) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil--;
            tampilkanProfil();
        }
    }
}