package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.ads.wg */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C8297wg {

    /* renamed from: c */
    public static final C7611dj f40778c = new C8263vg();

    /* renamed from: d */
    private static final Pattern f40779d = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f40780a = -1;

    /* renamed from: b */
    public int f40781b = -1;

    /* renamed from: a */
    public final boolean mo35615a() {
        return (this.f40780a == -1 || this.f40781b == -1) ? false : true;
    }

    /* renamed from: b */
    public final boolean mo35616b(zzatr zzatr) {
        for (int i = 0; i < zzatr.mo36205a(); i++) {
            zzatq b = zzatr.mo36206b(i);
            if (b instanceof zzatv) {
                zzatv zzatv = (zzatv) b;
                String str = zzatv.f42904d;
                String str2 = zzatv.f42905e;
                if (!"iTunSMPB".equals(str)) {
                    continue;
                } else {
                    Matcher matcher = f40779d.matcher(str2);
                    if (matcher.find()) {
                        try {
                            int parseInt = Integer.parseInt(matcher.group(1), 16);
                            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
                            if (parseInt > 0 || parseInt2 > 0) {
                                this.f40780a = parseInt;
                                this.f40781b = parseInt2;
                                return true;
                            }
                        } catch (NumberFormatException unused) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return false;
    }
}
