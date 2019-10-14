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
    EditText s,sisi1,sisi2;
    Button btnkel,btnluas;
    TextView txtkel,txtluas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        s =findViewById(R.id.edit_sisi);
        sisi1 =findViewById(R.id.edit_sisiluas1);
        sisi2 =findViewById(R.id.edit_sisiluas2);
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

                String isisisi1 = sisi1.getText().toString();
                String isisisi2 = sisi2.getText().toString();

                if(isisisi1.equals("") && isisisi2.equals("")){
                    Toast.makeText(getApplication(),"mohon Semua sisi diisi",Toast.LENGTH_SHORT).show();
                }else if(isisisi1.equals("")){
                    Toast.makeText(getApplication(),"mohon sisi pertama diisi",Toast.LENGTH_SHORT).show();
                }else if(isisisi2.equals("")){
                    Toast.makeText(getApplication(),"mohon sisi kedua diisi",Toast.LENGTH_SHORT).show();
                }
//                else if(){
//                    Toast.makeText(getApplication(),"inputan sisi harus sama",Toast.LENGTH_SHORT).show();
//                }
                else {

                    double sisi1 = Double.parseDouble(isisisi1);
                    double sisi2 = Double.parseDouble(isisisi2);
                    double hasil = LuasPersegi(sisi1,sisi2);
                    String output = String.valueOf(hasil);
                    txtluas.setText(output);
                }
            }
        });
    }
    public double KelilingPersegi(double s){
        return 4 * s ;
    }
    public double LuasPersegi(double sisi1, double sisi2){
        return sisi1 * sisi2 ;
    }
}
