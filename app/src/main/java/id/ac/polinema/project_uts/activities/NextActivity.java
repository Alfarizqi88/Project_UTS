package id.ac.polinema.project_uts.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import id.ac.polinema.project_uts.R;
import id.ac.polinema.project_uts.fragment.LingkaranFragment;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
    }

    public void handlelingkaran(View view) {
//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        LingkaranFragment lingkaranFragment = (LingkaranFragment) getSupportFragmentManager().findFragmentByTag("LINGKARAN_FRAGMENT");
//        if (lingkaranFragment != null && lingkaranFragment.isVisible()) {
////            fragmentTransaction.commit();
//        } else {
//            fragmentTransaction.replace(R.id.NextLayout, new LingkaranFragment(), "LINGKARAN_FRAGMENT");
//            fragmentTransaction.addToBackStack(null);
//            fragmentTransaction.commit();
//        }
    }
}
