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
    Button btnkel,btnluas;
    TextView txtkel,txtluas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lingkaran);

        r = (EditText)findViewById(R.id.edit_r);
        jarijari = (EditText)findViewById(R.id.editjarijari);
        btnkel =(Button) findViewById(R.id.btnkel);
        btnluas =(Button) findViewById(R.id.btnluas);
        txtkel = (TextView)findViewById(R.id.txthasilkel);
        txtluas = (TextView)findViewById(R.id.txthasilluas);

        btnkel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(r.length()==0){
                    Toast.makeText(getApplication(),"mohon jari - jari pada keliling diisi",Toast.LENGTH_LONG).show();
                }else {
                    String isi_r = r.getText().toString();

                    double r = Double.parseDouble(isi_r);
                    double hasil = KelilingLingkaran(r);
                    String output = String.valueOf(hasil);
                    txtkel.setText(output.toString());
                }
            }
        });
        btnluas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(jarijari.length()==0 ){
                    Toast.makeText(getApplication(),"mohon jari - jari pada luas diisi",Toast.LENGTH_LONG).show();
                }else {
                    String isijarijari = jarijari.getText().toString();

                    double jarijari = Double.parseDouble(isijarijari);
                    double hasil = LuasLingkaran(jarijari);
                    String output = String.valueOf(hasil);
                    txtluas.setText(output.toString());
                }
            }
        });
    }
    public double KelilingLingkaran(double r){
        return 2 * 3.14 * r;
    }
    public double LuasLingkaran(double jarijari){
        return 3.14 * jarijari * jarijari;
    }
}
