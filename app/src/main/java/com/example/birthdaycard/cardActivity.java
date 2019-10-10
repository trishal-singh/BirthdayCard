package com.example.birthdaycard;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class cardActivity extends AppCompatActivity {
    TextView view1;
    TextView view2;
    TextView view3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.card);
        Intent intent = getIntent();
        view1 = findViewById(R.id.textView);
        view2 = findViewById(R.id.textView2);
        view3 = findViewById(R.id.textView3);
        view1.setText("To " + intent.getStringExtra("To"));
        view2.setText(intent.getStringExtra("message"));
        view3.setText("From "+intent.getStringExtra("From"));
    }
}
