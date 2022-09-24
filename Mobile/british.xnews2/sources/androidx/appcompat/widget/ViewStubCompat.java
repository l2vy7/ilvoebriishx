package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import p072f.C5247j;

public final class ViewStubCompat extends View {

    /* renamed from: b */
    private int f1503b;

    /* renamed from: c */
    private int f1504c;

    /* renamed from: d */
    private WeakReference<View> f1505d;

    /* renamed from: e */
    private LayoutInflater f1506e;

    /* renamed from: f */
    private C0370a f1507f;

    /* renamed from: androidx.appcompat.widget.ViewStubCompat$a */
    public interface C0370a {
        /* renamed from: a */
        void mo2050a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: a */
    public View mo2038a() {
        ViewParent parent = getParent();
        if (!(parent instanceof ViewGroup)) {
            throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
        } else if (this.f1503b != 0) {
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f1506e;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f1503b, viewGroup, false);
            int i = this.f1504c;
            if (i != -1) {
                inflate.setId(i);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f1505d = new WeakReference<>(inflate);
            C0370a aVar = this.f1507f;
            if (aVar != null) {
                aVar.mo2050a(this, inflate);
            }
            return inflate;
        } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1504c;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1506e;
    }

    public int getLayoutResource() {
        return this.f1503b;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i) {
        this.f1504c = i;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1506e = layoutInflater;
    }

    public void setLayoutResource(int i) {
        this.f1503b = i;
    }

    public void setOnInflateListener(C0370a aVar) {
        this.f1507f = aVar;
    }

    public void setVisibility(int i) {
        WeakReference<View> weakReference = this.f1505d;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            mo2038a();
        }
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1503b = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5247j.f23099X3, i, 0);
        this.f1504c = obtainStyledAttributes.getResourceId(C5247j.f23115a4, -1);
        this.f1503b = obtainStyledAttributes.getResourceId(C5247j.f23109Z3, 0);
        setId(obtainStyledAttributes.getResourceId(C5247j.f23104Y3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }
}
