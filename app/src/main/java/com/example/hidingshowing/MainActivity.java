package com.example.hidingshowing;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    ImageView imageView;

    public  void showClick(View view)
    {
        textView= findViewById(R.id.textView);
        textView.setVisibility(View.VISIBLE);
        imageView=findViewById(R.id.imageView);
        imageView.setVisibility(View.VISIBLE);
    }
    public void  hideClick(View view)
    {
        textView= findViewById(R.id.textView);
        textView.setVisibility(View.INVISIBLE);
        imageView=findViewById(R.id.imageView);
        imageView.setVisibility(View.INVISIBLE);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
