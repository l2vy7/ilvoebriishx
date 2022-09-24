package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;

/* renamed from: com.google.android.gms.dynamite.f */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
final class C7477f implements DynamiteModule.C7469b {
    C7477f() {
    }

    /* renamed from: a */
    public final DynamiteModule.C7469b.C7471b mo30250a(Context context, String str, DynamiteModule.C7469b.C7470a aVar) throws DynamiteModule.C7468a {
        DynamiteModule.C7469b.C7471b bVar = new DynamiteModule.C7469b.C7471b();
        int a = aVar.mo30251a(context, str, false);
        bVar.f29472b = a;
        if (a == 0) {
            bVar.f29473c = 0;
        } else {
            bVar.f29473c = 1;
        }
        return bVar;
    }
}
