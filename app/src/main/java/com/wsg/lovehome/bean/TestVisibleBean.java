package com.wsg.lovehome.bean;

import io.realm.RealmObject;

public class TestVisibleBean extends RealmObject {
    private int type;
    private int list_id;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getList_id() {
        return list_id;
    }

    public void setList_id(int list_id) {
        this.list_id = list_id;
    }
}