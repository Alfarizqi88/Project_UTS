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
    EditText p,l,pjg,lbr;
    Button btnkel, btnluas;
    TextView txtkel, txtluas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi_panjang);

        p = (EditText)findViewById(R.id.edit_p);
        l = (EditText)findViewById(R.id.edit_l);
        pjg = (EditText)findViewById(R.id.edit_panjang);
        lbr = (EditText)findViewById(R.id.edit_lebar);
        btnkel = (Button)findViewById(R.id.btnkel);
        btnluas = (Button)findViewById(R.id.btnluas);
        txtkel = (TextView)findViewById(R.id.txthasilkel);
        txtluas = (TextView)findViewById(R.id.txthasilluas);

        btnkel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(p.length()==0 && l.length()==0){
                    Toast.makeText(getApplication(),"mohon panjang dan lebar diisi",Toast.LENGTH_LONG).show();
                }else if(p.length()==0){
                    Toast.makeText(getApplication(),"mohon panjang diisi",Toast.LENGTH_LONG).show();
                }else if(l.length()==0){
                    Toast.makeText(getApplication(),"mohon lebar diisi",Toast.LENGTH_LONG).show();
                }else if(p.length() == l.length()){
                    Toast.makeText(getApplication(),"inputan harus berbeda",Toast.LENGTH_LONG).show();
                }
                else {
                    String isiP = p.getText().toString();
                    String isiL = l.getText().toString();

                    float p = Float.parseFloat(isiP);
                    float l = Float.parseFloat(isiL);
                    float hasil = KelilingPersegiPanjang(p,l);
                    String output = String.valueOf(hasil);
                    txtkel.setText(output.toString());
                }
            }
        });
        btnluas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(pjg.length()==0 && lbr.length()==0){
                    Toast.makeText(getApplication(),"mohon panjang dan lebar diisi",Toast.LENGTH_LONG).show();
                    if(pjg.length()==0){
                        Toast.makeText(getApplication(),"mohon panjang diisi",Toast.LENGTH_LONG).show();
                    }else if(lbr.length()==0){
                        Toast.makeText(getApplication(),"mohon lebar diisi",Toast.LENGTH_LONG).show();
                    }
                }else if(pjg.length() < lbr.length()){
                    Toast.makeText(getApplication(),"inputan anda terbalik",Toast.LENGTH_LONG).show();
                }
                else {
                    String isiP = pjg.getText().toString();
                    String isiL = lbr.getText().toString();

                    float pjg = Float.parseFloat(isiP);
                    float lbr = Float.parseFloat(isiL);
                    float hasil = LuasPersegiPanjang(pjg,lbr);
                    String output = String.valueOf(hasil);
                    txtluas.setText(output.toString());
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
