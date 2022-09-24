package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C9068a7;
import com.google.android.gms.internal.measurement.C9083b7;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.b7 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
public abstract class C9083b7<MessageType extends C9083b7<MessageType, BuilderType>, BuilderType extends C9068a7<MessageType, BuilderType>> implements C9409w9 {
    protected int zzb = 0;

    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.Collection, java.lang.Object, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static void m42674i(java.lang.Iterable r6, java.util.List r7) {
        /*
            com.google.android.gms.internal.measurement.C9453z8.m43974e(r6)
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.C9148f9
            java.lang.String r1 = " is null."
            java.lang.String r2 = "Element at index "
            r3 = 37
            if (r0 == 0) goto L_0x0063
            com.google.android.gms.internal.measurement.f9 r6 = (com.google.android.gms.internal.measurement.C9148f9) r6
            java.util.List r6 = r6.zzh()
            r0 = r7
            com.google.android.gms.internal.measurement.f9 r0 = (com.google.android.gms.internal.measurement.C9148f9) r0
            int r7 = r7.size()
            java.util.Iterator r6 = r6.iterator()
        L_0x001e:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x00bf
            java.lang.Object r4 = r6.next()
            if (r4 != 0) goto L_0x0053
            int r6 = r0.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r2)
            int r6 = r6 - r7
            r4.append(r6)
            r4.append(r1)
            java.lang.String r6 = r4.toString()
            int r1 = r0.size()
        L_0x0045:
            int r1 = r1 + -1
            if (r1 < r7) goto L_0x004d
            r0.remove(r1)
            goto L_0x0045
        L_0x004d:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>(r6)
            throw r7
        L_0x0053:
            boolean r5 = r4 instanceof com.google.android.gms.internal.measurement.C9329r7
            if (r5 == 0) goto L_0x005d
            com.google.android.gms.internal.measurement.r7 r4 = (com.google.android.gms.internal.measurement.C9329r7) r4
            r0.mo37419d(r4)
            goto L_0x001e
        L_0x005d:
            java.lang.String r4 = (java.lang.String) r4
            r0.add(r4)
            goto L_0x001e
        L_0x0063:
            boolean r0 = r6 instanceof com.google.android.gms.internal.measurement.C9118da
            if (r0 != 0) goto L_0x00c0
            boolean r0 = r7 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x007e
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L_0x007e
            r0 = r7
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r4 = r7.size()
            int r5 = r6.size()
            int r4 = r4 + r5
            r0.ensureCapacity(r4)
        L_0x007e:
            int r0 = r7.size()
            java.util.Iterator r6 = r6.iterator()
        L_0x0086:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x00bf
            java.lang.Object r4 = r6.next()
            if (r4 != 0) goto L_0x00bb
            int r6 = r7.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r4.append(r2)
            int r6 = r6 - r0
            r4.append(r6)
            r4.append(r1)
            java.lang.String r6 = r4.toString()
            int r1 = r7.size()
        L_0x00ad:
            int r1 = r1 + -1
            if (r1 < r0) goto L_0x00b5
            r7.remove(r1)
            goto L_0x00ad
        L_0x00b5:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            r7.<init>(r6)
            throw r7
        L_0x00bb:
            r7.add(r4)
            goto L_0x0086
        L_0x00bf:
            return
        L_0x00c0:
            r7.addAll(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C9083b7.m42674i(java.lang.Iterable, java.util.List):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public int mo37401f() {
        throw null;
    }

    /* renamed from: h */
    public final C9329r7 mo37402h() {
        try {
            int c = mo37992c();
            C9329r7 r7Var = C9329r7.f45419c;
            byte[] bArr = new byte[c];
            C9452z7 c2 = C9452z7.m43946c(bArr);
            mo37991b(c2);
            c2.mo38220d();
            return new C9298p7(bArr);
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
    /* renamed from: k */
    public void mo37403k(int i) {
        throw null;
    }

    /* renamed from: l */
    public final byte[] mo37404l() {
        try {
            byte[] bArr = new byte[mo37992c()];
            C9452z7 c = C9452z7.m43946c(bArr);
            mo37991b(c);
            c.mo38220d();
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
}
