package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import p103l.C5639e;

/* renamed from: androidx.appcompat.widget.s */
/* compiled from: ForwardingListener */
public abstract class C0415s implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: b */
    private final float f1674b;

    /* renamed from: c */
    private final int f1675c;

    /* renamed from: d */
    private final int f1676d;

    /* renamed from: e */
    final View f1677e;

    /* renamed from: f */
    private Runnable f1678f;

    /* renamed from: g */
    private Runnable f1679g;

    /* renamed from: h */
    private boolean f1680h;

    /* renamed from: i */
    private int f1681i;

    /* renamed from: j */
    private final int[] f1682j = new int[2];

    /* renamed from: androidx.appcompat.widget.s$a */
    /* compiled from: ForwardingListener */
    private class C0416a implements Runnable {
        C0416a() {
        }

        public void run() {
            ViewParent parent = C0415s.this.f1677e.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.s$b */
    /* compiled from: ForwardingListener */
    private class C0417b implements Runnable {
        C0417b() {
        }

        public void run() {
            C0415s.this.mo2247e();
        }
    }

    public C0415s(View view) {
        this.f1677e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f1674b = (float) ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f1675c = tapTimeout;
        this.f1676d = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    /* renamed from: a */
    private void m2217a() {
        Runnable runnable = this.f1679g;
        if (runnable != null) {
            this.f1677e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f1678f;
        if (runnable2 != null) {
            this.f1677e.removeCallbacks(runnable2);
        }
    }

    /* renamed from: f */
    private boolean m2218f(MotionEvent motionEvent) {
        C0410q qVar;
        View view = this.f1677e;
        C5639e b = mo1009b();
        if (b == null || !b.mo1044a() || (qVar = (C0410q) b.mo1048j()) == null || !qVar.isShown()) {
            return false;
        }
        MotionEvent obtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
        m2221i(view, obtainNoHistory);
        m2222j(qVar, obtainNoHistory);
        boolean e = qVar.mo2228e(obtainNoHistory, this.f1681i);
        obtainNoHistory.recycle();
        int actionMasked = motionEvent.getActionMasked();
        boolean z = (actionMasked == 1 || actionMasked == 3) ? false : true;
        if (!e || !z) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r1 != 3) goto L_0x006d;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m2219g(android.view.MotionEvent r6) {
        /*
            r5 = this;
            android.view.View r0 = r5.f1677e
            boolean r1 = r0.isEnabled()
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            int r1 = r6.getActionMasked()
            if (r1 == 0) goto L_0x0041
            r3 = 1
            if (r1 == r3) goto L_0x003d
            r4 = 2
            if (r1 == r4) goto L_0x001a
            r6 = 3
            if (r1 == r6) goto L_0x003d
            goto L_0x006d
        L_0x001a:
            int r1 = r5.f1681i
            int r1 = r6.findPointerIndex(r1)
            if (r1 < 0) goto L_0x006d
            float r4 = r6.getX(r1)
            float r6 = r6.getY(r1)
            float r1 = r5.f1674b
            boolean r6 = m2220h(r0, r4, r6, r1)
            if (r6 != 0) goto L_0x006d
            r5.m2217a()
            android.view.ViewParent r6 = r0.getParent()
            r6.requestDisallowInterceptTouchEvent(r3)
            return r3
        L_0x003d:
            r5.m2217a()
            goto L_0x006d
        L_0x0041:
            int r6 = r6.getPointerId(r2)
            r5.f1681i = r6
            java.lang.Runnable r6 = r5.f1678f
            if (r6 != 0) goto L_0x0052
            androidx.appcompat.widget.s$a r6 = new androidx.appcompat.widget.s$a
            r6.<init>()
            r5.f1678f = r6
        L_0x0052:
            java.lang.Runnable r6 = r5.f1678f
            int r1 = r5.f1675c
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
            java.lang.Runnable r6 = r5.f1679g
            if (r6 != 0) goto L_0x0065
            androidx.appcompat.widget.s$b r6 = new androidx.appcompat.widget.s$b
            r6.<init>()
            r5.f1679g = r6
        L_0x0065:
            java.lang.Runnable r6 = r5.f1679g
            int r1 = r5.f1676d
            long r3 = (long) r1
            r0.postDelayed(r6, r3)
        L_0x006d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0415s.m2219g(android.view.MotionEvent):boolean");
    }

    /* renamed from: h */
    private static boolean m2220h(View view, float f, float f2, float f3) {
        float f4 = -f3;
        return f >= f4 && f2 >= f4 && f < ((float) (view.getRight() - view.getLeft())) + f3 && f2 < ((float) (view.getBottom() - view.getTop())) + f3;
    }

    /* renamed from: i */
    private boolean m2221i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1682j;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) iArr[0], (float) iArr[1]);
        return true;
    }

    /* renamed from: j */
    private boolean m2222j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f1682j;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation((float) (-iArr[0]), (float) (-iArr[1]));
        return true;
    }

    /* renamed from: b */
    public abstract C5639e mo1009b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract boolean mo1010c();

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo1409d() {
        C5639e b = mo1009b();
        if (b == null || !b.mo1044a()) {
            return true;
        }
        b.dismiss();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2247e() {
        m2217a();
        View view = this.f1677e;
        if (view.isEnabled() && !view.isLongClickable() && mo1010c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            this.f1680h = true;
        }
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = this.f1680h;
        if (z2) {
            z = m2218f(motionEvent) || !mo1409d();
        } else {
            z = m2219g(motionEvent) && mo1010c();
            if (z) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f1677e.onTouchEvent(obtain);
                obtain.recycle();
            }
        }
        this.f1680h = z;
        if (z || z2) {
            return true;
        }
        return false;
    }

    public void onViewAttachedToWindow(View view) {
    }

    public void onViewDetachedFromWindow(View view) {
        this.f1680h = false;
        this.f1681i = -1;
        Runnable runnable = this.f1678f;
        if (runnable != null) {
            this.f1677e.removeCallbacks(runnable);
        }
    }
}
