package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C9068a7;
import com.google.android.gms.internal.measurement.C9083b7;

/* renamed from: com.google.android.gms.internal.measurement.a7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
public abstract class C9068a7<MessageType extends C9083b7<MessageType, BuilderType>, BuilderType extends C9068a7<MessageType, BuilderType>> implements C9394v9 {
    /* renamed from: E */
    public final /* bridge */ /* synthetic */ C9394v9 mo37312E(C9409w9 w9Var) {
        if (mo37835g().getClass().isInstance(w9Var)) {
            return mo37314i((C9083b7) w9Var);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    /* renamed from: e */
    public final /* synthetic */ C9394v9 mo37313e(byte[] bArr) throws C9085b9 {
        return mo37316k(bArr, 0, bArr.length);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract C9068a7 mo37314i(C9083b7 b7Var);

    /* renamed from: j */
    public final /* synthetic */ C9394v9 mo37315j(byte[] bArr, C9132e8 e8Var) throws C9085b9 {
        return mo37317l(bArr, 0, bArr.length, e8Var);
    }

    /* renamed from: k */
    public abstract C9068a7 mo37316k(byte[] bArr, int i, int i2) throws C9085b9;

    /* renamed from: l */
    public abstract C9068a7 mo37317l(byte[] bArr, int i, int i2, C9132e8 e8Var) throws C9085b9;
}
