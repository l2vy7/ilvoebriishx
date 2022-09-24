package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ld4 implements lb4 {

    /* renamed from: a */
    private final kc4 f35006a;

    /* renamed from: b */
    private final int f35007b;

    /* renamed from: c */
    private final dc4 f35008c = new dc4();

    /* synthetic */ ld4(kc4 kc4, int i, kd4 kd4) {
        this.f35006a = kc4;
        this.f35007b = i;
    }

    /* renamed from: b */
    private final long m34432b(wb4 wb4) throws IOException {
        wb4 wb42 = wb4;
        while (wb4.zzd() < wb4.zzc() - 6) {
            kc4 kc4 = this.f35006a;
            int i = this.f35007b;
            dc4 dc4 = this.f35008c;
            long zzd = wb4.zzd();
            byte[] bArr = new byte[2];
            qb4 qb4 = (qb4) wb42;
            qb4.mo33311e(bArr, 0, 2, false);
            if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
                wb4.zzj();
                qb4.mo34304j((int) (zzd - wb4.zze()), false);
            } else {
                uq2 uq2 = new uq2(16);
                System.arraycopy(bArr, 0, uq2.mo35238h(), 0, 2);
                uq2.mo35235e(zb4.m21282a(wb42, uq2.mo35238h(), 2, 14));
                wb4.zzj();
                qb4.mo34304j((int) (zzd - wb4.zze()), false);
                if (ec4.m31773c(uq2, kc4, i, dc4)) {
                    break;
                }
            }
            qb4.mo34304j(1, false);
        }
        if (wb4.zzd() < wb4.zzc() - 6) {
            return this.f35008c.f30715a;
        }
        ((qb4) wb42).mo34304j((int) (wb4.zzc() - wb4.zzd()), false);
        return this.f35006a.f34250j;
    }

    /* renamed from: a */
    public final kb4 mo33023a(wb4 wb4, long j) throws IOException {
        long zze = wb4.zze();
        long b = m34432b(wb4);
        long zzd = wb4.zzd();
        ((qb4) wb4).mo34304j(Math.max(6, this.f35006a.f34243c), false);
        long b2 = m34432b(wb4);
        long zzd2 = wb4.zzd();
        if (b > j || b2 <= j) {
            return b2 <= j ? kb4.m33902f(b2, zzd2) : kb4.m33900d(b, zze);
        }
        return kb4.m33901e(zzd);
    }

    public final /* synthetic */ void zzb() {
    }
}
