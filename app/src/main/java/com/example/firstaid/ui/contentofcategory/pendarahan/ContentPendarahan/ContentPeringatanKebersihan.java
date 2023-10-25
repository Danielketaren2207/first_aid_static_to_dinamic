package com.example.firstaid.ui.contentofcategory.pendarahan.ContentPendarahan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.firstaid.R;

public class ContentPeringatanKebersihan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_peringatan_kebersihan);
        getSupportActionBar().setTitle("Kategori Pendarahan - Peringatan Kebersihan");
    }
}