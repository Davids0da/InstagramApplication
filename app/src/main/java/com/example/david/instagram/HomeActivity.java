package com.example.david.instagram;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.david.instagram.recycle.InstagramAdapter;
import com.example.david.instagram.recycle.Model;

import java.util.ArrayList;
import java.util.List;


public class HomeActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private InstagramAdapter mAdapter;
    private List<Model> modelList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        recyclerView = (RecyclerView) findViewById(R.id.rec_list);

        mAdapter = new InstagramAdapter(modelList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);

        prepareModelData();

    }

    private void prepareModelData() {
        Model model = new Model("draginja", "Podgorica", "Uzivam u prijatnoj veceri!","15","2");
        modelList.add(model);
        model = new Model("milutin","Kuvajt","Kako lipo vreme!","25","1");
        modelList.add(model);
        model = new Model("markosankovic", "Frankfurt", "Borba!","23","3");
        modelList.add(model);
        model = new Model("ivan", "Barcelona", "Kako smo lepi! ","36","3");
        modelList.add(model);
        model = new Model("nidzo", "Skupstina", "Necu da glasam!","45","3");
        modelList.add(model);
        model = new Model("davidsodaa", "Nije bitno", "Ne znam gde sam!","36","3");
        modelList.add(model);
    }
    public void startProfileActivity(View view){
        Intent i = new Intent (this, ProfilActivity.class);
        startActivity(i);
    }
}

