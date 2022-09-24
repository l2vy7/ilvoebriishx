package com.google.android.gms.internal.vision;

import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.vision.h4 */
/* compiled from: com.google.android.gms:play-services-vision-common@@19.1.2 */
final class C9530h4 {
    /* renamed from: a */
    static String m44289a(C9522g4 g4Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        m44290b(g4Var, sb, 0);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01e5, code lost:
        if (((java.lang.Boolean) r6).booleanValue() == false) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01f8, code lost:
        if (((java.lang.Integer) r6).intValue() == 0) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0209, code lost:
        if (((java.lang.Float) r6).floatValue() == 0.0f) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x021b, code lost:
        if (((java.lang.Double) r6).doubleValue() == 0.0d) goto L_0x01e7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x0253  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m44290b(com.google.android.gms.internal.vision.C9522g4 r13, java.lang.StringBuilder r14, int r15) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.TreeSet r2 = new java.util.TreeSet
            r2.<init>()
            java.lang.Class r3 = r13.getClass()
            java.lang.reflect.Method[] r3 = r3.getDeclaredMethods()
            int r4 = r3.length
            r5 = 0
            r6 = 0
        L_0x001a:
            java.lang.String r7 = "get"
            if (r6 >= r4) goto L_0x0049
            r8 = r3[r6]
            java.lang.String r9 = r8.getName()
            r1.put(r9, r8)
            java.lang.Class[] r9 = r8.getParameterTypes()
            int r9 = r9.length
            if (r9 != 0) goto L_0x0046
            java.lang.String r9 = r8.getName()
            r0.put(r9, r8)
            java.lang.String r9 = r8.getName()
            boolean r7 = r9.startsWith(r7)
            if (r7 == 0) goto L_0x0046
            java.lang.String r7 = r8.getName()
            r2.add(r7)
        L_0x0046:
            int r6 = r6 + 1
            goto L_0x001a
        L_0x0049:
            java.util.Iterator r2 = r2.iterator()
        L_0x004d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x026c
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            boolean r4 = r3.startsWith(r7)
            r6 = 3
            if (r4 == 0) goto L_0x0065
            java.lang.String r4 = r3.substring(r6)
            goto L_0x0066
        L_0x0065:
            r4 = r3
        L_0x0066:
            java.lang.String r8 = "List"
            boolean r9 = r4.endsWith(r8)
            r10 = 1
            if (r9 == 0) goto L_0x00ca
            java.lang.String r9 = "OrBuilderList"
            boolean r9 = r4.endsWith(r9)
            if (r9 != 0) goto L_0x00ca
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L_0x00ca
            java.lang.String r8 = r4.substring(r5, r10)
            java.lang.String r8 = r8.toLowerCase()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r9 = r4.length()
            int r9 = r9 + -4
            java.lang.String r9 = r4.substring(r10, r9)
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r11 = r9.length()
            if (r11 == 0) goto L_0x00a2
            java.lang.String r8 = r8.concat(r9)
            goto L_0x00a8
        L_0x00a2:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r8)
            r8 = r9
        L_0x00a8:
            java.lang.Object r9 = r0.get(r3)
            java.lang.reflect.Method r9 = (java.lang.reflect.Method) r9
            if (r9 == 0) goto L_0x00ca
            java.lang.Class r11 = r9.getReturnType()
            java.lang.Class<java.util.List> r12 = java.util.List.class
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L_0x00ca
            java.lang.String r3 = m44292d(r8)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            java.lang.Object r4 = com.google.android.gms.internal.vision.C9643v2.m44626l(r9, r13, r4)
            m44291c(r14, r15, r3, r4)
            goto L_0x004d
        L_0x00ca:
            java.lang.String r8 = "Map"
            boolean r9 = r4.endsWith(r8)
            if (r9 == 0) goto L_0x0136
            boolean r8 = r4.equals(r8)
            if (r8 != 0) goto L_0x0136
            java.lang.String r8 = r4.substring(r5, r10)
            java.lang.String r8 = r8.toLowerCase()
            java.lang.String r8 = java.lang.String.valueOf(r8)
            int r9 = r4.length()
            int r9 = r9 - r6
            java.lang.String r6 = r4.substring(r10, r9)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r9 = r6.length()
            if (r9 == 0) goto L_0x00fc
            java.lang.String r6 = r8.concat(r6)
            goto L_0x0101
        L_0x00fc:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r8)
        L_0x0101:
            java.lang.Object r3 = r0.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L_0x0136
            java.lang.Class r8 = r3.getReturnType()
            java.lang.Class<java.util.Map> r9 = java.util.Map.class
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0136
            java.lang.Class<java.lang.Deprecated> r8 = java.lang.Deprecated.class
            boolean r8 = r3.isAnnotationPresent(r8)
            if (r8 != 0) goto L_0x0136
            int r8 = r3.getModifiers()
            boolean r8 = java.lang.reflect.Modifier.isPublic(r8)
            if (r8 == 0) goto L_0x0136
            java.lang.String r4 = m44292d(r6)
            java.lang.Object[] r6 = new java.lang.Object[r5]
            java.lang.Object r3 = com.google.android.gms.internal.vision.C9643v2.m44626l(r3, r13, r6)
            m44291c(r14, r15, r4, r3)
            goto L_0x004d
        L_0x0136:
            java.lang.String r3 = "set"
            int r6 = r4.length()
            if (r6 == 0) goto L_0x0143
            java.lang.String r3 = r3.concat(r4)
            goto L_0x0149
        L_0x0143:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r3)
            r3 = r6
        L_0x0149:
            java.lang.Object r3 = r1.get(r3)
            java.lang.reflect.Method r3 = (java.lang.reflect.Method) r3
            if (r3 == 0) goto L_0x004d
            java.lang.String r3 = "Bytes"
            boolean r3 = r4.endsWith(r3)
            if (r3 == 0) goto L_0x017d
            int r3 = r4.length()
            int r3 = r3 + -5
            java.lang.String r3 = r4.substring(r5, r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r6 = r3.length()
            if (r6 == 0) goto L_0x0172
            java.lang.String r3 = r7.concat(r3)
            goto L_0x0177
        L_0x0172:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r7)
        L_0x0177:
            boolean r3 = r0.containsKey(r3)
            if (r3 != 0) goto L_0x004d
        L_0x017d:
            java.lang.String r3 = r4.substring(r5, r10)
            java.lang.String r3 = r3.toLowerCase()
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r6 = r4.substring(r10)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            int r8 = r6.length()
            if (r8 == 0) goto L_0x019c
            java.lang.String r3 = r3.concat(r6)
            goto L_0x01a2
        L_0x019c:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r3)
            r3 = r6
        L_0x01a2:
            int r6 = r4.length()
            if (r6 == 0) goto L_0x01ad
            java.lang.String r6 = r7.concat(r4)
            goto L_0x01b2
        L_0x01ad:
            java.lang.String r6 = new java.lang.String
            r6.<init>(r7)
        L_0x01b2:
            java.lang.Object r6 = r0.get(r6)
            java.lang.reflect.Method r6 = (java.lang.reflect.Method) r6
            java.lang.String r8 = "has"
            int r9 = r4.length()
            if (r9 == 0) goto L_0x01c5
            java.lang.String r4 = r8.concat(r4)
            goto L_0x01ca
        L_0x01c5:
            java.lang.String r4 = new java.lang.String
            r4.<init>(r8)
        L_0x01ca:
            java.lang.Object r4 = r0.get(r4)
            java.lang.reflect.Method r4 = (java.lang.reflect.Method) r4
            if (r6 == 0) goto L_0x004d
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r6 = com.google.android.gms.internal.vision.C9643v2.m44626l(r6, r13, r8)
            if (r4 != 0) goto L_0x0255
            boolean r4 = r6 instanceof java.lang.Boolean
            if (r4 == 0) goto L_0x01ed
            r4 = r6
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x01ea
        L_0x01e7:
            r4 = 1
            goto L_0x0250
        L_0x01ea:
            r4 = 0
            goto L_0x0250
        L_0x01ed:
            boolean r4 = r6 instanceof java.lang.Integer
            if (r4 == 0) goto L_0x01fb
            r4 = r6
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 != 0) goto L_0x01ea
            goto L_0x01e7
        L_0x01fb:
            boolean r4 = r6 instanceof java.lang.Float
            if (r4 == 0) goto L_0x020c
            r4 = r6
            java.lang.Float r4 = (java.lang.Float) r4
            float r4 = r4.floatValue()
            r8 = 0
            int r4 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x01ea
            goto L_0x01e7
        L_0x020c:
            boolean r4 = r6 instanceof java.lang.Double
            if (r4 == 0) goto L_0x021e
            r4 = r6
            java.lang.Double r4 = (java.lang.Double) r4
            double r8 = r4.doubleValue()
            r11 = 0
            int r4 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r4 != 0) goto L_0x01ea
            goto L_0x01e7
        L_0x021e:
            boolean r4 = r6 instanceof java.lang.String
            if (r4 == 0) goto L_0x0229
            java.lang.String r4 = ""
            boolean r4 = r6.equals(r4)
            goto L_0x0250
        L_0x0229:
            boolean r4 = r6 instanceof com.google.android.gms.internal.vision.C9552k1
            if (r4 == 0) goto L_0x0234
            com.google.android.gms.internal.vision.k1 r4 = com.google.android.gms.internal.vision.C9552k1.f45714c
            boolean r4 = r6.equals(r4)
            goto L_0x0250
        L_0x0234:
            boolean r4 = r6 instanceof com.google.android.gms.internal.vision.C9522g4
            if (r4 == 0) goto L_0x0242
            r4 = r6
            com.google.android.gms.internal.vision.g4 r4 = (com.google.android.gms.internal.vision.C9522g4) r4
            com.google.android.gms.internal.vision.g4 r4 = r4.mo38425d()
            if (r6 != r4) goto L_0x01ea
            goto L_0x01e7
        L_0x0242:
            boolean r4 = r6 instanceof java.lang.Enum
            if (r4 == 0) goto L_0x01ea
            r4 = r6
            java.lang.Enum r4 = (java.lang.Enum) r4
            int r4 = r4.ordinal()
            if (r4 != 0) goto L_0x01ea
            goto L_0x01e7
        L_0x0250:
            if (r4 != 0) goto L_0x0253
            goto L_0x0261
        L_0x0253:
            r10 = 0
            goto L_0x0261
        L_0x0255:
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Object r4 = com.google.android.gms.internal.vision.C9643v2.m44626l(r4, r13, r8)
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r10 = r4.booleanValue()
        L_0x0261:
            if (r10 == 0) goto L_0x004d
            java.lang.String r3 = m44292d(r3)
            m44291c(r14, r15, r3, r6)
            goto L_0x004d
        L_0x026c:
            boolean r0 = r13 instanceof com.google.android.gms.internal.vision.C9643v2.C9647d
            if (r0 == 0) goto L_0x02ad
            r0 = r13
            com.google.android.gms.internal.vision.v2$d r0 = (com.google.android.gms.internal.vision.C9643v2.C9647d) r0
            com.google.android.gms.internal.vision.k2<com.google.android.gms.internal.vision.v2$c> r0 = r0.zzyg
            java.util.Iterator r0 = r0.mo38473d()
        L_0x0279:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x02ad
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            com.google.android.gms.internal.vision.v2$c r2 = (com.google.android.gms.internal.vision.C9643v2.C9646c) r2
            int r2 = r2.f45910b
            r3 = 13
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "["
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = "]"
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.Object r1 = r1.getValue()
            m44291c(r14, r15, r2, r1)
            goto L_0x0279
        L_0x02ad:
            com.google.android.gms.internal.vision.v2 r13 = (com.google.android.gms.internal.vision.C9643v2) r13
            com.google.android.gms.internal.vision.n5 r13 = r13.zzxz
            if (r13 == 0) goto L_0x02b6
            r13.mo38514c(r14, r15)
        L_0x02b6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.vision.C9530h4.m44290b(com.google.android.gms.internal.vision.g4, java.lang.StringBuilder, int):void");
    }

    /* renamed from: c */
    static final void m44291c(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            for (Object c : (List) obj) {
                m44291c(sb, i, str, c);
            }
        } else if (obj instanceof Map) {
            for (Map.Entry c2 : ((Map) obj).entrySet()) {
                m44291c(sb, i, str, c2);
            }
        } else {
            sb.append(10);
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                sb.append(' ');
            }
            sb.append(str);
            if (obj instanceof String) {
                sb.append(": \"");
                sb.append(C9556k5.m44441a(C9552k1.m44407y((String) obj)));
                sb.append('\"');
            } else if (obj instanceof C9552k1) {
                sb.append(": \"");
                sb.append(C9556k5.m44441a((C9552k1) obj));
                sb.append('\"');
            } else if (obj instanceof C9643v2) {
                sb.append(" {");
                m44290b((C9643v2) obj, sb, i + 2);
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else if (obj instanceof Map.Entry) {
                sb.append(" {");
                Map.Entry entry = (Map.Entry) obj;
                int i4 = i + 2;
                m44291c(sb, i4, "key", entry.getKey());
                m44291c(sb, i4, "value", entry.getValue());
                sb.append("\n");
                while (i2 < i) {
                    sb.append(' ');
                    i2++;
                }
                sb.append("}");
            } else {
                sb.append(": ");
                sb.append(obj.toString());
            }
        }
    }

    /* renamed from: d */
    private static final String m44292d(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(charAt));
        }
        return sb.toString();
    }
}
