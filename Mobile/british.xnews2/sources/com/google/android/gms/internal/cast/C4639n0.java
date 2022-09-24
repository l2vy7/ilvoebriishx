package com.google.android.gms.internal.cast;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C4604n;
import java.util.UUID;
import org.checkerframework.dataflow.qual.Pure;
import p142r3.C5997c;
import p142r3.C6000f;

/* renamed from: com.google.android.gms.internal.cast.n0 */
/* compiled from: com.google.android.gms:play-services-cast-framework@@20.0.0 */
public final class C4639n0 {

    /* renamed from: a */
    private final C6000f<C8669o8> f21185a;

    /* renamed from: b */
    private final String f21186b;

    /* renamed from: c */
    private final int f21187c;

    private C4639n0(SharedPreferences sharedPreferences, C6000f<C8669o8> fVar, long j) {
        this.f21185a = fVar;
        String string = sharedPreferences.getString("client_sender_id", (String) null);
        if (string == null) {
            string = UUID.randomUUID().toString();
            sharedPreferences.edit().putString("client_sender_id", string).apply();
        }
        this.f21186b = string;
        this.f21187c = j == 0 ? 1 : 2;
    }

    /* renamed from: a */
    public static C4639n0 m21336a(SharedPreferences sharedPreferences, C6000f<C8669o8> fVar, long j) {
        return new C4639n0(sharedPreferences, fVar, j);
    }

    @Pure
    /* renamed from: b */
    public final void mo19116b(C8669o8 o8Var, C8435a5 a5Var) {
        C5997c cVar;
        C8653n8 o = C8669o8.m41177o(o8Var);
        o.mo36615m(this.f21186b);
        C8669o8 o8Var2 = (C8669o8) o.mo36634i();
        if (this.f21187c - 1 != 0) {
            cVar = C5997c.m26429d(a5Var.zza(), o8Var2);
        } else {
            cVar = C5997c.m26430e(a5Var.zza(), o8Var2);
        }
        C4604n.m20098k(cVar);
        this.f21185a.mo23100a(cVar);
    }
}
