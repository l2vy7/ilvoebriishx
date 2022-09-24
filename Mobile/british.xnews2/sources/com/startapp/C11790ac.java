package com.startapp;

import com.startapp.simple.bloomfilter.version.BloomVersion;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.startapp.ac */
/* compiled from: Sta */
public class C11790ac {

    /* renamed from: a */
    public final Map<BloomVersion, C12476zb> f52590a;

    public C11790ac() {
        HashMap hashMap = new HashMap();
        this.f52590a = hashMap;
        hashMap.put(BloomVersion.ZERO, new C11890ec());
        hashMap.put(BloomVersion.THREE, new C11872dc());
        hashMap.put(BloomVersion.FOUR, new C11831cc());
        hashMap.put(BloomVersion.FIVE, new C11807bc());
    }
}
