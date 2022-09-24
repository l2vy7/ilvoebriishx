package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.lj */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7906lj implements C8054pl {

    /* renamed from: a */
    private final Uri f35110a;

    /* renamed from: b */
    private final C7613dl f35111b;

    /* renamed from: c */
    private final C7943mj f35112c;

    /* renamed from: d */
    private final C8268vl f35113d;

    /* renamed from: e */
    private final C8333xg f35114e = new C8333xg();

    /* renamed from: f */
    private volatile boolean f35115f;

    /* renamed from: g */
    private boolean f35116g = true;

    /* renamed from: h */
    private long f35117h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public long f35118i = -1;

    /* renamed from: j */
    final /* synthetic */ C8017oj f35119j;

    public C7906lj(C8017oj ojVar, Uri uri, C7613dl dlVar, C7943mj mjVar, C8268vl vlVar) {
        this.f35119j = ojVar;
        Objects.requireNonNull(uri);
        this.f35110a = uri;
        Objects.requireNonNull(dlVar);
        this.f35111b = dlVar;
        Objects.requireNonNull(mjVar);
        this.f35112c = mjVar;
        this.f35113d = vlVar;
    }

    /* renamed from: b */
    public final void mo33343b(long j, long j2) {
        this.f35114e.f41156a = j;
        this.f35117h = j2;
        this.f35116g = true;
    }

    public final void zzb() {
        this.f35115f = true;
    }

    public final void zzc() throws IOException, InterruptedException {
        C8121rg rgVar;
        long j;
        while (!this.f35115f) {
            int i = 0;
            try {
                long j2 = this.f35114e.f41156a;
                C7613dl dlVar = this.f35111b;
                C7687fl flVar = r4;
                long j3 = j2;
                C7687fl flVar2 = new C7687fl(this.f35110a, (byte[]) null, j2, j2, -1, (String) null, 0);
                long b = dlVar.mo30700b(flVar);
                this.f35118i = b;
                if (b != -1) {
                    j = j3;
                    b += j;
                    this.f35118i = b;
                } else {
                    j = j3;
                }
                rgVar = new C8121rg(this.f35111b, j, b);
                try {
                    C8155sg b2 = this.f35112c.mo33551b(rgVar, this.f35111b.zzc());
                    if (this.f35116g) {
                        b2.mo30930d(j, this.f35117h);
                        this.f35116g = false;
                    }
                    long j4 = j;
                    int i2 = 0;
                    while (true) {
                        if (i2 != 0) {
                            break;
                        }
                        try {
                            if (this.f35115f) {
                                i2 = 0;
                                break;
                            }
                            this.f35113d.mo35437a();
                            i2 = b2.mo30931e(rgVar, this.f35114e);
                            if (rgVar.mo34534d() > this.f35119j.f36487h + j4) {
                                j4 = rgVar.mo34534d();
                                this.f35113d.mo35438b();
                                this.f35119j.f36493n.post(this.f35119j.f36492m);
                            }
                        } catch (Throwable th) {
                            th = th;
                            i = i2;
                            this.f35114e.f41156a = rgVar.mo34534d();
                            C7836jm.m33651m(this.f35111b);
                            throw th;
                        }
                    }
                    if (i2 != 1) {
                        this.f35114e.f41156a = rgVar.mo34534d();
                        i = i2;
                    }
                    C7836jm.m33651m(this.f35111b);
                    if (i != 0) {
                        return;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.f35114e.f41156a = rgVar.mo34534d();
                    C7836jm.m33651m(this.f35111b);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                rgVar = null;
                if (!(i == 1 || rgVar == null)) {
                    this.f35114e.f41156a = rgVar.mo34534d();
                }
                C7836jm.m33651m(this.f35111b);
                throw th;
            }
        }
    }

    public final boolean zze() {
        return this.f35115f;
    }
}
