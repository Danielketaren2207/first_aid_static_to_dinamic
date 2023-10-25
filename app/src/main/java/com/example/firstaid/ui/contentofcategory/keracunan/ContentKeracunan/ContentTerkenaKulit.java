package com.example.firstaid.ui.contentofcategory.keracunan.ContentKeracunan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.firstaid.R;

public class ContentTerkenaKulit extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_terkena_kulit);
        getSupportActionBar().setTitle("Kategori Keracunan - Terkena Kulit");
    }
}