package com.shalan.mohamed.recyclerviewwithlistadapterexample;

import android.support.v7.util.DiffUtil;

/**
 * Created by mohamed on 4/10/18.
 */

public class BooksDiffCallbacks extends DiffUtil.ItemCallback<BookModel> {

    @Override
    public boolean areItemsTheSame(BookModel oldItem, BookModel newItem) {
        return oldItem.getBookID() == newItem.getBookID();
    }

    @Override
    public boolean areContentsTheSame(BookModel oldItem, BookModel newItem) {
        return oldItem == newItem;
    }
}
