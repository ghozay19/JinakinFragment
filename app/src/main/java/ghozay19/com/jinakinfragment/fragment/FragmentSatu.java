package ghozay19.com.jinakinfragment.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import ghozay19.com.jinakinfragment.FragmentNavigationListener;
import ghozay19.com.jinakinfragment.R;

public class FragmentSatu extends Fragment implements View.OnClickListener {

    private FragmentNavigationListener navigationListener;

    public FragmentSatu() {
        // Required empty public constructor
    }


    public void setNavigationLlistener(FragmentNavigationListener navigationLlistener){
        this.navigationListener = navigationLlistener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_satu, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button button = view.findViewById(R.id.button_fragment_dua);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_fragment_dua:
                goToFragmentDua();
                break;
            default:
                break;
        }
    }

    private void goToFragmentDua() {
        Bundle bundle = new Bundle();
        bundle.putString("data", "data dari fragment satu");
        navigationListener.openFragment2(bundle);
    }
}
