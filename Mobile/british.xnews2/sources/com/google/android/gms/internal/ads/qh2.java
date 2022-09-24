package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qh2 implements yi2<Bundle> {

    /* renamed from: a */
    private final String f38137a;

    /* renamed from: b */
    private final String f38138b;

    public qh2(String str, String str2) {
        this.f38137a = str;
        this.f38138b = str2;
    }

    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f37171o5)).booleanValue()) {
            bundle.putString("request_id", this.f38138b);
        } else {
            bundle.putString("request_id", this.f38137a);
        }
    }
}
