package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class vf3 implements em3 {

    /* renamed from: a */
    private final String f40414a;

    /* renamed from: b */
    private final int f40415b;

    /* renamed from: c */
    private th3 f40416c;

    /* renamed from: d */
    private ug3 f40417d;

    /* renamed from: e */
    private int f40418e;

    /* renamed from: f */
    private fi3 f40419f;

    vf3(dk3 dk3) throws GeneralSecurityException {
        String str;
        String J = dk3.mo31287J();
        this.f40414a = J;
        if (J.equals(qd3.f37989b)) {
            try {
                wh3 I = wh3.m39176I(dk3.mo31286I(), wo3.m39219a());
                this.f40416c = (th3) od3.m35634d(dk3);
                this.f40415b = I.mo35622E();
            } catch (wp3 e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (J.equals(qd3.f37988a)) {
            try {
                xg3 H = xg3.m39462H(dk3.mo31286I(), wo3.m39219a());
                this.f40417d = (ug3) od3.m35634d(dk3);
                this.f40418e = H.mo35754I().mo31256E();
                this.f40415b = this.f40418e + H.mo35755J().mo34966E();
            } catch (wp3 e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else if (J.equals(ff3.f31721a)) {
            try {
                ii3 I2 = ii3.m33225I(dk3.mo31286I(), wo3.m39219a());
                this.f40419f = (fi3) od3.m35634d(dk3);
                this.f40415b = I2.mo32634E();
            } catch (wp3 e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        } else {
            String valueOf = String.valueOf(J);
            if (valueOf.length() != 0) {
                str = "unsupported AEAD DEM key type: ".concat(valueOf);
            } else {
                str = new String("unsupported AEAD DEM key type: ");
            }
            throw new GeneralSecurityException(str);
        }
    }

    /* renamed from: a */
    public final wf3 mo31604a(byte[] bArr) throws GeneralSecurityException {
        Class<gc3> cls = gc3.class;
        if (bArr.length != this.f40415b) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        } else if (this.f40414a.equals(qd3.f37989b)) {
            rh3 F = th3.m37851F();
            F.mo32422n(this.f40416c);
            F.mo34544y(eo3.m31874M(bArr, 0, this.f40415b));
            return new wf3((gc3) od3.m35637g(this.f40414a, (th3) F.mo32424p(), cls));
        } else if (this.f40414a.equals(qd3.f37988a)) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.f40418e);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.f40418e, this.f40415b);
            zg3 F2 = ah3.m30322F();
            F2.mo32422n(this.f40417d.mo35190J());
            F2.mo36060y(eo3.m31873L(copyOfRange));
            pj3 F3 = qj3.m36484F();
            F3.mo32422n(this.f40417d.mo35191K());
            F3.mo34141y(eo3.m31873L(copyOfRange2));
            tg3 F4 = ug3.m38324F();
            F4.mo34954C(this.f40417d.mo35189E());
            F4.mo34955y((ah3) F2.mo32424p());
            F4.mo34953B((qj3) F3.mo32424p());
            return new wf3((gc3) od3.m35637g(this.f40414a, (ug3) F4.mo32424p(), cls));
        } else if (this.f40414a.equals(ff3.f31721a)) {
            ei3 F5 = fi3.m32179F();
            F5.mo32422n(this.f40419f);
            F5.mo31581y(eo3.m31874M(bArr, 0, this.f40415b));
            return new wf3((jc3) od3.m35637g(this.f40414a, (fi3) F5.mo32424p(), jc3.class));
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }

    public final int zza() {
        return this.f40415b;
    }
}
