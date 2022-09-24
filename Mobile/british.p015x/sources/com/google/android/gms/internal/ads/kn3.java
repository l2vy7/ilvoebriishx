package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.kn3;
import com.google.android.gms.internal.ads.ln3;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class kn3<MessageType extends ln3<MessageType, BuilderType>, BuilderType extends kn3<MessageType, BuilderType>> implements tq3 {
    /* renamed from: G */
    public final /* bridge */ /* synthetic */ tq3 mo33117G(uq3 uq3) {
        if (mo32419d().getClass().isInstance(uq3)) {
            return mo32420k((ln3) uq3);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract BuilderType mo32420k(MessageType messagetype);
}
