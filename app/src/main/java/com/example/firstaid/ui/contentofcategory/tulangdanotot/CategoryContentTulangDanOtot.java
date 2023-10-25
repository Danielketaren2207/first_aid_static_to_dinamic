package com.example.firstaid.ui.contentofcategory.tulangdanotot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.firstaid.R;
import com.example.firstaid.ui.contentofcategory.pendarahan.CategoryContentPendarahan;
import com.example.firstaid.ui.contentofcategory.pendarahan.ContentPendarahan.ContentLukaBakar;
import com.example.firstaid.ui.contentofcategory.tulangdanotot.ContentTulangDanOtot.ContentCederaTulangBelakang;
import com.example.firstaid.ui.contentofcategory.tulangdanotot.ContentTulangDanOtot.ContentKeseleo;
import com.example.firstaid.ui.contentofcategory.tulangdanotot.ContentTulangDanOtot.ContentPatahTulang;

public class CategoryContentTulangDanOtot extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_content_tulang_dan_otot);
        getSupportActionBar().setTitle("Kategori Tulang dan Otot");

        View cederaTulangBelakang = findViewById(R.id.layoutContentCederaTulangBelakang);
        View keseleo = findViewById(R.id.layoutContentKeseleo);
        View patahTulang = findViewById(R.id.layoutContentPatahTulang);

        cederaTulangBelakang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryContentTulangDanOtot.this, ContentCederaTulangBelakang.class);
                startActivity(intent);
            }
        });

        keseleo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryContentTulangDanOtot.this, ContentKeseleo.class);
                startActivity(intent);
            }
        });

        patahTulang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryContentTulangDanOtot.this, ContentPatahTulang.class);
                startActivity(intent);
            }
        });

    }
}