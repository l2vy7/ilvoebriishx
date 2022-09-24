package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p006a5.C6483e;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class i82 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C6483e f33132a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final j82 f33133b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final sx2 f33134c;

    /* renamed from: d */
    private final List<String> f33135d = Collections.synchronizedList(new ArrayList());
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final boolean f33136e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final w42 f33137f;

    public i82(C6483e eVar, j82 j82, w42 w42, sx2 sx2) {
        this.f33132a = eVar;
        this.f33133b = j82;
        this.f33136e = ((Boolean) C8311wv.m39277c().mo18570b(p00.f37135k5)).booleanValue();
        this.f33137f = w42;
        this.f33134c = sx2;
    }

    /* renamed from: g */
    static /* bridge */ /* synthetic */ void m33114g(i82 i82, String str, int i, long j, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 33);
        sb.append(str);
        sb.append(".");
        sb.append(i);
        sb.append(".");
        sb.append(j);
        String sb2 = sb.toString();
        if (!TextUtils.isEmpty(str2)) {
            StringBuilder sb3 = new StringBuilder(sb2.length() + 1 + String.valueOf(str2).length());
            sb3.append(sb2);
            sb3.append(".");
            sb3.append(str2);
            sb2 = sb3.toString();
        }
        i82.f33135d.add(sb2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final <T> mb3<T> mo32569e(ur2 ur2, ir2 ir2, mb3<T> mb3, px2 px2) {
        lr2 lr2 = ur2.f39937b.f39519b;
        long elapsedRealtime = this.f33132a.elapsedRealtime();
        String str = ir2.f33498x;
        if (str != null) {
            bb3.m30658r(mb3, new h82(this, elapsedRealtime, str, ir2, lr2, px2, ur2), po0.f37727f);
        }
        return mb3;
    }

    /* renamed from: f */
    public final String mo32570f() {
        return TextUtils.join("_", this.f33135d);
    }
}
