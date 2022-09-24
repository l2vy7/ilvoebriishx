package com.google.ads.interactivemedia.p038v3.internal;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.ads.interactivemedia.v3.internal.azv */
/* compiled from: IMASDK */
final class azv implements bdi {

    /* renamed from: a */
    private final String f15928a;

    /* renamed from: b */
    private final int f15929b;

    /* renamed from: c */
    private bay f15930c;

    /* renamed from: d */
    private ban f15931d;

    /* renamed from: e */
    private int f15932e;

    /* renamed from: f */
    private bbe f15933f;

    azv(bcc bcc) throws GeneralSecurityException {
        String str;
        String a = bcc.mo14892a();
        this.f15928a = a;
        if (a.equals(axv.f15892b)) {
            try {
                baz c = baz.m15447c(bcc.mo14893c(), bka.m16275a());
                this.f15930c = (bay) axt.m15147e(bcc);
                this.f15929b = c.mo14824a();
            } catch (bkt e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (a.equals(axv.f15891a)) {
            try {
                bao d = bao.m15386d(bcc.mo14893c(), bka.m16275a());
                this.f15931d = (ban) axt.m15147e(bcc);
                this.f15932e = d.mo14800a().mo14809c();
                this.f15929b = this.f15932e + d.mo14801c().mo14872c();
            } catch (bkt e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else if (a.equals(azg.f15923a)) {
            try {
                bbf c2 = bbf.m15475c(bcc.mo14893c(), bka.m16275a());
                this.f15933f = (bbe) axt.m15147e(bcc);
                this.f15929b = c2.mo14835a();
            } catch (bkt e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        } else {
            String valueOf = String.valueOf(a);
            if (valueOf.length() != 0) {
                str = "unsupported AEAD DEM key type: ".concat(valueOf);
            } else {
                str = new String("unsupported AEAD DEM key type: ");
            }
            throw new GeneralSecurityException(str);
        }
    }

    /* renamed from: a */
    public final int mo14779a() {
        return this.f15929b;
    }

    /* renamed from: b */
    public final azw mo14780b(byte[] bArr) throws GeneralSecurityException {
        Class<aws> cls = aws.class;
        if (bArr.length != this.f15929b) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        } else if (this.f15928a.equals(axv.f15892b)) {
            bax e = bay.m15440e();
            e.mo15388ah(this.f15930c);
            e.mo14820a(bjq.m16050m(bArr, 0, this.f15929b));
            return new azw((aws) axt.m15148f(this.f15928a, (bay) e.mo15385ae(), cls));
        } else if (this.f15928a.equals(axv.f15891a)) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.f15932e);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.f15932e, this.f15929b);
            bap f = baq.m15395f();
            f.mo15388ah(this.f15931d.mo14798c());
            f.mo14802a(bjq.m16051n(copyOfRange));
            bbu f2 = bbv.m15549f();
            f2.mo15388ah(this.f15931d.mo14799d());
            f2.mo14865a(bjq.m16051n(copyOfRange2));
            bam f3 = ban.m15377f();
            f3.mo14796c(this.f15931d.mo14797a());
            f3.mo14794a((baq) f.mo15385ae());
            f3.mo14795b((bbv) f2.mo15385ae());
            return new azw((aws) axt.m15148f(this.f15928a, (ban) f3.mo15385ae(), cls));
        } else if (this.f15928a.equals(azg.f15923a)) {
            bbd e2 = bbe.m15468e();
            e2.mo15388ah(this.f15933f);
            e2.mo14831a(bjq.m16050m(bArr, 0, this.f15929b));
            return new azw((awv) axt.m15148f(this.f15928a, (bbe) e2.mo15385ae(), awv.class));
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }
}
