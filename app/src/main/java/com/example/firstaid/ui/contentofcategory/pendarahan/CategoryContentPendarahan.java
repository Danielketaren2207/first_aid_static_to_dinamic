package com.example.firstaid.ui.contentofcategory.pendarahan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.example.firstaid.R;
import com.example.firstaid.ui.contentofcategory.pendarahan.ContentPendarahan.ContentLukaBakar;
import com.example.firstaid.ui.contentofcategory.pendarahan.ContentPendarahan.ContentPendarahanKecil;
import com.example.firstaid.ui.contentofcategory.pendarahan.ContentPendarahan.ContentPendarahanParah;
import com.example.firstaid.ui.contentofcategory.pendarahan.ContentPendarahan.ContentPeringatanKebersihan;

public class CategoryContentPendarahan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category_content_pendarahan);
        getSupportActionBar().setTitle("Kategori Pendarahan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        View lukaBakar = findViewById(R.id.layoutContentLukaBakar);
        View peringatanKebersihan = findViewById(R.id.layoutContentPeringatanKebersihan);
        View pendarahanParah = findViewById(R.id.layoutContentPendarahanParah);
        View pendarahanKecil = findViewById(R.id.layoutContentPendarahanKecil);

        lukaBakar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryContentPendarahan.this, ContentLukaBakar.class);
                startActivity(intent);
            }
        });

        peringatanKebersihan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryContentPendarahan.this, ContentPeringatanKebersihan.class);
                startActivity(intent);
            }
        });

        pendarahanParah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryContentPendarahan.this, ContentPendarahanParah.class);
                startActivity(intent);
            }
        });

        pendarahanKecil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CategoryContentPendarahan.this, ContentPendarahanKecil.class);
                startActivity(intent);
            }
        });


    }

    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == android.R.id.home){
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}