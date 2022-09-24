package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class g83<K, V> extends a73<Map.Entry<K, V>> {

    /* renamed from: d */
    private final transient t63<K, V> f20337d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final transient Object[] f20338e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final transient int f20339f;

    g83(t63<K, V> t63, Object[] objArr, int i, int i2) {
        this.f20337d = t63;
        this.f20338e = objArr;
        this.f20339f = i2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo18346a(Object[] objArr, int i) {
        return mo18099f().mo18346a(objArr, i);
    }

    public final boolean contains(@CheckForNull Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f20337d.get(key))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final s83<Map.Entry<K, V>> mo18100g() {
        return mo18099f().listIterator(0);
    }

    public final /* synthetic */ Iterator iterator() {
        return mo18099f().listIterator(0);
    }

    public final int size() {
        return this.f20339f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final p63<Map.Entry<K, V>> mo18103t() {
        return new f83(this);
    }
}
