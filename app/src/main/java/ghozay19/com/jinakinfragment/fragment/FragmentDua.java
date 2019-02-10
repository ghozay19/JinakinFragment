package ghozay19.com.jinakinfragment.fragment;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import ghozay19.com.jinakinfragment.FragmentNavigationListener;
import ghozay19.com.jinakinfragment.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentDua extends Fragment implements View.OnClickListener {

    String message;
    private FragmentNavigationListener navigationListener;

    public FragmentDua() {
        // Required empty public constructor
    }

    public void setNavigationLlistener(FragmentNavigationListener navigationLlistener){
        this.navigationListener = navigationLlistener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fragment_dua, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView tvMessage = view.findViewById(R.id.tvMessage);
        Button btnFragmentTiga = view.findViewById(R.id.btnFragmentTiga);
        btnFragmentTiga.setOnClickListener(this);
        getDataBundle();
        setMessage(tvMessage);




    }

    private void setMessage(TextView tvMessage) {
        if (message != null && !message.isEmpty()){
            tvMessage.setText(message);
        }
    }

    private void getDataBundle() {
        //buat nangkep intent dari setArgument
        Bundle bundle = getArguments();
        if(bundle != null){
            message = bundle.getString("data");

        }
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnFragmentTiga:
                goToFragmentTiga();
                break;
            default:
                break;
        }
    }

    private void goToFragmentTiga() {
        String param1 =  " Judul Buat Child 1";
        String param2 =  " Judul Buat Child 1";
        Bundle bundle = new Bundle();
        bundle.putString("param1", param1);
        bundle.putString("param2", param2);
        FragmentTiga fragmentTiga = new FragmentTiga();
        fragmentTiga.setArguments(bundle);
        navigationListener.openFragment(fragmentTiga);
    }
}
