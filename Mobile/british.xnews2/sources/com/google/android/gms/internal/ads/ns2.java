package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ns2 {

    /* renamed from: a */
    private final Pattern f36106a;

    public ns2() {
        Pattern pattern;
        try {
            pattern = Pattern.compile((String) C8311wv.m39277c().mo18570b(p00.f37144l5));
        } catch (PatternSyntaxException unused) {
            pattern = null;
        }
        this.f36106a = pattern;
    }

    /* renamed from: a */
    public final String mo33737a(String str) {
        Pattern pattern = this.f36106a;
        if (!(pattern == null || str == null)) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group();
            }
        }
        return null;
    }
}
