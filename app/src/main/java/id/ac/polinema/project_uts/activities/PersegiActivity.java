package id.ac.polinema.project_uts.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import id.ac.polinema.project_uts.R;

public class PersegiActivity extends AppCompatActivity {
    EditText s,sisi;
    Button btnkel,btnluas;
    TextView txtkel,txtluas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        s =findViewById(R.id.edit_sisi);
        sisi =findViewById(R.id.edit_sisiluas);
        btnkel=findViewById(R.id.btnkel);
        btnluas=findViewById(R.id.btnluas);
        txtkel = findViewById(R.id.txthasilkel);
        txtluas = findViewById(R.id.txthasilluas);

        btnkel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isiS = s.getText().toString();
                if(isiS.equals("") ){
                    Toast.makeText(getApplication(),"mohon sisi diisi",Toast.LENGTH_SHORT).show();
                }else {
                    double s = Double.parseDouble(isiS);
                    double hasil = KelilingPersegi(s);
                    String output = String.valueOf(hasil);
                    txtkel.setText(output);
                }
            }
        });
        btnluas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String isisisi = sisi.getText().toString();

                if(isisisi.equals("")){
                    Toast.makeText(getApplication(),"mohon sisi diisi",Toast.LENGTH_SHORT).show();
                }
                else {

                    double sisi = Double.parseDouble(isisisi);
                    double hasil = LuasPersegi(sisi);
                    String output = String.valueOf(hasil);
                    txtluas.setText(output);
                }
            }
        });
    }
    public double KelilingPersegi(double s){
        return 4 * s ;
    }
    public double LuasPersegi(double sisi){
        return sisi * sisi ;
    }
}
