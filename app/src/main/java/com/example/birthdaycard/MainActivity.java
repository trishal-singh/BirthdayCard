package com.example.birthdaycard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    EditText from ;
    EditText to ;
    EditText message;
    ImageView imageView;
    Intent Card;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         from = findViewById(R.id.edit1);
         to = findViewById(R.id.edit2);
         message = findViewById(R.id.edit3);
         imageView = findViewById(R.id.imageView);
         button= findViewById(R.id.button2);
         button.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Card = new Intent(MainActivity.this,cardActivity.class);
                 Card.putExtra("From",from.getText().toString());
                 Card.putExtra("To",to.getText().toString());
                 Card.putExtra("message",message.getText().toString());
                 startActivity(Card);
             }
         });
    }

    public void findfile(View view) {
        imageView.setImageResource(R.drawable.cake);

    }


}
