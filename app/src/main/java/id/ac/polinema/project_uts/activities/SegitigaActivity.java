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

        a = (EditText)findViewById(R.id.edit_A);
        b = (EditText)findViewById(R.id.edit_B);
        c = (EditText)findViewById(R.id.edit_C);
        alas = (EditText)findViewById(R.id.edit_alas);
        tinggi = (EditText)findViewById(R.id.edit_tinggi);
        btnkel = (Button)findViewById(R.id.btnkel);
        btnluas = (Button)findViewById(R.id.btnluas);
        txthasilkel = (TextView)findViewById(R.id.txthasilkel);
        txthasilluas = (TextView)findViewById(R.id.txthasilluas);

            btnkel.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(a.length() == 0 && b.length()== 0 && c.length()==0){
                        Toast.makeText(getApplication(),"Setiap sisi harus diisi",Toast.LENGTH_LONG).show();
                    }else{
                        String isiA = a.getText().toString();
                        String isiB = b.getText().toString();
                        String isiC = c.getText().toString();

                        float a = Float.parseFloat(isiA);
                        float b = Float.parseFloat(isiB);
                        float c = Float.parseFloat(isiC);

                        float hasil = KelilingSegitiga(a,b,c);
                        String output = String.valueOf(hasil);
                        txthasilkel.setText(output.toString());
                    }
                }
            });
            btnluas.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(alas.length()==0 && tinggi.length()==0){
                        Toast.makeText(getApplication(),"Mohon alas dan tinggi diisi",Toast.LENGTH_LONG).show();
                    }else if(alas.length()==0){
                        Toast.makeText(getApplication(),"Mohon alas diisi",Toast.LENGTH_LONG).show();
                    }else if(tinggi.length()==0){
                        Toast.makeText(getApplication(),"Mohon tinggi diisi",Toast.LENGTH_LONG).show();
                    }else {
                        String isialas = alas.getText().toString();
                        String isitinggi = tinggi.getText().toString();

                        float alas = Float.parseFloat(isialas);
                        float tinggi = Float.parseFloat(isitinggi);

                        float hasil = LuasSegitiga(alas, tinggi);
                        String output = String.valueOf(hasil);
                        txthasilluas.setText(output.toString());
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
