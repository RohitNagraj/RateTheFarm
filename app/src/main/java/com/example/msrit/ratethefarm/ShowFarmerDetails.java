package com.example.msrit.ratethefarm;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ShowFarmerDetails extends AppCompatActivity {

    DatabaseReference mDatabase;

    private TextView mName;
    private TextView mAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_farmer_details);

        mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.child("Users").child(MyAdapter.mClickID).addValueEventListener(new ValueEventListener() {
            @SuppressLint("WrongViewCast")
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                UserData value = dataSnapshot.getValue(UserData.class);
                Toast.makeText(ShowFarmerDetails.this, value.getName(), Toast.LENGTH_SHORT).show();

                //Enter Code Here

                mName = findViewById(R.id.textView);
                mName.setText(value.getName());

                mAge = findViewById(R.id.textView2);
                mAge.setText(Integer.toString(value.getAge()));




            }


            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }
}
