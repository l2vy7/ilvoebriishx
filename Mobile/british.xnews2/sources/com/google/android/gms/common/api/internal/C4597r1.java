package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.C4591e;
import com.google.android.gms.common.api.C7191a;
import com.google.android.gms.common.api.C7191a.C7195d;
import com.google.android.gms.common.api.C7341k;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: com.google.android.gms.common.api.internal.r1 */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C4597r1<O extends C7191a.C7195d> extends C7227c0 {
    @NotOnlyInitialized

    /* renamed from: c */
    private final C4591e<O> f20024c;

    public C4597r1(C4591e<O> eVar) {
        super("Method is not supported by connectionless client. APIs supporting connectionless client must not call this method.");
        this.f20024c = eVar;
    }

    /* renamed from: i */
    public final <A extends C7191a.C7193b, T extends C7231d<? extends C7341k, A>> T mo17960i(T t) {
        return this.f20024c.doWrite(t);
    }

    /* renamed from: k */
    public final Context mo17961k() {
        return this.f20024c.getApplicationContext();
    }

    /* renamed from: l */
    public final Looper mo17962l() {
        return this.f20024c.getLooper();
    }

    /* renamed from: q */
    public final void mo17963q(C7308s2 s2Var) {
    }
}
