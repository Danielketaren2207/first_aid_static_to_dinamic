package com.example.firstaid.ui.contentofcategory.keracunan.ContentKeracunan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.firstaid.R;

public class ContentObatObatan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content_obat_obatan);
        getSupportActionBar().setTitle("Kategori Keracunan - Obat-Obatan");
    }
}