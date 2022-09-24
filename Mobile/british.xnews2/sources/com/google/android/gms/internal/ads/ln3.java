package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.kn3;
import com.google.android.gms.internal.ads.ln3;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class ln3<MessageType extends ln3<MessageType, BuilderType>, BuilderType extends kn3<MessageType, BuilderType>> implements uq3 {
    protected int zza = 0;

    /* JADX WARNING: type inference failed for: r3v0, types: [java.util.Collection, java.lang.Object, java.lang.Iterable<T>, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static <T> void m34512f(java.lang.Iterable<T> r3, java.util.List<? super T> r4) {
        /*
            com.google.android.gms.internal.ads.up3.m38379e(r3)
            boolean r0 = r4 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x0016
            r0 = r4
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r4.size()
            int r2 = r3.size()
            int r1 = r1 + r2
            r0.ensureCapacity(r1)
        L_0x0016:
            int r0 = r4.size()
            java.util.Iterator r3 = r3.iterator()
        L_0x001e:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x005d
            java.lang.Object r1 = r3.next()
            if (r1 != 0) goto L_0x0059
            int r3 = r4.size()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 37
            r1.<init>(r2)
            java.lang.String r2 = "Element at index "
            r1.append(r2)
            int r3 = r3 - r0
            r1.append(r3)
            java.lang.String r3 = " is null."
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            int r1 = r4.size()
        L_0x004b:
            int r1 = r1 + -1
            if (r1 < r0) goto L_0x0053
            r4.remove(r1)
            goto L_0x004b
        L_0x0053:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            r4.<init>(r3)
            throw r4
        L_0x0059:
            r4.add(r1)
            goto L_0x001e
        L_0x005d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ln3.m34512f(java.lang.Iterable, java.util.List):void");
    }

    /* renamed from: c */
    public final eo3 mo33364c() {
        try {
            int a = mo33137a();
            eo3 eo3 = eo3.f31444c;
            byte[] bArr = new byte[a];
            ro3 c = ro3.m37153c(bArr);
            mo33138b(c);
            c.mo34577d();
            return new ao3(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a ByteString threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo33139e() {
        throw null;
    }

    /* renamed from: g */
    public final byte[] mo33365g() {
        try {
            byte[] bArr = new byte[mo33137a()];
            ro3 c = ro3.m37153c(bArr);
            mo33138b(c);
            c.mo34577d();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 72);
            sb.append("Serializing ");
            sb.append(name);
            sb.append(" to a byte array threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo33144j(int i) {
        throw null;
    }
}
