package com.ironsource.lifecycle;

import p303e8.C12691c;

/* renamed from: com.ironsource.lifecycle.a */
public final class C4987a implements C4990c {

    /* renamed from: a */
    private long f22058a = System.currentTimeMillis();

    /* renamed from: b */
    private final C4997g f22059b;

    public C4987a(C4997g gVar) {
        C12691c.m53984c(gVar, "task");
        this.f22059b = gVar;
        C4991d.m22849a().mo20610a(this);
    }

    /* renamed from: a */
    public final void mo20600a() {
        this.f22058a = System.currentTimeMillis();
    }

    /* renamed from: b */
    public final void mo20601b() {
        this.f22059b.f22088b = Long.valueOf(System.currentTimeMillis() - this.f22058a);
        this.f22059b.run();
    }
}
