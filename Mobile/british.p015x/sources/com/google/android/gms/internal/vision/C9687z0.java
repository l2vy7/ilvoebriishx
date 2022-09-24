package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.C9481c1;
import com.google.android.gms.internal.vision.C9687z0;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.vision.z0 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
public abstract class C9687z0<MessageType extends C9687z0<MessageType, BuilderType>, BuilderType extends C9481c1<MessageType, BuilderType>> implements C9522g4 {
    protected int zzte = 0;

    /* renamed from: e */
    public final byte[] mo38664e() {
        try {
            byte[] bArr = new byte[mo38402b()];
            C9482c2 Z = C9482c2.m44077Z(bArr);
            mo38404g(Z);
            Z.mo38276e0();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + "byte array".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo38608f(int i) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: h */
    public final C9552k1 mo38405h() {
        try {
            C9625t1 i = C9552k1.m44404i(mo38402b());
            mo38404g(i.mo38578b());
            return i.mo38577a();
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + "ByteString".length());
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public int mo38610i() {
        throw new UnsupportedOperationException();
    }
}
