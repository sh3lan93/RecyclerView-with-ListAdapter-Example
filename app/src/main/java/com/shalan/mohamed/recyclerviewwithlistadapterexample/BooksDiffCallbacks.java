/*
 * Copyright (c) 2018. Mohamed Shalan
 * Android developer
 * mohamed.sh3lan_93@outlook.com.
 */

package com.shalan.mohamed.recyclerviewwithlistadapterexample;

import android.support.v7.util.DiffUtil;

/**
 * Created by mohamed on 4/10/18.
 */

public class BooksDiffCallbacks extends DiffUtil.ItemCallback<BookModel> {

    /*link for reference on android developer
    * https://developer.android.com/reference/android/support/v7/util/DiffUtil.Callback.html
    * */

    @Override
    public boolean areItemsTheSame(BookModel oldItem, BookModel newItem) {
        /*Called by the DiffUtil when it wants to check whether two items have the same data*/
        return oldItem.getBookID() == newItem.getBookID();
    }

    @Override
    public boolean areContentsTheSame(BookModel oldItem, BookModel newItem) {
        /*Called by the DiffUtil to decide whether two object represent the same Item*/
        return oldItem == newItem;
    }
}
