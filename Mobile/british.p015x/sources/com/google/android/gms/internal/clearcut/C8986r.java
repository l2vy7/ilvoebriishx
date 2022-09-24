package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C8979q;
import com.google.android.gms.internal.clearcut.C8986r;

/* renamed from: com.google.android.gms.internal.clearcut.r */
public abstract class C8986r<MessageType extends C8979q<MessageType, BuilderType>, BuilderType extends C8986r<MessageType, BuilderType>> implements C8954m2 {
    /* access modifiers changed from: protected */
    /* renamed from: h */
    public abstract BuilderType mo36904h(MessageType messagetype);

    /* renamed from: r */
    public final /* synthetic */ C8954m2 mo37038r(C8942l2 l2Var) {
        if (mo36897g().getClass().isInstance(l2Var)) {
            return mo36904h((C8979q) l2Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
