package com.litmon.app.singlechoicelistviewsample;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;

public class ListItemSingleChoiceView extends LinearLayout implements Checkable {

    CheckedTextView checkedTextView;

    public ListItemSingleChoiceView(Context context) {
        this(context, null);
    }

    public ListItemSingleChoiceView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ListItemSingleChoiceView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        inflate(getContext(), R.layout.list_item_single_choice, this);
        checkedTextView = (CheckedTextView) findViewById(R.id.checkedTextView);
    }


    @Override
    public void setChecked(boolean checked) {
        checkedTextView.setChecked(checked);
    }

    @Override
    public boolean isChecked() {
        return checkedTextView.isChecked();
    }

    @Override
    public void toggle() {
        checkedTextView.toggle();
    }
}
