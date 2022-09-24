package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Objects;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class w83 implements FilenameFilter {

    /* renamed from: a */
    private final Pattern f40728a;

    public w83(Pattern pattern) {
        Objects.requireNonNull(pattern);
        this.f40728a = pattern;
    }

    public final boolean accept(File file, String str) {
        return this.f40728a.matcher(str).matches();
    }
}
