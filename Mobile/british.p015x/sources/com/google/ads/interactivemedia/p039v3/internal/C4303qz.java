package com.google.ads.interactivemedia.p039v3.internal;

import android.net.Uri;
import com.google.android.exoplayer2.extractor.p040ts.TsExtractor;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.qz */
/* compiled from: IMASDK */
public final class C4303qz implements C4311rg {

    /* renamed from: a */
    private static final int[] f18475a = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 14};

    /* renamed from: b */
    private static final Constructor<? extends C4306rb> f18476b;

    /* renamed from: c */
    private final int f18477c = 1;

    /* renamed from: d */
    private final int f18478d = TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES;

    static {
        Constructor<? extends U> constructor = null;
        try {
            if (Boolean.TRUE.equals(Class.forName("com.google.android.exoplayer2.ext.flac.FlacLibrary").getMethod("isAvailable", new Class[0]).invoke((Object) null, new Object[0]))) {
                constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(C4306rb.class).getConstructor(new Class[]{Integer.TYPE});
            }
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new RuntimeException("Error instantiating FLAC extension", e);
        }
        f18476b = constructor;
    }

    /* renamed from: c */
    private final void m18718c(int i, List<C4306rb> list) {
        switch (i) {
            case 0:
                list.add(new C4421vi());
                return;
            case 1:
                list.add(new C4424vl());
                return;
            case 2:
                list.add(new C4427vo((byte[]) null));
                return;
            case 3:
                list.add(new C4334sc((byte[]) null));
                return;
            case 4:
                Constructor<? extends C4306rb> constructor = f18476b;
                if (constructor != null) {
                    try {
                        list.add((C4306rb) constructor.newInstance(new Object[]{0}));
                        return;
                    } catch (Exception e) {
                        throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
                    }
                } else {
                    list.add(new C4339sh((byte[]) null));
                    return;
                }
            case 5:
                list.add(new C4342sk());
                return;
            case 6:
                list.add(new C4362td(0));
                return;
            case 7:
                list.add(new C4369tk((byte[]) null));
                return;
            case 8:
                list.add(new C4389ud((byte[]) null));
                list.add(new C4394ui((byte[]) null));
                return;
            case 9:
                list.add(new C4408uw());
                return;
            case 10:
                list.add(new C4454wo());
                return;
            case 11:
                list.add(new C4464wy(1, TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES));
                return;
            case 12:
                list.add(new C4476xj());
                return;
            case 14:
                list.add(new C4347sp());
                return;
            default:
                return;
        }
    }

    /* renamed from: a */
    public final synchronized C4306rb[] mo15843a() {
        return mo15844b(Uri.EMPTY, new HashMap());
    }

    /* renamed from: b */
    public final synchronized C4306rb[] mo15844b(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        arrayList = new ArrayList(14);
        int i = C4396uk.m19140i(map);
        if (i != -1) {
            m18718c(i, arrayList);
        }
        int k = C4396uk.m19142k(uri);
        if (!(k == -1 || k == i)) {
            m18718c(k, arrayList);
        }
        int[] iArr = f18475a;
        int length = iArr.length;
        for (int i2 = 0; i2 < 14; i2++) {
            int i3 = iArr[i2];
            if (!(i3 == i || i3 == k)) {
                m18718c(i3, arrayList);
            }
        }
        return (C4306rb[]) arrayList.toArray(new C4306rb[arrayList.size()]);
    }
}
