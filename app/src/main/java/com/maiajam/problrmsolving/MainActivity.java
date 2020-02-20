package com.maiajam.problrmsolving;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.mbms.MbmsErrors;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        InitializationViews();
    }

    private void InitializationViews() {

        b = (Button)findViewById(R.id.button);
        b.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Toast.makeText(getBaseContext(), Solution.getSmallestAndLargest("ASDFHDSFHsdlfhsdlfLDFHSDLFHsdlfhsdlhkfsdlfLHDFLSDKFHsdfhsdlkfhsdlfhsLFDLSFHSDLFHsdkfhsdkfhsdkfhsdfhsdfjeaDFHSDLFHDFlajfsdlfhsdlfhDSLFHSDLFHdlfhs",30),Toast.LENGTH_LONG).show();

    }
}
