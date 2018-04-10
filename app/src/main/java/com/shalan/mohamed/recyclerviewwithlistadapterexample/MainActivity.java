package com.shalan.mohamed.recyclerviewwithlistadapterexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView booksRecycler;
    private List<BookModel> bookModelList = new ArrayList<>();
    private List<BookModel> newBookModelList = new ArrayList<>();
    private BooksAdapter booksAdapter;
    private BooksDiffCallbacks callbacks;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        booksRecycler = findViewById(R.id.booksRecycler);

        /*setup recycler configuration*/
        booksRecycler.setLayoutManager(new LinearLayoutManager(this));

        /*initialize diff callbacks*/
        callbacks = new BooksDiffCallbacks();

        /*initialize adapter*/
        booksAdapter = new BooksAdapter(callbacks);

        /*setting adapter to recycler*/
        booksRecycler.setAdapter(booksAdapter);

        /*fill the initial books*/
        BookModel model = new BookModel(1, "Book1", "Quote1");
        bookModelList.add(model);

        model = new BookModel(2, "Book2", "Quote2");
        bookModelList.add(model);

    }
}
