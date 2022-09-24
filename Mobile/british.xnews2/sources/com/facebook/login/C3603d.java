package com.facebook.login;

/* renamed from: com.facebook.login.d */
/* compiled from: LoginBehavior */
public enum C3603d {
    NATIVE_WITH_FALLBACK(true, true, true, false, true, true),
    NATIVE_ONLY(true, true, false, false, false, true),
    KATANA_ONLY(false, true, false, false, false, false),
    WEB_ONLY(false, false, true, false, true, false),
    WEB_VIEW_ONLY(false, false, true, false, false, false),
    DIALOG_ONLY(false, true, true, false, true, true),
    DEVICE_AUTH(false, false, false, true, false, false);
    

    /* renamed from: b */
    private final boolean f13395b;

    /* renamed from: c */
    private final boolean f13396c;

    /* renamed from: d */
    private final boolean f13397d;

    /* renamed from: e */
    private final boolean f13398e;

    /* renamed from: f */
    private final boolean f13399f;

    /* renamed from: g */
    private final boolean f13400g;

    private C3603d(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.f13395b = z;
        this.f13396c = z2;
        this.f13397d = z3;
        this.f13398e = z4;
        this.f13399f = z5;
        this.f13400g = z6;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo12236d() {
        return this.f13399f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public boolean mo12237i() {
        return this.f13398e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo12238j() {
        return this.f13400g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo12239k() {
        return this.f13395b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public boolean mo12240l() {
        return this.f13396c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public boolean mo12241m() {
        return this.f13397d;
    }
}
