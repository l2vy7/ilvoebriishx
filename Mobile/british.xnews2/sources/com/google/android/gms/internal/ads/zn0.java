package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import p006a5.C6481c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final /* synthetic */ class zn0 implements ao0 {

    /* renamed from: a */
    public final /* synthetic */ byte[] f42530a;

    public /* synthetic */ zn0(byte[] bArr) {
        this.f42530a = bArr;
    }

    /* renamed from: a */
    public final void mo30441a(JsonWriter jsonWriter) {
        byte[] bArr = this.f42530a;
        int i = bo0.f30054g;
        jsonWriter.name("params").beginObject();
        int length = bArr.length;
        String a = C6481c.m28246a(bArr);
        if (length < 10000) {
            jsonWriter.name(TtmlNode.TAG_BODY).value(a);
        } else {
            String e = vn0.m38849e(a);
            if (e != null) {
                jsonWriter.name("bodydigest").value(e);
            }
        }
        jsonWriter.name("bodylength").value((long) length);
        jsonWriter.endObject();
    }
}
