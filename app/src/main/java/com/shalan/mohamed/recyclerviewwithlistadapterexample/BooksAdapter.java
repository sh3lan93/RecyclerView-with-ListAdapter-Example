/*
 * Copyright (c) 2018. Mohamed Shalan
 * Android developer
 * mohamed.sh3lan_93@outlook.com.
 */

package com.shalan.mohamed.recyclerviewwithlistadapterexample;

import android.support.annotation.NonNull;
import android.support.v7.recyclerview.extensions.ListAdapter;
import android.support.v7.util.DiffUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by mohamed on 4/10/18.
 */

public class BooksAdapter extends ListAdapter<BookModel, BooksViewHolder> {

    /*link for reference on android developer
    * https://developer.android.com/reference/android/support/v7/recyclerview/extensions/ListAdapter.html
    * */

    protected BooksAdapter(@NonNull DiffUtil.ItemCallback<BookModel> diffCallback) {
        /*All we need to call super and pass callback*/
        super(diffCallback);
    }

    @NonNull
    @Override
    public BooksViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        /*same thing made for Adapter<VH>*/
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_item_view, parent, false);
        BooksViewHolder holder = new BooksViewHolder(rootView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull BooksViewHolder holder, int position) {
        /*getItem return model for certain position
        * same thing made for setting data in Adapter<VH>
        **/
        BookModel model = getItem(position);
        holder.bookName.setText(model.getBookName());
        holder.bookQuote.setText(model.getBookQuote());
    }
}
