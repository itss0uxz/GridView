package com.s0uxz.gridview.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.s0uxz.gridview.R;
import com.s0uxz.gridview.model.TableModel;

import java.util.List;

public class TableAdapter extends ArrayAdapter<TableModel> {
    Activity context;
    int resource;
    @NonNull List<TableModel> objects;
    public TableAdapter(@NonNull Activity context, int resource, @NonNull List<TableModel> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View row, @NonNull ViewGroup parent) {
        LayoutInflater layoutInflater = this.context.getLayoutInflater();
        row = layoutInflater.inflate(this.resource,null);
        TextView _tableNumber = row.findViewById(R.id.txtTableNumber);
        ImageView _img = row.findViewById(R.id.imageView);
        TableModel tableModel = this.objects.get(position);
        _tableNumber.setText(tableModel.get_tableNumber());
        _img.setImageResource(tableModel.get_LinkAnh());
        return row;
    }
}
