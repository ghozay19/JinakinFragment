package ghozay19.com.jinakinfragment.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ghozay19.com.jinakinfragment.R;
import ghozay19.com.jinakinfragment.childfragment.FragmentEmpat;
import ghozay19.com.jinakinfragment.childfragment.FragmentLima;

public class FragmentTiga extends Fragment {

    public FragmentTiga() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_tiga, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        FragmentEmpat fragmentEmpat = new FragmentEmpat();
        FragmentLima fragmentLima = new FragmentLima();

        FragmentManager fragmentManager = getChildFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.container_child_top, fragmentEmpat)
                .replace(R.id.container_child_bottom, fragmentLima)
                .commit();
    }
}
