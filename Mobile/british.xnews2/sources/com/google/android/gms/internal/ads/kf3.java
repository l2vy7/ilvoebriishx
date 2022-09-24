package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class kf3 extends hd3<dj3, gj3> {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final byte[] f34287d = new byte[0];

    kf3() {
        super(dj3.class, gj3.class, new if3(kc3.class));
    }

    /* renamed from: l */
    static /* bridge */ /* synthetic */ sc3 m33930l(int i, int i2, int i3, qc3 qc3, byte[] bArr, int i4) {
        wi3 E = xi3.m39480E();
        ij3 E2 = jj3.m33624E();
        int i5 = 4;
        E2.mo32641B(4);
        E2.mo32642C(5);
        E2.mo32643y(eo3.m31873L(bArr));
        jj3 jj3 = (jj3) E2.mo32424p();
        ck3 E3 = dk3.m31453E();
        E3.mo30949y(qc3.mo34317a());
        E3.mo30947B(eo3.m31873L(qc3.mo34318b()));
        int c = qc3.mo34319c() - 1;
        if (c == 0) {
            i5 = 3;
        } else if (c != 1) {
            i5 = c != 2 ? 6 : 5;
        }
        E3.mo30948C(i5);
        si3 E4 = ui3.m38334E();
        E4.mo34711y((dk3) E3.mo32424p());
        zi3 F = aj3.m30343F();
        F.mo36064B(jj3);
        F.mo36066y((ui3) E4.mo32424p());
        F.mo36065C(i3);
        E.mo35637y((aj3) F.mo32424p());
        return new sc3((xi3) E.mo32424p(), i4);
    }

    /* renamed from: a */
    public final tc3<xi3, dj3> mo30893a() {
        return new jf3(this, xi3.class);
    }

    /* renamed from: b */
    public final /* synthetic */ uq3 mo30894b(eo3 eo3) throws wp3 {
        return dj3.m31422I(eo3, wo3.m39219a());
    }

    /* renamed from: f */
    public final String mo30895f() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    /* renamed from: h */
    public final /* bridge */ /* synthetic */ void mo30896h(uq3 uq3) throws GeneralSecurityException {
        dj3 dj3 = (dj3) uq3;
        if (!dj3.mo31268K().mo31615e()) {
            gn3.m32591b(dj3.mo31266E(), 0);
            uf3.m38320a(dj3.mo31267J().mo32151F());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    /* renamed from: j */
    public final int mo30897j() {
        return 4;
    }
}
