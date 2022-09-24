package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p073f.C5247j;
import p099k.C5522b;

public abstract class ActionBar {

    /* renamed from: androidx.appcompat.app.ActionBar$a */
    public interface C0212a {
        /* renamed from: a */
        void mo726a(boolean z);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.ActionBar$b */
    public static abstract class C0213b {
        /* renamed from: a */
        public abstract CharSequence mo727a();

        /* renamed from: b */
        public abstract View mo728b();

        /* renamed from: c */
        public abstract Drawable mo729c();

        /* renamed from: d */
        public abstract CharSequence mo730d();

        /* renamed from: e */
        public abstract void mo731e();
    }

    /* renamed from: f */
    public boolean mo707f() {
        return false;
    }

    /* renamed from: g */
    public abstract boolean mo708g();

    /* renamed from: h */
    public abstract void mo709h(boolean z);

    /* renamed from: i */
    public abstract int mo710i();

    /* renamed from: j */
    public abstract Context mo711j();

    /* renamed from: k */
    public boolean mo712k() {
        return false;
    }

    /* renamed from: l */
    public void mo713l(Configuration configuration) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo714m() {
    }

    /* renamed from: n */
    public abstract boolean mo715n(int i, KeyEvent keyEvent);

    /* renamed from: o */
    public boolean mo716o(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: p */
    public boolean mo717p() {
        return false;
    }

    /* renamed from: q */
    public abstract void mo718q(boolean z);

    /* renamed from: r */
    public abstract void mo719r(boolean z);

    /* renamed from: s */
    public abstract void mo720s(int i);

    /* renamed from: t */
    public abstract void mo721t(boolean z);

    /* renamed from: u */
    public abstract void mo722u(CharSequence charSequence);

    /* renamed from: v */
    public abstract void mo723v(CharSequence charSequence);

    /* renamed from: w */
    public abstract void mo724w(CharSequence charSequence);

    /* renamed from: x */
    public C5522b mo725x(C5522b.C5523a aVar) {
        return null;
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f552a;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f552a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C5247j.f23206t);
            this.f552a = obtainStyledAttributes.getInt(C5247j.f23211u, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f552a = 0;
            this.f552a = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f552a = 0;
            this.f552a = layoutParams.f552a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f552a = 0;
        }
    }
}
