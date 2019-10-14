package id.ac.polinema.project_uts.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import id.ac.polinema.project_uts.R;
import id.ac.polinema.project_uts.fragment.LingkaranFragment;
import id.ac.polinema.project_uts.fragment.PersegiFragment;
import id.ac.polinema.project_uts.fragment.PersegiPanjangFragment;
import id.ac.polinema.project_uts.fragment.SegitigaFragment;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void handleClickLingkaran(View view) {

        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.cek1);
        if(fragment == null || fragment instanceof PersegiFragment || fragment instanceof PersegiPanjangFragment
                || fragment instanceof SegitigaFragment){
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_left,R.anim.enter_from_right)
                    .replace(R.id.cek1,new LingkaranFragment(), "LINGKARAN_FRAGMENT")
                    .addToBackStack(null)
                    .commit();
        }

    }

    public void handleClickPersegiPJG(View view) {

        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.cek1);
        if(fragment == null || fragment instanceof LingkaranFragment || fragment instanceof PersegiFragment
                || fragment instanceof SegitigaFragment){
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_left,R.anim.enter_from_right)
                    .replace(R.id.cek1,new PersegiPanjangFragment(), "PERSEGI_PANJANG_FRAGMENT")
                    .addToBackStack(null)
                    .commit();
        }
    }

    public void handleClickSegitiga(View view) {

        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.cek1);
        if(fragment == null || fragment instanceof LingkaranFragment || fragment instanceof PersegiPanjangFragment
                || fragment instanceof PersegiFragment){
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_left,R.anim.enter_from_right)
                    .replace(R.id.cek1,new SegitigaFragment(), "SEGITIGA_FRAGMENT")
                    .addToBackStack(null)
                    .commit();
        }
    }

    public void handleClickPersegi(View view) {

        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.cek1);
        if(fragment == null || fragment instanceof LingkaranFragment || fragment instanceof PersegiPanjangFragment
                || fragment instanceof SegitigaFragment){
            getSupportFragmentManager().beginTransaction()
                    .setCustomAnimations(R.anim.enter_from_left,R.anim.enter_from_right)
                    .replace(R.id.cek1,new PersegiFragment(), "PERSEGI_FRAGMENT")
                    .addToBackStack(null)
                    .commit();
        }
    }
}
