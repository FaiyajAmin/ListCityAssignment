package com.example.simpleparadox.listycity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity{

     TextView textView;
     Button button;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_activity);
        textView = findViewById(R.id.textCityName);
        button = findViewById(R.id.backButton);
        Bundle extra = getIntent().getExtras();

        if(extra!=null)
        {textView.setText(extra.getString("nameOfCity"));
    }

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ShowActivity.this.finish();
            }
        });

    }

}
