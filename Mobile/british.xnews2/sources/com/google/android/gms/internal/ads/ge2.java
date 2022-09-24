package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class ge2 implements yi2 {

    /* renamed from: a */
    public final /* synthetic */ ArrayList f32251a;

    public /* synthetic */ ge2(ArrayList arrayList) {
        this.f32251a = arrayList;
    }

    public final void zza(Object obj) {
        ((Bundle) obj).putStringArrayList("android_permissions", this.f32251a);
    }
}
