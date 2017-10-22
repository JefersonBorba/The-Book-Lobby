package com.example.jefer.thebooklobby;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.example.jefer.thebooklobby.databinding.BookListBinding;

import java.util.ArrayList;

/**
 * Created by jefer on 10/21/2017.
 */

public class BookListAdapter extends ArrayAdapter<Book> {
    private ArrayList<Book> books;

    public BookListAdapter(Context context, ArrayList<Book> books) {
        super(context, 0, books);
        this.books = books;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder;
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        if (convertView == null) {
            BookListBinding binding = DataBindingUtil.inflate(inflater, R.layout.book_list, parent, false);
            convertView = binding.getRoot();
            viewHolder = new ViewHolder(binding, position % 2 == 0);
            convertView.setTag(viewHolder);
        } else viewHolder = (ViewHolder) convertView.getTag();
        viewHolder.bind(books.get(position));
        return convertView;
    }

    private class ViewHolder {
        private BookListBinding itemBinding;
        private boolean isEven;

        public ViewHolder(BookListBinding binding, boolean even) {
            this.itemBinding = binding;
            this.isEven = even;
        }

        public void bind(Book book) {
            itemBinding.setBook(book);
            itemBinding.setIsEven(isEven);
            itemBinding.executePendingBindings();
        }
    }
}