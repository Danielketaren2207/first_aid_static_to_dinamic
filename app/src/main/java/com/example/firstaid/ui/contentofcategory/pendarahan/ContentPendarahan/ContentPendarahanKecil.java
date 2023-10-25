package com.example.firstaid.ui.contentofcategory.pendarahan.ContentPendarahan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.firstaid.R;

public class ContentPendarahanKecil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_pendarahan_kecil);
        getSupportActionBar().setTitle("Kategori Pendarahan - Pendarahan Kecil");
    }
}