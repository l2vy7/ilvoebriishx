package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class rd2 implements yi2 {

    /* renamed from: a */
    public final /* synthetic */ ArrayList f38634a;

    public /* synthetic */ rd2(ArrayList arrayList) {
        this.f38634a = arrayList;
    }

    public final void zza(Object obj) {
        ((Bundle) obj).putStringArrayList("ad_types", this.f38634a);
    }
}
