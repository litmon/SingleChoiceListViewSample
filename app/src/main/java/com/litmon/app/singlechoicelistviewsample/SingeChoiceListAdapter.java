package com.litmon.app.singlechoicelistviewsample;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

public class SingeChoiceListAdapter extends ArrayAdapter<String> {

    public SingeChoiceListAdapter(Context context) {
        super(context, 0);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return new ListItemSingleChoiceView(getContext());
    }
}
