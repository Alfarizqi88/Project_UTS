package id.ac.polinema.project_uts.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import id.ac.polinema.project_uts.R;

public class LingkaranActivity extends AppCompatActivity {
    EditText r,jarijari;
    EditText jari;
    Button btnkel,btnluas,btnhitung;
    TextView txtkel,txtluas,txthitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        r = findViewById(R.id.edit_r);
        jarijari = findViewById(R.id.editjarijari);
        jari = findViewById(R.id.edit_R);
        btnkel = findViewById(R.id.btnkel);
        btnluas = findViewById(R.id.btnluas);
        btnhitung = findViewById(R.id.btnhitung);
        txtkel = findViewById(R.id.txthasilkel);
        txtluas = findViewById(R.id.txthasilluas);
        txthitung = findViewById(R.id.txthitung);

        btnkel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isi_r = r.getText().toString();
                if(isi_r.equals("")){
                    Toast.makeText(getApplication(),"mohon jari - jari diisi",Toast.LENGTH_SHORT).show();
                }else {
                    double r = Double.parseDouble(isi_r);
                    double hasil = KelilingLingkaran(r);
                    String output = String.valueOf(hasil);
                    txtkel.setText(output);
                }
            }
        });
        btnluas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isijarijari = jarijari.getText().toString();
                if(isijarijari.equals("") ){
                    Toast.makeText(getApplication(),"mohon jari - jari pada luas diisi",Toast.LENGTH_SHORT).show();
                }else {
                    double jarijari = Double.parseDouble(isijarijari);
                    double hasil = LuasLingkaran(jarijari);
                    String output = String.valueOf(hasil);
                    txtluas.setText(output);
                }
            }
        });
        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isir=jari.getText().toString();
                if(isir.equals("")){
                    Toast.makeText(getApplication(),"mohon jari - jari diisi",Toast.LENGTH_SHORT).show();
                }else {
                    double r = Double.parseDouble(isir);
                    double hasil = HitungDiameter(r);
                    String output = String.valueOf(hasil);
                    txthitung.setText(output);
                }
            }
        });
    }

    private double HitungDiameter(double r) {return 2 * r;}
    public double KelilingLingkaran(double r){
        return 2 * 3.14 * r;
    }
    public double LuasLingkaran(double jarijari){
        return 3.14 * jarijari * jarijari;
    }
}
