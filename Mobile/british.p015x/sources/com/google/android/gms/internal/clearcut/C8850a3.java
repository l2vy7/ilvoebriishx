package com.google.android.gms.internal.clearcut;

import java.lang.reflect.Field;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.clearcut.a3 */
final class C8850a3 {

    /* renamed from: A */
    private int f44351A;

    /* renamed from: B */
    private int f44352B;

    /* renamed from: C */
    private Field f44353C;

    /* renamed from: D */
    private Object f44354D;

    /* renamed from: E */
    private Object f44355E;

    /* renamed from: F */
    private Object f44356F;

    /* renamed from: a */
    private final C8858b3 f44357a;

    /* renamed from: b */
    private final Object[] f44358b;

    /* renamed from: c */
    private Class<?> f44359c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final int f44360d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final int f44361e;

    /* renamed from: f */
    private final int f44362f;

    /* renamed from: g */
    private final int f44363g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final int f44364h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final int f44365i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final int f44366j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final int f44367k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final int f44368l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final int f44369m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final int[] f44370n;

    /* renamed from: o */
    private int f44371o;

    /* renamed from: p */
    private int f44372p;

    /* renamed from: q */
    private int f44373q = Integer.MAX_VALUE;

    /* renamed from: r */
    private int f44374r = Integer.MIN_VALUE;

    /* renamed from: s */
    private int f44375s = 0;

    /* renamed from: t */
    private int f44376t = 0;

    /* renamed from: u */
    private int f44377u = 0;

    /* renamed from: v */
    private int f44378v = 0;

    /* renamed from: w */
    private int f44379w = 0;

    /* renamed from: x */
    private int f44380x;

    /* renamed from: y */
    private int f44381y;

    /* renamed from: z */
    private int f44382z;

    C8850a3(Class<?> cls, String str, Object[] objArr) {
        this.f44359c = cls;
        C8858b3 b3Var = new C8858b3(str);
        this.f44357a = b3Var;
        this.f44358b = objArr;
        this.f44360d = b3Var.mo36839b();
        int b = b3Var.mo36839b();
        this.f44361e = b;
        int[] iArr = null;
        if (b == 0) {
            this.f44362f = 0;
            this.f44363g = 0;
            this.f44364h = 0;
            this.f44365i = 0;
            this.f44366j = 0;
            this.f44368l = 0;
            this.f44367k = 0;
            this.f44369m = 0;
            this.f44370n = null;
            return;
        }
        int b2 = b3Var.mo36839b();
        this.f44362f = b2;
        int b3 = b3Var.mo36839b();
        this.f44363g = b3;
        this.f44364h = b3Var.mo36839b();
        this.f44365i = b3Var.mo36839b();
        this.f44368l = b3Var.mo36839b();
        this.f44367k = b3Var.mo36839b();
        this.f44366j = b3Var.mo36839b();
        this.f44369m = b3Var.mo36839b();
        int b4 = b3Var.mo36839b();
        this.f44370n = b4 != 0 ? new int[b4] : iArr;
        this.f44371o = (b2 << 1) + b3;
    }

    /* renamed from: c */
    private static Field m41507c(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + name.length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    /* renamed from: f */
    private final Object m41510f() {
        Object[] objArr = this.f44358b;
        int i = this.f44371o;
        this.f44371o = i + 1;
        return objArr[i];
    }

    /* renamed from: i */
    private final boolean m41511i() {
        return (this.f44360d & 1) == 1;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c6, code lost:
        if (m41511i() != false) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0152, code lost:
        if (r1 != false) goto L_0x00c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0159, code lost:
        if (m41511i() != false) goto L_0x00c8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo36814a() {
        /*
            r6 = this;
            com.google.android.gms.internal.clearcut.b3 r0 = r6.f44357a
            boolean r0 = r0.mo36838a()
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            com.google.android.gms.internal.clearcut.b3 r0 = r6.f44357a
            int r0 = r0.mo36839b()
            r6.f44380x = r0
            com.google.android.gms.internal.clearcut.b3 r0 = r6.f44357a
            int r0 = r0.mo36839b()
            r6.f44381y = r0
            r0 = r0 & 255(0xff, float:3.57E-43)
            r6.f44382z = r0
            int r2 = r6.f44380x
            int r3 = r6.f44373q
            if (r2 >= r3) goto L_0x0026
            r6.f44373q = r2
        L_0x0026:
            int r3 = r6.f44374r
            if (r2 <= r3) goto L_0x002c
            r6.f44374r = r2
        L_0x002c:
            com.google.android.gms.internal.clearcut.a1 r2 = com.google.android.gms.internal.clearcut.C8848a1.MAP
            int r3 = r2.mo36812d()
            r4 = 1
            if (r0 != r3) goto L_0x003b
            int r0 = r6.f44375s
            int r0 = r0 + r4
            r6.f44375s = r0
            goto L_0x0054
        L_0x003b:
            int r0 = r6.f44382z
            com.google.android.gms.internal.clearcut.a1 r3 = com.google.android.gms.internal.clearcut.C8848a1.DOUBLE_LIST
            int r3 = r3.mo36812d()
            if (r0 < r3) goto L_0x0054
            int r0 = r6.f44382z
            com.google.android.gms.internal.clearcut.a1 r3 = com.google.android.gms.internal.clearcut.C8848a1.GROUP_LIST
            int r3 = r3.mo36812d()
            if (r0 > r3) goto L_0x0054
            int r0 = r6.f44376t
            int r0 = r0 + r4
            r6.f44376t = r0
        L_0x0054:
            int r0 = r6.f44379w
            int r0 = r0 + r4
            r6.f44379w = r0
            int r3 = r6.f44373q
            int r5 = r6.f44380x
            boolean r0 = com.google.android.gms.internal.clearcut.C8887e3.m41735s(r3, r5, r0)
            if (r0 == 0) goto L_0x006c
            int r0 = r6.f44380x
            int r0 = r0 + r4
            r6.f44378v = r0
            int r3 = r6.f44373q
            int r0 = r0 - r3
            goto L_0x006f
        L_0x006c:
            int r0 = r6.f44377u
            int r0 = r0 + r4
        L_0x006f:
            r6.f44377u = r0
            int r0 = r6.f44381y
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L_0x0079
            r0 = 1
            goto L_0x007a
        L_0x0079:
            r0 = 0
        L_0x007a:
            if (r0 == 0) goto L_0x0088
            int[] r0 = r6.f44370n
            int r3 = r6.f44372p
            int r5 = r3 + 1
            r6.f44372p = r5
            int r5 = r6.f44380x
            r0[r3] = r5
        L_0x0088:
            r0 = 0
            r6.f44354D = r0
            r6.f44355E = r0
            r6.f44356F = r0
            boolean r0 = r6.mo36817k()
            if (r0 == 0) goto L_0x00d8
            com.google.android.gms.internal.clearcut.b3 r0 = r6.f44357a
            int r0 = r0.mo36839b()
            r6.f44351A = r0
            int r0 = r6.f44382z
            com.google.android.gms.internal.clearcut.a1 r1 = com.google.android.gms.internal.clearcut.C8848a1.MESSAGE
            int r1 = r1.mo36812d()
            int r1 = r1 + 51
            if (r0 == r1) goto L_0x00d0
            int r0 = r6.f44382z
            com.google.android.gms.internal.clearcut.a1 r1 = com.google.android.gms.internal.clearcut.C8848a1.GROUP
            int r1 = r1.mo36812d()
            int r1 = r1 + 51
            if (r0 != r1) goto L_0x00b6
            goto L_0x00d0
        L_0x00b6:
            int r0 = r6.f44382z
            com.google.android.gms.internal.clearcut.a1 r1 = com.google.android.gms.internal.clearcut.C8848a1.ENUM
            int r1 = r1.mo36812d()
            int r1 = r1 + 51
            if (r0 != r1) goto L_0x0165
            boolean r0 = r6.m41511i()
            if (r0 == 0) goto L_0x0165
        L_0x00c8:
            java.lang.Object r0 = r6.m41510f()
            r6.f44355E = r0
            goto L_0x0165
        L_0x00d0:
            java.lang.Object r0 = r6.m41510f()
        L_0x00d4:
            r6.f44354D = r0
            goto L_0x0165
        L_0x00d8:
            java.lang.Class<?> r0 = r6.f44359c
            java.lang.Object r3 = r6.m41510f()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.reflect.Field r0 = m41507c(r0, r3)
            r6.f44353C = r0
            boolean r0 = r6.mo36821o()
            if (r0 == 0) goto L_0x00f4
            com.google.android.gms.internal.clearcut.b3 r0 = r6.f44357a
            int r0 = r0.mo36839b()
            r6.f44352B = r0
        L_0x00f4:
            int r0 = r6.f44382z
            com.google.android.gms.internal.clearcut.a1 r3 = com.google.android.gms.internal.clearcut.C8848a1.MESSAGE
            int r3 = r3.mo36812d()
            if (r0 == r3) goto L_0x015d
            int r0 = r6.f44382z
            com.google.android.gms.internal.clearcut.a1 r3 = com.google.android.gms.internal.clearcut.C8848a1.GROUP
            int r3 = r3.mo36812d()
            if (r0 != r3) goto L_0x0109
            goto L_0x015d
        L_0x0109:
            int r0 = r6.f44382z
            com.google.android.gms.internal.clearcut.a1 r3 = com.google.android.gms.internal.clearcut.C8848a1.MESSAGE_LIST
            int r3 = r3.mo36812d()
            if (r0 == r3) goto L_0x00d0
            int r0 = r6.f44382z
            com.google.android.gms.internal.clearcut.a1 r3 = com.google.android.gms.internal.clearcut.C8848a1.GROUP_LIST
            int r3 = r3.mo36812d()
            if (r0 != r3) goto L_0x011e
            goto L_0x00d0
        L_0x011e:
            int r0 = r6.f44382z
            com.google.android.gms.internal.clearcut.a1 r3 = com.google.android.gms.internal.clearcut.C8848a1.ENUM
            int r3 = r3.mo36812d()
            if (r0 == r3) goto L_0x0155
            int r0 = r6.f44382z
            com.google.android.gms.internal.clearcut.a1 r3 = com.google.android.gms.internal.clearcut.C8848a1.ENUM_LIST
            int r3 = r3.mo36812d()
            if (r0 == r3) goto L_0x0155
            int r0 = r6.f44382z
            com.google.android.gms.internal.clearcut.a1 r3 = com.google.android.gms.internal.clearcut.C8848a1.ENUM_LIST_PACKED
            int r3 = r3.mo36812d()
            if (r0 != r3) goto L_0x013d
            goto L_0x0155
        L_0x013d:
            int r0 = r6.f44382z
            int r2 = r2.mo36812d()
            if (r0 != r2) goto L_0x0165
            java.lang.Object r0 = r6.m41510f()
            r6.f44356F = r0
            int r0 = r6.f44381y
            r0 = r0 & 2048(0x800, float:2.87E-42)
            if (r0 == 0) goto L_0x0152
            r1 = 1
        L_0x0152:
            if (r1 == 0) goto L_0x0165
            goto L_0x015b
        L_0x0155:
            boolean r0 = r6.m41511i()
            if (r0 == 0) goto L_0x0165
        L_0x015b:
            goto L_0x00c8
        L_0x015d:
            java.lang.reflect.Field r0 = r6.f44353C
            java.lang.Class r0 = r0.getType()
            goto L_0x00d4
        L_0x0165:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.clearcut.C8850a3.mo36814a():boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final int mo36815g() {
        return this.f44380x;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final int mo36816h() {
        return this.f44382z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final boolean mo36817k() {
        return this.f44382z > C8848a1.MAP.mo36812d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final Field mo36818l() {
        int i = this.f44351A << 1;
        Object obj = this.f44358b[i];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field c = m41507c(this.f44359c, (String) obj);
        this.f44358b[i] = c;
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final Field mo36819m() {
        int i = (this.f44351A << 1) + 1;
        Object obj = this.f44358b[i];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field c = m41507c(this.f44359c, (String) obj);
        this.f44358b[i] = c;
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final Field mo36820n() {
        return this.f44353C;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public final boolean mo36821o() {
        return m41511i() && this.f44382z <= C8848a1.GROUP.mo36812d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final Field mo36822p() {
        int i = (this.f44362f << 1) + (this.f44352B / 32);
        Object obj = this.f44358b[i];
        if (obj instanceof Field) {
            return (Field) obj;
        }
        Field c = m41507c(this.f44359c, (String) obj);
        this.f44358b[i] = c;
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final int mo36823q() {
        return this.f44352B % 32;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final boolean mo36824r() {
        return (this.f44381y & 256) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final boolean mo36825s() {
        return (this.f44381y & 512) != 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final Object mo36826t() {
        return this.f44354D;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final Object mo36827u() {
        return this.f44355E;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final Object mo36828v() {
        return this.f44356F;
    }
}
