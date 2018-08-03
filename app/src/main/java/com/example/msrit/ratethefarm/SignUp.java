
package com.example.msrit.ratethefarm;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;

public class SignUp extends AppCompatActivity {
    private FirebaseAuth mAuth;
    private Button login;
    private Button register;
    private EditText confirmPassword;
    private EditText password;
    private EditText email;
    private ProgressDialog progressDialog;

    // Remove when project is done
    private Button mPage1, mPage2, mPage3, mPage4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        mAuth = FirebaseAuth.getInstance();
        if (mAuth.getCurrentUser()!=null){
            startActivity(new Intent(com.example.msrit.ratethefarm.SignUp.this,NeeharGetFarmerDetails.class));
        }

        progressDialog = new ProgressDialog(this);

        register = findViewById(R.id.register);
        login = findViewById(R.id.login);

        email = findViewById(R.id.email);
        password = findViewById(R.id.password);
        confirmPassword=findViewById(R.id.confirmpassword);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view==register)
                    userLogIn();
            }
        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (view==login){
                    finish();
                    startActivity(new Intent(com.example.msrit.ratethefarm.SignUp.this,LoginAndSignUp.class));}
            }
        });

        mPage1 = findViewById(R.id.page_1);
        mPage2 = findViewById(R.id.page_2);
        mPage3 = findViewById(R.id.page_3);
        mPage4 = findViewById(R.id.page_4);

        mPage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(v.getContext(), com.example.msrit.ratethefarm.LoginAndSignUp.class);
                startActivity(myIntent);
            }
        });

        mPage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), NeeharGetFarmerDetails.class);
                startActivity(myIntent);
            }
        });

        mPage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent myIntent = new Intent(v.getContext(), FarmersList.class);
                startActivity(myIntent);
            }
        });

        mPage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(v.getContext(), ShowFarmerDetails.class);
                startActivity(myIntent);
            }
        });

    }
    private void userLogIn(){
        String mEmail=email.getText().toString().trim();
        String mPassword =password.getText().toString().trim();
        String mConfirmPassword=confirmPassword.getText().toString().trim();

        if (TextUtils.isEmpty(mEmail)) {
            Toast.makeText(this, "Please enter email", Toast.LENGTH_SHORT).show();
            email.requestFocus();
            return;
        }
            if (!Patterns.EMAIL_ADDRESS.matcher(mEmail).matches()){
                Toast.makeText(this, "Please enter email", Toast.LENGTH_SHORT).show();
                email.requestFocus();
                return;
            }
        if (TextUtils.isEmpty(mPassword)) {
            Toast.makeText(this, "Please enter password", Toast.LENGTH_SHORT).show();
            password.requestFocus();
            return;
        }
        if (mPassword.length()<6){
            password.setError("Minimum length of password should be 6");
            password.requestFocus();
            return;
        }
        if (TextUtils.isEmpty(mConfirmPassword)) {
            Toast.makeText(this, "Please confirm password", Toast.LENGTH_SHORT).show();
            return;
        }
        if (!mPassword.equals(mConfirmPassword)) {
            Toast.makeText(this, "Confirm password does not match your password", Toast.LENGTH_SHORT).show();
            return;
        }

        progressDialog.setMessage("Signing up...");
        progressDialog.show();

        mAuth.createUserWithEmailAndPassword(mEmail, mPassword)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        progressDialog.dismiss();
                        if (task.isSuccessful()) {
                            Toast.makeText(SignUp.this, "Woo-hoo! Successfully registered", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(getApplicationContext(), LoginAndSignUp.class));
                        } else {
                            if (task.getException()instanceof FirebaseAuthUserCollisionException){
                                Toast.makeText(SignUp.this, "Email is already registered", Toast.LENGTH_SHORT).show();
                            }
                                /*else {
                                    Toast.makeText(getApplicationContext(),task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                                }*/
                        }
                    }
                });

    }
}