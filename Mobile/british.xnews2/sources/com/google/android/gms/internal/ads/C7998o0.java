package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;

/* renamed from: com.google.android.gms.internal.ads.o0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C7998o0 implements C7924m0 {

    /* renamed from: a */
    private final int f36208a;

    /* renamed from: b */
    private final int f36209b;

    /* renamed from: c */
    private final uq2 f36210c;

    public C7998o0(C7814j0 j0Var, C8281w wVar) {
        uq2 uq2 = j0Var.f33686b;
        this.f36210c = uq2;
        uq2.mo35236f(12);
        int v = uq2.mo35252v();
        if (MimeTypes.AUDIO_RAW.equals(wVar.f40619l)) {
            int S = d13.m20288S(wVar.f40602A, wVar.f40632y);
            if (v == 0 || v % S != 0) {
                StringBuilder sb = new StringBuilder(88);
                sb.append("Audio sample size mismatch. stsd sample size: ");
                sb.append(S);
                sb.append(", stsz sample size: ");
                sb.append(v);
                Log.w("AtomParsers", sb.toString());
                v = S;
            }
        }
        this.f36208a = v == 0 ? -1 : v;
        this.f36209b = uq2.mo35252v();
    }

    public final int zza() {
        return this.f36208a;
    }

    public final int zzb() {
        return this.f36209b;
    }

    public final int zzc() {
        int i = this.f36208a;
        return i == -1 ? this.f36210c.mo35252v() : i;
    }
}
