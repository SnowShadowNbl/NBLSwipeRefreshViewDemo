package com.nbl.nblswiperefreshview;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * author: Nbl(SnowShadow)
 * email: vsnowshadow@gmail.com
 * created
 */
public class ProgressView extends RelativeLayout{


    public ProgressView(Context context){
        super(context);
        init( context);
    }

    public ProgressView(Context context, AttributeSet attrs){
        super(context, attrs);
        init( context);
    }

    public ProgressView(Context context, AttributeSet attrs, int defStyle){
        super(context, attrs, defStyle);
        init( context);
    }

    private void init(Context context){
        LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View progressBarItemView=(View)inflater.inflate(R.layout.progress_item, null);
        addView(progressBarItemView);
        ImageView progressImageView=(ImageView)this.findViewById(R.id.myloading_image_id);
        AnimationDrawable animationDrawable = (AnimationDrawable) progressImageView.getDrawable();
        animationDrawable.start();
    }

}
