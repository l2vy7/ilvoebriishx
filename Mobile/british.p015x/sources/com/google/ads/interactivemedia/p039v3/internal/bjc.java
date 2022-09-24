package com.google.ads.interactivemedia.p039v3.internal;

import com.google.ads.interactivemedia.p039v3.internal.bjb;
import com.google.ads.interactivemedia.p039v3.internal.bjc;
import java.io.IOException;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bjc */
/* compiled from: IMASDK */
public abstract class bjc<MessageType extends bjc<MessageType, BuilderType>, BuilderType extends bjb<MessageType, BuilderType>> implements bln {

    /* renamed from: b */
    protected int f16465b = 0;

    /* renamed from: aV */
    public final byte[] mo15165aV() {
        try {
            byte[] bArr = new byte[mo15392al()];
            bjw t = bjw.m16203t(bArr);
            mo15171aW(t);
            t.mo15294V();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + 10);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* renamed from: af */
    public final bjq mo15166af() {
        try {
            int al = mo15392al();
            bjq bjq = bjq.f16482b;
            byte[] bArr = new byte[al];
            bjw t = bjw.m16203t(bArr);
            mo15171aW(bjr.m16070b(t));
            return bjr.m16069a(t, bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 62 + 10);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ");
            sb.append("ByteString");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ah */
    public int mo15167ah() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: ai */
    public void mo15168ai(int i) {
        throw null;
    }
}
