package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class r11 implements e11 {

    /* renamed from: a */
    private final hr2 f38457a;

    public r11(hr2 hr2) {
        this.f38457a = hr2;
    }

    /* renamed from: a */
    public final void mo31442a(Map<String, String> map) {
        String str = map.get("render_in_browser");
        if (!TextUtils.isEmpty(str)) {
            try {
                this.f38457a.mo32438b(Boolean.parseBoolean(str));
            } catch (Exception unused) {
                throw new IllegalStateException("Invalid render_in_browser state");
            }
        }
    }
}
