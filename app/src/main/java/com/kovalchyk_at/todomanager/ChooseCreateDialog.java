package com.kovalchyk_at.todomanager;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import com.kovalchyk_at.todomanager.Fragments.FragmentCompanyDetail;


public class ChooseCreateDialog extends DialogFragment {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        final AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        View view = inflater.inflate(R.layout.fragment_create_dialog, null);
        builder.setView(view);

        Button createCompanyButton = view.findViewById(R.id.createCompanyButton);
        Button createUserButton = view.findViewById(R.id.createUserButton);

        createCompanyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout, new FragmentCompanyDetail()).commit();
                getDialog().cancel();
            }
        });

        createUserButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout, new FragmentUserDetail()).commit();
                getDialog().cancel();
            }
        });

        return builder.create();
    }
}
