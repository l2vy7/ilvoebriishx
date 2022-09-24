package com.appnext.base.moments.p027a;

import com.appnext.base.C3117a;
import com.appnext.base.moments.p027a.p029b.C3131a;
import com.appnext.base.moments.p027a.p029b.C3132b;
import com.appnext.base.moments.p027a.p029b.C3133c;

/* renamed from: com.appnext.base.moments.a.a */
public class C3127a {

    /* renamed from: bZ */
    private static volatile C3127a f12206bZ;

    /* renamed from: bW */
    private C3131a f12207bW;

    /* renamed from: bX */
    private C3132b f12208bX;

    /* renamed from: bY */
    private C3133c f12209bY;

    private C3127a() {
        try {
            this.f12207bW = new C3131a();
            this.f12208bX = new C3132b();
            this.f12209bY = new C3133c();
        } catch (Throwable th) {
            C3117a.m10553a("DatabaseFactory$initDB", th);
        }
    }

    /* renamed from: Q */
    public static C3127a m10579Q() {
        if (f12206bZ == null) {
            synchronized (C3127a.class) {
                if (f12206bZ == null) {
                    f12206bZ = new C3127a();
                }
            }
        }
        return f12206bZ;
    }

    /* renamed from: R */
    public final C3131a mo10555R() {
        return this.f12207bW;
    }

    /* renamed from: S */
    public final C3132b mo10556S() {
        return this.f12208bX;
    }

    /* renamed from: T */
    public final C3133c mo10557T() {
        return this.f12209bY;
    }
}
