package com.example.msrit.ratethefarm;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import android.view.View;
import android.widget.RatingBar;
import android.widget.Button;

public class ShowFarmerDetails extends AppCompatActivity {
//UserData man = new UserData();
    DatabaseReference mDatabase;
    private int userID;
    private UserData userData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_farmer_details);

        
        final RatingBar simpleRatingBar = (RatingBar) findViewById(R.id.consumer_rating);
        Button submitButton = (Button) findViewById(R.id.submit);
        

        mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.child("Users").child(MyAdapter.mClickID).addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                userData = dataSnapshot.getValue(UserData.class);
                userID = userData.getUserID();

                //Toast.makeText(ShowFarmerDetails.this, userData.getName(), Toast.LENGTH_SHORT).show();
            }


            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String totalStars = "Total Stars : " + simpleRatingBar.getNumStars();
                String consumerRating = "Rating : " + simpleRatingBar.getRating();

                userData.setConsumerRating(simpleRatingBar.getRating());

                Toast.makeText(getApplicationContext(), Integer.toString(userData.getNoOfConsumers()), Toast.LENGTH_SHORT).show();

                mDatabase.child("Users").child(Integer.toString(userData.getUserID())).setValue(userData);


                //Toast.makeText(getApplicationContext(), totalStars + "\n" + consumerRating, Toast.LENGTH_LONG).show();
            }
        });

    }
}
