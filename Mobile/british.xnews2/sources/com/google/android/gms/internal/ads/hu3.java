package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hu3 extends mu3 {

    /* renamed from: a */
    final String f32851a;

    public hu3(String str) {
        this.f32851a = str;
    }

    /* renamed from: a */
    public final void mo32456a(String str) {
        String str2 = this.f32851a;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        Log.d("isoparser", sb.toString());
    }
}
