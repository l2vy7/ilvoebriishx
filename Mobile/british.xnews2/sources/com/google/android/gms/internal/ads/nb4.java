package com.google.android.gms.internal.ads;

import android.util.Log;
import com.google.android.exoplayer2.C6540C;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nb4 {
    /* renamed from: a */
    public static void m35124a(long j, uq2 uq2, ad4[] ad4Arr) {
        int i;
        while (true) {
            boolean z = true;
            if (uq2.mo35239i() > 1) {
                int c = m35126c(uq2);
                int c2 = m35126c(uq2);
                int k = uq2.mo35241k() + c2;
                if (c2 == -1 || c2 > uq2.mo35239i()) {
                    Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                    k = uq2.mo35242l();
                } else if (c == 4 && c2 >= 8) {
                    int s = uq2.mo35249s();
                    int w = uq2.mo35253w();
                    if (w == 49) {
                        i = uq2.mo35243m();
                        w = 49;
                    } else {
                        i = 0;
                    }
                    int s2 = uq2.mo35249s();
                    if (w == 47) {
                        uq2.mo35237g(1);
                        w = 47;
                    }
                    boolean z2 = s == 181 && (w == 49 || w == 47) && s2 == 3;
                    if (w == 49) {
                        if (i != 1195456820) {
                            z = false;
                        }
                        z2 &= z;
                    }
                    if (z2) {
                        m35125b(j, uq2, ad4Arr);
                    }
                }
                uq2.mo35236f(k);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    public static void m35125b(long j, uq2 uq2, ad4[] ad4Arr) {
        int s = uq2.mo35249s();
        if ((s & 64) != 0) {
            uq2.mo35237g(1);
            int i = (s & 31) * 3;
            int k = uq2.mo35241k();
            for (ad4 ad4 : ad4Arr) {
                uq2.mo35236f(k);
                ad4.mo30357d(uq2, i);
                if (j != C6540C.TIME_UNSET) {
                    ad4.mo30358e(j, 1, i, 0, (zc4) null);
                }
            }
        }
    }

    /* renamed from: c */
    private static int m35126c(uq2 uq2) {
        int i = 0;
        while (uq2.mo35239i() != 0) {
            int s = uq2.mo35249s();
            i += s;
            if (s != 255) {
                return i;
            }
        }
        return -1;
    }
}
