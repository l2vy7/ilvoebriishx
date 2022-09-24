package com.google.android.gms.internal.cast;

import com.google.android.gms.internal.cast.C8591jb;
import com.google.android.gms.internal.cast.C8608kb;

/* renamed from: com.google.android.gms.internal.cast.jb */
/* compiled from: com.google.android.gms:play-services-cast@@20.0.0 */
public abstract class C8591jb<MessageType extends C8608kb<MessageType, BuilderType>, BuilderType extends C8591jb<MessageType, BuilderType>> implements C8767ud {
    /* renamed from: D */
    public final /* bridge */ /* synthetic */ C8767ud mo36564D(C8782vd vdVar) {
        if (zzs().getClass().isInstance(vdVar)) {
            return mo36565b((C8608kb) vdVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract BuilderType mo36565b(MessageType messagetype);
}
