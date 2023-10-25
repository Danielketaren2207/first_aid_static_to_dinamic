package com.example.firstaid.ui.category;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.firstaid.R;
import com.example.firstaid.ui.contentofcategory.jantung.CategoryContentJantung;
import com.example.firstaid.ui.contentofcategory.kepala.CategoryContentKepala;
import com.example.firstaid.ui.contentofcategory.keracunan.CategoryContentKeracunan;
import com.example.firstaid.ui.contentofcategory.pendarahan.CategoryContentPendarahan;
import com.example.firstaid.ui.contentofcategory.pernafasan.CategoryContentPernafasan;
import com.example.firstaid.ui.contentofcategory.tenggorokan.CategoryContentTenggorokan;
import com.example.firstaid.ui.contentofcategory.tulangdanotot.CategoryContentTulangDanOtot;


public class CategoryFragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public CategoryFragment() {
        // Required empty public constructor
    }

    public static CategoryFragment newInstance(String param1, String param2) {
        CategoryFragment fragment = new CategoryFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_category, container, false);

        View jantungLayout = view.findViewById(R.id.layoutJantung);
        View tenggorokanLayout = view.findViewById(R.id.layoutTenggorokan);
        View pernafasanLayout = view.findViewById(R.id.layoutPernafasan);
        View kepalaLayout = view.findViewById(R.id.layoutKepala);
        View keracunanLayout = view.findViewById(R.id.layoutKeracunan);
        View pendarahanLayout = view.findViewById(R.id.layoutPendarahan);
        View tulangDanOtotLayout = view.findViewById(R.id.layoutTulangdanOtot);

        jantungLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CategoryContentJantung.class);
                startActivity(intent);
            }
        });

        tenggorokanLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CategoryContentTenggorokan.class);
                startActivity(intent);
            }
        });

        pernafasanLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CategoryContentPernafasan.class);
                startActivity(intent);
            }
        });

        kepalaLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CategoryContentKepala.class);
                startActivity(intent);
            }
        });

        keracunanLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CategoryContentKeracunan.class);
                startActivity(intent);
            }
        });

        pendarahanLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CategoryContentPendarahan.class);
                startActivity(intent);
            }
        });

        tulangDanOtotLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CategoryContentTulangDanOtot.class);
                startActivity(intent);
            }
        });

        return view;
    }
}