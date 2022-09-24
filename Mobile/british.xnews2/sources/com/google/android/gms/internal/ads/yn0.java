package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final /* synthetic */ class yn0 implements ao0 {

    /* renamed from: a */
    public final /* synthetic */ String f41931a;

    /* renamed from: b */
    public final /* synthetic */ String f41932b;

    /* renamed from: c */
    public final /* synthetic */ Map f41933c;

    /* renamed from: d */
    public final /* synthetic */ byte[] f41934d;

    public /* synthetic */ yn0(String str, String str2, Map map, byte[] bArr) {
        this.f41931a = str;
        this.f41932b = str2;
        this.f41933c = map;
        this.f41934d = bArr;
    }

    /* renamed from: a */
    public final void mo30441a(JsonWriter jsonWriter) {
        bo0.m30766a(this.f41931a, this.f41932b, this.f41933c, this.f41934d, jsonWriter);
    }
}
