package com.google.android.gms.internal.ads;

import android.util.JsonReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class jr2 {

    /* renamed from: a */
    public final int f34022a;

    /* renamed from: b */
    public final int f34023b;

    /* renamed from: c */
    public final boolean f34024c;

    public jr2(int i, int i2, boolean z) {
        this.f34022a = i;
        this.f34023b = i2;
        this.f34024c = z;
    }

    /* renamed from: a */
    static List<jr2> m33738a(JsonReader jsonReader) throws IllegalStateException, IOException, NumberFormatException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            jsonReader.beginObject();
            int i = 0;
            int i2 = 0;
            boolean z = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                if ("width".equals(nextName)) {
                    i = jsonReader.nextInt();
                } else if ("height".equals(nextName)) {
                    i2 = jsonReader.nextInt();
                } else if ("is_fluid_height".equals(nextName)) {
                    z = jsonReader.nextBoolean();
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            arrayList.add(new jr2(i, i2, z));
        }
        jsonReader.endArray();
        return arrayList;
    }
}
