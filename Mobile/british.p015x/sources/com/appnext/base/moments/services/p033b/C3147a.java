package com.appnext.base.moments.services.p033b;

import android.content.Context;
import com.appnext.base.C3117a;
import com.appnext.base.moments.p028a.p029a.C3130c;
import com.appnext.base.moments.services.p032a.C3145a;
import com.appnext.base.moments.services.p032a.C3146b;
import java.util.List;

/* renamed from: com.appnext.base.moments.services.b.a */
public class C3147a {

    /* renamed from: cs */
    private static volatile C3147a f12230cs;

    /* renamed from: ct */
    private C3145a f12231ct;

    public C3147a(Context context) {
        try {
            this.f12231ct = new C3146b(context);
        } catch (Throwable th) {
            C3117a.m10553a("ServiceOperationsManager$ServiceOperationsManager", th);
        }
    }

    /* renamed from: b */
    public static C3147a m10633b(Context context) {
        if (f12230cs == null) {
            synchronized (C3147a.class) {
                if (f12230cs == null) {
                    f12230cs = new C3147a(context);
                }
            }
        }
        return f12230cs;
    }

    /* renamed from: a */
    public final void mo10589a(C3130c cVar, boolean z) {
        this.f12231ct.mo10585a(cVar, z);
    }

    /* renamed from: c */
    public final void mo10591c(C3130c cVar) {
        this.f12231ct.mo10587c(cVar);
    }

    /* renamed from: a */
    public final void mo10590a(List<C3130c> list) {
        this.f12231ct.mo10586a(list);
    }
}
