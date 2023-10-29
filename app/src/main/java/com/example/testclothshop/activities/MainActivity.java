package com.example.testclothshop.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.testclothshop.R;
import com.example.testclothshop.adapters.CategoryAdapter;
import com.example.testclothshop.domain.CategoryDomain;
import com.example.testclothshop.domain.ClothDomain;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter,adapter2;
    private RecyclerView recyclerViewCategoryList, recyclerViewPopularList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewCategory();
        recyclerViewPopular();

    }

    private void recyclerViewPopular(){
        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewPopularList = findViewById(R.id.popularlist);
        recyclerViewPopularList.setLayoutManager(linearLayoutManager  );

        ArrayList<ClothDomain> clothlist = new ArrayList<>();
        clothlist.add(new ClothDomain("shirt", "","adadA", 13.00, 13, 5 ));
        clothlist.add(new ClothDomain("shirt", "","adadA", 13.00, 13, 5 ));
        clothlist.add(new ClothDomain("shirt", "","adadA", 13.00, 13, 5 ));
        clothlist.add(new ClothDomain("shirt", "","adadA", 13.00, 13, 5 ));

        adapter2 = new
    }

    private void recyclerViewCategory() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerViewCategoryList = findViewById(R.id.categorylist);
        recyclerViewCategoryList.setLayoutManager(linearLayoutManager);

        ArrayList<CategoryDomain> categoryList = new ArrayList<>();
        categoryList.add(new CategoryDomain("Pizza",""));
        categoryList.add(new CategoryDomain("Pizza",""));
        categoryList.add(new CategoryDomain("Pizza",""));

        adapter = new CategoryAdapter(categoryList);
        recyclerViewCategoryList.setAdapter(adapter);
    }
}