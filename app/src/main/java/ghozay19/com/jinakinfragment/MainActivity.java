package ghozay19.com.jinakinfragment;

import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ghozay19.com.jinakinfragment.fragment.FragmentDua;
import ghozay19.com.jinakinfragment.fragment.FragmentSatu;

public class MainActivity extends AppCompatActivity implements FragmentNavigationListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        openFragmentSatu(null);
        //openFragmentDua(null);


    }

    private void openFragmentDua(Bundle bundle) {
        FragmentDua fragmentDua = new FragmentDua();
        fragmentDua.setNavigationLlistener(this);
        fragmentDua.setArguments(bundle); // ini buat put extra atau mau lempar intent
        commitFragment(fragmentDua);
    }

    private void openFragmentSatu(Bundle bundle) {
        FragmentSatu fragmentSatu = new FragmentSatu();
        fragmentSatu.setNavigationLlistener(this);
        fragmentSatu.setArguments(bundle); // ini buat put extra atau mau lempar intent
        commitFragment(fragmentSatu);
    }

    private void commitFragment(Fragment fragment) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment);

        fragmentTransaction.commit();


        /**
         kalo pake replace nanti liar
         **/
    }

    @Override
    public void openFragment1(Bundle bundle) {
        openFragmentSatu(bundle);
    }

    @Override
    public void openFragment2(Bundle bundle) {
        openFragmentDua(bundle);
    }


    @Override
    public void openFragment(Fragment fragment) {
      commitFragment(fragment);

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
