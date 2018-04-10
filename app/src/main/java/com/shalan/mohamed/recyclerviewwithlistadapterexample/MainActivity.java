/*
 * Copyright (c) 2018. Mohamed Shalan
 * Android developer
 * mohamed.sh3lan_93@outlook.com.
 */

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

        model = new BookModel(3, "Book3", "Quote3");
        bookModelList.add(model);

        model = new BookModel(4, "Book4", "Quote4");
        bookModelList.add(model);

        model = new BookModel(5, "Book5", "Quote5");
        bookModelList.add(model);

        /*add list to adapter*/
        booksAdapter.submitList(bookModelList);

        /*fill the new books list*/
        BookModel newModel = new BookModel(5, "new Book 5", "Quote5");
        newBookModelList.add(newModel);

        newModel = new BookModel(4, "new Book 4", "Quote4");
        newBookModelList.add(newModel);

        newModel = new BookModel(1, "new Book 1", "Quote1");
        newBookModelList.add(newModel);

        newModel = new BookModel(6, "Book6", "Quote6");
        newBookModelList.add(newModel);

        newModel = new BookModel(2, "new Book 2", "Quote2");
        newBookModelList.add(newModel);

        newModel = new BookModel(3, "new Book 3", "Quote3");
        newBookModelList.add(newModel);

        /*make a thread that will be sleep for 5 sec this will simulate delay for new data to be available*/
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                    booksAdapter.submitList(newBookModelList);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread.start();
    }
}
