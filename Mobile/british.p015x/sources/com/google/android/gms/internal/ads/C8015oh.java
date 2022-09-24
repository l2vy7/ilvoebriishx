package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.oh */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C8015oh extends C8086qh {

    /* renamed from: P0 */
    public final long f36460P0;

    /* renamed from: Q0 */
    public final List<C8050ph> f36461Q0 = new ArrayList();

    /* renamed from: R0 */
    public final List<C8015oh> f36462R0 = new ArrayList();

    public C8015oh(int i, long j) {
        super(i);
        this.f36460P0 = j;
    }

    /* renamed from: d */
    public final C8015oh mo33898d(int i) {
        int size = this.f36462R0.size();
        for (int i2 = 0; i2 < size; i2++) {
            C8015oh ohVar = this.f36462R0.get(i2);
            if (ohVar.f38132a == i) {
                return ohVar;
            }
        }
        return null;
    }

    /* renamed from: e */
    public final C8050ph mo33899e(int i) {
        int size = this.f36461Q0.size();
        for (int i2 = 0; i2 < size; i2++) {
            C8050ph phVar = this.f36461Q0.get(i2);
            if (phVar.f38132a == i) {
                return phVar;
            }
        }
        return null;
    }

    /* renamed from: f */
    public final void mo33900f(C8015oh ohVar) {
        this.f36462R0.add(ohVar);
    }

    /* renamed from: g */
    public final void mo33901g(C8050ph phVar) {
        this.f36461Q0.add(phVar);
    }

    public final String toString() {
        String c = C8086qh.m36473c(this.f38132a);
        String arrays = Arrays.toString(this.f36461Q0.toArray());
        String arrays2 = Arrays.toString(this.f36462R0.toArray());
        int length = String.valueOf(arrays).length();
        StringBuilder sb = new StringBuilder(c.length() + 22 + length + String.valueOf(arrays2).length());
        sb.append(c);
        sb.append(" leaves: ");
        sb.append(arrays);
        sb.append(" containers: ");
        sb.append(arrays2);
        return sb.toString();
    }
}
