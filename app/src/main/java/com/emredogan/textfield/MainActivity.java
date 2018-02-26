package com.emredogan.textfield;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    AppCompatEditText user;
    AppCompatEditText pass;
    RelativeLayout relativeLayout;
    TextInputLayout userLayout;
    TextInputLayout passLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (AppCompatEditText) findViewById(R.id.username_TextField);
        userLayout = (TextInputLayout) findViewById(R.id.username_TextInputLayout);
        pass = (AppCompatEditText) findViewById(R.id.password_TextField);
        passLayout = (TextInputLayout) findViewById(R.id.password_TextInputLayout);

        relativeLayout = (RelativeLayout) findViewById(R.id.activity_main);
        relativeLayout.setOnClickListener(null);




        user.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {



            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

                if(user.getText().toString().isEmpty()) {
                    userLayout.setErrorEnabled(true);
                    userLayout.setError("Please enter your username");

                } else {

                    userLayout.setErrorEnabled(false);

                }





            }

            @Override
            public void afterTextChanged(Editable editable) {

                System.out.println("afterText");

            }
        });

        user.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {

                if(user.getText().toString().isEmpty()) {
                    userLayout.setErrorEnabled(true);
                    userLayout.setError("Please enter your username");

                } else {

                    userLayout.setErrorEnabled(false);

                }



            }
        });

        passLayout.setCounterEnabled(true);
        passLayout.setCounterMaxLength(8);


    }
}
