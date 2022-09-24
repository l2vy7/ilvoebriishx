package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C9412wc;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.a4 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9715a4 implements C9412wc {

    /* renamed from: a */
    final /* synthetic */ String f46147a;

    /* renamed from: b */
    final /* synthetic */ C9726b4 f46148b;

    C9715a4(C9726b4 b4Var, String str) {
        this.f46148b = b4Var;
        this.f46147a = str;
    }

    public final String zza(String str) {
        Map map = (Map) this.f46148b.f46165d.get(this.f46147a);
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return (String) map.get(str);
    }
}
