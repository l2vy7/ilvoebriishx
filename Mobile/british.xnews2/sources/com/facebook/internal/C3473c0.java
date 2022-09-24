package com.facebook.internal;

import com.facebook.C3642m;
import java.util.Collection;

/* renamed from: com.facebook.internal.c0 */
/* compiled from: ServerProtocol */
public final class C3473c0 {

    /* renamed from: a */
    public static final Collection<String> f13031a = C3481f0.m11653s0("service_disabled", "AndroidAuthKillSwitchException");

    /* renamed from: b */
    public static final Collection<String> f13032b = C3481f0.m11653s0("access_denied", "OAuthAccessDeniedException");

    /* renamed from: a */
    public static final String m11574a() {
        return "v5.0";
    }

    /* renamed from: b */
    public static final String m11575b() {
        return String.format("m.%s", new Object[]{C3642m.m12289o()});
    }

    /* renamed from: c */
    public static final String m11576c() {
        return String.format("https://graph.%s", new Object[]{C3642m.m12289o()});
    }

    /* renamed from: d */
    public static final String m11577d() {
        return String.format("https://graph-video.%s", new Object[]{C3642m.m12289o()});
    }
}
