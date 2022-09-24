package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class x11 implements e11 {

    /* renamed from: a */
    private final ly1 f40988a;

    x11(ly1 ly1) {
        this.f40988a = ly1;
    }

    /* renamed from: a */
    public final void mo31442a(Map<String, String> map) {
        String str = map.get("test_mode_enabled");
        if (!TextUtils.isEmpty(str)) {
            this.f40988a.mo33432l(str.equals("true"));
        }
    }
}
