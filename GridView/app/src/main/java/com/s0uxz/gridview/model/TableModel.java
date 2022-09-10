package com.s0uxz.gridview.model;

import java.io.Serializable;

public class TableModel implements Serializable {
    private String _tableNumber;
    private int _LinkAnh;

    public TableModel()
    {

    }

    public TableModel(String _tableNumber, int _LinkAnh) {
        this._tableNumber = _tableNumber;
        this._LinkAnh = _LinkAnh;
    }

    public String get_tableNumber() {
        return _tableNumber;
    }

    public void set_tableNumber(String _tableNumber) {
        this._tableNumber = _tableNumber;
    }

    public int get_LinkAnh() {
        return _LinkAnh;
    }

    public void set_LinkAnh(int _LinkAnh) {
        this._LinkAnh = _LinkAnh;
    }
}
