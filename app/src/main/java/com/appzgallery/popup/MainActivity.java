package com.appzgallery.popup;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder pBuilder = new AlertDialog.Builder(MainActivity.this);
                View pView = getLayoutInflater().inflate(R.layout.popup,null);

                pBuilder.setView(pView);
                AlertDialog dialog = pBuilder.create();
                dialog.show();
            }
        });

    }
}
