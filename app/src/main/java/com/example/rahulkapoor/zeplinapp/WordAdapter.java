package com.example.rahulkapoor.zeplinapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatCheckBox;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rahulkapoor.zeplinapp.listdata.ListData;

import java.util.ArrayList;

/**
 * Created by rahulkapoor on 12/04/17.
 */

class WordAdapter extends ArrayAdapter<ListData>{

    private TextView tvdata;
    private AppCompatCheckBox mtogglebutton;


    /**
     * @param context         calls to super
     * @param pWords          calls to super
     */
    public WordAdapter(final Context context, final ArrayList<ListData> pWords) {
        super(context, 0, pWords);

    }
    @NonNull
    @Override
    public View getView(final int position, @Nullable final View convertView, @Nullable final ViewGroup parent) {
        View listitemview = convertView;
        if (listitemview == null) {
            listitemview = LayoutInflater.from(getContext()).inflate(R.layout.list_view_items, parent, false);

        }

        ListData obj = getItem(position);



        tvdata = (TextView) listitemview.findViewById(R.id.tv_heading);
        tvdata.setText(obj.getData());

        ImageView setimage = (ImageView) listitemview.findViewById(R.id.iv_placeholderimage);
        if (obj.hasImage()) {
            setimage.setImageResource(obj.getImageId());
            setimage.setVisibility(View.VISIBLE);
        } else {
            setimage.setVisibility(View.GONE);

        }

        mtogglebutton = (AppCompatCheckBox) listitemview.findViewById(R.id.toggle_button);

        if(position == 0)
        {
            mtogglebutton.setVisibility(View.VISIBLE);
        }




        return listitemview;
}

}
