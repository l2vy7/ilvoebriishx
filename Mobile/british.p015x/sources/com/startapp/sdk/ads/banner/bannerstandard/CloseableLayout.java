package com.startapp.sdk.ads.banner.bannerstandard;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.startapp.C11878e1;
import com.startapp.C11970ib;

/* compiled from: Sta */
public class CloseableLayout extends FrameLayout {

    /* renamed from: o */
    public static final /* synthetic */ int f54205o = 0;

    /* renamed from: a */
    public final int f54206a;

    /* renamed from: b */
    public C12197a f54207b;

    /* renamed from: c */
    public final Drawable f54208c;

    /* renamed from: d */
    public ClosePosition f54209d;

    /* renamed from: e */
    public final int f54210e;

    /* renamed from: f */
    public final int f54211f;

    /* renamed from: g */
    public final int f54212g;

    /* renamed from: h */
    public boolean f54213h;

    /* renamed from: i */
    public final Rect f54214i;

    /* renamed from: j */
    public final Rect f54215j;

    /* renamed from: k */
    public final Rect f54216k;

    /* renamed from: l */
    public final Rect f54217l;

    /* renamed from: m */
    public boolean f54218m;

    /* renamed from: n */
    public C12198b f54219n;

    /* renamed from: com.startapp.sdk.ads.banner.bannerstandard.CloseableLayout$a */
    /* compiled from: Sta */
    public interface C12197a {
        void onClose();
    }

    /* renamed from: com.startapp.sdk.ads.banner.bannerstandard.CloseableLayout$b */
    /* compiled from: Sta */
    public final class C12198b implements Runnable {
        public C12198b() {
        }

        public void run() {
            CloseableLayout closeableLayout = CloseableLayout.this;
            int i = CloseableLayout.f54205o;
            closeableLayout.mo45854a(false);
        }
    }

    public CloseableLayout(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    /* renamed from: a */
    public final void mo45854a(boolean z) {
        int[] state = this.f54208c.getState();
        int[] iArr = FrameLayout.SELECTED_STATE_SET;
        if (z != (state == iArr)) {
            Drawable drawable = this.f54208c;
            if (!z) {
                iArr = FrameLayout.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
            invalidate(this.f54215j);
        }
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f54213h) {
            this.f54213h = false;
            this.f54214i.set(0, 0, getWidth(), getHeight());
            ClosePosition closePosition = this.f54209d;
            Rect rect = this.f54214i;
            Rect rect2 = this.f54215j;
            int i = this.f54210e;
            Gravity.apply(closePosition.mo45866a(), i, i, rect, rect2);
            this.f54217l.set(this.f54215j);
            Rect rect3 = this.f54217l;
            int i2 = this.f54212g;
            rect3.inset(i2, i2);
            ClosePosition closePosition2 = this.f54209d;
            Rect rect4 = this.f54217l;
            Rect rect5 = this.f54216k;
            int i3 = this.f54211f;
            Gravity.apply(closePosition2.mo45866a(), i3, i3, rect4, rect5);
            this.f54208c.setBounds(this.f54216k);
        }
        if (this.f54208c.isVisible()) {
            this.f54208c.draw(canvas);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() != 0) {
            return false;
        }
        return mo45855a((int) motionEvent.getX(), (int) motionEvent.getY(), 0);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f54213h = true;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (mo45855a((int) motionEvent.getX(), (int) motionEvent.getY(), this.f54206a)) {
            if (this.f54218m || this.f54208c.isVisible()) {
                int action = motionEvent.getAction();
                if (action == 0) {
                    mo45854a(true);
                } else if (action == 1) {
                    if (this.f54208c.getState() == FrameLayout.SELECTED_STATE_SET) {
                        if (this.f54219n == null) {
                            this.f54219n = new C12198b();
                        }
                        postDelayed(this.f54219n, (long) ViewConfiguration.getPressedStateDuration());
                        playSoundEffect(0);
                        C12197a aVar = this.f54207b;
                        if (aVar != null) {
                            aVar.onClose();
                        }
                    }
                } else if (action == 3) {
                    mo45854a(false);
                }
                return true;
            }
        }
        mo45854a(false);
        super.onTouchEvent(motionEvent);
        return false;
    }

    public void setCloseAlwaysInteractable(boolean z) {
        this.f54218m = z;
    }

    public void setCloseBoundChanged(boolean z) {
        this.f54213h = z;
    }

    public void setCloseBounds(Rect rect) {
        this.f54215j.set(rect);
    }

    public void setClosePosition(ClosePosition closePosition) {
        this.f54209d = closePosition;
        this.f54213h = true;
        invalidate();
    }

    public void setCloseVisible(boolean z) {
        if (this.f54208c.setVisible(z, false)) {
            invalidate(this.f54215j);
        }
    }

    public void setOnCloseListener(C12197a aVar) {
        this.f54207b = aVar;
    }

    public CloseableLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CloseableLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54214i = new Rect();
        this.f54215j = new Rect();
        this.f54216k = new Rect();
        this.f54217l = new Rect();
        Drawable a = C11878e1.m52262a(context.getResources(), "iVBORw0KGgoAAAANSUhEUgAAACAAAAAgCAYAAABzenr0AAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAA39pVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuNi1jMDY3IDc5LjE1Nzc0NywgMjAxNS8wMy8zMC0yMzo0MDo0MiAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wTU09Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9tbS8iIHhtbG5zOnN0UmVmPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvc1R5cGUvUmVzb3VyY2VSZWYjIiB4bWxuczp4bXA9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC8iIHhtcE1NOk9yaWdpbmFsRG9jdW1lbnRJRD0ieG1wLmRpZDozODRkZTAxYi00OWRkLWM4NDYtYThkNC0wZWRiMDMwYTZlODAiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6QkE0Q0U2MUY2QzA0MTFFNUE3MkJGQjQ1MTkzOEYxQUUiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6QkE0Q0U2MUU2QzA0MTFFNUE3MkJGQjQ1MTkzOEYxQUUiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENDIChXaW5kb3dzKSI+IDx4bXBNTTpEZXJpdmVkRnJvbSBzdFJlZjppbnN0YW5jZUlEPSJ4bXAuaWlkOjlkZjAyMGU0LTNlYmUtZTY0ZC04YjRiLWM5ZWY4MTU4ZjFhYyIgc3RSZWY6ZG9jdW1lbnRJRD0iYWRvYmU6ZG9jaWQ6cGhvdG9zaG9wOmU1MzEzNDdlLTZjMDEtMTFlNS1hZGZlLThmMTBjZWYxMGRiZSIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/PngNsEEAAANeSURBVHjatFfNS1tBEH+pUZOQ0B4i3sTSxHMRFNQoFBEP7dHgvyDiKWgguQra9F+oxqNiwOTQ+oFI1ZM3jSf1YK5FL41ooaKZzu+x+4gv2bx9Rgd+JNn5zO7s7IzH0CQiCvLHZ8YnxkfGe8ZbwS4zSowTxi/GT4/Hc2u8BLHjCOM745b06VboRJpx7GN8ZfyDxUqlQgcHB5RMJmloaIg6Ozupra3NBL5jDTzIQFYQdDOw5db5B8YxLDw+PtLKygr19PQQWDqIRqOUzWZNXUHH2rvBgr2M39C6uLig/v5+bcd2QLdUKskgYLNX57yvIL2zs0OhUOjZziU6Ojro8PBQBnGl3Alm+BknkMI54mybdS4BW3t7ezKIInzVCwDJYm4Zon4p5xLYzfPzcxlEpl7S3SNpmjlznZwQiXn/5CjEnTUzt5GBsbExamlpUfLBg0wjG8vLy3IXlqTzEAoH7m4kElEqTk1Nmfd7bW2tbhBYAw8ykFXZgQ9RJ1CsQghgEr/29/eVStPT09XFhdbX18nr9Vr81tZWyuVyFh+yMzMzSnvwJWjyDS+MYic2NzeV17O7u9vg2m79jsfjBv9bg7PbxOrqqjExMWHxIdvV1aW0V+VrFDtwhFCGh4cbnl0mk6kp+BsbGybsBNlGtkZGRqToEQK4xjfUc6csXlhYcHyFFhcXHe3Al6BrQz427e3tWldpfn5e6Rw83cIkHyvXAUAZb4SdsKZbPe0BaB+Bz+cjTiDlDmxtbZkybo9AKwn9fj9tb2875gBkINvIFnzJJMQ1PMV9GBgYUF6bQCBgFAoFY3x8/Ml6KpUy0un0kzXIQBY6KqrydapViPL5fM0/Rfcj+fhuJw5CqxBpleJYLEY3NzeW8dnZ2RoZrEmCLHQcSvGdWYrFe7CEFTwUqqjR85XLZUokEkoZ8CADWe3HqKoTcnyOdW5KI5m+vj56eHiQz3G0bkNyeXn5ag3J2dmZ/PffVC1Z8bVast3d3eqWLKDVlAaDwaadh8Nhvaa0XluOHg7n9lzn0MWRarfltp0oysEErRqGDTeDCbK9ajApuh7TxGiWERlrjWZzc3M0ODhYM5phDTzbaHb/rNHMFkhUNK13LobTv6K2RJ3se1yO519s4/k7wf5jG89/6I7n/wUYAGo3YtcprD4sAAAAAElFTkSuQmCC");
        this.f54208c = a;
        this.f54209d = ClosePosition.TOP_RIGHT;
        a.setState(FrameLayout.EMPTY_STATE_SET);
        a.setCallback(this);
        this.f54206a = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f54210e = C11970ib.m52467a(context, 50);
        this.f54211f = C11970ib.m52467a(context, 30);
        this.f54212g = C11970ib.m52467a(context, 8);
        setWillNotDraw(false);
        this.f54218m = true;
    }

    /* renamed from: a */
    public boolean mo45855a(int i, int i2, int i3) {
        Rect rect = this.f54215j;
        return i >= rect.left - i3 && i2 >= rect.top - i3 && i < rect.right + i3 && i2 < rect.bottom + i3;
    }

    /* compiled from: Sta */
    public enum ClosePosition {
        TOP_LEFT(51),
        TOP_CENTER(49),
        TOP_RIGHT(53),
        CENTER(17),
        BOTTOM_LEFT(83),
        BOTTOM_CENTER(81),
        BOTTOM_RIGHT(85);
        
        private final int mGravity;

        /* access modifiers changed from: public */
        ClosePosition(int i) {
            this.mGravity = i;
        }

        /* renamed from: a */
        public static ClosePosition m52902a(String str, ClosePosition closePosition) throws Exception {
            if (TextUtils.isEmpty(str)) {
                return closePosition;
            }
            if (str.equals("top-left")) {
                return TOP_LEFT;
            }
            if (str.equals("top-right")) {
                return TOP_RIGHT;
            }
            if (str.equals(TtmlNode.CENTER)) {
                return CENTER;
            }
            if (str.equals("bottom-left")) {
                return BOTTOM_LEFT;
            }
            if (str.equals("bottom-right")) {
                return BOTTOM_RIGHT;
            }
            if (str.equals("top-center")) {
                return TOP_CENTER;
            }
            if (str.equals("bottom-center")) {
                return BOTTOM_CENTER;
            }
            throw new IllegalArgumentException(str);
        }

        /* renamed from: a */
        public int mo45866a() {
            return this.mGravity;
        }
    }
}
