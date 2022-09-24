package com.google.ads.interactivemedia.p039v3.internal;

import java.lang.reflect.Type;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.bfv */
/* compiled from: IMASDK */
public final class bfv {

    /* renamed from: a */
    private final Map<Type, bev<?>> f16254a;

    /* renamed from: b */
    private final bis f16255b = bis.m15933b();

    public bfv(Map<Type, bev<?>> map) {
        this.f16254a = map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e7  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final <T> com.google.ads.interactivemedia.p039v3.internal.bgj<T> mo15029a(com.google.ads.interactivemedia.p039v3.internal.biu<T> r6) {
        /*
            r5 = this;
            java.lang.reflect.Type r0 = r6.mo15134b()
            java.lang.Class r6 = r6.mo15133a()
            java.util.Map<java.lang.reflect.Type, com.google.ads.interactivemedia.v3.internal.bev<?>> r1 = r5.f16254a
            java.lang.Object r1 = r1.get(r0)
            com.google.ads.interactivemedia.v3.internal.bev r1 = (com.google.ads.interactivemedia.p039v3.internal.bev) r1
            r2 = 0
            if (r1 == 0) goto L_0x0019
            com.google.ads.interactivemedia.v3.internal.bfs r6 = new com.google.ads.interactivemedia.v3.internal.bfs
            r6.<init>(r1, r0, r2)
            return r6
        L_0x0019:
            java.util.Map<java.lang.reflect.Type, com.google.ads.interactivemedia.v3.internal.bev<?>> r1 = r5.f16254a
            java.lang.Object r1 = r1.get(r6)
            com.google.ads.interactivemedia.v3.internal.bev r1 = (com.google.ads.interactivemedia.p039v3.internal.bev) r1
            if (r1 != 0) goto L_0x00ee
            r1 = 0
            java.lang.Class[] r3 = new java.lang.Class[r1]     // Catch:{ NoSuchMethodException -> 0x003b }
            java.lang.reflect.Constructor r3 = r6.getDeclaredConstructor(r3)     // Catch:{ NoSuchMethodException -> 0x003b }
            boolean r4 = r3.isAccessible()     // Catch:{ NoSuchMethodException -> 0x003b }
            if (r4 != 0) goto L_0x0035
            com.google.ads.interactivemedia.v3.internal.bis r4 = r5.f16255b     // Catch:{ NoSuchMethodException -> 0x003b }
            r4.mo15132a(r3)     // Catch:{ NoSuchMethodException -> 0x003b }
        L_0x0035:
            com.google.ads.interactivemedia.v3.internal.bft r4 = new com.google.ads.interactivemedia.v3.internal.bft     // Catch:{ NoSuchMethodException -> 0x003b }
            r4.<init>(r3)     // Catch:{ NoSuchMethodException -> 0x003b }
            goto L_0x003c
        L_0x003b:
            r4 = r2
        L_0x003c:
            if (r4 != 0) goto L_0x00ed
            java.lang.Class<java.util.Collection> r3 = java.util.Collection.class
            boolean r3 = r3.isAssignableFrom(r6)
            if (r3 == 0) goto L_0x0087
            java.lang.Class<java.util.SortedSet> r1 = java.util.SortedSet.class
            boolean r1 = r1.isAssignableFrom(r6)
            if (r1 == 0) goto L_0x0056
            com.google.ads.interactivemedia.v3.internal.bfq r1 = new com.google.ads.interactivemedia.v3.internal.bfq
            r1.<init>((int[]) r2)
        L_0x0053:
            r2 = r1
            goto L_0x00e4
        L_0x0056:
            java.lang.Class<java.util.EnumSet> r1 = java.util.EnumSet.class
            boolean r1 = r1.isAssignableFrom(r6)
            if (r1 == 0) goto L_0x0065
            com.google.ads.interactivemedia.v3.internal.bfu r2 = new com.google.ads.interactivemedia.v3.internal.bfu
            r2.<init>(r0)
            goto L_0x00e4
        L_0x0065:
            java.lang.Class<java.util.Set> r1 = java.util.Set.class
            boolean r1 = r1.isAssignableFrom(r6)
            if (r1 == 0) goto L_0x0073
            com.google.ads.interactivemedia.v3.internal.bfq r1 = new com.google.ads.interactivemedia.v3.internal.bfq
            r1.<init>((boolean[]) r2)
            goto L_0x0053
        L_0x0073:
            java.lang.Class<java.util.Queue> r1 = java.util.Queue.class
            boolean r1 = r1.isAssignableFrom(r6)
            if (r1 == 0) goto L_0x0081
            com.google.ads.interactivemedia.v3.internal.bfq r1 = new com.google.ads.interactivemedia.v3.internal.bfq
            r1.<init>((float[]) r2)
            goto L_0x0053
        L_0x0081:
            com.google.ads.interactivemedia.v3.internal.bfq r1 = new com.google.ads.interactivemedia.v3.internal.bfq
            r1.<init>((byte[][]) r2)
            goto L_0x0053
        L_0x0087:
            java.lang.Class<java.util.Map> r3 = java.util.Map.class
            boolean r3 = r3.isAssignableFrom(r6)
            if (r3 == 0) goto L_0x00e4
            java.lang.Class<java.util.concurrent.ConcurrentNavigableMap> r3 = java.util.concurrent.ConcurrentNavigableMap.class
            boolean r3 = r3.isAssignableFrom(r6)
            if (r3 == 0) goto L_0x009d
            com.google.ads.interactivemedia.v3.internal.bfq r1 = new com.google.ads.interactivemedia.v3.internal.bfq
            r1.<init>((char[][]) r2)
            goto L_0x0053
        L_0x009d:
            java.lang.Class<java.util.concurrent.ConcurrentMap> r3 = java.util.concurrent.ConcurrentMap.class
            boolean r3 = r3.isAssignableFrom(r6)
            if (r3 == 0) goto L_0x00ab
            com.google.ads.interactivemedia.v3.internal.bfq r1 = new com.google.ads.interactivemedia.v3.internal.bfq
            r1.<init>((byte[]) r2)
            goto L_0x0053
        L_0x00ab:
            java.lang.Class<java.util.SortedMap> r3 = java.util.SortedMap.class
            boolean r3 = r3.isAssignableFrom(r6)
            if (r3 == 0) goto L_0x00b9
            com.google.ads.interactivemedia.v3.internal.bfq r2 = new com.google.ads.interactivemedia.v3.internal.bfq
            r2.<init>()
            goto L_0x00e4
        L_0x00b9:
            boolean r3 = r0 instanceof java.lang.reflect.ParameterizedType
            if (r3 == 0) goto L_0x00dd
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r4 = r0
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type[] r4 = r4.getActualTypeArguments()
            r1 = r4[r1]
            com.google.ads.interactivemedia.v3.internal.biu r1 = com.google.ads.interactivemedia.p039v3.internal.biu.m15937c(r1)
            java.lang.Class r1 = r1.mo15133a()
            boolean r1 = r3.isAssignableFrom(r1)
            if (r1 != 0) goto L_0x00dd
            com.google.ads.interactivemedia.v3.internal.bfq r1 = new com.google.ads.interactivemedia.v3.internal.bfq
            r1.<init>((char[]) r2)
            goto L_0x0053
        L_0x00dd:
            com.google.ads.interactivemedia.v3.internal.bfq r1 = new com.google.ads.interactivemedia.v3.internal.bfq
            r1.<init>((short[]) r2)
            goto L_0x0053
        L_0x00e4:
            if (r2 == 0) goto L_0x00e7
            return r2
        L_0x00e7:
            com.google.ads.interactivemedia.v3.internal.bfr r1 = new com.google.ads.interactivemedia.v3.internal.bfr
            r1.<init>(r6, r0)
            return r1
        L_0x00ed:
            return r4
        L_0x00ee:
            com.google.ads.interactivemedia.v3.internal.bfs r6 = new com.google.ads.interactivemedia.v3.internal.bfs
            r6.<init>(r1, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.bfv.mo15029a(com.google.ads.interactivemedia.v3.internal.biu):com.google.ads.interactivemedia.v3.internal.bgj");
    }

    public final String toString() {
        return this.f16254a.toString();
    }
}
