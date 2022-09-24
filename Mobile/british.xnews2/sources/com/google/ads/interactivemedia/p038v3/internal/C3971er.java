package com.google.ads.interactivemedia.p038v3.internal;

import android.annotation.TargetApi;
import com.google.ads.interactivemedia.p038v3.impl.data.C3790bc;
import com.google.ads.interactivemedia.p038v3.impl.data.C3791bd;
import java.util.concurrent.ExecutorService;

@TargetApi(19)
/* renamed from: com.google.ads.interactivemedia.v3.internal.er */
/* compiled from: IMASDK */
final class C3971er {

    /* renamed from: a */
    private final C3969ep f17002a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C3963ej f17003b;

    /* renamed from: c */
    private final awl f17004c;

    C3971er(C3963ej ejVar, ExecutorService executorService, C3969ep epVar) {
        this.f17004c = awo.m15056a(executorService);
        this.f17002a = epVar;
        this.f17003b = ejVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15742a(C3948dv dvVar, String str, C3790bc bcVar) {
        C3948dv dvVar2 = C3948dv.activate;
        if (dvVar.ordinal() != 34) {
            String valueOf = String.valueOf(dvVar);
            StringBuilder sb = new StringBuilder(valueOf.length() + 34);
            sb.append("Unexpected network request of type");
            sb.append(valueOf);
            C4257pg.m18525d(sb.toString());
            return;
        }
        awo.m15057b(this.f17004c.mo14676a(new C3966em(this, bcVar)), new C3967en(this, str), this.f17004c);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ C3791bd mo15743b(C3790bc bcVar) throws Exception {
        return this.f17002a.mo15741a(bcVar);
    }
}
