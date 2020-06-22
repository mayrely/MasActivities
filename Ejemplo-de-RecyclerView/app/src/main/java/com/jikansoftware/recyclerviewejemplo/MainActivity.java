package com.jikansoftware.recyclerviewejemplo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.jikansoftware.recyclerviewejemplo.adapter.ProductAdapter;
import com.jikansoftware.recyclerviewejemplo.model.Product;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Product> productList;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        productList = new ArrayList<>();

        productList.add(
                new Product(
                        1,
                        "Apple Macbook Air",
                        "13.3, inch, Silver, 1.35kg",
                        4.3,
                        100000,
                        R.drawable.macbook
                ));
        productList.add(
                new Product(
                        1,
                        "HP",
                        "14.3, inch, Silver, 1.20kg",
                        4,
                        60000,
                        R.drawable.hp
                ));
        productList.add(
                new Product(
                        1,
                        "Dell Inspiron",
                        "9.3, inch, White, 1.10kg",
                        3.9,
                        50000,
                        R.drawable.dell
                ));
        ProductAdapter adapter = new ProductAdapter(this, productList);
        recyclerView.setAdapter(adapter);
    }
}
