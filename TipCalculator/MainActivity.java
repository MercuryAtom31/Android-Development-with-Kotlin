package com.example.tipcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickTipCalc(View v) {

        EditText bAmount = findViewById(R.id.edtTxtBillAmnt);
        String bA = bAmount.getText().toString();
        double bAd = Double.parseDouble(bA);

        EditText tAmount = findViewById(R.id.edtTxtTipAmount);
        String tA = tAmount.getText().toString();
        double tAd = Double.parseDouble(tA);

        double totalTip = bAd * (tAd / 100);
        double totalBill =  totalTip + bAd;

        TextView textViewTip = findViewById(R.id.txtTotalTipAmount);
        textViewTip.setText(Double.toString(totalTip));


        TextView textViewBill = findViewById(R.id.txtTotalBillAmount);
        textViewBill.setText(Double.toString(totalBill));
    }
}