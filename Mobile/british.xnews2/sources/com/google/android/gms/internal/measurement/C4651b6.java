package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.google.android.gms.internal.measurement.b6 */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C4651b6 {

    /* renamed from: a */
    private final Map f21232a;

    C4651b6(Map map) {
        this.f21232a = map;
    }

    @Nullable
    /* renamed from: a */
    public final String mo19175a(@Nullable Uri uri, @Nullable String str, @Nullable String str2, String str3) {
        String str4;
        if (uri == null) {
            return null;
        }
        Map map = (Map) this.f21232a.get(uri.toString());
        if (map == null) {
            return null;
        }
        String valueOf = String.valueOf(str3);
        if (valueOf.length() != 0) {
            str4 = "".concat(valueOf);
        } else {
            str4 = new String("");
        }
        return (String) map.get(str4);
    }
}
