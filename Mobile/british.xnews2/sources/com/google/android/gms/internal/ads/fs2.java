package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.AdSize;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fs2 {
    /* renamed from: a */
    public static zzbfi m32243a(Context context, List<jr2> list) {
        ArrayList arrayList = new ArrayList();
        for (jr2 next : list) {
            if (next.f34024c) {
                arrayList.add(AdSize.FLUID);
            } else {
                arrayList.add(new AdSize(next.f34022a, next.f34023b));
            }
        }
        return new zzbfi(context, (AdSize[]) arrayList.toArray(new AdSize[arrayList.size()]));
    }

    /* renamed from: b */
    public static jr2 m32244b(List<jr2> list, jr2 jr2) {
        return list.get(0);
    }

    /* renamed from: c */
    public static jr2 m32245c(zzbfi zzbfi) {
        return zzbfi.f42972j ? new jr2(-3, 0, true) : new jr2(zzbfi.f42968f, zzbfi.f42965c, false);
    }
}
