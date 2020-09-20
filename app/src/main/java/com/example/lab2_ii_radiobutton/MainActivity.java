package com.example.lab2_ii_radiobutton;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.*;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RadioGroup RadioGroupPhoto;
    public ImageView imageViewPhoto;
    public Integer []photos = {R.drawable.appleimage, R.drawable.bananaimage, R.drawable.orangeimage};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.imageViewPhoto = (ImageView) findViewById(R.id.imageViewPhoto);
        this.RadioGroupPhoto = (RadioGroup) findViewById(R.id.RadioGroupPhoto);
        this.RadioGroupPhoto.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged (RadioGroup radioGroup, int i) {
                RadioButton radioButton = (RadioButton) radioGroup.findViewById(i);
                int index = radioGroup.indexOfChild(radioButton);
                imageViewPhoto.setImageResource (photos[index]);
            }

        });
    }
}