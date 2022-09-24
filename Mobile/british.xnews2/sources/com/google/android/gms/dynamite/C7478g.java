package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.g */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
final class C7478g implements DynamiteModule.C7469b {
    C7478g() {
    }

    /* renamed from: a */
    public final DynamiteModule.C7469b.C7471b mo30250a(Context context, String str, DynamiteModule.C7469b.C7470a aVar) throws DynamiteModule.C7468a {
        DynamiteModule.C7469b.C7471b bVar = new DynamiteModule.C7469b.C7471b();
        bVar.f29471a = aVar.mo30252b(context, str);
        int a = aVar.mo30251a(context, str, true);
        bVar.f29472b = a;
        int i = bVar.f29471a;
        if (i == 0) {
            if (a == 0) {
                bVar.f29473c = 0;
                return bVar;
            }
            i = 0;
        }
        if (i >= a) {
            bVar.f29473c = -1;
        } else {
            bVar.f29473c = 1;
        }
        return bVar;
    }
}
