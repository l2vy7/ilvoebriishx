package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.C0572f;
import androidx.core.widget.NestedScrollView;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.constraintlayout.motion.widget.t */
/* compiled from: TouchResponse */
class C0547t {

    /* renamed from: v */
    private static final float[][] f2234v = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};

    /* renamed from: w */
    private static final float[][] f2235w = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};

    /* renamed from: a */
    private int f2236a = 0;

    /* renamed from: b */
    private int f2237b = 0;

    /* renamed from: c */
    private int f2238c = 0;

    /* renamed from: d */
    private int f2239d = -1;

    /* renamed from: e */
    private int f2240e = -1;

    /* renamed from: f */
    private int f2241f = -1;

    /* renamed from: g */
    private float f2242g = 0.5f;

    /* renamed from: h */
    private float f2243h = 0.5f;

    /* renamed from: i */
    private float f2244i = 0.0f;

    /* renamed from: j */
    private float f2245j = 1.0f;

    /* renamed from: k */
    private boolean f2246k = false;

    /* renamed from: l */
    private float[] f2247l = new float[2];

    /* renamed from: m */
    private float f2248m;

    /* renamed from: n */
    private float f2249n;

    /* renamed from: o */
    private final MotionLayout f2250o;

    /* renamed from: p */
    private float f2251p = 4.0f;

    /* renamed from: q */
    private float f2252q = 1.2f;

    /* renamed from: r */
    private boolean f2253r = true;

    /* renamed from: s */
    private float f2254s = 1.0f;

    /* renamed from: t */
    private int f2255t = 0;

    /* renamed from: u */
    private float f2256u = 10.0f;

    /* renamed from: androidx.constraintlayout.motion.widget.t$a */
    /* compiled from: TouchResponse */
    class C0548a implements View.OnTouchListener {
        C0548a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            return false;
        }
    }

    /* renamed from: androidx.constraintlayout.motion.widget.t$b */
    /* compiled from: TouchResponse */
    class C0549b implements NestedScrollView.C0611b {
        C0549b() {
        }

        /* renamed from: a */
        public void mo748a(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4) {
        }
    }

    C0547t(Context context, MotionLayout motionLayout, XmlPullParser xmlPullParser) {
        this.f2250o = motionLayout;
        m2966c(context, Xml.asAttributeSet(xmlPullParser));
    }

    /* renamed from: b */
    private void m2965b(TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArray.getIndex(i);
            if (index == C0572f.f2894i7) {
                this.f2239d = typedArray.getResourceId(index, this.f2239d);
            } else if (index == C0572f.f2904j7) {
                int i2 = typedArray.getInt(index, this.f2236a);
                this.f2236a = i2;
                float[][] fArr = f2234v;
                this.f2243h = fArr[i2][0];
                this.f2242g = fArr[i2][1];
            } else if (index == C0572f.f2804Z6) {
                int i3 = typedArray.getInt(index, this.f2237b);
                this.f2237b = i3;
                float[][] fArr2 = f2235w;
                this.f2244i = fArr2[i3][0];
                this.f2245j = fArr2[i3][1];
            } else if (index == C0572f.f2854e7) {
                this.f2251p = typedArray.getFloat(index, this.f2251p);
            } else if (index == C0572f.f2844d7) {
                this.f2252q = typedArray.getFloat(index, this.f2252q);
            } else if (index == C0572f.f2864f7) {
                this.f2253r = typedArray.getBoolean(index, this.f2253r);
            } else if (index == C0572f.f2814a7) {
                this.f2254s = typedArray.getFloat(index, this.f2254s);
            } else if (index == C0572f.f2824b7) {
                this.f2256u = typedArray.getFloat(index, this.f2256u);
            } else if (index == C0572f.f2914k7) {
                this.f2240e = typedArray.getResourceId(index, this.f2240e);
            } else if (index == C0572f.f2884h7) {
                this.f2238c = typedArray.getInt(index, this.f2238c);
            } else if (index == C0572f.f2874g7) {
                this.f2255t = typedArray.getInteger(index, 0);
            } else if (index == C0572f.f2834c7) {
                this.f2241f = typedArray.getResourceId(index, 0);
            }
        }
    }

    /* renamed from: c */
    private void m2966c(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0572f.f2795Y6);
        m2965b(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public float mo2751a(float f, float f2) {
        return (f * this.f2244i) + (f2 * this.f2245j);
    }

    /* renamed from: d */
    public int mo2752d() {
        return this.f2255t;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public RectF mo2753e(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.f2241f;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public float mo2754f() {
        return this.f2252q;
    }

    /* renamed from: g */
    public float mo2755g() {
        return this.f2251p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo2756h() {
        return this.f2253r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public float mo2757i(float f, float f2) {
        this.f2250o.mo2536e0(this.f2239d, this.f2250o.getProgress(), this.f2243h, this.f2242g, this.f2247l);
        float f3 = this.f2244i;
        if (f3 != 0.0f) {
            float[] fArr = this.f2247l;
            if (fArr[0] == 0.0f) {
                fArr[0] = 1.0E-7f;
            }
            return (f * f3) / fArr[0];
        }
        float[] fArr2 = this.f2247l;
        if (fArr2[1] == 0.0f) {
            fArr2[1] = 1.0E-7f;
        }
        return (f2 * this.f2245j) / fArr2[1];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public RectF mo2758j(ViewGroup viewGroup, RectF rectF) {
        View findViewById;
        int i = this.f2240e;
        if (i == -1 || (findViewById = viewGroup.findViewById(i)) == null) {
            return null;
        }
        rectF.set((float) findViewById.getLeft(), (float) findViewById.getTop(), (float) findViewById.getRight(), (float) findViewById.getBottom());
        return rectF;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public int mo2759k() {
        return this.f2240e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public void mo2760l(MotionEvent motionEvent, MotionLayout.C0469f fVar, int i, C0511q qVar) {
        float f;
        int i2;
        float f2;
        MotionLayout.C0469f fVar2 = fVar;
        fVar2.mo2603b(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f2248m = motionEvent.getRawX();
            this.f2249n = motionEvent.getRawY();
            this.f2246k = false;
        } else if (action == 1) {
            this.f2246k = false;
            fVar2.mo2606e(1000);
            float d = fVar.mo2605d();
            float c = fVar.mo2604c();
            float progress = this.f2250o.getProgress();
            int i3 = this.f2239d;
            if (i3 != -1) {
                this.f2250o.mo2536e0(i3, progress, this.f2243h, this.f2242g, this.f2247l);
            } else {
                float min = (float) Math.min(this.f2250o.getWidth(), this.f2250o.getHeight());
                float[] fArr = this.f2247l;
                fArr[1] = this.f2245j * min;
                fArr[0] = min * this.f2244i;
            }
            float f3 = this.f2244i;
            float[] fArr2 = this.f2247l;
            float f4 = fArr2[0];
            float f5 = fArr2[1];
            if (f3 != 0.0f) {
                f = d / fArr2[0];
            } else {
                f = c / fArr2[1];
            }
            float f6 = !Float.isNaN(f) ? (f / 3.0f) + progress : progress;
            if (f6 != 0.0f && f6 != 1.0f && (i2 = this.f2238c) != 3) {
                this.f2250o.mo2568s0(i2, ((double) f6) < 0.5d ? 0.0f : 1.0f, f);
                if (0.0f >= progress || 1.0f <= progress) {
                    this.f2250o.setState(MotionLayout.C0473j.FINISHED);
                }
            } else if (0.0f >= f6 || 1.0f <= f6) {
                this.f2250o.setState(MotionLayout.C0473j.FINISHED);
            }
        } else if (action == 2) {
            float rawY = motionEvent.getRawY() - this.f2249n;
            float rawX = motionEvent.getRawX() - this.f2248m;
            if (Math.abs((this.f2244i * rawX) + (this.f2245j * rawY)) > this.f2256u || this.f2246k) {
                float progress2 = this.f2250o.getProgress();
                if (!this.f2246k) {
                    this.f2246k = true;
                    this.f2250o.setProgress(progress2);
                }
                int i4 = this.f2239d;
                if (i4 != -1) {
                    this.f2250o.mo2536e0(i4, progress2, this.f2243h, this.f2242g, this.f2247l);
                } else {
                    float min2 = (float) Math.min(this.f2250o.getWidth(), this.f2250o.getHeight());
                    float[] fArr3 = this.f2247l;
                    fArr3[1] = this.f2245j * min2;
                    fArr3[0] = min2 * this.f2244i;
                }
                float f7 = this.f2244i;
                float[] fArr4 = this.f2247l;
                if (((double) Math.abs(((f7 * fArr4[0]) + (this.f2245j * fArr4[1])) * this.f2254s)) < 0.01d) {
                    float[] fArr5 = this.f2247l;
                    fArr5[0] = 0.01f;
                    fArr5[1] = 0.01f;
                }
                if (this.f2244i != 0.0f) {
                    f2 = rawX / this.f2247l[0];
                } else {
                    f2 = rawY / this.f2247l[1];
                }
                float max = Math.max(Math.min(progress2 + f2, 1.0f), 0.0f);
                if (max != this.f2250o.getProgress()) {
                    this.f2250o.setProgress(max);
                    fVar2.mo2606e(1000);
                    this.f2250o.f1844A = this.f2244i != 0.0f ? fVar.mo2605d() / this.f2247l[0] : fVar.mo2604c() / this.f2247l[1];
                } else {
                    this.f2250o.f1844A = 0.0f;
                }
                this.f2248m = motionEvent.getRawX();
                this.f2249n = motionEvent.getRawY();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo2761m(float f, float f2) {
        float f3;
        float progress = this.f2250o.getProgress();
        if (!this.f2246k) {
            this.f2246k = true;
            this.f2250o.setProgress(progress);
        }
        this.f2250o.mo2536e0(this.f2239d, progress, this.f2243h, this.f2242g, this.f2247l);
        float f4 = this.f2244i;
        float[] fArr = this.f2247l;
        if (((double) Math.abs((f4 * fArr[0]) + (this.f2245j * fArr[1]))) < 0.01d) {
            float[] fArr2 = this.f2247l;
            fArr2[0] = 0.01f;
            fArr2[1] = 0.01f;
        }
        float f5 = this.f2244i;
        if (f5 != 0.0f) {
            f3 = (f * f5) / this.f2247l[0];
        } else {
            f3 = (f2 * this.f2245j) / this.f2247l[1];
        }
        float max = Math.max(Math.min(progress + f3, 1.0f), 0.0f);
        if (max != this.f2250o.getProgress()) {
            this.f2250o.setProgress(max);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo2762n(float f, float f2) {
        float f3;
        boolean z = false;
        this.f2246k = false;
        float progress = this.f2250o.getProgress();
        this.f2250o.mo2536e0(this.f2239d, progress, this.f2243h, this.f2242g, this.f2247l);
        float f4 = this.f2244i;
        float[] fArr = this.f2247l;
        float f5 = fArr[0];
        float f6 = this.f2245j;
        float f7 = fArr[1];
        float f8 = 0.0f;
        if (f4 != 0.0f) {
            f3 = (f * f4) / fArr[0];
        } else {
            f3 = (f2 * f6) / fArr[1];
        }
        if (!Float.isNaN(f3)) {
            progress += f3 / 3.0f;
        }
        if (progress != 0.0f) {
            boolean z2 = progress != 1.0f;
            int i = this.f2238c;
            if (i != 3) {
                z = true;
            }
            if (z && z2) {
                MotionLayout motionLayout = this.f2250o;
                if (((double) progress) >= 0.5d) {
                    f8 = 1.0f;
                }
                motionLayout.mo2568s0(i, f8, f3);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo2763o(float f, float f2) {
        this.f2248m = f;
        this.f2249n = f2;
    }

    /* renamed from: p */
    public void mo2764p(boolean z) {
        if (z) {
            float[][] fArr = f2235w;
            fArr[4] = fArr[3];
            fArr[5] = fArr[2];
            float[][] fArr2 = f2234v;
            fArr2[5] = fArr2[2];
            fArr2[6] = fArr2[1];
        } else {
            float[][] fArr3 = f2235w;
            fArr3[4] = fArr3[2];
            fArr3[5] = fArr3[3];
            float[][] fArr4 = f2234v;
            fArr4[5] = fArr4[1];
            fArr4[6] = fArr4[2];
        }
        float[][] fArr5 = f2234v;
        int i = this.f2236a;
        this.f2243h = fArr5[i][0];
        this.f2242g = fArr5[i][1];
        float[][] fArr6 = f2235w;
        int i2 = this.f2237b;
        this.f2244i = fArr6[i2][0];
        this.f2245j = fArr6[i2][1];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo2765q(float f, float f2) {
        this.f2248m = f;
        this.f2249n = f2;
        this.f2246k = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo2766r() {
        View view;
        int i = this.f2239d;
        if (i != -1) {
            view = this.f2250o.findViewById(i);
            if (view == null) {
                Log.e("TouchResponse", "cannot find TouchAnchorId @id/" + C0474a.m2600b(this.f2250o.getContext(), this.f2239d));
            }
        } else {
            view = null;
        }
        if (view instanceof NestedScrollView) {
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            nestedScrollView.setOnTouchListener(new C0548a());
            nestedScrollView.setOnScrollChangeListener(new C0549b());
        }
    }

    public String toString() {
        return this.f2244i + " , " + this.f2245j;
    }
}
