package com.kovalchyk_at.todomaneger;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.kovalchyk_at.todomaneger.Fragments.FragmentLogin;
import com.kovalchyk_at.todomaneger.Fragments.FragmentLogout;
import com.kovalchyk_at.todomaneger.Helper.Authentication;

public class MainActivity extends AppCompatActivity {

    private Fragment fragment;
    private FragmentManager fragmentManager;
    private Toast toastMesege;

    public Toast getToastMesege() {
        return toastMesege;
    }

    public void setFragment (Fragment fgm){
        fragment = fgm;
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.mainFrameLayout, fragment).commit();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Authentication.initialize();
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (!Authentication.isSigned()) {
            setFragment(new FragmentLogin());
            Log.w("MainActivity", "start app, user isn't signed" + Authentication.isSigned());
        } else {
            setFragment(new FragmentLogout());
            Log.w("MainActivity", "start app, user is signed" + Authentication.isSigned());
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        Authentication.logOut();
//        Log.w("MainActivity", "log out");
    }
}
