package com.kovalchyk_at.todomanager.Helper;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

/**
 * Created by Kovalchyk_AT on 02.04.2018.
 */

public class DBHelper {
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();
    DatabaseReference dbUserRef = myRef.child("User");
    DatabaseReference dbTaskRef = myRef.child("Task");
    DatabaseReference dbCompanyRef = myRef.child("Company");
    String s ;

    public void setTXT (String str){
        myRef.child("txt").setValue(str);
    }
    public  String  getS(){return s;}
    public DBHelper(final Context context) {
        database = FirebaseDatabase.getInstance();
        myRef.child("txt").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                String txt = dataSnapshot.getValue(String.class);
                s= txt;
                Toast.makeText(context,txt,Toast.LENGTH_LONG);
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });


        /*
        ValueEventListener userDataBaseListener = new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // Get Post object and use the values to update the UI
                User user = dataSnapshot.getValue(User.class);
                // ...
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                // Getting Post failed, log a message
                Log.w("TAG", "loadPost:onCancelled", databaseError.toException());
                // ...
            }
        };*/

        /*myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
                *//*String value = dataSnapshot.getValue(String.class);
                Log.d("DB", "Value is: " + value);*//*
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w("DB", "Failed to read value.", error.toException());
            }
        });*/
    }

    public void writeDB(String s) {
        myRef.child("User").child("0").child("id").setValue(s);
        Log.w("writeDB", "xz");
    }

    ValueEventListener userDataBaseListener (){

        return null;
    }


}
