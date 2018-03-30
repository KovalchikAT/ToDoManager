package com.kovalchyk_at.todomaneger.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.kovalchyk_at.todomaneger.Helper.Authentication;
import com.kovalchyk_at.todomaneger.R;

/**
 * Created by Kovalchyk_AT on 26.03.2018.
 */

public class FragmentLogout extends Fragment {
    private Button logoutButton;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View retV = inflater.inflate(R.layout.fragment_logut, null);
        logoutButton = retV.findViewById(R.id.buttonLogout);
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Authentication.logOut();
                Log.w("MainActivity", "log out " + Authentication.isSigned());
            }
        });
        return retV;
    }
}
