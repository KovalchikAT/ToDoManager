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
import com.kovalchyk_at.todomanager.Model.ToDoManagerDB;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Kovalchyk_AT on 02.04.2018.
 */

public class DBHelper {
    FirebaseDatabase database;
    DatabaseReference myRef;
    DatabaseReference companyRef;
    ArrayList <Company> companyList;
    HashMap <String,Company> comapnyMap;
    public DBHelper(final Context context) {
        database = FirebaseDatabase.getInstance();
        myRef = database.getReference();
        myRef.addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                companyList = new ArrayList<>();
                comapnyMap = new HashMap<>();
                for (DataSnapshot ds : dataSnapshot.child("company").getChildren()){
                    Company company = ds.getValue(Company.class);
                    companyList.add(company);
                    comapnyMap.put(company.getCompanyId(),company);
                    //company.setCompanyName(ds.child("0").getValue(Company.class).getCompanyName());
                    //company = ds.child("0").getValue(Company.class);
                }
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

    public  Company getCompany(String companyMapId){
        return comapnyMap.get(companyMapId);
    }

    public Company getCompany(int companyArrayId){
        return companyList.get(companyArrayId);
    }

    ValueEventListener userDataBaseListener (){
        return null;
    }
}
