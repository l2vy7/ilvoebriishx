package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C7410m0;
import com.google.android.gms.common.internal.zaaa;
import p198d5.C10490c;
import p224k4.C10638d;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class SignInButton extends FrameLayout implements View.OnClickListener {

    /* renamed from: b */
    private int f28871b;

    /* renamed from: c */
    private int f28872c;

    /* renamed from: d */
    private View f28873d;

    /* renamed from: e */
    private View.OnClickListener f28874e;

    public SignInButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* renamed from: b */
    private final void m29481b(Context context) {
        View view = this.f28873d;
        if (view != null) {
            removeView(view);
        }
        try {
            this.f28873d = C7410m0.m30032c(context, this.f28871b, this.f28872c);
        } catch (C10490c.C10491a unused) {
            Log.w("SignInButton", "Sign in button not found, using placeholder instead");
            int i = this.f28871b;
            int i2 = this.f28872c;
            zaaa zaaa = new zaaa(context, (AttributeSet) null);
            zaaa.mo30177a(context.getResources(), i, i2);
            this.f28873d = zaaa;
        }
        addView(this.f28873d);
        this.f28873d.setEnabled(isEnabled());
        this.f28873d.setOnClickListener(this);
    }

    /* renamed from: a */
    public void mo29697a(int i, int i2) {
        this.f28871b = i;
        this.f28872c = i2;
        m29481b(getContext());
    }

    public void onClick(View view) {
        View.OnClickListener onClickListener = this.f28874e;
        if (onClickListener != null && view == this.f28873d) {
            onClickListener.onClick(this);
        }
    }

    public void setColorScheme(int i) {
        mo29697a(this.f28871b, i);
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f28873d.setEnabled(z);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f28874e = onClickListener;
        View view = this.f28873d;
        if (view != null) {
            view.setOnClickListener(this);
        }
    }

    @Deprecated
    public void setScopes(Scope[] scopeArr) {
        mo29697a(this.f28871b, this.f28872c);
    }

    public void setSize(int i) {
        mo29697a(i, this.f28872c);
    }

    /* JADX INFO: finally extract failed */
    public SignInButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28874e = null;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C10638d.f49210b, 0, 0);
        try {
            this.f28871b = obtainStyledAttributes.getInt(C10638d.f49211c, 0);
            this.f28872c = obtainStyledAttributes.getInt(C10638d.f49212d, 2);
            obtainStyledAttributes.recycle();
            mo29697a(this.f28871b, this.f28872c);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
