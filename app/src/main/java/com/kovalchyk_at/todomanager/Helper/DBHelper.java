package com.kovalchyk_at.todomanager.Helper;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.kovalchyk_at.todomanager.Model.Company;
import com.kovalchyk_at.todomanager.Model.Task;
import com.kovalchyk_at.todomanager.Model.ToDoManagerDB;
import com.kovalchyk_at.todomanager.Model.User;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Kovalchyk_AT on 02.04.2018.
 */

public class DBHelper {
    FirebaseDatabase database;
    DatabaseReference myRef;
    DataSnapshot ds;
    HashMap <String,Company> comapnyMap;
    HashMap <String,User> userMap;
    public DBHelper(final Context context) {
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference();
        comapnyMap = new HashMap<>();
        userMap = new HashMap<>();
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                ds = dataSnapshot;
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
            }
        });
    }

    public void writeDB(String s,String childNumber ) {
        myRef.child("user").child(childNumber).child("userId").setValue(s);
        Log.w("writeDB", "xz "+s);
    }

    public void createNewCompany (Company company){
        myRef.child("company").child(company.getCompanyId()).setValue(company);
    }

    public void createNewUser (User user){
        myRef.child("user").child(user.getUserId()).setValue(user);
    }

    public void createNewTask (Task task){
        myRef.child("task").child(task.getTaskId()).setValue(task);
    }

    public  Company getCompany(String companyMapId){
        for (DataSnapshot dsi : ds.child("company").getChildren()){
            Company company = dsi.getValue(Company.class);
            comapnyMap.put(company.getCompanyId(),company);
        }
        return comapnyMap.get(companyMapId);
    }

    public User getUser(String userMapId){
        for (DataSnapshot dsi : ds.child("company").getChildren()){
            User user = dsi.getValue(User.class);
            userMap.put(user.getUserId(),user);
        }
        return userMap.get(userMapId);
    }

}
