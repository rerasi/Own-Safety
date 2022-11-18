package com.rezwanur.ownsafety;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LawsActivity extends AppCompatActivity implements View.OnClickListener {

    String myLocation = "", numberCall;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(LawsActivity.this, MainActivity.class));
        LawsActivity.this.finish();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laws);

        findViewById(R.id.backBtn).setOnClickListener(view -> {
            startActivity(new Intent(LawsActivity.this, MainActivity.class));
            LawsActivity.this.finish();
        });


        findViewById(R.id.first).setOnClickListener(view -> {
            numberCall = "01783289804";
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:"+numberCall));
            startActivity(intent);
        });

        findViewById(R.id.second).setOnClickListener(view -> {
            numberCall = "01783289804";
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:"+numberCall));
            startActivity(intent);
        });

        findViewById(R.id.third).setOnClickListener(view -> {
            numberCall = "01783289804";
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:"+numberCall));
            startActivity(intent);
        });

        findViewById(R.id.fourth).setOnClickListener(view -> {
            numberCall = "01783289804";
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:"+numberCall));
            startActivity(intent);
        });

        findViewById(R.id.fifth).setOnClickListener(view -> {
            numberCall = "01783289804";
            Intent intent = new Intent(Intent.ACTION_DIAL);
            intent.setData(Uri.parse("tel:"+numberCall));
            startActivity(intent);
        });


    }

    @Override
    public void onClick(View v) {

    }
}