package com.zeeals.zeeals.utils;

import android.view.View;

/**
 * @author Ilyasa Ridho
 * @version 1.0
 * @Created on  02/05/17.
 */

public class OnItemClickListener implements View.OnClickListener, View.OnLongClickListener {
    private int position;
    private OnItemClickCallback onItemClickCallback;

    public OnItemClickListener(int position, OnItemClickCallback onItemClickCallback) {
        this.position = position;
        this.onItemClickCallback = onItemClickCallback;
    }

    @Override
    public void onClick(View view) {
        onItemClickCallback.onItemClicked(view, position);
    }

    @Override
    public boolean onLongClick(View v) {
        onItemClickCallback.onItemLongClicked(v, position);
        return false;
    }

    public interface OnItemClickCallback {
        void onItemClicked(View view, int position);
        void onItemLongClicked(View v, int position);
    }
}
