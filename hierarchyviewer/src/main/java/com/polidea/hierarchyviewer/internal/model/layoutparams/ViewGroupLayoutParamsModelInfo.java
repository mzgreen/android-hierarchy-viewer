package com.polidea.hierarchyviewer.internal.model.layoutparams;

import android.view.ViewGroup;
import com.google.gson.annotations.SerializedName;

public class ViewGroupLayoutParamsModelInfo implements LayoutParamsModelInfo {

    interface Metadata {

        String NAME = "name";

        String HEIGHT = "height";
        String WIDTH = "width";
    }

    @SerializedName(Metadata.NAME)
    String name;

    @SerializedName(Metadata.HEIGHT)
    int height;

    @SerializedName(Metadata.WIDTH)
    int width;

    @Override
    public void setDataFromLayoutParams(ViewGroup.LayoutParams viewGroupLayoutParams) {
        name = viewGroupLayoutParams.getClass().getCanonicalName();
        height = viewGroupLayoutParams.height;
        width = viewGroupLayoutParams.width;
    }
}
