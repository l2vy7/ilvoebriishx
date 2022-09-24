package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.qu */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final /* synthetic */ class C8099qu implements Comparator {

    /* renamed from: b */
    public static final /* synthetic */ C8099qu f38283b = new C8099qu();

    private /* synthetic */ C8099qu() {
    }

    public final int compare(Object obj, Object obj2) {
        List<String> list = RequestConfiguration.zza;
        return list.indexOf((String) obj) - list.indexOf((String) obj2);
    }
}
