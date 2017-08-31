package com.unisoft.developer.lasvegasdice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

import static android.os.Build.VERSION_CODES.M;

//import static com.unisoft.developer.lasvegasdice.R.id.imageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = (Button) findViewById(R.id.button);

        final int[] diceArray = {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        final ImageView leftdice,rightdice;

        leftdice = (ImageView) findViewById(R.id.left_dice);
        rightdice = (ImageView) findViewById(R.id.right_dice);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Roll","Start Up");

                Random randomNumberGenerator = new Random();
                int number = randomNumberGenerator.nextInt(6);

                leftdice.setImageResource(diceArray[number]);

                number = randomNumberGenerator.nextInt(6);

                rightdice.setImageResource(diceArray[number]);

            }
        });

    }
}
