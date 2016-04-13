package com.example.hamzeh.firebasepracites;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.firebase.client.Config;
import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        UserInfo info=new UserInfo("Hamzeh","hamzeh@yahoo.com","0776513064","","","","","","","","","",new UserLocation(10.5,45.6));


        Config config=new Config();
        Firebase ref=new Firebase("https://torrid-fire-2314.firebaseio.com/");
        Firebase alanRef = ref.child("users").child("alanisawesome");


        alanRef.setValue(info);


    }
}
