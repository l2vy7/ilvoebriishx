package com.google.android.gms.internal.ads;

import android.util.JsonWriter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final /* synthetic */ class xn0 implements ao0 {

    /* renamed from: a */
    public final /* synthetic */ String f41225a;

    public /* synthetic */ xn0(String str) {
        this.f41225a = str;
    }

    /* renamed from: a */
    public final void mo30441a(JsonWriter jsonWriter) {
        String str = this.f41225a;
        int i = bo0.f30054g;
        jsonWriter.name("params").beginObject();
        if (str != null) {
            jsonWriter.name("error_description").value(str);
        }
        jsonWriter.endObject();
    }
}
