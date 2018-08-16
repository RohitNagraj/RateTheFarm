package com.example.msrit.ratethefarm;

import android.annotation.SuppressLint;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
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

        //Textviews initialization
        final TextView mName = findViewById(R.id.name);
        final TextView mAge = findViewById(R.id.age);
        final TextView mVillage = findViewById(R.id.village);
        final TextView mTaluq = findViewById(R.id.taluq);
        final TextView mTotalLand = findViewById(R.id.land);
        final TextView mIrrigatedOrRainfed = findViewById(R.id.irrigated_or_rainfed);
        final TextView mRating = findViewById(R.id.rating);


        final TextView mCropName = findViewById(R.id.crop);
        final TextView mCropArea = findViewById(R.id.crop_area);
        final TextView mCropYield = findViewById(R.id.crop_yield);
        final TextView mYieldPerHectare = findViewById(R.id.yield_per_hectare);
        final TextView mMaleWorkers = findViewById(R.id.male_workers);
        final TextView mFemaleWorkers = findViewById(R.id.female_workers);


        final TextView mCows = findViewById(R.id.cow);
        final TextView mBuffalos = findViewById(R.id.buffalo);
        final TextView mCocks = findViewById(R.id.cock);
        final TextView mHens = findViewById(R.id.hen);
        final TextView mGoats = findViewById(R.id.goat);
        final TextView mSheeps = findViewById(R.id.sheep);
        final TextView mOtherAnimals = findViewById(R.id.other_animals);


        final TextView mTractor = findViewById(R.id.tractor);
        final TextView mBullockCart = findViewById(R.id.bullock_cart);
        final TextView mPlougher = findViewById(R.id.plougher);
        final TextView mRotomator = findViewById(R.id.rotomator);
        final TextView mSprinkler = findViewById(R.id.sprinkler);
        final TextView mSprayer = findViewById(R.id.sprayer);
        final TextView mPowerTiller = findViewById(R.id.power_tiller);


        final TextView mMulberry = findViewById(R.id.mulberry_cultivation);
        final TextView mOnlineSale = findViewById(R.id.online_sale);
        final TextView mScientificSuggestion = findViewById(R.id.scientific_suggestions);
        final TextView mNursery = findViewById(R.id.owns_nursery);
        final TextView mLocalSales = findViewById(R.id.local);
        final TextView mAPMCSales = findViewById(R.id.apmc);
        final TextView mEmail = findViewById(R.id.email);



        //Firebase login details fetch
        final FirebaseUser loggedInUser = FirebaseAuth.getInstance().getCurrentUser();
        

        //Firebase userdata fetch
        mDatabase = FirebaseDatabase.getInstance().getReference();
        mDatabase.child("Users").child(MyAdapter.mClickID).addValueEventListener(new ValueEventListener() {
            @SuppressLint({"SetTextI18n", "DefaultLocale"})
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                userData = dataSnapshot.getValue(UserData.class);


                mName.setText               ("Name         :   " + userData.getName());
                mAge.setText                ("Age             :   " + userData.getAge());
                mVillage.setText            ("Village        :   " + userData.getVillage());
                mTaluq.setText              ("Taluq          :   " + userData.getTaluq());
                mTotalLand.setText          ("Total Land :   " + Double.toString(userData.getLand()) + " hectares");
                mIrrigatedOrRainfed.setText ("   :   " + userData.getIrrigatedOrRainfed());
                mRating.setText(String.format("%.1f",userData.getRating()));


                mCropName.setText      ("Crop                        :   " + userData.getCropName());
                mCropArea.setText      ("Area                        :  " + Double.toString(userData.getCropArea()) + " hectares");
                mCropYield.setText     ("Yield                        :  " + Double.toString(userData.getCropYield()) + " KGs");
                mYieldPerHectare.setText("Yield per hectare  :  " + String.format("%.1f",userData.getYieldPerHectare()) + " KGs / hectare");
                mMaleWorkers.setText   ("Men in field            :   " + userData.getMaleWorkers());
                mFemaleWorkers.setText ("Women in field      :   " + userData.getFemaleWorkers());


                mCows.setText("Cows  :   " + Integer.toString(userData.getCow()));
                mBuffalos.setText("Buffalos :   " + Integer.toString(userData.getBuffalo()));
                mCocks.setText("Cocks :   " + Integer.toString(userData.getCock()));
                mHens.setText("Hens       :   " + Integer.toString(userData.getHen()));
                mGoats.setText("Goats :   " + Integer.toString(userData.getGoat()));
                mSheeps.setText("Sheeps   :   " + Integer.toString(userData.getSheep()));
                mOtherAnimals.setText("Other Animals :   " + Integer.toString(userData.getOtherAnimals()));


                if(userData.getOwnsTractor()) {
                    mTractor.setText("Tractor  :  Yes");
                    mTractor.setTextColor(getResources().getColor(R.color.true_color));
                }
                else{
                    mTractor.setText("Tractor  :  No");
                    mTractor.setTextColor(getResources().getColor(R.color.false_color));
                }

                if(userData.getOwnsBullockCart()) {
                    mBullockCart.setText("Bullock Cart  :  Yes");
                    mBullockCart.setTextColor(getResources().getColor(R.color.true_color));
                }
                else{
                    mBullockCart.setText("Bullock Cart  :  No");
                    mBullockCart.setTextColor(getResources().getColor(R.color.false_color));
                }

                if(userData.getOwnsPlougher()) {
                    mPlougher.setText("Plougher  :  Yes");
                    mPlougher.setTextColor(getResources().getColor(R.color.true_color));
                }
                else{
                    mPlougher.setText("Plougher  :  No");
                    mPlougher.setTextColor(getResources().getColor(R.color.false_color));
                }

                if(userData.getOwnsRotomator()) {
                    mRotomator.setText("Rotomator  :  Yes");
                    mRotomator.setTextColor(getResources().getColor(R.color.true_color));
                }
                else{
                    mRotomator.setText("Rotomator  :  No");
                    mRotomator.setTextColor(getResources().getColor(R.color.false_color));
                }

                if(userData.getOwnsSprinkler()) {
                    mSprinkler.setText("Sprinkler  :  Yes");
                    mSprinkler.setTextColor(getResources().getColor(R.color.true_color));
                }
                else{
                    mSprinkler.setText("Sprinkler  :  No");
                    mSprinkler.setTextColor(getResources().getColor(R.color.false_color));
                }

                if(userData.getOwnsSprayer()) {
                    mSprayer.setText("Sprayer  :  Yes");
                    mSprayer.setTextColor(getResources().getColor(R.color.true_color));
                }
                else{
                    mSprayer.setText("Sprayer  :  No");
                    mSprayer.setTextColor(getResources().getColor(R.color.false_color));
                }

                if(userData.getOwnsPowerTiller()) {
                    mPowerTiller.setText("Power Tiller  :  Yes");
                    mPowerTiller.setTextColor(getResources().getColor(R.color.true_color));
                }
                else{
                    mPowerTiller.setText("Power Tiller  :  No");
                    mPowerTiller.setTextColor(getResources().getColor(R.color.false_color));
                }


                mMulberry.setText("Mulberry Yield :  " + Double.toString(userData.getMulberryYield()) + " KGs");


                if(userData.getOnlineSale()) {
                    mOnlineSale.setText("Willing to sell online  :  Yes");
                    mOnlineSale.setTextColor(getResources().getColor(R.color.true_color));
                }
                else{
                    mOnlineSale.setText("Willing to sell online  :  No");
                    mOnlineSale.setTextColor(getResources().getColor(R.color.false_color));
                }

                if(userData.getScientificSuggestions()) {
                    mScientificSuggestion.setText("Open to scientific suggestions  :  Yes");
                    mScientificSuggestion.setTextColor(getResources().getColor(R.color.true_color));
                }
                else{
                    mScientificSuggestion.setText("Open to scientific suggestions  :  No");
                    mScientificSuggestion.setTextColor(getResources().getColor(R.color.false_color));
                }

                if(userData.getOwnsNursery()) {
                    mNursery.setText("Owns nursery  :  Yes");
                    mNursery.setTextColor(getResources().getColor(R.color.true_color));
                }
                else{
                    mNursery.setText("Owns nursery  :  No");
                    mNursery.setTextColor(getResources().getColor(R.color.false_color));
                }

                if(userData.getSalesLocal()) {
                    mLocalSales.setText("Local sales  :  Yes");
                    mLocalSales.setTextColor(getResources().getColor(R.color.true_color));
                }
                else{
                    mLocalSales.setText("Local sales  :  No");
                    mLocalSales.setTextColor(getResources().getColor(R.color.false_color));
                }

                if(userData.getSalesAPMC()) {
                    mAPMCSales.setText("APMC sales  :  Yes");
                    mAPMCSales.setTextColor(getResources().getColor(R.color.true_color));
                }
                else{
                    mAPMCSales.setText("APMC sales  :  No");
                    mAPMCSales.setTextColor(getResources().getColor(R.color.false_color));
                }


                mEmail.setText("Email address  :   " + userData.getEmail());


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


//TODO prevent going to GetFarmerDetails on pressing back.
//TODO add app icon.
//TODO prevent going to login page when already signed in
//TODO Add logout button
//TODO add rotation lock