package id.ac.polinema.project_uts.activities;

import androidx.appcompat.app.AppCompatActivity;
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
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        LingkaranFragment lingkaranFragment = (LingkaranFragment) getSupportFragmentManager().findFragmentByTag("LINGKARAN_FRAGMENT");
        if (lingkaranFragment != null && lingkaranFragment.isVisible()) {
//            fragmentTransaction.commit();
        } else {
            fragmentTransaction.replace(R.id.cek1, new LingkaranFragment(), "LINGKARAN_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handleClickPersegiPJG(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        PersegiPanjangFragment persegiPanjangFragment = (PersegiPanjangFragment) getSupportFragmentManager().findFragmentByTag("PANJANG_FRAGMENT");
        if (persegiPanjangFragment != null && persegiPanjangFragment.isVisible()) {
//            fragmentTransaction.commit();
        } else {
            fragmentTransaction.replace(R.id.cek1, new PersegiPanjangFragment(), "PANJANG_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handleClickSegitiga(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        SegitigaFragment segitigaFragment = (SegitigaFragment) getSupportFragmentManager().findFragmentByTag("SEGITIGA_FRAGMENT");
        if (segitigaFragment != null && segitigaFragment.isVisible()) {
//            fragmentTransaction.commit();
        } else {
            fragmentTransaction.replace(R.id.cek1, new SegitigaFragment(), "SEGITIGA_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handleClickPersegi(View view) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        PersegiFragment persegiFragment = (PersegiFragment) getSupportFragmentManager().findFragmentByTag("PERSEGI_FRAGMENT");
        if (persegiFragment != null && persegiFragment.isVisible()) {
//            fragmentTransaction.commit();
        } else {
            fragmentTransaction.replace(R.id.cek1, new PersegiFragment(), "PERSEGI_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
