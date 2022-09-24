package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.content.C0600b;
import p104l0.C5648h;

/* renamed from: androidx.fragment.app.h */
/* compiled from: FragmentHostCallback */
public abstract class C0707h<E> extends C0704e {

    /* renamed from: b */
    private final Activity f3616b;

    /* renamed from: c */
    private final Context f3617c;

    /* renamed from: d */
    private final Handler f3618d;

    /* renamed from: e */
    private final int f3619e;

    /* renamed from: f */
    final FragmentManager f3620f;

    C0707h(FragmentActivity fragmentActivity) {
        this(fragmentActivity, fragmentActivity, new Handler(), 0);
    }

    /* renamed from: f */
    public View mo3487f(int i) {
        return null;
    }

    /* renamed from: h */
    public boolean mo3488h() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public Activity mo3769j() {
        return this.f3616b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public Context mo3770k() {
        return this.f3617c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public Handler mo3771l() {
        return this.f3618d;
    }

    /* renamed from: m */
    public abstract E mo3512m();

    /* renamed from: n */
    public LayoutInflater mo3513n() {
        return LayoutInflater.from(this.f3617c);
    }

    /* renamed from: o */
    public boolean mo3514o(Fragment fragment) {
        return true;
    }

    /* renamed from: p */
    public void mo3772p(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            C0600b.m3300l(this.f3617c, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    /* renamed from: q */
    public void mo3515q() {
    }

    C0707h(Activity activity, Context context, Handler handler, int i) {
        this.f3620f = new C0711k();
        this.f3616b = activity;
        this.f3617c = (Context) C5648h.m24965d(context, "context == null");
        this.f3618d = (Handler) C5648h.m24965d(handler, "handler == null");
        this.f3619e = i;
    }
}
