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


    protected BooksAdapter(@NonNull DiffUtil.ItemCallback<BookModel> diffCallback) {
        super(diffCallback);
    }

    @NonNull
    @Override
    public BooksViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View rootView = LayoutInflater.from(parent.getContext()).inflate(R.layout.book_item_view, parent);
        BooksViewHolder holder = new BooksViewHolder(rootView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull BooksViewHolder holder, int position) {
        BookModel model = getItem(position);
        holder.bookName.setText(model.getBookName());
        holder.bookQuote.setText(model.getBookQuote());
    }
}
