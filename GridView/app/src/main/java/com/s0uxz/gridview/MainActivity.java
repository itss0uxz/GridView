package com.s0uxz.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

import com.s0uxz.gridview.adapter.TableAdapter;
import com.s0uxz.gridview.model.TableModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    GridView _gridview;
    TableAdapter tableAdapter;
    ArrayList<TableModel> dsTable = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addEvents();
        addControls();
    }
    private void addControls()
    {
        _gridview = findViewById(R.id.gridview);
        dsTable.add(new TableModel("Table number: 01",R.drawable.table));
        dsTable.add(new TableModel("Table number: 02",R.drawable.table));
        dsTable.add(new TableModel("Table number: 03",R.drawable.table));
        dsTable.add(new TableModel("Table number: 04",R.drawable.table));
        dsTable.add(new TableModel("Table number: 05",R.drawable.table));
        dsTable.add(new TableModel("Table number: 06",R.drawable.table));
        dsTable.add(new TableModel("Table number: 07",R.drawable.table));
        dsTable.add(new TableModel("Table number: 08",R.drawable.table));
        dsTable.add(new TableModel("Table number: 09",R.drawable.table));
        dsTable.add(new TableModel("Table number: 10",R.drawable.table));
        dsTable.add(new TableModel("Table number: 11",R.drawable.table));
        dsTable.add(new TableModel("Table number: 12",R.drawable.table));
        dsTable.add(new TableModel("Table number: 13",R.drawable.table));
        dsTable.add(new TableModel("Table number: 14",R.drawable.table));
        dsTable.add(new TableModel("Table number: 15",R.drawable.table));
        dsTable.add(new TableModel("Table number: 16",R.drawable.table));
        dsTable.add(new TableModel("Table number: 17",R.drawable.table));
        dsTable.add(new TableModel("Table number: 18",R.drawable.table));
        tableAdapter = new TableAdapter(
                MainActivity.this,R.layout.table_item,dsTable
        );
        _gridview.setAdapter(tableAdapter);
    }
    private void addEvents()
    {

    }
}