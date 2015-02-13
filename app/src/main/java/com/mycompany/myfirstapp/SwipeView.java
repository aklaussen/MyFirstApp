package com.mycompany.myfirstapp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by anna on 2/11/15.
 */
public class SwipeView extends TextView {

    int num = 0;
    SwipeView self;

    public SwipeView (Context context, AttributeSet attrs) {
        super(context, attrs);

        self = this;

        setOnTouchListener(new OnSwipeTouchListener(context) {
            @Override
            public void onSwipeDown() {
                num--;
//                Toast.makeText(getContext(), "Down", Toast.LENGTH_SHORT).show();
                self.setText("" + num);
                postInvalidate();
            }

            @Override
            public void onSwipeUp() {
                num++;
//                Toast.makeText(getContext(), "Up", Toast.LENGTH_SHORT).show();
                self.setText("" + num);
                postInvalidate();
            }

            @Override
            public void doubleTap () {
                num+=5;
                self.setText("" + num);
                postInvalidate();
            }

        });

    }

    public void discard() {
        num = 0;
        self.setText("" + num);
        postInvalidate();
    }
}
