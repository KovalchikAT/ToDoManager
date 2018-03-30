package com.kovalchyk_at.todomaneger.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.kovalchyk_at.todomaneger.Helper.Authentication;
import com.kovalchyk_at.todomaneger.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentLogin extends Fragment {

    private AutoCompleteTextView emailEditText;
    private EditText passwordEditText;
    private Button loginButton;
    private Button signupButton;
    private TextView forgotPasswordTV;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View retV = inflater.inflate(R.layout.fragment_login, null);

        emailEditText = retV.findViewById(R.id.editTextEmail);
        passwordEditText = retV.findViewById(R.id.editTextPassword);
        loginButton = retV.findViewById(R.id.buttonLogin);
        signupButton = retV.findViewById(R.id.buttonSignup);
        forgotPasswordTV = retV.findViewById(R.id.textViewForgotPassword);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Authentication.logInUser(emailEditText.getText().toString(), passwordEditText.getText().toString());
                if (Authentication.isSigned()) {
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout, new FragmentLogout()).commit();
                    Log.w("MainActivity", "on login clic");
                } else {
                    signupButton.setVisibility(View.VISIBLE);
                    forgotPasswordTV.setVisibility(View.VISIBLE);
                }

            }
        });

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Authentication.createUser(emailEditText.getText().toString(), passwordEditText.getText().toString());
                if (Authentication.isSigned()) {
                    Log.w("MainActivity", "on signup clic");
                    //getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout, new FragmentLogout()).commit();
                    //create user fragm
                } else {
                    // user not created
                }
            }
        });

        return retV;
    }
}