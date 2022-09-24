package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class mc4 {

    /* renamed from: c */
    private static final Pattern f35495c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f35496a = -1;

    /* renamed from: b */
    public int f35497b = -1;

    /* renamed from: c */
    private final boolean m34756c(String str) {
        Matcher matcher = f35495c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i = d13.f20195a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f35496a = parseInt;
            this.f35497b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo33527a() {
        return (this.f35496a == -1 || this.f35497b == -1) ? false : true;
    }

    /* renamed from: b */
    public final boolean mo33528b(zzdd zzdd) {
        for (int i = 0; i < zzdd.mo36273a(); i++) {
            zzdc b = zzdd.mo36274b(i);
            if (b instanceof zzzn) {
                zzzn zzzn = (zzzn) b;
                if ("iTunSMPB".equals(zzzn.f43112d) && m34756c(zzzn.f43113e)) {
                    return true;
                }
            } else if (b instanceof zzzw) {
                zzzw zzzw = (zzzw) b;
                if ("com.apple.iTunes".equals(zzzw.f43119c) && "iTunSMPB".equals(zzzw.f43120d) && m34756c(zzzw.f43121e)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
