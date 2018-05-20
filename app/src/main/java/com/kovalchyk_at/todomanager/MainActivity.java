package com.kovalchyk_at.todomanager;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Toast;

import com.kovalchyk_at.todomanager.Fragments.FragmentCompanyDetail;
import com.kovalchyk_at.todomanager.Fragments.FragmentLogin;
import com.kovalchyk_at.todomanager.Fragments.FragmentLogout;
import com.kovalchyk_at.todomanager.Fragments.FragmentTaskDetail;
import com.kovalchyk_at.todomanager.Fragments.FragmentUserDetail;
import com.kovalchyk_at.todomanager.Helper.Authentication;
import com.kovalchyk_at.todomanager.Helper.DBHelper;

public class MainActivity extends AppCompatActivity {

    private Fragment fragment;
    private FragmentManager fragmentManager;
    private Toast toastMesege;
    public static DBHelper sHelper;

    public void setToast(String str){
        toastMesege.makeText(this,str,Toast.LENGTH_LONG).show();
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
        MyTask myTask = new MyTask();
        myTask.execute();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Authentication.logOut();
        Log.w("MainActivity", "log out");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        menu.findItem(R.id.log_out_mi).setVisible(false);
        return true;
    }

    class MyTask extends AsyncTask<Void,Void,Void> {
    ProgressDialog pd = new ProgressDialog(MainActivity.this);
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            pd.setTitle("Please wait...");
            pd.show();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            Authentication.initialize();
            sHelper= new DBHelper(MainActivity.this);
            if (!Authentication.isSigned()) {
                setFragment(new FragmentLogin());
                Log.w("MainActivity", "start app, user isn't signed" + Authentication.isSigned());
            } else {
                //setFragment(new FragmentTaskList());
                setFragment(new FragmentUserDetail());
                Log.w("MainActivity", "start app, user is signed" + Authentication.isSigned());
            }

            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            pd.dismiss();
        }
    }
}
