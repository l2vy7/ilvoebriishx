package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class cu0 implements xa3<Map<String, String>> {

    /* renamed from: a */
    final /* synthetic */ List f30490a;

    /* renamed from: b */
    final /* synthetic */ String f30491b;

    /* renamed from: c */
    final /* synthetic */ Uri f30492c;

    /* renamed from: d */
    final /* synthetic */ eu0 f30493d;

    cu0(eu0 eu0, List list, String str, Uri uri) {
        this.f30493d = eu0;
        this.f30490a = list;
        this.f30491b = str;
        this.f30492c = uri;
    }

    public final void zza(Throwable th) {
        co0.zzj("Failed to parse gmsg params for: ".concat(String.valueOf(this.f30492c)));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.f30493d.m20409w((Map) obj, this.f30490a, this.f30491b);
    }
}
