package com.google.ads.interactivemedia.p039v3.internal;

import com.google.ads.interactivemedia.p039v3.internal.bjb;
import com.google.ads.interactivemedia.p039v3.internal.bjc;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bjb */
/* compiled from: IMASDK */
public abstract class bjb<MessageType extends bjc<MessageType, BuilderType>, BuilderType extends bjb<MessageType, BuilderType>> implements blm {
    /* renamed from: X */
    public abstract BuilderType clone();

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public abstract BuilderType mo15161Y(MessageType messagetype);

    /* renamed from: Z */
    public final /* bridge */ /* synthetic */ blm mo15162Z(bln bln) {
        if (mo15387ag().getClass().isInstance(bln)) {
            return mo15161Y((bjc) bln);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* renamed from: aa */
    public void mo15163aa(byte[] bArr, int i, bka bka) throws bkt {
        throw null;
    }
}
