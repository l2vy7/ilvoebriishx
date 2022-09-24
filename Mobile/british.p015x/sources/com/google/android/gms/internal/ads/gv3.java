package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gv3<T> implements uu3<Set<T>> {

    /* renamed from: c */
    private static final uu3<Set<Object>> f32479c = vu3.m38959a(Collections.emptySet());

    /* renamed from: a */
    private final List<iv3<T>> f32480a;

    /* renamed from: b */
    private final List<iv3<Collection<T>>> f32481b;

    /* synthetic */ gv3(List list, List list2, ev3 ev3) {
        this.f32480a = list;
        this.f32481b = list2;
    }

    /* renamed from: a */
    public static <T> fv3<T> m32718a(int i, int i2) {
        return new fv3<>(i, i2, (ev3) null);
    }

    /* renamed from: b */
    public final Set<T> zzb() {
        int size = this.f32480a.size();
        ArrayList arrayList = new ArrayList(this.f32481b.size());
        int size2 = this.f32481b.size();
        for (int i = 0; i < size2; i++) {
            Collection collection = (Collection) this.f32481b.get(i).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet a = ru3.m37250a(size);
        int size3 = this.f32480a.size();
        for (int i2 = 0; i2 < size3; i2++) {
            Object zzb = this.f32480a.get(i2).zzb();
            Objects.requireNonNull(zzb);
            a.add(zzb);
        }
        int size4 = arrayList.size();
        for (int i3 = 0; i3 < size4; i3++) {
            for (Object next : (Collection) arrayList.get(i3)) {
                Objects.requireNonNull(next);
                a.add(next);
            }
        }
        return Collections.unmodifiableSet(a);
    }
}
