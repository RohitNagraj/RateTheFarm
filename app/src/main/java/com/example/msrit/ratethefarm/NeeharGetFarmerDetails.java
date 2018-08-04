package com.example.msrit.ratethefarm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class NeeharGetFarmerDetails extends AppCompatActivity {
    EditText mname;
    EditText mvillage;
    EditText mhobli;
    EditText mtaluq;
    EditText mage;

    TextView labour_view;
    EditText mmale;
    EditText mfemale;

    TextView land_view;
    EditText mtotal_land;

    RadioGroup rg_landtype;
    RadioButton rbIrrigated;
    RadioButton rbRainfed;

    TextView animal_view;
    EditText mcow,mbuffalo,mcock,mhen,msheep,mgoat,mothers;

    TextView sericulture_view,extent_view;
    EditText mextent;

    RadioGroup rg_mulberry;
    RadioButton rb_yes_mul;
    RadioButton rb_no_mul;

    TextView machinery_view, owned_view;
    CheckBox ctractor,cpower_tiller,cplougher,crotomator,cbullock,csprayer,csprinkler;

    TextView crop_view,name_view,cropextent_view,production_view,misc_view,online_view,nursery_view,sales_view;
    EditText mcrop_name,mcrop_extent,mcrop_prod;

    RadioGroup rg_online;
    RadioButton rb_yes_online;
    RadioButton rb_no_online;

    RadioGroup rg_scientific;
    RadioButton rb_yes_sci;
    RadioButton rb_no_sci;

    RadioGroup rg_nursery;
    RadioButton rb_yes_nursery;
    RadioButton rb_no_nursery;

    CheckBox clocal,capmc;

    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neehar_get_farmer_details);

        mname = (EditText) findViewById(R.id.name);
        mvillage = (EditText) findViewById(R.id.village);
        mhobli = (EditText) findViewById(R.id.hobli);
        mtaluq = (EditText) findViewById(R.id.taluq);
        mage = (EditText) findViewById(R.id.age);
        mmale = (EditText) findViewById(R.id.male);
        mfemale = (EditText) findViewById(R.id.female);

        mtotal_land = (EditText) findViewById(R.id.total_land);
        rg_landtype = (RadioGroup) findViewById(R.id.i_or_r);
        rbIrrigated = (RadioButton) findViewById(R.id.irrigated);
        rbRainfed = (RadioButton) findViewById(R.id.rainfed);

        mcow = (EditText) findViewById(R.id.cow);
        mbuffalo = (EditText) findViewById(R.id.buffalo);
        mcock = (EditText) findViewById(R.id.cock);
        mhen = (EditText) findViewById(R.id.hen);
        msheep = (EditText) findViewById(R.id.sheep);
        mgoat = (EditText) findViewById(R.id.goat);
        mothers = (EditText) findViewById(R.id.others);
        mextent = (EditText) findViewById(R.id.extent);

        rg_mulberry = (RadioGroup) findViewById(R.id.yn_mulberry);
        rb_yes_mul = (RadioButton) findViewById(R.id.yes_mul);
        rb_no_mul = (RadioButton) findViewById(R.id.no_mul);

        ctractor = (CheckBox) findViewById(R.id.tractor);
        cpower_tiller = (CheckBox) findViewById(R.id.power_tiller);
        cplougher = (CheckBox) findViewById(R.id.plougher);
        crotomator = (CheckBox) findViewById(R.id.rotomator);
        cbullock = (CheckBox) findViewById(R.id.bullock_cart);
        csprayer = (CheckBox) findViewById(R.id.sprayer);
        csprinkler = (CheckBox) findViewById(R.id.sprinkler);

        mcrop_name = (EditText) findViewById(R.id.crop_name);
        String  crop_name = mcrop_name.getText().toString();

        mcrop_extent = (EditText) findViewById(R.id.crop_extent);
        String  crop_extent = mcrop_extent.getText().toString();

        mcrop_prod = (EditText) findViewById(R.id.crop_production);
        String  crop_production = mcrop_prod.getText().toString();

        rg_online = (RadioGroup) findViewById(R.id.yn_online);
        rb_yes_online = (RadioButton) findViewById(R.id.yes_online);
        rb_no_online = (RadioButton) findViewById(R.id.no_online);

        rg_scientific = (RadioGroup) findViewById(R.id.yn_scientific);
        rb_yes_sci = (RadioButton) findViewById(R.id.yes_scientific);
        rb_no_sci = (RadioButton) findViewById(R.id.no_scientific);

        rg_nursery = (RadioGroup) findViewById(R.id.yn_nursery);
        rb_yes_nursery = (RadioButton) findViewById(R.id.yes_nursery);
        rb_no_nursery = (RadioButton) findViewById(R.id.no_nursery);

        clocal = (CheckBox) findViewById(R.id.sale_local);
        capmc = (CheckBox) findViewById(R.id.sale_apmc);

        submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = mname.getText().toString();
                String village = mvillage.getText().toString();
                String hobli = mhobli.getText().toString();
                String taluq = mtaluq.getText().toString();
                int age = Integer.parseInt(mage.getText().toString());
                int male = Integer.parseInt(mmale.getText().toString());
                int female = Integer.parseInt(mfemale.getText().toString());
                int total_land = Integer.parseInt(mtotal_land.getText().toString());
                int cow = Integer.parseInt(mcow.getText().toString());
                int buffalo = Integer.parseInt(mbuffalo.getText().toString());
                int cock = Integer.parseInt(mcock.getText().toString());
                int hen = Integer.parseInt(mhen.getText().toString());
                int sheep = Integer.parseInt(msheep.getText().toString());
                int goat = Integer.parseInt(mgoat.getText().toString());
                int others = Integer.parseInt(mothers.getText().toString());
                int extent = Integer.parseInt(mextent.getText().toString());
                }
        });

    }



}
