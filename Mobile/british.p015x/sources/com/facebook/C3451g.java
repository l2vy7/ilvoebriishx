package com.facebook;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import androidx.core.content.C0600b;
import androidx.fragment.app.Fragment;
import com.facebook.appevents.C3420m;
import com.facebook.common.C3437a;
import com.facebook.common.C3443g;
import com.facebook.internal.C3541p;

/* renamed from: com.facebook.g */
/* compiled from: FacebookButtonBase */
public abstract class C3451g extends Button {

    /* renamed from: b */
    private String f12994b;

    /* renamed from: c */
    private String f12995c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public View.OnClickListener f12996d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public View.OnClickListener f12997e;

    /* renamed from: f */
    private boolean f12998f;

    /* renamed from: g */
    private int f12999g;

    /* renamed from: h */
    private int f13000h;

    /* renamed from: i */
    private C3541p f13001i;

    /* renamed from: com.facebook.g$a */
    /* compiled from: FacebookButtonBase */
    class C3452a implements View.OnClickListener {
        C3452a() {
        }

        public void onClick(View view) {
            C3451g gVar = C3451g.this;
            gVar.m11514g(gVar.getContext());
            if (C3451g.this.f12997e != null) {
                C3451g.this.f12997e.onClick(view);
            } else if (C3451g.this.f12996d != null) {
                C3451g.this.f12996d.onClick(view);
            }
        }
    }

    protected C3451g(Context context, AttributeSet attributeSet, int i, int i2, String str, String str2) {
        super(context, attributeSet, 0);
        i2 = i2 == 0 ? getDefaultStyleResource() : i2;
        mo11880e(context, attributeSet, i, i2 == 0 ? C3443g.com_facebook_button : i2);
        this.f12994b = str;
        this.f12995c = str2;
        setClickable(true);
        setFocusable(true);
    }

    /* renamed from: f */
    private void m11513f(Context context) {
        new C3420m(context).mo11847h(this.f12994b);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m11514g(Context context) {
        new C3420m(context).mo11847h(this.f12995c);
    }

    /* renamed from: i */
    private void m11515i(Context context, AttributeSet attributeSet, int i, int i2) {
        if (!isInEditMode()) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842964}, i, i2);
            try {
                if (obtainStyledAttributes.hasValue(0)) {
                    int resourceId = obtainStyledAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        setBackgroundResource(resourceId);
                    } else {
                        setBackgroundColor(obtainStyledAttributes.getColor(0, 0));
                    }
                } else {
                    setBackgroundColor(C0600b.m3292d(context, C3437a.com_facebook_blue));
                }
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    @SuppressLint({"ResourceType"})
    /* renamed from: j */
    private void m11516j(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16843119, 16843117, 16843120, 16843118, 16843121}, i, i2);
        try {
            setCompoundDrawablesWithIntrinsicBounds(obtainStyledAttributes.getResourceId(0, 0), obtainStyledAttributes.getResourceId(1, 0), obtainStyledAttributes.getResourceId(2, 0), obtainStyledAttributes.getResourceId(3, 0));
            setCompoundDrawablePadding(obtainStyledAttributes.getDimensionPixelSize(4, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: k */
    private void m11517k(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842966, 16842967, 16842968, 16842969}, i, i2);
        try {
            setPadding(obtainStyledAttributes.getDimensionPixelSize(0, 0), obtainStyledAttributes.getDimensionPixelSize(1, 0), obtainStyledAttributes.getDimensionPixelSize(2, 0), obtainStyledAttributes.getDimensionPixelSize(3, 0));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: l */
    private void m11518l(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842904}, i, i2);
        try {
            setTextColor(obtainStyledAttributes.getColorStateList(0));
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842927}, i, i2);
            try {
                setGravity(obtainStyledAttributes2.getInt(0, 17));
                obtainStyledAttributes2.recycle();
                TypedArray obtainStyledAttributes3 = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{16842901, 16842903, 16843087}, i, i2);
                try {
                    setTextSize(0, (float) obtainStyledAttributes3.getDimensionPixelSize(0, 0));
                    setTypeface(Typeface.defaultFromStyle(obtainStyledAttributes3.getInt(1, 1)));
                    setText(obtainStyledAttributes3.getString(2));
                } finally {
                    obtainStyledAttributes3.recycle();
                }
            } catch (Throwable th) {
                obtainStyledAttributes2.recycle();
                throw th;
            }
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    /* renamed from: m */
    private void m11519m() {
        super.setOnClickListener(new C3452a());
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo11879d(View view) {
        View.OnClickListener onClickListener = this.f12996d;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo11880e(Context context, AttributeSet attributeSet, int i, int i2) {
        m11515i(context, attributeSet, i, i2);
        m11516j(context, attributeSet, i, i2);
        m11517k(context, attributeSet, i, i2);
        m11518l(context, attributeSet, i, i2);
        m11519m();
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.app.Activity getActivity() {
        /*
            r3 = this;
            android.content.Context r0 = r3.getContext()
        L_0x0004:
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 != 0) goto L_0x0013
            boolean r2 = r0 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L_0x0013
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L_0x0004
        L_0x0013:
            if (r1 == 0) goto L_0x0018
            android.app.Activity r0 = (android.app.Activity) r0
            return r0
        L_0x0018:
            com.facebook.j r0 = new com.facebook.j
            java.lang.String r1 = "Unable to get Activity."
            r0.<init>((java.lang.String) r1)
            goto L_0x0021
        L_0x0020:
            throw r0
        L_0x0021:
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C3451g.getActivity():android.app.Activity");
    }

    public int getCompoundPaddingLeft() {
        if (this.f12998f) {
            return this.f12999g;
        }
        return super.getCompoundPaddingLeft();
    }

    public int getCompoundPaddingRight() {
        if (this.f12998f) {
            return this.f13000h;
        }
        return super.getCompoundPaddingRight();
    }

    /* access modifiers changed from: protected */
    public abstract int getDefaultRequestCode();

    /* access modifiers changed from: protected */
    public int getDefaultStyleResource() {
        return 0;
    }

    public Fragment getFragment() {
        C3541p pVar = this.f13001i;
        if (pVar != null) {
            return pVar.mo12053c();
        }
        return null;
    }

    public android.app.Fragment getNativeFragment() {
        C3541p pVar = this.f13001i;
        if (pVar != null) {
            return pVar.mo12052b();
        }
        return null;
    }

    public int getRequestCode() {
        return getDefaultRequestCode();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo11889h(String str) {
        return (int) Math.ceil((double) getPaint().measureText(str));
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            m11513f(getContext());
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if ((getGravity() & 1) != 0) {
            int compoundPaddingLeft = getCompoundPaddingLeft();
            int compoundPaddingRight = getCompoundPaddingRight();
            int min = Math.min((((getWidth() - (getCompoundDrawablePadding() + compoundPaddingLeft)) - compoundPaddingRight) - mo11889h(getText().toString())) / 2, (compoundPaddingLeft - getPaddingLeft()) / 2);
            this.f12999g = compoundPaddingLeft - min;
            this.f13000h = compoundPaddingRight + min;
            this.f12998f = true;
        }
        super.onDraw(canvas);
        this.f12998f = false;
    }

    public void setFragment(Fragment fragment) {
        this.f13001i = new C3541p(fragment);
    }

    /* access modifiers changed from: protected */
    public void setInternalOnClickListener(View.OnClickListener onClickListener) {
        this.f12997e = onClickListener;
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f12996d = onClickListener;
    }

    public void setFragment(android.app.Fragment fragment) {
        this.f13001i = new C3541p(fragment);
    }
}
