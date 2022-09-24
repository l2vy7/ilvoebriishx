package com.google.android.gms.internal.ads;

import android.util.JsonWriter;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;
import p006a5.C6483e;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zv1 {

    /* renamed from: a */
    private final C6483e f42600a;

    public zv1(C6483e eVar) {
        this.f42600a = eVar;
    }

    /* renamed from: a */
    public final void mo36136a(List<Object> list, String str, String str2, Object... objArr) {
        String str3;
        if (g20.f32112a.mo34648e().booleanValue()) {
            long currentTimeMillis = this.f42600a.currentTimeMillis();
            StringWriter stringWriter = new StringWriter();
            JsonWriter jsonWriter = new JsonWriter(stringWriter);
            try {
                jsonWriter.beginObject();
                jsonWriter.name("timestamp").value(currentTimeMillis);
                jsonWriter.name("source").value(str);
                jsonWriter.name("event").value(str2);
                jsonWriter.name("components").beginArray();
                for (Object obj : list) {
                    jsonWriter.value(obj.toString());
                }
                jsonWriter.endArray();
                jsonWriter.name("params").beginArray();
                int length = objArr.length;
                for (int i = 0; i < length; i++) {
                    Object obj2 = objArr[i];
                    jsonWriter.value(obj2 != null ? obj2.toString() : null);
                }
                jsonWriter.endArray();
                jsonWriter.endObject();
                jsonWriter.flush();
                jsonWriter.close();
            } catch (IOException e) {
                co0.zzh("unable to log", e);
            }
            String valueOf = String.valueOf(stringWriter.toString());
            if (valueOf.length() != 0) {
                str3 = "AD-DBG ".concat(valueOf);
            } else {
                str3 = new String("AD-DBG ");
            }
            co0.zzi(str3);
        }
    }
}
