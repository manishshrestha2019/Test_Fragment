package com.e.test_fragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import fragment.AddFragment;
import fragment.SecondFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button btnLoad;
    private Boolean status=true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLoad=findViewById(R.id.btnLoad);
        btnLoad.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();


        if(status){
            AddFragment addFragment=new AddFragment();
            fragmentTransaction.replace(R.id.FragContainer,addFragment);
            fragmentTransaction.commit();
            btnLoad.setText("Calculate SUM");
            status=false;
        }
        else {
            SecondFragment secondFragment=new SecondFragment();
            fragmentTransaction.replace(R.id.FragContainer,secondFragment);
            fragmentTransaction.commit();
            btnLoad.setText("Calculate Area");
            status=true;
        }
    }
}
