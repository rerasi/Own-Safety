package com.rezwanur.ownsafety;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LawsActivity extends AppCompatActivity implements View.OnClickListener {

    String numberCall;

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

        findViewById(R.id.first).setOnClickListener(this);
        findViewById(R.id.second).setOnClickListener(this);
        findViewById(R.id.third).setOnClickListener(this);
        findViewById(R.id.fourth).setOnClickListener(this);
        findViewById(R.id.fifth).setOnClickListener(this);

        findViewById(R.id.backBtn).setOnClickListener(view -> {
            startActivity(new Intent(LawsActivity.this, MainActivity.class));
            LawsActivity.this.finish();
        });
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.first) {
            numberCall = "1";
            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:"+numberCall));
            startActivity(intent);
        }

        else if (id == R.id.second) {
            numberCall = "2";
            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:"+numberCall));
            startActivity(intent);
        }

        else if (id == R.id.third) {
            numberCall = "3";
            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:"+numberCall));
            startActivity(intent);
        }

        else if (id == R.id.fourth) {
            numberCall = "4";
            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:"+numberCall));
            startActivity(intent);
        }

        else if (id == R.id.fifth) {
            numberCall = "5";
            Intent intent = new Intent(Intent.ACTION_CALL);
            intent.setData(Uri.parse("tel:"+numberCall));
            startActivity(intent);
        }

    }
}