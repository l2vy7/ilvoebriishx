package com.appnext.core.p034ra.services;

import android.content.Context;
import com.appnext.core.p034ra.services.p037a.C3237a;
import com.appnext.core.p034ra.services.p037a.C3238b;
import java.util.ArrayList;

/* renamed from: com.appnext.core.ra.services.a */
public class C3235a {

    /* renamed from: fe */
    private static C3235a f12424fe;

    /* renamed from: ff */
    private C3237a f12425ff;

    /* renamed from: com.appnext.core.ra.services.a$a */
    public enum C3236a {
        DownloadingConfig,
        SendRA,
        StoreRa
    }

    private C3235a(Context context) {
        try {
            this.f12425ff = new C3238b(context);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: s */
    public static C3235a m10897s(Context context) {
        if (f12424fe == null) {
            synchronized (C3235a.class) {
                if (f12424fe == null) {
                    f12424fe = new C3235a(context);
                }
            }
        }
        return f12424fe;
    }

    /* renamed from: aW */
    public final void mo10850aW() {
        try {
            this.f12425ff.mo10857aW();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public final void mo10851b(long j) {
        try {
            this.f12425ff.mo10859d(j * 60000);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public final void mo10852c(long j) {
        try {
            this.f12425ff.mo10858c(j * 60000);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    public final void mo10853d(ArrayList<String> arrayList) {
        if (arrayList != null) {
            try {
                if (!arrayList.isEmpty()) {
                    this.f12425ff.mo10860d(arrayList);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
