package architecture.karlsu.com.basicknowledge4android.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Date:2018/7/31
 * Time:下午8:23
 * author:suwantao
 */
public class EventView extends View {
    public static final String TAG = "MainActivity";

    public EventView(Context context) {
        super(context);
    }

    public EventView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.e(TAG, "dispatchTouchEvent----" + this.getClass().getSimpleName());
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Log.e(TAG, "onTouchEvent-----" + this.getClass().getSimpleName());
        return super.onTouchEvent(event);
    }
}
