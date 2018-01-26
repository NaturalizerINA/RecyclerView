package com.mukminullah.recyclerview;

import android.util.Log;

/**
 * Created by user on 26/01/18.
 */

public class B_list {
    private String nama;
    private String jurusan;

    public B_list(String name, String jurusan) {
        this.nama= name;
        this.jurusan = jurusan;
    }

    public B_list cloneB_list() {
        try {
            return (B_list) super.clone();
        } catch (CloneNotSupportedException e) {
            Log.e("Clone B_list", "Error: " + e);
            return this;
        }
    }

    public String getName() {
        return nama;
    }

    public String getJurusan() {
        return jurusan;
    }
}
