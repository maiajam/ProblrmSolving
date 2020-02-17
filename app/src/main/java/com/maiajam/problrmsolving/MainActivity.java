package com.maiajam.problrmsolving;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.telephony.mbms.MbmsErrors;
import android.view.View;
import android.widget.Button;

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

        b = (Button)findViewById(R.id.bottom);
        b.setOnClickListener(this);
    }

    private void checkInput() {

        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            getTheOutput(a,b,n);
        }
        in.close();
    }

    private void getTheOutput(int a, int b, int n) {

        int output;
        for(int i=0;i<n;i++)
        {
            System.out.print((int)Math.pow(a,i));
        }

        System.out.println();
    }

    @Override
    public void onClick(View view) {

        checkInput();
    }
}
