package id.ac.polinema.project_uts.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import id.ac.polinema.project_uts.R;

public class PersegiPanjangActivity extends AppCompatActivity {
    private EditText p,l,pjg,lbr;
    private Button btnkel, btnluas;
    private TextView txtkel, txtluas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        p = findViewById(R.id.edit_p);
        l = findViewById(R.id.edit_l);
        pjg = findViewById(R.id.edit_panjang);
        lbr = findViewById(R.id.edit_lebar);
        btnkel = findViewById(R.id.btnkel);
        btnluas = findViewById(R.id.btnluas);
        txtkel = findViewById(R.id.txthasilkel);
        txtluas = findViewById(R.id.txthasilluas);

        btnkel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isiP = p.getText().toString();
                String isiL = l.getText().toString();

                if(isiP.equals("") && isiL.equals("")){
                    Toast.makeText(getApplication(),"mohon panjang dan lebar diisi",Toast.LENGTH_SHORT).show();
                }else if(isiP.equals("")){
                    Toast.makeText(getApplication(),"mohon panjang diisi",Toast.LENGTH_SHORT).show();
                }else if(isiL.equals("")){
                    Toast.makeText(getApplication(),"mohon lebar diisi",Toast.LENGTH_SHORT).show();
                }
                else if(isiP.equals(isiL)){
                    Toast.makeText(getApplication(),"inputan anda tidak boleh sama",Toast.LENGTH_SHORT).show();
                }
                else {
                    float p = Float.parseFloat(isiP);
                    float l = Float.parseFloat(isiL);
                    float hasil = KelilingPersegiPanjang(p,l);
                    String output = String.valueOf(hasil);
                    txtkel.setText(output);
                }
            }
        });
        btnluas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String isiP = pjg.getText().toString();
                String isiL = lbr.getText().toString();

                if(isiP.equals("") && isiL.equals("")){
                    Toast.makeText(getApplication(),"mohon panjang dan lebar diisi",Toast.LENGTH_SHORT).show();
                }else if(isiP.equals("")){
                    Toast.makeText(getApplication(),"mohon panjang diisi",Toast.LENGTH_SHORT).show();
                }else if(isiL.equals("")){
                    Toast.makeText(getApplication(),"mohon lebar diisi",Toast.LENGTH_SHORT).show();
                }
                else if(isiP.equals(isiL)){
                    Toast.makeText(getApplication(),"inputan anda tidak boleh sama",Toast.LENGTH_SHORT).show();
                }
                else {
                    float pjg = Float.parseFloat(isiP);
                    float lbr = Float.parseFloat(isiL);
                    float hasil = LuasPersegiPanjang(pjg,lbr);
                    String output = String.valueOf(hasil);
                    txtluas.setText(output);
                }
            }
        });
    }
    public float KelilingPersegiPanjang(float p,float l){
        return (p + l)*2;
    }
    public float LuasPersegiPanjang(float pjg, float lbr){
        return pjg * lbr;
    }
}
