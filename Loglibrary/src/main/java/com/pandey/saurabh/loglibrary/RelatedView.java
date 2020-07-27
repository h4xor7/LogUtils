package com.pandey.saurabh.loglibrary;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;

public  class RelatedView extends FrameLayout {

    private TextView valueText;
    private ImageView link;


    private int textColorRes;


    public RelatedView(@NonNull Context context) {
        super(context);

        init();
    }

    public RelatedView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();

        obtainStyledAttributes(context,attrs,0);
    }

    public RelatedView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        init();
        obtainStyledAttributes(context,attrs,defStyleAttr);


    }



    private void init() {
       /* inflate(getContext(), R.layout.view_quantity, this);
        subtract = findViewById(R.id.subtract);
        quantity = findViewById(R.id.quantity);
        add = findViewById(R.id.add);
        subtract.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                ...
            }
        });
        add.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                ...
            }
        });
        ...*/

       inflate(getContext(),R.layout.test_layout,this);
       valueText = findViewById(R.id.testTextView);
       link = findViewById(R.id.testImageView);


       link.setOnClickListener(new OnClickListener() {
           @Override
           public void onClick(View v) {

               Toast.makeText(getContext(), "Working", Toast.LENGTH_SHORT).show();

           }
       });


       setupView();


    }


    private void obtainStyledAttributes(Context context, AttributeSet attrs, int defStyleAttr) {
        if (attrs != null) {
            TypedArray typedArray = context.getTheme().obtainStyledAttributes(attrs, R.styleable.RelatedView, defStyleAttr, 0);

            textColorRes = typedArray.getResourceId(R.styleable.RelatedView_colorOfText, R.color.div2);
            return;
        }

        textColorRes = R.color.div2;
    }




    private void setupView() {
        int textColor = ContextCompat.getColor(getContext(), textColorRes);
        if (textColor != ContextCompat.getColor(getContext(), R.color.div2)) {
            valueText.setTextColor(textColor);
        }
    }


}
