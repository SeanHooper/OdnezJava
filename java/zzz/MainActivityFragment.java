package com.zendo.zzz;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements OnClickListener{

    View rootView;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Button b = (Button) rootView.findViewById(R.id.loginbutton);
        b.setOnClickListener(this);

        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.loginbutton:
                startActivity(new Intent(getActivity(), TopAdCategoryActivity.class));
                break;
        }
    }
}
