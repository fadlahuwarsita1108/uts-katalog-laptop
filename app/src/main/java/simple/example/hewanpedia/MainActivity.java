package simple.example.hewanpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnAsus,btnDell,btnLenovo;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnAsus = findViewById(R.id.btn_buka_ras_asus);
        btnDell = findViewById(R.id.btn_buka_ras_dell);
        btnLenovo = findViewById(R.id.btn_buka_ras_lenovo);
        btnAsus.setOnClickListener(view -> bukaGaleri("Asus"));
        btnDell.setOnClickListener(view -> bukaGaleri("Dell"));
        btnLenovo.setOnClickListener(view -> bukaGaleri("Lenovo"));
    }

    private void bukaGaleri(String jenisLaptop) {
        Log.d("MAIN","Buka activity asus");
        Intent intent = new Intent(this, GaleriActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisLaptop);
        startActivity(intent);
    }

}