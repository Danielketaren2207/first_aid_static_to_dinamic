package com.example.firstaid.ui.contentofcategory.kepala.ContentKepala;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.firstaid.R;

public class ContentTidakResponsif extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_tidak_responsif);
        getSupportActionBar().setTitle("Kategori Kepala - Tidak Responsif");
    }
}