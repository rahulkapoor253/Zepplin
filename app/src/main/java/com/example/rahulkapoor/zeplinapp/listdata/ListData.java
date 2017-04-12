package com.example.rahulkapoor.zeplinapp.listdata;

/**
 * Created by rahulkapoor on 12/04/17.
 */

public class ListData {
    private static final int NO_IMAGE_PROVIDED = -1;
    private String mdata;
    private int mImageId = NO_IMAGE_PROVIDED;


    public ListData(final int imageid, final String string) {
        this.mdata = string;
        this.mImageId = imageid;

    }

    public String getData() {
        return mdata;

    }

    public int getImageId() {
        return mImageId;
    }

    public boolean hasImage() {
        return true;
    }


}
