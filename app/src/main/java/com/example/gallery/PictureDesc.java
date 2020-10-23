package com.example.gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PictureDesc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.picturedesc);

        TextView tv_title = (TextView)findViewById(R.id.title);
        TextView tv_author = (TextView)findViewById(R.id.artist);
        ImageView iv_picture = (ImageView)findViewById(R.id.picture);

        Intent it = getIntent();
        int[] values = it.getIntArrayExtra("it_tag");
        tv_title.setText(values[0]);
        tv_author.setText(values[1]);
        iv_picture.setBackgroundResource(values[2]);

    }

    public void closePictrue(View view) {
        finish();
    }
}
