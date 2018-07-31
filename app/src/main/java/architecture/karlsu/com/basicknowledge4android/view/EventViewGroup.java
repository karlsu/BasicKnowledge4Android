package architecture.karlsu.com.basicknowledge4android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ViewGroup;


/**
 * Date:2018/7/31
 * Time:下午8:20
 * author:suwantao
 */
public class EventViewGroup extends ViewGroup {
    public static final String TAG = "MainActivity";

    public EventViewGroup(Context context) {
        super(context);
    }

    public EventViewGroup(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onLayout(boolean b, int i, int i1, int i2, int i3) {

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e(TAG, "dispatchTouchEvent----" + this.getClass().getSimpleName());
        return  true;
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Log.e(TAG, "onInterceptTouchEvent----" + this.getClass().getSimpleName());
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG, "onTouchEvent----" + this.getClass().getSimpleName());
        return super.onTouchEvent(event);
    }
}
