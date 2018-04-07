package com.kovalchyk_at.todomanager.Fragments;

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
import android.widget.Toast;

import com.kovalchyk_at.todomanager.Helper.Authentication;
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

        forgotPasswordTV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                helper = new DBHelper(getActivity().getApplicationContext());
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Authentication.logInUser(emailEditText.getText().toString(), passwordEditText.getText().toString());
                if (Authentication.isSigned()) {
                    getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.mainFrameLayout, new FragmentLogout()).commit();
                    Log.d("MainActivity", "on login clic");
                    Toast.makeText(getActivity().getApplicationContext(), "login" , Toast.LENGTH_LONG).show();
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
                    Log.d("MainActivity", "on signup clic");
                    Toast.makeText(getActivity().getApplicationContext(), "signUp",Toast.LENGTH_LONG).show();
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