package com.google.android.gms.cast.framework.media.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.C7408m;
import java.util.ArrayList;
import java.util.List;
import p114m4.C10758h;
import p114m4.C10761i;
import p114m4.C10772n;
import p114m4.C10773o;
import p241p4.C10863a;
import p241p4.C10864b;
import p241p4.C10865c;
import p241p4.C10866d;
import p243q4.C10920a;

/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public class CastSeekBar extends View {

    /* renamed from: b */
    public C10866d f28757b;

    /* renamed from: c */
    private boolean f28758c;

    /* renamed from: d */
    private Integer f28759d;

    /* renamed from: e */
    public C10864b f28760e;
    @RecentlyNullable

    /* renamed from: f */
    public List<C10863a> f28761f;

    /* renamed from: g */
    public C10865c f28762g;

    /* renamed from: h */
    private final float f28763h;

    /* renamed from: i */
    private final float f28764i;

    /* renamed from: j */
    private final float f28765j;

    /* renamed from: k */
    private final float f28766k;

    /* renamed from: l */
    private final float f28767l;

    /* renamed from: m */
    private final Paint f28768m;

    /* renamed from: n */
    private final int f28769n;

    /* renamed from: o */
    private final int f28770o;

    /* renamed from: p */
    private final int f28771p;

    /* renamed from: q */
    private final int f28772q;

    /* renamed from: r */
    private int[] f28773r;

    /* renamed from: s */
    private Point f28774s;

    /* renamed from: t */
    private Runnable f28775t;

    public CastSeekBar(@RecentlyNonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: f */
    private final void m29415f(Canvas canvas, int i, int i2, int i3, int i4, int i5) {
        this.f28768m.setColor(i5);
        float f = (float) i3;
        float f2 = (float) i4;
        float f3 = this.f28765j;
        canvas.drawRect((((float) i) / f) * f2, -f3, (((float) i2) / f) * f2, f3, this.f28768m);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public final void m29416g(int i) {
        C10866d dVar = this.f28757b;
        if (dVar.f49655f) {
            this.f28759d = Integer.valueOf(C10920a.m49145h(i, dVar.f49653d, dVar.f49654e));
            C10865c cVar = this.f28762g;
            if (cVar != null) {
                cVar.mo43033c(this, getProgress(), true);
            }
            Runnable runnable = this.f28775t;
            if (runnable == null) {
                this.f28775t = new C7151a(this);
            } else {
                removeCallbacks(runnable);
            }
            postDelayed(this.f28775t, 200);
            postInvalidate();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final void m29417h() {
        this.f28758c = true;
        C10865c cVar = this.f28762g;
        if (cVar != null) {
            cVar.mo43032b(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void m29418i() {
        this.f28758c = false;
        C10865c cVar = this.f28762g;
        if (cVar != null) {
            cVar.mo43031a(this);
        }
    }

    /* renamed from: j */
    private final int m29419j(int i) {
        double d = (double) i;
        double measuredWidth = (double) ((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        Double.isNaN(d);
        Double.isNaN(measuredWidth);
        double d2 = d / measuredWidth;
        double d3 = (double) this.f28757b.f49651b;
        Double.isNaN(d3);
        return (int) (d2 * d3);
    }

    /* renamed from: a */
    public final void mo29589a(@RecentlyNonNull List<C10863a> list) {
        ArrayList arrayList;
        if (!C7408m.m30028a(this.f28761f, list)) {
            if (list == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(list);
            }
            this.f28761f = arrayList;
            postInvalidate();
        }
    }

    /* renamed from: b */
    public final void mo29590b(C10866d dVar) {
        if (!this.f28758c) {
            C10866d dVar2 = new C10866d();
            dVar2.f49650a = dVar.f49650a;
            dVar2.f49651b = dVar.f49651b;
            dVar2.f49652c = dVar.f49652c;
            dVar2.f49653d = dVar.f49653d;
            dVar2.f49654e = dVar.f49654e;
            dVar2.f49655f = dVar.f49655f;
            this.f28757b = dVar2;
            this.f28759d = null;
            C10865c cVar = this.f28762g;
            if (cVar != null) {
                cVar.mo43033c(this, getProgress(), false);
            }
            postInvalidate();
        }
    }

    public int getMaxProgress() {
        return this.f28757b.f49651b;
    }

    public int getProgress() {
        Integer num = this.f28759d;
        if (num != null) {
            return num.intValue();
        }
        return this.f28757b.f49650a;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        Runnable runnable = this.f28775t;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        super.onDetachedFromWindow();
    }

    public void onDraw(@RecentlyNonNull Canvas canvas) {
        Canvas canvas2 = canvas;
        int save = canvas.save();
        canvas2.translate((float) getPaddingLeft(), (float) getPaddingTop());
        C10864b bVar = this.f28760e;
        if (bVar == null) {
            int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int measuredHeight = getMeasuredHeight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int progress = getProgress();
            int save2 = canvas.save();
            canvas2.translate(0.0f, (float) (((measuredHeight - paddingTop) - paddingBottom) / 2));
            C10866d dVar = this.f28757b;
            if (dVar.f49655f) {
                int i = dVar.f49653d;
                if (i > 0) {
                    m29415f(canvas, 0, i, dVar.f49651b, measuredWidth, this.f28771p);
                }
                C10866d dVar2 = this.f28757b;
                int i2 = dVar2.f49653d;
                if (progress > i2) {
                    m29415f(canvas, i2, progress, dVar2.f49651b, measuredWidth, this.f28769n);
                }
                C10866d dVar3 = this.f28757b;
                int i3 = dVar3.f49654e;
                if (i3 > progress) {
                    m29415f(canvas, progress, i3, dVar3.f49651b, measuredWidth, this.f28770o);
                }
                C10866d dVar4 = this.f28757b;
                int i4 = dVar4.f49651b;
                int i5 = dVar4.f49654e;
                if (i4 > i5) {
                    m29415f(canvas, i5, i4, i4, measuredWidth, this.f28771p);
                }
            } else {
                int max = Math.max(dVar.f49652c, 0);
                if (max > 0) {
                    m29415f(canvas, 0, max, this.f28757b.f49651b, measuredWidth, this.f28771p);
                }
                if (progress > max) {
                    m29415f(canvas, max, progress, this.f28757b.f49651b, measuredWidth, this.f28769n);
                }
                int i6 = this.f28757b.f49651b;
                if (i6 > progress) {
                    m29415f(canvas, progress, i6, i6, measuredWidth, this.f28771p);
                }
            }
            canvas2.restoreToCount(save2);
            List<C10863a> list = this.f28761f;
            if (list != null && !list.isEmpty()) {
                this.f28768m.setColor(this.f28772q);
                int measuredWidth2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
                int measuredHeight2 = getMeasuredHeight();
                int paddingTop2 = getPaddingTop();
                int paddingBottom2 = getPaddingBottom();
                int save3 = canvas.save();
                canvas2.translate(0.0f, (float) (((measuredHeight2 - paddingTop2) - paddingBottom2) / 2));
                for (C10863a next : list) {
                    if (next != null) {
                        int min = Math.min(next.f49645a, this.f28757b.f49651b);
                        int i7 = next.f49647c ? next.f49646b : 1;
                        float f = (float) measuredWidth2;
                        float f2 = (float) this.f28757b.f49651b;
                        float f3 = (((float) min) * f) / f2;
                        float f4 = (((float) (min + i7)) * f) / f2;
                        float f5 = this.f28767l;
                        if (f4 - f3 < f5) {
                            f4 = f3 + f5;
                        }
                        float f6 = f4 > f ? f : f4;
                        float f7 = f6 - f3 < f5 ? f6 - f5 : f3;
                        float f8 = this.f28765j;
                        canvas.drawRect(f7, -f8, f6, f8, this.f28768m);
                    }
                }
                canvas2.restoreToCount(save3);
            }
            if (isEnabled() && this.f28757b.f49655f) {
                this.f28768m.setColor(this.f28769n);
                int measuredWidth3 = getMeasuredWidth();
                int paddingLeft = getPaddingLeft();
                int paddingRight = getPaddingRight();
                int measuredHeight3 = getMeasuredHeight();
                int paddingTop3 = getPaddingTop();
                int paddingBottom3 = getPaddingBottom();
                int progress2 = getProgress();
                int i8 = this.f28757b.f49651b;
                int save4 = canvas.save();
                double d = (double) progress2;
                double d2 = (double) i8;
                Double.isNaN(d);
                Double.isNaN(d2);
                double d3 = (double) ((measuredWidth3 - paddingLeft) - paddingRight);
                Double.isNaN(d3);
                canvas2.drawCircle((float) ((int) ((d / d2) * d3)), ((float) ((measuredHeight3 - paddingTop3) - paddingBottom3)) / 2.0f, this.f28766k, this.f28768m);
                canvas2.restoreToCount(save4);
            }
        } else {
            int measuredWidth4 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
            int measuredHeight4 = getMeasuredHeight();
            int paddingTop4 = getPaddingTop();
            int paddingBottom4 = getPaddingBottom();
            int save5 = canvas.save();
            canvas2.translate(0.0f, (float) (((measuredHeight4 - paddingTop4) - paddingBottom4) / 2));
            Canvas canvas3 = canvas;
            int i9 = measuredWidth4;
            m29415f(canvas3, 0, bVar.f49648a, bVar.f49649b, i9, this.f28772q);
            int i10 = bVar.f49648a;
            int i11 = bVar.f49649b;
            m29415f(canvas3, i10, i11, i11, i9, this.f28771p);
            canvas2.restoreToCount(save5);
        }
        canvas2.restoreToCount(save);
    }

    /* access modifiers changed from: protected */
    public synchronized void onMeasure(int i, int i2) {
        setMeasuredDimension(View.resolveSizeAndState((int) (this.f28763h + ((float) getPaddingLeft()) + ((float) getPaddingRight())), i, 0), View.resolveSizeAndState((int) (this.f28764i + ((float) getPaddingTop()) + ((float) getPaddingBottom())), i2, 0));
    }

    public boolean onTouchEvent(@RecentlyNonNull MotionEvent motionEvent) {
        if (!isEnabled() || !this.f28757b.f49655f) {
            return false;
        }
        if (this.f28774s == null) {
            this.f28774s = new Point();
        }
        if (this.f28773r == null) {
            this.f28773r = new int[2];
        }
        getLocationOnScreen(this.f28773r);
        this.f28774s.set((((int) motionEvent.getRawX()) - this.f28773r[0]) - getPaddingLeft(), ((int) motionEvent.getRawY()) - this.f28773r[1]);
        int action = motionEvent.getAction();
        if (action == 0) {
            m29417h();
            m29416g(m29419j(this.f28774s.x));
            return true;
        } else if (action == 1) {
            m29416g(m29419j(this.f28774s.x));
            m29418i();
            return true;
        } else if (action == 2) {
            m29416g(m29419j(this.f28774s.x));
            return true;
        } else if (action != 3) {
            return false;
        } else {
            this.f28758c = false;
            this.f28759d = null;
            C10865c cVar = this.f28762g;
            if (cVar != null) {
                cVar.mo43033c(this, getProgress(), true);
                this.f28762g.mo43031a(this);
            }
            postInvalidate();
            return true;
        }
    }

    public CastSeekBar(@RecentlyNonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28761f = new ArrayList();
        setAccessibilityDelegate(new C7153c(this, (C7152b) null));
        Paint paint = new Paint(1);
        this.f28768m = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f28763h = context.getResources().getDimension(C10761i.cast_seek_bar_minimum_width);
        this.f28764i = context.getResources().getDimension(C10761i.cast_seek_bar_minimum_height);
        this.f28765j = context.getResources().getDimension(C10761i.cast_seek_bar_progress_height) / 2.0f;
        this.f28766k = context.getResources().getDimension(C10761i.cast_seek_bar_thumb_size) / 2.0f;
        this.f28767l = context.getResources().getDimension(C10761i.cast_seek_bar_ad_break_minimum_width);
        C10866d dVar = new C10866d();
        this.f28757b = dVar;
        dVar.f49651b = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C10773o.f49480a, C10758h.f49394a, C10772n.f49476a);
        int resourceId = obtainStyledAttributes.getResourceId(C10773o.f49499t, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(C10773o.f49500u, 0);
        int resourceId3 = obtainStyledAttributes.getResourceId(C10773o.f49502w, 0);
        int resourceId4 = obtainStyledAttributes.getResourceId(C10773o.f49481b, 0);
        this.f28769n = context.getResources().getColor(resourceId);
        this.f28770o = context.getResources().getColor(resourceId2);
        this.f28771p = context.getResources().getColor(resourceId3);
        this.f28772q = context.getResources().getColor(resourceId4);
        obtainStyledAttributes.recycle();
    }
}
