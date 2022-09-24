package com.google.ads.interactivemedia.p038v3.internal;

import android.net.Uri;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aey */
/* compiled from: IMASDK */
public final class aey extends aez {

    /* renamed from: a */
    private final aew f14483a;

    /* renamed from: f */
    private final afh f14484f;

    public aey(C4120ke keVar, String str, afe afe, List<aes> list) {
        super(keVar, str, afe, list);
        aew aew;
        Uri.parse(str);
        long j = afe.f14506b;
        afh afh = null;
        if (j <= 0) {
            aew = null;
        } else {
            aew = new aew((String) null, afe.f14505a, j);
        }
        this.f14483a = aew;
        this.f14484f = aew == null ? new afh(new aew((String) null, 0, -1)) : afh;
    }

    /* renamed from: k */
    public final aew mo13586k() {
        return this.f14483a;
    }

    /* renamed from: l */
    public final aed mo13587l() {
        return this.f14484f;
    }

    /* renamed from: m */
    public final void mo13588m() {
    }
}
