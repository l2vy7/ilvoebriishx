package com.google.android.gms.internal.ads;

import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.n2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C7964n2 implements C7596d4 {

    /* renamed from: a */
    private final List<C8281w> f35870a = p63.m20814A();

    public C7964n2(int i) {
    }

    /* renamed from: b */
    private final C8142s3 m35021b(C7561c4 c4Var) {
        return new C8142s3(m35023d(c4Var));
    }

    /* renamed from: c */
    private final C7743h4 m35022c(C7561c4 c4Var) {
        return new C7743h4(m35023d(c4Var));
    }

    /* renamed from: d */
    private final List<C8281w> m35023d(C7561c4 c4Var) {
        String str;
        int i;
        List list;
        uq2 uq2 = new uq2(c4Var.f30242d);
        List<C8281w> list2 = this.f35870a;
        while (uq2.mo35239i() > 0) {
            int s = uq2.mo35249s();
            int k = uq2.mo35241k() + uq2.mo35249s();
            if (s == 134) {
                list2 = new ArrayList<>();
                int s2 = uq2.mo35249s() & 31;
                for (int i2 = 0; i2 < s2; i2++) {
                    String F = uq2.mo35228F(3, n33.f35887c);
                    int s3 = uq2.mo35249s();
                    int i3 = s3 & 128;
                    if (i3 != 0) {
                        i = s3 & 63;
                        str = MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = MimeTypes.APPLICATION_CEA608;
                        i = 1;
                    }
                    byte s4 = (byte) uq2.mo35249s();
                    uq2.mo35237g(1);
                    if (i3 != 0) {
                        int i4 = qw1.f38299c;
                        list = Collections.singletonList((s4 & 64) != 0 ? new byte[]{1} : new byte[]{0});
                    } else {
                        list = null;
                    }
                    ge4 ge4 = new ge4();
                    ge4.mo32093s(str);
                    ge4.mo32085k(F);
                    ge4.mo32072c0(i);
                    ge4.mo32083i(list);
                    list2.add(ge4.mo32099y());
                }
            }
            uq2.mo35236f(k);
        }
        return list2;
    }

    /* renamed from: a */
    public final C7670f4 mo31098a(int i, C7561c4 c4Var) {
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new C7780i3(new C7669f3(c4Var.f30240b));
            }
            if (i == 21) {
                return new C7780i3(new C7595d3());
            }
            if (i == 27) {
                return new C7780i3(new C4606a3(m35021b(c4Var), false, false));
            }
            if (i == 36) {
                return new C7780i3(new C4609c3(m35021b(c4Var)));
            }
            if (i == 89) {
                return new C7780i3(new C8035p2(c4Var.f30241c));
            }
            if (i == 138) {
                return new C7780i3(new C8000o2(c4Var.f30240b));
            }
            if (i == 172) {
                return new C7780i3(new C7816j2(c4Var.f30240b));
            }
            if (i == 257) {
                return new C8108r3(new C7742h3(MimeTypes.APPLICATION_AIT));
            }
            if (i != 128) {
                if (i != 129) {
                    if (i == 134) {
                        return new C8108r3(new C7742h3(MimeTypes.APPLICATION_SCTE35));
                    }
                    if (i != 135) {
                        switch (i) {
                            case 15:
                                return new C7780i3(new C7926m2(false, c4Var.f30240b));
                            case 16:
                                return new C7780i3(new C8249v2(m35022c(c4Var)));
                            case 17:
                                return new C7780i3(new C7632e3(c4Var.f30240b));
                            default:
                                return null;
                        }
                    }
                }
                return new C7780i3(new C7705g2(c4Var.f30240b));
            }
        }
        return new C7780i3(new C8141s2(m35022c(c4Var)));
    }
}
