package com.mukminullah.recyclerview;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by user on 26/01/18.
 */

public class RDV_list extends RecyclerView.ItemDecoration {
    private int bottom_margin;

    public RDV_list(int bottom_margin) {
        this.bottom_margin = bottom_margin;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);

        if (parent.getChildAdapterPosition(view) == parent.getAdapter().getItemCount()-1) {
            outRect.bottom = 0;
        } else {
            outRect.bottom = bottom_margin;
        }


    }
}
