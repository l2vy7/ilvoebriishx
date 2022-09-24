package com.google.ads.interactivemedia.p039v3.internal;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.ads.interactivemedia.v3.internal.rn */
/* compiled from: IMASDK */
public final class C4318rn {

    /* renamed from: c */
    private static final Pattern f18525c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a */
    public int f18526a = -1;

    /* renamed from: b */
    public int f18527b = -1;

    /* renamed from: c */
    private final boolean m18805c(String str) {
        Matcher matcher = f18525c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i = amm.f15298a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f18526a = parseInt;
            this.f18527b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo16615a() {
        return (this.f18526a == -1 || this.f18527b == -1) ? false : true;
    }

    /* renamed from: b */
    public final void mo16616b(C4507yn ynVar) {
        for (int i = 0; i < ynVar.mo16831a(); i++) {
            C4506ym b = ynVar.mo16832b(i);
            if (b instanceof C4524zd) {
                C4524zd zdVar = (C4524zd) b;
                if ("iTunSMPB".equals(zdVar.f19741b) && m18805c(zdVar.f19742c)) {
                    return;
                }
            } else if (b instanceof C4531zk) {
                C4531zk zkVar = (C4531zk) b;
                if ("com.apple.iTunes".equals(zkVar.f19754a) && "iTunSMPB".equals(zkVar.f19755b) && m18805c(zkVar.f19756c)) {
                    return;
                }
            } else {
                continue;
            }
        }
    }
}
