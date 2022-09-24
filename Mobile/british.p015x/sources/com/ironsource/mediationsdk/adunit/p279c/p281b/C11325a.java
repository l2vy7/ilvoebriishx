package com.ironsource.mediationsdk.adunit.p279c.p281b;

/* renamed from: com.ironsource.mediationsdk.adunit.c.b.a */
public final class C11325a {

    /* renamed from: a */
    public C11326a f50841a;

    /* renamed from: b */
    public long f50842b;

    /* renamed from: c */
    public long f50843c;

    /* renamed from: com.ironsource.mediationsdk.adunit.c.b.a$a */
    public enum C11326a {
        MANUAL,
        MANUAL_WITH_AUTOMATIC_RELOAD,
        AUTOMATIC_LOAD_AFTER_CLOSE,
        AUTOMATIC_LOAD_WHILE_SHOW
    }

    public C11325a(C11326a aVar, long j, long j2) {
        this.f50841a = aVar;
        this.f50842b = j;
        this.f50843c = j2;
    }

    /* renamed from: a */
    public final boolean mo44130a() {
        C11326a aVar = this.f50841a;
        return aVar == C11326a.MANUAL || aVar == C11326a.MANUAL_WITH_AUTOMATIC_RELOAD;
    }

    /* renamed from: b */
    public final boolean mo44131b() {
        C11326a aVar = this.f50841a;
        return aVar == C11326a.AUTOMATIC_LOAD_AFTER_CLOSE || aVar == C11326a.AUTOMATIC_LOAD_WHILE_SHOW;
    }
}
