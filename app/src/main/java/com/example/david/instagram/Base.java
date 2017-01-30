package com.example.david.instagram;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.VectorEnabledTintResources;
import android.view.View;
import android.widget.TextView;

/**
 * Created by David on 1/27/17.
 */

public class Base extends AppCompatActivity {

    public void startProfileActivity(View view) {
        Intent i = new Intent(this, ProfilActivity.class);
        startActivity(i);
    }

    public void startSearchActivity(View view) {
        Intent i = new Intent(this, SearchActivity.class);
        startActivity(i);
    }
    public void startHomeActivity(View view) {
        Intent i = new Intent(this, HomeActivity.class);
        startActivity(i);
    }
    public void startActivityActivity(View view) {
        Intent i = new Intent(this, ActivityActivity.class);
        startActivity(i);
    }
    public void startFollowingFragment(View view) {
        TextView i = (TextView) findViewById(R.id.activity_textv1);
        TextView a = (TextView) findViewById(R.id.activity_textv2);

        i.setTextColor(Color.WHITE);
        i.setBackgroundResource(R.drawable.activetab);
        a.setBackgroundResource(R.color.colorTransparent);
        a.setTextColor(Color.BLACK);
        View frag = findViewById(R.id.toolbar_gragment1);
        View frag1 = findViewById(R.id.toolbar_gragment);
        frag.setVisibility(View.GONE);
        frag1.setVisibility(View.VISIBLE);
        View relativ = findViewById(R.id.relative_layout4);
        relativ.setAlpha(1);
    }

    public void startFollowingFragments(View view) {
        TextView a = (TextView) findViewById(R.id.activity_textv1);
        TextView i = (TextView) findViewById(R.id.activity_textv2);

        i.setTextColor(Color.WHITE);
        i.setBackgroundResource(R.drawable.activetab);
        a.setBackgroundResource(R.color.colorTransparent);
        a.setTextColor(Color.BLACK);
        View frag = findViewById(R.id.toolbar_gragment);
        View frag1 = findViewById(R.id.toolbar_gragment1);
        frag1.setVisibility(View.VISIBLE);
        frag.setVisibility(View.GONE);

    }
}
