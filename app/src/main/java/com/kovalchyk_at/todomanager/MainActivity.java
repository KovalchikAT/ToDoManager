package com.kovalchyk_at.todomanager;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.kovalchyk_at.todomanager.Fragments.FragmentLogin;
import com.kovalchyk_at.todomanager.Fragments.FragmentLogout;
import com.kovalchyk_at.todomanager.Helper.Authentication;
import com.kovalchyk_at.todomanager.Helper.DBHelper;

public class MainActivity extends AppCompatActivity {

    private Fragment fragment;
    private FragmentManager fragmentManager;
    private Toast toastMesege;
    public static DBHelper sHelper;

    public void setToast(String str){
        toastMesege.makeText(this,str,Toast.LENGTH_LONG);
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
    }

    @Override
    protected void onStart() {
        super.onStart();
        Authentication.initialize();
        sHelper= new DBHelper(this);
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

    class MyTask extends AsyncTask<Void,Void,Void> {

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
        }
    }
}
