package com.example.foodfordude;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.provider.AlarmClock;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CardView firstCard;
    CardView secondCard;
    CardView thirdCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstCard = findViewById(R.id.card_starters);
        firstCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startersActivityIntent = new Intent(MainActivity.this, StartersActivity.class);
                startActivity(startersActivityIntent);
            }
        });

        secondCard = findViewById(R.id.card_main_courses);
        secondCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MainCoursesActivity.class));
            }
        });

        thirdCard = findViewById(R.id.card_extra);
        thirdCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AlarmClock.ACTION_SET_ALARM)
                        .putExtra(AlarmClock.EXTRA_MESSAGE, "wake up hookie dookie")
                        .putExtra(AlarmClock.EXTRA_HOUR, 2)
                        .putExtra(AlarmClock.EXTRA_MINUTES, 30);
                if (intent.resolveActivity(getPackageManager()) != null) {
                    startActivity(intent);
                }
            }
        });

    }
}