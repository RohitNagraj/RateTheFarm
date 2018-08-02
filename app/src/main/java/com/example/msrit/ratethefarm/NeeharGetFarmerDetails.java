package com.example.msrit.ratethefarm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class NeeharGetFarmerDetails extends AppCompatActivity {
    EditText mText1;
    EditText mText2;
    EditText mText3;
    EditText mText4;
    EditText mText5;

    TextView mView1;
    EditText mText6;
    EditText mText7;

    TextView mView2;
    EditText mText8;

    RadioGroup rg;
    RadioButton mRB1;
    RadioButton mRB2;

    TextView mView3;
    EditText mText9,mText10,mText11,mText12,mText13,mText14,mText15;

    TextView mView4,mView5;
    EditText mText16;

    RadioGroup rg2;
    RadioButton mRB3;
    RadioButton mRB4;

    TextView mView6,mView7;
    CheckBox mCheck1,mCheck2,mCheck3,mCheck4,mCheck5,mCheck6,mCheck7;

    TextView mView8,mView9,mView10,mView11,mView12;
    EditText mText17,mText18,mText19;

    TextView mView13,mView14,mView15,mView16,mView17;
    RadioGroup rg3;
    RadioButton mRB5;
    RadioButton mRB6;

    RadioGroup rg4;
    RadioButton mRB7;
    RadioButton mRB8;

    RadioGroup rg5;
    RadioButton mRB9;
    RadioButton mRB10;

    CheckBox mCheck8,mCheck9;

    Button mButton1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neehar_get_farmer_details);

        mText1 = (EditText) findViewById(R.id.name);
        String name = mText1.getText().toString();

        mText2 = (EditText) findViewById(R.id.village);
        String village = mText2.getText().toString();

        mText3 = (EditText) findViewById(R.id.hobli);
        String hobli = mText2.getText().toString();

        mText4 = (EditText) findViewById(R.id.taluq);
        String taluq = mText2.getText().toString();

        mText5 = (EditText) findViewById(R.id.age);
        String age = (mText5.getText().toString());

        mText6 = (EditText) findViewById(R.id.male);
        String male = mText6.getText().toString();

        mText7 = (EditText) findViewById(R.id.female);
        String female = mText7.getText().toString();

        mText8 = (EditText) findViewById(R.id.total_land);
        String total_land = mText8.getText().toString();
        rg = (RadioGroup) findViewById(R.id.i_or_r);
        mRB1 = (RadioButton) findViewById(R.id.irrigated);
        mRB2 = (RadioButton) findViewById(R.id.rainfed);

        mText9 = (EditText) findViewById(R.id.cow);
        String cows = mText9.getText().toString();

        mText10 = (EditText) findViewById(R.id.buffalo);
        String buffalo = mText10.getText().toString();

        mText11 = (EditText) findViewById(R.id.cock);
        String cock = mText11.getText().toString();

        mText12 = (EditText) findViewById(R.id.hen);
        String hen = mText12.getText().toString();

        mText13 = (EditText) findViewById(R.id.sheep);
        String sheep = mText13.getText().toString();

        mText14 = (EditText) findViewById(R.id.goat);
        String goat = mText14.getText().toString();

        mText15 = (EditText) findViewById(R.id.others);
        String others = mText15.getText().toString();

        mText16 = (EditText) findViewById(R.id.extent);
        String  extent = mText16.getText().toString();

        rg2 = (RadioGroup) findViewById(R.id.yn_mulberry);
        mRB3 = (RadioButton) findViewById(R.id.yes_mul);
        mRB4 = (RadioButton) findViewById(R.id.no_mul);

        mCheck1 = (CheckBox) findViewById(R.id.tractor);
        mCheck2 = (CheckBox) findViewById(R.id.power_tiller);
        mCheck3 = (CheckBox) findViewById(R.id.plougher);
        mCheck4 = (CheckBox) findViewById(R.id.rotomator);
        mCheck5 = (CheckBox) findViewById(R.id.bullock_cart);
        mCheck6 = (CheckBox) findViewById(R.id.sprayer);
        mCheck7 = (CheckBox) findViewById(R.id.sprinkler);

        mText17 = (EditText) findViewById(R.id.crop_name);
        String  crop_name = mText17.getText().toString();

        mText18 = (EditText) findViewById(R.id.crop_extent);
        String  crop_extent = mText18.getText().toString();

        mText19 = (EditText) findViewById(R.id.crop_production);
        String  crop_production = mText19.getText().toString();

        rg3 = (RadioGroup) findViewById(R.id.yn_online);
        mRB5 = (RadioButton) findViewById(R.id.yes_online);
        mRB6 = (RadioButton) findViewById(R.id.no_online);

        rg4 = (RadioGroup) findViewById(R.id.yn_scientific);
        mRB7 = (RadioButton) findViewById(R.id.yes_scientific);
        mRB8 = (RadioButton) findViewById(R.id.no_scientific);

        rg = (RadioGroup) findViewById(R.id.yn_nursery);
        mRB9 = (RadioButton) findViewById(R.id.yes_nursery);
        mRB10 = (RadioButton) findViewById(R.id.no_nursery);

        mCheck8 = (CheckBox) findViewById(R.id.sale_local);
        mCheck9 = (CheckBox) findViewById(R.id.sale_apmc);

        mButton1 = (Button) findViewById(R.id.submit);

    }
}
