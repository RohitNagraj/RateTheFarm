package com.example.msrit.ratethefarm;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import android.view.View;
import android.widget.RatingBar;
import android.widget.Button;

public class ShowFarmerDetails extends AppCompatActivity {

    DatabaseReference mDatabase;
    private UserData userData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_farmer_details);

        //Rating bar initialization
        final RatingBar ratingBar = findViewById(R.id.consumer_rating);
        Button submitButton = findViewById(R.id.submit);

        //Firebase login details fetch
        final FirebaseUser loggedInUser = FirebaseAuth.getInstance().getCurrentUser();
        

        //Firebase userdata fetch
        mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.child("Users").child(MyAdapter.mClickID).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                userData = dataSnapshot.getValue(UserData.class);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (userData.getEmail().equals(loggedInUser.getEmail())){

                    Toast.makeText(getApplicationContext(), "Cannot rate your own profile",Toast.LENGTH_LONG).show();
                }
                else{
                    userData.setConsumerRating(ratingBar.getRating());

                    Toast.makeText(getApplicationContext(), "Rating submitted successfully", Toast.LENGTH_LONG).show();

                    mDatabase.child("Users").child(Integer.toString(userData.getUserID())).setValue(userData);
                }


            }
        });

    }
}


//TODO prevent farmer from rating himself. - Done
//TODO prevent going to GetFarmerDetails on pressing back.
//TODO add app icon.
//TODO optimize rating algorithm
//TODO Be clear about mulberry yield and other fields
//TODO make fields non empty properly - done
//TODO Add logout button
//TODO add rotation lock