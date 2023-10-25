package com.example.firstaid.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.firstaid.R;
import com.example.firstaid.databinding.FragmentHomeBinding;
import com.example.firstaid.ui.category.CategoryFragment;
import com.example.firstaid.ui.contentofcategory.jantung.CategoryContentJantung;
import com.example.firstaid.ui.contentofcategory.kepala.CategoryContentKepala;
import com.example.firstaid.ui.contentofcategory.keracunan.CategoryContentKeracunan;
import com.example.firstaid.ui.contentofcategory.pernafasan.CategoryContentPernafasan;
import com.example.firstaid.ui.contentofcategory.tenggorokan.CategoryContentTenggorokan;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        View categoryJantung = view.findViewById(R.id.categoryJantung);
        View categoryTenggorokan = view.findViewById(R.id.categoryTenggorokan);
        View categoryPernafasan = view.findViewById(R.id.categoryPernafasan);
        View categoryKepala = view.findViewById(R.id.categoryKepala);
        View categoryKeracunan = view.findViewById(R.id.categoryKeracunan);
        View moreCategory = view.findViewById(R.id.moreCategory);

        categoryJantung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CategoryContentJantung.class);
                startActivity(intent);
            }
        });

        categoryTenggorokan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CategoryContentTenggorokan.class);
                startActivity(intent);
            }
        });

        categoryPernafasan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CategoryContentPernafasan.class);
                startActivity(intent);
            }
        });

        categoryKepala.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CategoryContentKepala.class);
                startActivity(intent);
            }
        });

        categoryKeracunan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CategoryContentKeracunan.class);
                startActivity(intent);
            }
        });

        moreCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getActivity().getSupportFragmentManager();
                fm.popBackStack("fragment_category", FragmentManager.POP_BACK_STACK_INCLUSIVE);
            }
        });





        return view;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}