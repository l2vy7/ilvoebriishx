package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.C7353b;
import com.google.android.gms.common.api.C7191a;

/* renamed from: com.google.android.gms.common.internal.g0 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7390g0 {

    /* renamed from: a */
    private final SparseIntArray f29318a = new SparseIntArray();

    /* renamed from: b */
    private C7353b f29319b;

    public C7390g0(C7353b bVar) {
        C4604n.m20098k(bVar);
        this.f29319b = bVar;
    }

    /* renamed from: a */
    public final int mo30098a(Context context, int i) {
        return this.f29318a.get(i, -1);
    }

    /* renamed from: b */
    public final int mo30099b(Context context, C7191a.C7201f fVar) {
        C4604n.m20098k(context);
        C4604n.m20098k(fVar);
        int i = 0;
        if (!fVar.requiresGooglePlayServices()) {
            return 0;
        }
        int minApkVersion = fVar.getMinApkVersion();
        int a = mo30098a(context, minApkVersion);
        if (a == -1) {
            int i2 = 0;
            while (true) {
                if (i2 >= this.f29318a.size()) {
                    i = -1;
                    break;
                }
                int keyAt = this.f29318a.keyAt(i2);
                if (keyAt > minApkVersion && this.f29318a.get(keyAt) == 0) {
                    break;
                }
                i2++;
            }
            a = i == -1 ? this.f29319b.mo29709j(context, minApkVersion) : i;
            this.f29318a.put(minApkVersion, a);
        }
        return a;
    }

    /* renamed from: c */
    public final void mo30100c() {
        this.f29318a.clear();
    }
}
