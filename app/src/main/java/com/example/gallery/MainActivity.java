package com.example.gallery;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayPicture(View view) {
        String tag = (String)view.getTag();

        Resources res = getResources();
        int id_picture = res.getIdentifier("picture"+tag, "string", getPackageName());
        String picture = res.getString(id_picture).toString();

        int id_img = res.getIdentifier(picture, "drawable", getPackageName());

        Intent it = new Intent(this, PictureDesc.class);
        it.putExtra("it_tag", new int[]{res.getIdentifier("title"+tag, "string", getPackageName()),
                                                res.getIdentifier("artist"+tag,"string",getPackageName()),
                                                id_img});
        startActivity(it);
    }
}
