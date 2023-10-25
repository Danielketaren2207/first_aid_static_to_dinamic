package com.example.firstaid.ui.contentofcategory.keracunan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.firstaid.R;
import com.example.firstaid.ui.contentofcategory.kepala.CategoryContentKepala;
import com.example.firstaid.ui.contentofcategory.kepala.ContentKepala.ContentGegarOtak;
import com.example.firstaid.ui.contentofcategory.keracunan.ContentKeracunan.ContentObatObatan;
import com.example.firstaid.ui.contentofcategory.keracunan.ContentKeracunan.ContentTerkenaKulit;
import com.example.firstaid.ui.contentofcategory.keracunan.ContentKeracunan.ContentTertelan;

public class CategoryContentKeracunan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_content_keracunan);
        getSupportActionBar().setTitle("Kategori Keracunan");

        View obatObatan = findViewById(R.id.layoutContentObatObatan);
        View terkenaKulit = findViewById(R.id.layoutContentTerkenaKulit);
        View tertelan = findViewById(R.id.layoutContentTertelan);

        obatObatan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryContentKeracunan.this, ContentObatObatan.class);
                startActivity(intent);
            }
        });

        terkenaKulit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryContentKeracunan.this, ContentTerkenaKulit.class);
                startActivity(intent);
            }
        });

        tertelan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryContentKeracunan.this, ContentTertelan.class);
                startActivity(intent);
            }
        });

    }
}