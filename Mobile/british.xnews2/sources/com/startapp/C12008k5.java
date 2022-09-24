package com.startapp;

import android.util.JsonReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.startapp.k5 */
/* compiled from: Sta */
public class C12008k5 {

    /* renamed from: com.startapp.k5$a */
    /* compiled from: Sta */
    public static /* synthetic */ class C12009a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f53199a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.util.JsonToken[] r0 = android.util.JsonToken.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f53199a = r0
                android.util.JsonToken r1 = android.util.JsonToken.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f53199a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.util.JsonToken r1 = android.util.JsonToken.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f53199a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.util.JsonToken r1 = android.util.JsonToken.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f53199a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.util.JsonToken r1 = android.util.JsonToken.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f53199a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.util.JsonToken r1 = android.util.JsonToken.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f53199a     // Catch:{ NoSuchFieldError -> 0x0049 }
                android.util.JsonToken r1 = android.util.JsonToken.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.C12008k5.C12009a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static List<Object> m52529a(JsonReader jsonReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(m52530b(jsonReader));
        }
        jsonReader.endArray();
        return arrayList;
    }

    /* renamed from: b */
    public static Object m52530b(JsonReader jsonReader) throws IOException {
        switch (C12009a.f53199a[jsonReader.peek().ordinal()]) {
            case 1:
                return m52529a(jsonReader);
            case 2:
                HashMap hashMap = new HashMap();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    hashMap.put(jsonReader.nextName(), m52530b(jsonReader));
                }
                jsonReader.endObject();
                return hashMap;
            case 3:
                return jsonReader.nextString();
            case 4:
                return new BigDecimal(jsonReader.nextString());
            case 5:
                return Boolean.valueOf(jsonReader.nextBoolean());
            case 6:
                jsonReader.nextNull();
                return null;
            default:
                throw new IOException(String.valueOf(jsonReader.peek()));
        }
    }
}
