package com.example.myapplication;

import android.app.Activity;
import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.ui.notifications.SignUp;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import java.io.FileOutputStream;

public class MainActivity extends AppCompatActivity {
    EditText mEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //BottomNavigationView navView = findViewById(R.id.nav_view);

        Button buttonsign = (Button) findViewById(R.id.botton1);
        Button buttonsave = (Button) findViewById(R.id.button2);

        buttonsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent intl=new Intent(packagecontext )
                openActivitySignUp();
            }
            public void openActivitySignUp(){
                Intent intent=new Intent(this, SignUp.class);
                startActivity(intent);
            }






        });



    }
}
