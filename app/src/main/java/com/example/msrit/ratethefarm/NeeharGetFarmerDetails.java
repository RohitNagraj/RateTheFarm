package com.example.msrit.ratethefarm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class NeeharGetFarmerDetails extends AppCompatActivity {

    UserData userData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neehar_get_farmer_details);

        //Personal Details

        final EditText mName = findViewById(R.id.name);
        final EditText mVillage = findViewById(R.id.village);
        final EditText mHobli = findViewById(R.id.hobli);
        final EditText mTaluq = findViewById(R.id.taluq);
        final EditText mAge = findViewById(R.id.age);

        //Total no. of Workers

        final EditText mMaleWorkers = findViewById(R.id.workers_men);
        final EditText mFemaleWorkers = findViewById(R.id.workers_women);

        //Land Details

        final EditText mLandArea = findViewById(R.id.land_area);
        final RadioGroup rgLandType = findViewById(R.id.land_type);

        //Animals Owned

        final EditText mCow = findViewById(R.id.cow);
        final EditText mBuffalo = findViewById(R.id.buffalo);
        final EditText mCock = findViewById(R.id.cock);
        final EditText mHen = findViewById(R.id.hen);
        final EditText mSheep = findViewById(R.id.sheep);
        final EditText mGoat = findViewById(R.id.goat);
        final EditText mOtherAnimals = findViewById(R.id.others);

        //Sericulture

        final EditText mMulberryYield = findViewById(R.id.mulberry_yield);
        final RadioGroup rgMulberry = findViewById(R.id.sell_mulberry);

        //Machines Owned

        CheckBox cTractor = findViewById(R.id.tractor);
        CheckBox cPowerTiller = findViewById(R.id.power_tiller);
        CheckBox cPlougher = findViewById(R.id.plougher);
        CheckBox cRotomator = findViewById(R.id.rotomator);
        CheckBox cBullock = findViewById(R.id.bullock_cart);
        CheckBox cSprayer = findViewById(R.id.sprayer);
        CheckBox cSprinkler = findViewById(R.id.sprinkler);

        //Crop Details

        EditText mCrop = findViewById(R.id.crop_name);
        EditText mCropArea = findViewById(R.id.crop_area);
        EditText mCropYield = findViewById(R.id.crop_yield);

        //Miscellaneous

        RadioGroup rgOnlineSales = findViewById(R.id.sell_online);
        RadioButton  rbOnlineYes = findViewById(R.id.online_yes);
        RadioButton  rbOnlineNo = findViewById(R.id.online_no);

        RadioGroup rgScientificSuggestions = findViewById(R.id.scientific_suggestions);
        RadioButton rbYesScience = findViewById(R.id.scientific_yes);
        RadioButton rbNoScience = findViewById(R.id.scientific_no);

        RadioGroup rgNursery = findViewById(R.id.own_nursery);
        RadioButton rbYesNursery = findViewById(R.id.nursery_yes);
        RadioButton rbNoNursery = findViewById(R.id.nursery_no);

        CheckBox cLocal = findViewById(R.id.sale_local);
        CheckBox cAMPC = findViewById(R.id.sale_apmc);

        Button mSubmitBtn = findViewById(R.id.submit);

        mSubmitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                userData.setName(mName.getText().toString());
                userData.setVillage(mVillage.getText().toString());
                userData.setHobli(mHobli.getText().toString());
                userData.setTaluq(mTaluq.getText().toString());
                userData.setAge(Integer.parseInt(mAge.getText().toString()));


                userData.setMaleWorkers(Integer.parseInt(mMaleWorkers.getText().toString()));
                userData.setFemaleWorkers(Integer.parseInt(mFemaleWorkers.getText().toString()));


                userData.setLand(Double.parseDouble(mLandArea.getText().toString()));
                int SelectedID = rgLandType.getCheckedRadioButtonId();
                RadioButton radioButton = findViewById(SelectedID);
                userData.setIrrigatedOrRainfed(radioButton.getText().toString());


                userData.setCow(Integer.parseInt(mCow.getText().toString()));
                userData.setBuffalo(Integer.parseInt(mBuffalo.getText().toString()));
                userData.setCock(Integer.parseInt(mCock.getText().toString()));
                userData.setHen(Integer.parseInt(mHen.getText().toString()));
                userData.setSheep(Integer.parseInt(mSheep.getText().toString()));
                userData.setGoat(Integer.parseInt(mGoat.getText().toString()));
                userData.setOtherAnimals(Integer.parseInt(mOtherAnimals.getText().toString()));


                userData.setMulberryYield(Double.parseDouble(mMulberryYield.getText().toString()));
                SelectedID = rgMulberry.getCheckedRadioButtonId();
                radioButton = findViewById(SelectedID);
                String SellMulberry = radioButton.getText().toString();
                if (SellMulberry.equals("Yes"))
                {
                    userData.setSellMulberry(true);
                }
                else
                {
                    userData.setSellMulberry(false);
                }


                }
        });

    }



}
