package com.example.firstaid.ui.contentofcategory.kepala;

import static com.example.firstaid.R.id.layoutContentKompresi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.firstaid.R;
import com.example.firstaid.ui.contentofcategory.kepala.ContentKepala.ContentGegarOtak;
import com.example.firstaid.ui.contentofcategory.kepala.ContentKepala.ContentKejangKejang;
import com.example.firstaid.ui.contentofcategory.kepala.ContentKepala.ContentKompresi;
import com.example.firstaid.ui.contentofcategory.kepala.ContentKepala.ContentPatahTulang;
import com.example.firstaid.ui.contentofcategory.kepala.ContentKepala.ContentPenyitaanKetidakhadiran;
import com.example.firstaid.ui.contentofcategory.kepala.ContentKepala.ContentTidakResponsif;

public class CategoryContentKepala extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_content_kepala);
        getSupportActionBar().setTitle("Kategori Kepala");

        View gegarOtak = findViewById(R.id.layoutContentGegarOtak);
        View tidakResponsif = findViewById(R.id.layoutContentTidakResponsif);
        View kompresi = findViewById(layoutContentKompresi1);
        View patahTulang = findViewById(R.id.layoutContentPatahTulang);
        View kejangKejang = findViewById(R.id.layoutContentKejangKejang);
        View penyitaanKetidakHadiran = findViewById(R.id.layoutContentPenyitaanKetidakhadiran);

        gegarOtak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryContentKepala.this, ContentGegarOtak.class);
                startActivity(intent);
            }
        });

        tidakResponsif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryContentKepala.this, ContentTidakResponsif.class);
                startActivity(intent);
            }
        });

        kompresi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryContentKepala.this, ContentKompresi.class);
                startActivity(intent);
            }
        });

        patahTulang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryContentKepala.this, ContentPatahTulang.class);
                startActivity(intent);
            }
        });

        kejangKejang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryContentKepala.this, ContentKejangKejang.class);
                startActivity(intent);
            }
        });

        penyitaanKetidakHadiran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryContentKepala.this, ContentPenyitaanKetidakhadiran.class);
                startActivity(intent);
            }
        });
    }
}
