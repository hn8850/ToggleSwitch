package com.example.toggleswitch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Switch sw = findViewById(R.id.switch2);
        ToggleButton tb = findViewById(R.id.toggleButton);
        Button btn = findViewById(R.id.button);
        ImageView image = findViewById(R.id.imageView);
        image.setImageResource(0);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (tb.isChecked()){
                   if (sw.isChecked()){
                        image.setImageResource(R.drawable.amog1);
                    }
                   else{
                       image.setImageResource(R.drawable.amog2);
                   }
                }
                else{
                    if (sw.isChecked()){
                        image.setImageResource(R.drawable.amog3);
                    }
                    else{
                        image.setImageResource(R.drawable.amog4);
                    }
                }



            }
        });





    }
}