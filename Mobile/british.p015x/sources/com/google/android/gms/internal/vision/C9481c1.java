package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C9481c1;
import com.google.android.gms.internal.vision.C9687z0;

/* renamed from: com.google.android.gms.internal.vision.c1 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public abstract class C9481c1<MessageType extends C9687z0<MessageType, BuilderType>, BuilderType extends C9481c1<MessageType, BuilderType>> implements C9514f4 {
    /* renamed from: F */
    public final /* synthetic */ C9514f4 mo38261F(C9522g4 g4Var) {
        if (mo38425d().getClass().isInstance(g4Var)) {
            return mo38262i((C9687z0) g4Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract BuilderType mo38262i(MessageType messagetype);

    /* renamed from: k */
    public abstract BuilderType mo38263k(byte[] bArr, int i, int i2, C9511f2 f2Var) throws C9513f3;
}
