package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zz2 extends vz2 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: long} */
    /* JADX WARNING: type inference failed for: r2v0, types: [java.util.HashSet] */
    /* JADX WARNING: type inference failed for: r3v0, types: [org.json.JSONObject] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zz2(com.google.android.gms.internal.ads.oz2 r8, com.google.android.gms.internal.ads.oz2 r9, java.util.HashSet<java.lang.String> r10, org.json.JSONObject r11, long r12) {
        /*
            r7 = this;
            r6 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zz2.<init>(com.google.android.gms.internal.ads.oz2, java.util.HashSet, org.json.JSONObject, long, byte[]):void");
    }

    /* renamed from: c */
    private final void m40591c(String str) {
        qy2 a = qy2.m36822a();
        if (a != null) {
            for (fy2 next : a.mo34441c()) {
                if (this.f40596c.contains(next.mo31963h())) {
                    next.mo31962g().mo31698d(str, this.f40598e);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo30280a(String str) {
        m40591c(str);
        super.onPostExecute(str);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f40597d.toString();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        m40591c(str);
        super.onPostExecute(str);
    }
}
