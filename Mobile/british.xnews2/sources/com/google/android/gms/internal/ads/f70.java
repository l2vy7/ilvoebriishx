package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.C4604n;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class f70 implements e70<Object> {

    /* renamed from: a */
    private final ly1 f31658a;

    public f70(ly1 ly1) {
        C4604n.m20099l(ly1, "The Inspector Manager must not be null");
        this.f31658a = ly1;
    }

    /* renamed from: a */
    public final void mo18854a(Object obj, Map<String, String> map) {
        if (map != null && map.containsKey("extras")) {
            long j = Long.MAX_VALUE;
            if (map.containsKey("expires")) {
                try {
                    j = Long.parseLong(map.get("expires"));
                } catch (NumberFormatException unused) {
                }
            }
            this.f31658a.mo33428h(map.get("extras"), j);
        }
    }
}
