package com.startapp;

import android.app.Activity;
import android.content.Context;
import java.lang.ref.SoftReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.startapp.p1 */
/* compiled from: Sta */
public class C12120p1 {

    /* renamed from: a */
    public final String f53991a;

    /* renamed from: b */
    public final String f53992b;

    /* renamed from: c */
    public final String[] f53993c;

    /* renamed from: d */
    public final Class[] f53994d;

    /* renamed from: e */
    public final Object[] f53995e;

    /* renamed from: f */
    public final String[] f53996f;

    /* renamed from: g */
    public transient SoftReference<C12156r1> f53997g;

    /* renamed from: h */
    public final transient Map<String, SoftReference<Map<String, Object>>> f53998h = new ConcurrentHashMap();

    /* renamed from: com.startapp.p1$a */
    /* compiled from: Sta */
    public static class C12121a implements Iterator<Object> {

        /* renamed from: a */
        public final Object f53999a;

        /* renamed from: b */
        public final int f54000b;

        /* renamed from: c */
        public int f54001c;

        public C12121a(Object obj, int i) {
            this.f53999a = obj;
            this.f54000b = i;
        }

        public boolean hasNext() {
            return this.f54001c < this.f54000b;
        }

        public Object next() {
            Object obj = this.f53999a;
            int i = this.f54001c;
            this.f54001c = i + 1;
            return Array.get(obj, i);
        }
    }

    /* renamed from: com.startapp.p1$b */
    /* compiled from: Sta */
    public static class C12122b implements Iterator<Object> {

        /* renamed from: a */
        public static final C12122b f54002a = new C12122b();

        public boolean hasNext() {
            return false;
        }

        public Object next() {
            return null;
        }
    }

    public C12120p1(String str, String str2, String[] strArr, Class[] clsArr, Object[] objArr, String[] strArr2) {
        this.f53991a = str;
        this.f53992b = str2;
        this.f53993c = strArr;
        this.f53994d = clsArr;
        this.f53995e = objArr;
        this.f53996f = strArr2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.util.Comparator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.util.Comparator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: com.startapp.y1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v17, resolved type: java.util.Comparator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v18, resolved type: java.util.Map<java.lang.String, java.lang.Object>} */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7, types: [java.util.Map] */
    /* JADX WARNING: type inference failed for: r2v19 */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0116, code lost:
        r2 = r2;
     */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONArray mo45653a(android.content.Context r9, int[] r10, java.lang.Integer r11) {
        /*
            r8 = this;
            r0 = 5
            com.startapp.r1 r9 = r8.mo45651a((android.content.Context) r9)     // Catch:{ InvocationTargetException -> 0x015b, IllegalAccessException -> 0x0150 }
            java.lang.Object[] r1 = r8.f53995e     // Catch:{ InvocationTargetException -> 0x015b, IllegalAccessException -> 0x0150 }
            java.lang.reflect.Method r2 = r9.f54089b     // Catch:{ InvocationTargetException -> 0x015b, IllegalAccessException -> 0x0150 }
            java.lang.Object r9 = r9.f54088a     // Catch:{ InvocationTargetException -> 0x015b, IllegalAccessException -> 0x0150 }
            java.lang.Object r9 = r2.invoke(r9, r1)     // Catch:{ InvocationTargetException -> 0x015b, IllegalAccessException -> 0x0150 }
            if (r9 != 0) goto L_0x0014
            com.startapp.p1$b r9 = com.startapp.C12120p1.C12122b.f54002a
            goto L_0x003c
        L_0x0014:
            boolean r0 = r9 instanceof java.util.Collection
            if (r0 == 0) goto L_0x001f
            java.util.Collection r9 = (java.util.Collection) r9
            java.util.Iterator r9 = r9.iterator()
            goto L_0x003c
        L_0x001f:
            java.lang.Class r0 = r9.getClass()
            boolean r0 = r0.isArray()
            if (r0 == 0) goto L_0x0034
            com.startapp.p1$a r0 = new com.startapp.p1$a
            int r1 = java.lang.reflect.Array.getLength(r9)
            r0.<init>(r9, r1)
            r9 = r0
            goto L_0x003c
        L_0x0034:
            java.util.Set r9 = java.util.Collections.singleton(r9)
            java.util.Iterator r9 = r9.iterator()
        L_0x003c:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0041:
            boolean r1 = r9.hasNext()
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x00e1
            java.lang.Object r1 = r9.next()
            if (r1 != 0) goto L_0x0050
            goto L_0x0041
        L_0x0050:
            org.json.JSONObject r4 = new org.json.JSONObject
            r4.<init>()
            java.lang.Class r5 = r1.getClass()
            java.util.Map<java.lang.String, java.lang.ref.SoftReference<java.util.Map<java.lang.String, java.lang.Object>>> r6 = r8.f53998h
            java.lang.String r7 = r5.getName()
            java.lang.Object r6 = r6.get(r7)
            java.lang.ref.SoftReference r6 = (java.lang.ref.SoftReference) r6
            if (r6 == 0) goto L_0x006d
            java.lang.Object r2 = r6.get()
            java.util.Map r2 = (java.util.Map) r2
        L_0x006d:
            if (r2 != 0) goto L_0x0083
            java.lang.String[] r2 = r8.f53996f
            java.util.Map r2 = r8.mo45652a(r5, r2)
            java.util.Map<java.lang.String, java.lang.ref.SoftReference<java.util.Map<java.lang.String, java.lang.Object>>> r6 = r8.f53998h
            java.lang.String r5 = r5.getName()
            java.lang.ref.SoftReference r7 = new java.lang.ref.SoftReference
            r7.<init>(r2)
            r6.put(r5, r7)
        L_0x0083:
            boolean r5 = r2.isEmpty()
            if (r5 == 0) goto L_0x0093
            java.lang.String r2 = ""
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00dc }
            r4.put(r2, r1)     // Catch:{ all -> 0x00dc }
            goto L_0x00dc
        L_0x0093:
            java.util.Set r2 = r2.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x009b:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x00dc
            java.lang.Object r5 = r2.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r5 = r5.getValue()
            boolean r7 = r5 instanceof java.lang.reflect.Field     // Catch:{ all -> 0x00da }
            if (r7 == 0) goto L_0x00c3
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5     // Catch:{ all -> 0x00da }
            java.lang.Object r5 = r5.get(r1)     // Catch:{ all -> 0x00da }
            java.lang.Object r5 = m52735a((java.lang.Object) r5)     // Catch:{ all -> 0x00da }
            r4.put(r6, r5)     // Catch:{ all -> 0x00da }
            goto L_0x009b
        L_0x00c3:
            boolean r7 = r5 instanceof java.lang.reflect.Method     // Catch:{ all -> 0x00da }
            if (r7 == 0) goto L_0x00d7
            java.lang.reflect.Method r5 = (java.lang.reflect.Method) r5     // Catch:{ all -> 0x00da }
            java.lang.Object[] r7 = new java.lang.Object[r3]     // Catch:{ all -> 0x00da }
            java.lang.Object r5 = r5.invoke(r1, r7)     // Catch:{ all -> 0x00da }
            java.lang.Object r5 = m52735a((java.lang.Object) r5)     // Catch:{ all -> 0x00da }
            r4.put(r6, r5)     // Catch:{ all -> 0x00da }
            goto L_0x009b
        L_0x00d7:
            boolean r5 = r5 instanceof java.lang.Throwable     // Catch:{ all -> 0x00da }
            goto L_0x009b
        L_0x00da:
            goto L_0x009b
        L_0x00dc:
            r0.add(r4)
            goto L_0x0041
        L_0x00e1:
            if (r10 == 0) goto L_0x011e
            int r9 = r10.length
            if (r9 <= 0) goto L_0x011e
            java.lang.String[] r9 = r8.f53996f
            int r9 = r9.length
            int r1 = r10.length
            r4 = 0
        L_0x00eb:
            if (r4 >= r1) goto L_0x0119
            r5 = r10[r4]
            if (r5 == 0) goto L_0x0116
            int r6 = java.lang.Math.abs(r5)
            if (r6 > r9) goto L_0x0116
            java.lang.String[] r6 = r8.f53996f
            int r7 = java.lang.Math.abs(r5)
            int r7 = r7 + -1
            r6 = r6[r7]
            com.startapp.d5 r7 = new com.startapp.d5
            r7.<init>(r6)
            if (r5 >= 0) goto L_0x010c
            java.util.Comparator r7 = java.util.Collections.reverseOrder(r7)
        L_0x010c:
            if (r2 != 0) goto L_0x0110
            r2 = r7
            goto L_0x0116
        L_0x0110:
            com.startapp.y1 r5 = new com.startapp.y1
            r5.<init>(r2, r7)
            r2 = r5
        L_0x0116:
            int r4 = r4 + 1
            goto L_0x00eb
        L_0x0119:
            if (r2 == 0) goto L_0x011e
            java.util.Collections.sort(r0, r2)
        L_0x011e:
            if (r11 == 0) goto L_0x0136
            int r9 = r11.intValue()
            if (r9 <= 0) goto L_0x0136
            int r9 = r11.intValue()
            int r10 = r0.size()
            int r9 = java.lang.Math.min(r9, r10)
            java.util.List r0 = r0.subList(r3, r9)
        L_0x0136:
            org.json.JSONArray r9 = new org.json.JSONArray
            r9.<init>()
            java.util.Iterator r10 = r0.iterator()
        L_0x013f:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x014f
            java.lang.Object r11 = r10.next()
            org.json.JSONObject r11 = (org.json.JSONObject) r11
            r9.put(r11)
            goto L_0x013f
        L_0x014f:
            return r9
        L_0x0150:
            r9 = move-exception
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            java.lang.String r11 = java.lang.String.valueOf(r0)
            r10.<init>(r11, r9)
            throw r10
        L_0x015b:
            r9 = move-exception
            java.lang.RuntimeException r10 = new java.lang.RuntimeException
            java.lang.String r11 = java.lang.String.valueOf(r0)
            r10.<init>(r11, r9)
            goto L_0x0167
        L_0x0166:
            throw r10
        L_0x0167:
            goto L_0x0166
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C12120p1.mo45653a(android.content.Context, int[], java.lang.Integer):org.json.JSONArray");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12120p1.class != obj.getClass()) {
            return false;
        }
        C12120p1 p1Var = (C12120p1) obj;
        if (!C5015nb.m22922a(this.f53991a, p1Var.f53991a) || !C5015nb.m22922a(this.f53992b, p1Var.f53992b) || !Arrays.equals(this.f53993c, p1Var.f53993c) || !Arrays.equals(this.f53995e, p1Var.f53995e) || !Arrays.equals(this.f53996f, p1Var.f53996f)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        Object[] objArr = {this.f53991a, this.f53992b, this.f53993c, this.f53995e, this.f53996f};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }

    public String toString() {
        return super.toString();
    }

    /* renamed from: a */
    public static Object m52735a(Object obj) {
        if (obj instanceof Short) {
            return Integer.valueOf(((Short) obj).intValue());
        }
        if ((obj instanceof Integer) || (obj instanceof Long)) {
            return obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof Double) || (obj instanceof Boolean) || (obj instanceof String)) {
            return obj;
        }
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    /* renamed from: a */
    public final C12156r1 mo45651a(Context context) {
        Object obj;
        SoftReference<C12156r1> softReference = this.f53997g;
        C12156r1 r1Var = softReference != null ? softReference.get() : null;
        if (r1Var != null) {
            return r1Var;
        }
        Object systemService = context.getSystemService(this.f53991a);
        if (systemService == null) {
            try {
                Object obj2 = ((LinkedHashMap) mo45652a(Context.class, new String[]{this.f53991a})).get(this.f53991a);
                if (obj2 instanceof Method) {
                    obj = ((Method) obj2).invoke(context, new Object[0]);
                } else if (obj2 instanceof Field) {
                    obj = ((Field) obj2).get(context);
                } else {
                    boolean z = obj2 instanceof Throwable;
                }
                systemService = obj;
            } catch (Throwable unused) {
            }
        }
        if (systemService != null) {
            try {
                Method a = m52736a(systemService.getClass(), this.f53992b, this.f53994d);
                if (!a.isAccessible()) {
                    try {
                        a.setAccessible(true);
                    } catch (SecurityException e) {
                        throw new RuntimeException(String.valueOf(4), e);
                    }
                }
                C12156r1 r1Var2 = new C12156r1(systemService, a);
                this.f53997g = new SoftReference<>(r1Var2);
                return r1Var2;
            } catch (NoSuchMethodException e2) {
                throw new RuntimeException(String.valueOf(3), e2);
            }
        } else {
            throw new RuntimeException(String.valueOf(1));
        }
    }

    /* renamed from: a */
    public static Method m52736a(Class<?> cls, String str, Class[] clsArr) throws NoSuchMethodException {
        NoSuchMethodException noSuchMethodException = null;
        Class<? super Object> cls2 = cls;
        while (cls2 != null) {
            try {
                return cls2.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException e) {
                if (noSuchMethodException == null) {
                    noSuchMethodException = e;
                }
                cls2 = cls2.getSuperclass();
            }
        }
        throw noSuchMethodException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r6 = m52736a(r11, "is" + r6, new java.lang.Class[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r6.isAccessible() == false) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008c, code lost:
        r6.setAccessible(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008f, code lost:
        r0.put(r4, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0093, code lost:
        r0.put(r4, r5);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x006f */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[ExcHandler: SecurityException (unused java.lang.SecurityException), SYNTHETIC, Splitter:B:24:0x006f] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<java.lang.String, java.lang.Object> mo45652a(java.lang.Class<?> r11, java.lang.String[] r12) {
        /*
            r10 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            int r1 = r12.length
            r2 = 0
            r3 = 0
        L_0x0008:
            if (r3 >= r1) goto L_0x009a
            r4 = r12[r3]
            r5 = 0
            r6 = r11
        L_0x000e:
            r7 = 1
            if (r6 == 0) goto L_0x002c
            java.lang.reflect.Field r5 = r6.getDeclaredField(r4)     // Catch:{ NoSuchFieldException -> 0x0023, SecurityException -> 0x002d }
            boolean r6 = r5.isAccessible()     // Catch:{ NoSuchFieldException -> 0x002f, SecurityException -> 0x002d }
            if (r6 != 0) goto L_0x001e
            r5.setAccessible(r7)     // Catch:{ NoSuchFieldException -> 0x002f, SecurityException -> 0x002d }
        L_0x001e:
            r0.put(r4, r5)     // Catch:{ NoSuchFieldException -> 0x002f, SecurityException -> 0x002d }
            goto L_0x0096
        L_0x0023:
            r8 = move-exception
            if (r5 != 0) goto L_0x0027
            r5 = r8
        L_0x0027:
            java.lang.Class r6 = r6.getSuperclass()     // Catch:{ NoSuchFieldException -> 0x002f, SecurityException -> 0x002d }
            goto L_0x000e
        L_0x002c:
            throw r5     // Catch:{ NoSuchFieldException -> 0x002f, SecurityException -> 0x002d }
        L_0x002d:
            r5 = move-exception
            goto L_0x0030
        L_0x002f:
            r5 = move-exception
        L_0x0030:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            char r8 = r4.charAt(r2)
            char r8 = java.lang.Character.toUpperCase(r8)
            r6.append(r8)
            java.lang.String r8 = r4.substring(r7)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ NoSuchMethodException -> 0x006f }
            r8.<init>()     // Catch:{ NoSuchMethodException -> 0x006f }
            java.lang.String r9 = "get"
            r8.append(r9)     // Catch:{ NoSuchMethodException -> 0x006f }
            r8.append(r6)     // Catch:{ NoSuchMethodException -> 0x006f }
            java.lang.String r8 = r8.toString()     // Catch:{ NoSuchMethodException -> 0x006f }
            java.lang.Class[] r9 = new java.lang.Class[r2]     // Catch:{ NoSuchMethodException -> 0x006f }
            java.lang.reflect.Method r8 = m52736a((java.lang.Class<?>) r11, (java.lang.String) r8, (java.lang.Class[]) r9)     // Catch:{ NoSuchMethodException -> 0x006f }
            boolean r9 = r8.isAccessible()     // Catch:{ NoSuchMethodException -> 0x006f }
            if (r9 != 0) goto L_0x006b
            r8.setAccessible(r7)     // Catch:{ NoSuchMethodException -> 0x006f }
        L_0x006b:
            r0.put(r4, r8)     // Catch:{ NoSuchMethodException -> 0x006f }
            goto L_0x0096
        L_0x006f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ SecurityException -> 0x0093, SecurityException -> 0x0093 }
            r8.<init>()     // Catch:{ SecurityException -> 0x0093, SecurityException -> 0x0093 }
            java.lang.String r9 = "is"
            r8.append(r9)     // Catch:{ SecurityException -> 0x0093, SecurityException -> 0x0093 }
            r8.append(r6)     // Catch:{ SecurityException -> 0x0093, SecurityException -> 0x0093 }
            java.lang.String r6 = r8.toString()     // Catch:{ SecurityException -> 0x0093, SecurityException -> 0x0093 }
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch:{ SecurityException -> 0x0093, SecurityException -> 0x0093 }
            java.lang.reflect.Method r6 = m52736a((java.lang.Class<?>) r11, (java.lang.String) r6, (java.lang.Class[]) r8)     // Catch:{ SecurityException -> 0x0093, SecurityException -> 0x0093 }
            boolean r8 = r6.isAccessible()     // Catch:{ SecurityException -> 0x0093, SecurityException -> 0x0093 }
            if (r8 != 0) goto L_0x008f
            r6.setAccessible(r7)     // Catch:{ SecurityException -> 0x0093, SecurityException -> 0x0093 }
        L_0x008f:
            r0.put(r4, r6)     // Catch:{ SecurityException -> 0x0093, SecurityException -> 0x0093 }
            goto L_0x0096
        L_0x0093:
            r0.put(r4, r5)
        L_0x0096:
            int r3 = r3 + 1
            goto L_0x0008
        L_0x009a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C12120p1.mo45652a(java.lang.Class, java.lang.String[]):java.util.Map");
    }
}
