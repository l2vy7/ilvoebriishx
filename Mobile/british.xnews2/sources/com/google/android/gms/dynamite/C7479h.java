package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.h */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
final class C7479h implements DynamiteModule.C7469b {
    C7479h() {
    }

    /* renamed from: a */
    public final DynamiteModule.C7469b.C7471b mo30250a(Context context, String str, DynamiteModule.C7469b.C7470a aVar) throws DynamiteModule.C7468a {
        int i;
        DynamiteModule.C7469b.C7471b bVar = new DynamiteModule.C7469b.C7471b();
        int b = aVar.mo30252b(context, str);
        bVar.f29471a = b;
        int i2 = 0;
        if (b != 0) {
            i = aVar.mo30251a(context, str, false);
            bVar.f29472b = i;
        } else {
            i = aVar.mo30251a(context, str, true);
            bVar.f29472b = i;
        }
        int i3 = bVar.f29471a;
        if (i3 != 0) {
            i2 = i3;
        } else if (i == 0) {
            bVar.f29473c = 0;
            return bVar;
        }
        if (i2 >= i) {
            bVar.f29473c = -1;
        } else {
            bVar.f29473c = 1;
        }
        return bVar;
    }
}
