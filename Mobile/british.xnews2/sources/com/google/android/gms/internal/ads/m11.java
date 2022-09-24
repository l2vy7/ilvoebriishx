package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class m11 implements e11 {

    /* renamed from: a */
    private final ly1 f35330a;

    m11(ly1 ly1) {
        this.f35330a = ly1;
    }

    /* renamed from: a */
    public final void mo31442a(Map<String, String> map) {
        if (((Boolean) C8311wv.m39277c().mo18570b(p00.f36966Q6)).booleanValue()) {
            String str = map.get("policy_violations");
            if (!TextUtils.isEmpty(str)) {
                this.f35330a.mo33431k(str);
            }
        }
    }
}
