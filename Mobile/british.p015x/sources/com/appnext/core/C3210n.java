package com.appnext.core;

/* renamed from: com.appnext.core.n */
public class C3210n {

    /* renamed from: ee */
    private static volatile C3210n f12378ee;

    /* JADX WARNING: Can't wrap try/catch for region: R(5:16|17|(1:19)|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0096 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String m10823a(android.content.Context r12, java.lang.String r13, java.util.HashMap<java.lang.String, java.lang.String> r14, java.lang.String r15) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            java.lang.String r1 = ""
            if (r0 == 0) goto L_0x0009
            return r1
        L_0x0009:
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            java.lang.String r2 = "cache_config"
            if (r0 != 0) goto L_0x0067
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "settingsServerResponsesSettingsName"
            r0.<init>(r3)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "settingsServerResponseAcceptedTimeSettingsName"
            r3.<init>(r4)
            r3.append(r15)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r2)
            r4.append(r15)
            java.lang.String r4 = r4.toString()
            com.appnext.core.m r5 = com.appnext.core.C3209m.m10816l(r12)
            r6 = 0
            int r5 = r5.mo10815a((java.lang.String) r4, (int) r6)
            int r5 = r5 * 60
            r6 = 60000(0xea60, float:8.4078E-41)
            int r5 = r5 * r6
            long r5 = (long) r5
            long r7 = java.lang.System.currentTimeMillis()
            com.appnext.core.m r9 = com.appnext.core.C3209m.m10816l(r12)
            r10 = 0
            long r9 = r9.mo10816a((java.lang.String) r3, (long) r10)
            long r9 = r9 + r5
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 >= 0) goto L_0x006a
            com.appnext.core.m r1 = com.appnext.core.C3209m.m10816l(r12)
            r5 = 0
            java.lang.String r1 = r1.mo10819d(r0, r5)
            goto L_0x006a
        L_0x0067:
            r0 = r1
            r3 = r0
            r4 = r3
        L_0x006a:
            boolean r5 = android.text.TextUtils.isEmpty(r1)
            if (r5 == 0) goto L_0x00a8
            java.lang.String r1 = com.appnext.core.C3198g.m10776a(r12, r13, r14)     // Catch:{ all -> 0x00a8 }
            boolean r13 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x00a8 }
            if (r13 != 0) goto L_0x00a8
            boolean r13 = android.text.TextUtils.isEmpty(r15)     // Catch:{ all -> 0x00a8 }
            if (r13 != 0) goto L_0x00a8
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ all -> 0x0096 }
            r13.<init>(r1)     // Catch:{ all -> 0x0096 }
            boolean r14 = r13.has(r2)     // Catch:{ all -> 0x0096 }
            if (r14 == 0) goto L_0x0096
            com.appnext.core.m r14 = com.appnext.core.C3209m.m10816l(r12)     // Catch:{ all -> 0x0096 }
            int r13 = r13.getInt(r2)     // Catch:{ all -> 0x0096 }
            r14.mo10817b((java.lang.String) r4, (int) r13)     // Catch:{ all -> 0x0096 }
        L_0x0096:
            com.appnext.core.m r13 = com.appnext.core.C3209m.m10816l(r12)     // Catch:{ all -> 0x00a8 }
            r13.mo10820e(r0, r1)     // Catch:{ all -> 0x00a8 }
            com.appnext.core.m r12 = com.appnext.core.C3209m.m10816l(r12)     // Catch:{ all -> 0x00a8 }
            long r13 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00a8 }
            r12.mo10818b((java.lang.String) r3, (long) r13)     // Catch:{ all -> 0x00a8 }
        L_0x00a8:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appnext.core.C3210n.m10823a(android.content.Context, java.lang.String, java.util.HashMap, java.lang.String):java.lang.String");
    }

    /* renamed from: ay */
    public static C3210n m10824ay() {
        if (f12378ee == null) {
            synchronized (C3210n.class) {
                if (f12378ee == null) {
                    f12378ee = new C3210n();
                }
            }
        }
        return f12378ee;
    }
}
