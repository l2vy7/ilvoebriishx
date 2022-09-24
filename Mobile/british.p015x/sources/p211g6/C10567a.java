package p211g6;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* renamed from: g6.a */
/* compiled from: InsetDialogOnTouchListener */
public class C10567a implements View.OnTouchListener {

    /* renamed from: b */
    private final Dialog f49121b;

    /* renamed from: c */
    private final int f49122c;

    /* renamed from: d */
    private final int f49123d;

    /* renamed from: e */
    private final int f49124e;

    public C10567a(Dialog dialog, Rect rect) {
        this.f49121b = dialog;
        this.f49122c = rect.left;
        this.f49123d = rect.top;
        this.f49124e = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f49122c + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f49123d + findViewById.getTop();
        if (new RectF((float) left, (float) top, (float) width, (float) (findViewById.getHeight() + top)).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f49124e;
            obtain.setLocation((float) ((-i) - 1), (float) ((-i) - 1));
        }
        view.performClick();
        return this.f49121b.onTouchEvent(obtain);
    }
}
