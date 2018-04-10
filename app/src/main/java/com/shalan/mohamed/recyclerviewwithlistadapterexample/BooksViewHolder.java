package com.shalan.mohamed.recyclerviewwithlistadapterexample;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by mohamed on 4/10/18.
 */

public class BooksViewHolder extends RecyclerView.ViewHolder {

    TextView bookName;
    TextView bookQuote;

    public BooksViewHolder(View itemView) {
        super(itemView);
        bookName = itemView.findViewById(R.id.bookName);
        bookQuote = itemView.findViewById(R.id.bookQuote);
    }
}
