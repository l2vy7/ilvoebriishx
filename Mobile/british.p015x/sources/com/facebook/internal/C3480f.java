package com.facebook.internal;

import android.app.Activity;

/* renamed from: com.facebook.internal.f */
/* compiled from: FacebookDialogBase */
public abstract class C3480f<CONTENT, RESULT> {

    /* renamed from: d */
    protected static final Object f13056d = new Object();

    /* renamed from: a */
    private final Activity f13057a;

    /* renamed from: b */
    private final C3541p f13058b;

    /* renamed from: c */
    private int f13059c;

    protected C3480f(Activity activity, int i) {
        C3489g0.m11687i(activity, "activity");
        this.f13057a = activity;
        this.f13058b = null;
        this.f13059c = i;
    }

    protected C3480f(C3541p pVar, int i) {
        C3489g0.m11687i(pVar, "fragmentWrapper");
        this.f13058b = pVar;
        this.f13057a = null;
        this.f13059c = i;
        if (pVar.mo12051a() == null) {
            throw new IllegalArgumentException("Cannot use a fragment that is not attached to an activity");
        }
    }
}
