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
        s =(EditText)findViewById(R.id.edit_sisi);
        sisi1 =(EditText)findViewById(R.id.edit_sisiluas1);
        sisi2 =(EditText)findViewById(R.id.edit_sisiluas2);
        btnkel=(Button)findViewById(R.id.btnkel);
        btnluas=(Button)findViewById(R.id.btnluas);
        txtkel = (TextView)findViewById(R.id.txthasilkel);
        txtluas = (TextView)findViewById(R.id.txthasilluas);

        btnkel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(s.length()==0 ){
                    Toast.makeText(getApplication(),"mohon sisi diisi",Toast.LENGTH_LONG).show();
                }else {
                    String isiS = s.getText().toString();

                    double s = Double.parseDouble(isiS);
                    double hasil = KelilingPersegi(s);
                    String output = String.valueOf(hasil);
                    txtkel.setText(output.toString());
                }
            }
        });
        btnluas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sisi1.length()==0 && sisi2.length()==0){
                    Toast.makeText(getApplication(),"mohon Semua sisi diisi",Toast.LENGTH_LONG).show();
                }else if(sisi1.length()==0){
                    Toast.makeText(getApplication(),"mohon sisi pertama diisi",Toast.LENGTH_LONG).show();
                }else if(sisi2.length()==0){
                    Toast.makeText(getApplication(),"mohon sisi kedua diisi",Toast.LENGTH_LONG).show();
                }else {
                    String isisisi1 = sisi1.getText().toString();
                    String isisisi2 = sisi2.getText().toString();

                    double sisi1 = Double.parseDouble(isisisi1);
                    double sisi2 = Double.parseDouble(isisisi2);
                    double hasil = LuasPersegi(sisi1,sisi2);
                    String output = String.valueOf(hasil);
                    txtluas.setText(output.toString());
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
