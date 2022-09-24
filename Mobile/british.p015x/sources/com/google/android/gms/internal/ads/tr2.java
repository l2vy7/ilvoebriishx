package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import com.google.android.gms.ads.internal.util.zzby;
import com.unity3d.ads.metadata.MediationMetaData;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p006a5.C0114k;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class tr2 {

    /* renamed from: a */
    public final List<ir2> f39518a;

    /* renamed from: b */
    public final lr2 f39519b;

    /* renamed from: c */
    public final List<sr2> f39520c;

    tr2(JsonReader jsonReader) throws IllegalStateException, IOException, JSONException, NumberFormatException, AssertionError {
        List<ir2> emptyList = Collections.emptyList();
        ArrayList arrayList = new ArrayList();
        jsonReader.beginObject();
        lr2 lr2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            if ("responses".equals(nextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String nextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(nextName2)) {
                        emptyList = new ArrayList<>();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            emptyList.add(new ir2(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (nextName2.equals("common")) {
                        lr2 = new lr2(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (nextName.equals("actions")) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String str = null;
                    JSONObject jSONObject = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        if (MediationMetaData.KEY_NAME.equals(nextName3)) {
                            str = jsonReader.nextString();
                        } else if ("info".equals(nextName3)) {
                            jSONObject = zzby.zzh(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (str != null) {
                        arrayList.add(new sr2(str, jSONObject));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.f39520c = arrayList;
        this.f39518a = emptyList;
        this.f39519b = lr2 == null ? new lr2(new JsonReader(new StringReader("{}"))) : lr2;
    }

    /* renamed from: a */
    public static tr2 m38007a(Reader reader) throws mr2 {
        try {
            tr2 tr2 = new tr2(new JsonReader(reader));
            C0114k.m409a(reader);
            return tr2;
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e) {
            throw new mr2("unable to parse ServerResponse", e);
        } catch (Throwable th) {
            C0114k.m409a(reader);
            throw th;
        }
    }
}
