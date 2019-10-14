package id.ac.polinema.project_uts.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import id.ac.polinema.project_uts.R;

public class SegitigaActivity extends AppCompatActivity {
    EditText alas,tinggi,a,b,c;
    Button btnkel,btnluas;
    TextView txthasilkel,txthasilluas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        a = findViewById(R.id.edit_A);
        b = findViewById(R.id.edit_B);
        c = findViewById(R.id.edit_C);
        alas = findViewById(R.id.edit_alas);
        tinggi = findViewById(R.id.edit_tinggi);
        btnkel = findViewById(R.id.btnkel);
        btnluas = findViewById(R.id.btnluas);
        txthasilkel = findViewById(R.id.txthasilkel);
        txthasilluas = findViewById(R.id.txthasilluas);

            btnkel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String isiA = a.getText().toString();
                    String isiB = b.getText().toString();
                    String isiC = c.getText().toString();
                    if(isiA.equals("") || isiB.equals("") || isiC.equals("")){
                        Toast.makeText(getApplication(),"Setiap sisi harus diisi",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        float a = Float.parseFloat(isiA);
                        float b = Float.parseFloat(isiB);
                        float c = Float.parseFloat(isiC);

                        float hasil = KelilingSegitiga(a,b,c);
                        String output = String.valueOf(hasil);
                        txthasilkel.setText(output);
                    }
                }
            });
            btnluas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String isialas = alas.getText().toString();
                    String isitinggi = tinggi.getText().toString();

                    if(isialas.equals("") && isitinggi.equals("")){
                        Toast.makeText(getApplication(),"Mohon alas dan tinggi diisi",Toast.LENGTH_SHORT).show();
                    }else if(isialas.equals("")){
                        Toast.makeText(getApplication(),"Mohon alas diisi",Toast.LENGTH_SHORT).show();
                    }else if(isitinggi.equals("")){
                        Toast.makeText(getApplication(),"Mohon tinggi diisi",Toast.LENGTH_SHORT).show();
                    }else {

                        float alas = Float.parseFloat(isialas);
                        float tinggi = Float.parseFloat(isitinggi);

                        float hasil = LuasSegitiga(alas, tinggi);
                        String output = String.valueOf(hasil);
                        txthasilluas.setText(output);
                    }
                }
            });
    }
    public float KelilingSegitiga(float a, float b, float c){
        return a+b+c;
    }
    public float LuasSegitiga (float alas, float tinggi){
        return alas*tinggi/2;
    }

}
