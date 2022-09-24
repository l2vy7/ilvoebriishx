package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;
import p255u5.C11050y;

/* renamed from: com.google.android.gms.measurement.internal.p9 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9880p9 extends C9868o8 {

    /* renamed from: d */
    private String f46578d;

    /* renamed from: e */
    private Set f46579e;

    /* renamed from: f */
    private Map f46580f;

    /* renamed from: g */
    private Long f46581g;

    /* renamed from: h */
    private Long f46582h;

    C9880p9(C9958x8 x8Var) {
        super(x8Var);
    }

    /* renamed from: m */
    private final C9825k9 m45266m(Integer num) {
        if (this.f46580f.containsKey(num)) {
            return (C9825k9) this.f46580f.get(num);
        }
        C9825k9 k9Var = new C9825k9(this, this.f46578d, (C11050y) null);
        this.f46580f.put(num, k9Var);
        return k9Var;
    }

    /* renamed from: n */
    private final boolean m45267n(int i, int i2) {
        C9825k9 k9Var = (C9825k9) this.f46580f.get(Integer.valueOf(i));
        if (k9Var == null) {
            return false;
        }
        return k9Var.f46416d.get(i2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo38861k() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0302, code lost:
        if (r5 != null) goto L_0x02d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x072e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x072f, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0731, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0732, code lost:
        r29 = r2;
        r28 = r4;
        r25 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0750, code lost:
        if (r11 != null) goto L_0x071a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x075b, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x090a, code lost:
        if (r13 == null) goto L_0x090d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:403:0x0a36, code lost:
        if (r7 != false) goto L_0x0a41;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0171, code lost:
        if (r5 != null) goto L_0x014f;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x025e  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x03d0  */
    /* JADX WARNING: Removed duplicated region for block: B:227:0x0593  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x072e A[ExcHandler: all (th java.lang.Throwable), Splitter:B:239:0x067b] */
    /* JADX WARNING: Removed duplicated region for block: B:296:0x075b  */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x081d  */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x0915  */
    /* JADX WARNING: Removed duplicated region for block: B:410:0x0a67  */
    /* JADX WARNING: Removed duplicated region for block: B:427:0x0afb  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01b0 A[Catch:{ SQLiteException -> 0x0220 }] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01be A[SYNTHETIC, Splitter:B:65:0x01be] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0249  */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List mo39104l(java.lang.String r66, java.util.List r67, java.util.List r68, java.lang.Long r69, java.lang.Long r70) {
        /*
            r65 = this;
            r10 = r65
            java.lang.String r11 = "current_results"
            com.google.android.gms.common.internal.C4604n.m20094g(r66)
            com.google.android.gms.common.internal.C4604n.m20098k(r67)
            com.google.android.gms.common.internal.C4604n.m20098k(r68)
            r0 = r66
            r10.f46578d = r0
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r10.f46579e = r0
            t.a r0 = new t.a
            r0.<init>()
            r10.f46580f = r0
            r0 = r69
            r10.f46581g = r0
            r0 = r70
            r10.f46582h = r0
            java.util.Iterator r0 = r67.iterator()
        L_0x002b:
            boolean r1 = r0.hasNext()
            r12 = 0
            r13 = 1
            if (r1 == 0) goto L_0x0047
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.measurement.f4 r1 = (com.google.android.gms.internal.measurement.C9143f4) r1
            java.lang.String r1 = r1.mo37555H()
            java.lang.String r2 = "_s"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x002b
            r1 = 1
            goto L_0x0048
        L_0x0047:
            r1 = 0
        L_0x0048:
            com.google.android.gms.internal.measurement.C9427xc.m43850b()
            com.google.android.gms.measurement.internal.h4 r0 = r10.f21269a
            com.google.android.gms.measurement.internal.f r0 = r0.mo19392z()
            java.lang.String r2 = r10.f46578d
            com.google.android.gms.measurement.internal.r2 r3 = com.google.android.gms.measurement.internal.C9903s2.f46674Y
            boolean r14 = r0.mo19337B(r2, r3)
            com.google.android.gms.internal.measurement.C9427xc.m43850b()
            com.google.android.gms.measurement.internal.h4 r0 = r10.f21269a
            com.google.android.gms.measurement.internal.f r0 = r0.mo19392z()
            java.lang.String r2 = r10.f46578d
            com.google.android.gms.measurement.internal.r2 r3 = com.google.android.gms.measurement.internal.C9903s2.f46673X
            boolean r15 = r0.mo19337B(r2, r3)
            if (r1 == 0) goto L_0x00af
            com.google.android.gms.measurement.internal.x8 r0 = r10.f46518b
            com.google.android.gms.measurement.internal.i r2 = r0.mo39280V()
            java.lang.String r3 = r10.f46578d
            r2.mo39090d()
            r2.mo19272b()
            com.google.android.gms.common.internal.C4604n.m20094g(r3)
            android.content.ContentValues r0 = new android.content.ContentValues
            r0.<init>()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r12)
            java.lang.String r5 = "current_session_count"
            r0.put(r5, r4)
            android.database.sqlite.SQLiteDatabase r4 = r2.mo38987P()     // Catch:{ SQLiteException -> 0x009b }
            java.lang.String[] r5 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x009b }
            r5[r12] = r3     // Catch:{ SQLiteException -> 0x009b }
            java.lang.String r6 = "events"
            java.lang.String r7 = "app_id = ?"
            r4.update(r6, r0, r7, r5)     // Catch:{ SQLiteException -> 0x009b }
            goto L_0x00af
        L_0x009b:
            r0 = move-exception
            com.google.android.gms.measurement.internal.h4 r2 = r2.f21269a
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19282q()
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r3)
            java.lang.String r4 = "Error resetting session-scoped event counts. appId"
            r2.mo38858c(r4, r3, r0)
        L_0x00af:
            java.util.Map r0 = java.util.Collections.emptyMap()
            java.lang.String r9 = "Failed to merge filter. appId"
            java.lang.String r8 = "Database error querying filters. appId"
            java.lang.String r7 = "data"
            java.lang.String r6 = "audience_id"
            if (r15 == 0) goto L_0x017a
            if (r14 == 0) goto L_0x017a
            com.google.android.gms.measurement.internal.x8 r0 = r10.f46518b
            com.google.android.gms.measurement.internal.i r2 = r0.mo39280V()
            java.lang.String r3 = r10.f46578d
            com.google.android.gms.common.internal.C4604n.m20094g(r3)
            t.a r4 = new t.a
            r4.<init>()
            android.database.sqlite.SQLiteDatabase r16 = r2.mo38987P()
            java.lang.String[] r18 = new java.lang.String[]{r6, r7}     // Catch:{ SQLiteException -> 0x015a, all -> 0x0157 }
            java.lang.String[] r0 = new java.lang.String[r13]     // Catch:{ SQLiteException -> 0x015a, all -> 0x0157 }
            r0[r12] = r3     // Catch:{ SQLiteException -> 0x015a, all -> 0x0157 }
            java.lang.String r17 = "event_filters"
            java.lang.String r19 = "app_id=?"
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            android.database.Cursor r5 = r16.query(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x015a, all -> 0x0157 }
            boolean r0 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x0155 }
            if (r0 == 0) goto L_0x014b
        L_0x00f1:
            byte[] r0 = r5.getBlob(r13)     // Catch:{ SQLiteException -> 0x0155 }
            com.google.android.gms.internal.measurement.y2 r13 = com.google.android.gms.internal.measurement.C9447z2.m43899B()     // Catch:{ IOException -> 0x012b }
            com.google.android.gms.internal.measurement.v9 r0 = com.google.android.gms.measurement.internal.C9978z8.m45535C(r13, r0)     // Catch:{ IOException -> 0x012b }
            com.google.android.gms.internal.measurement.y2 r0 = (com.google.android.gms.internal.measurement.C9433y2) r0     // Catch:{ IOException -> 0x012b }
            com.google.android.gms.internal.measurement.r8 r0 = r0.mo37840w()     // Catch:{ IOException -> 0x012b }
            com.google.android.gms.internal.measurement.z2 r0 = (com.google.android.gms.internal.measurement.C9447z2) r0     // Catch:{ IOException -> 0x012b }
            boolean r13 = r0.mo38206N()     // Catch:{ SQLiteException -> 0x0155 }
            if (r13 != 0) goto L_0x010c
            goto L_0x013d
        L_0x010c:
            int r13 = r5.getInt(r12)     // Catch:{ SQLiteException -> 0x0155 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ SQLiteException -> 0x0155 }
            java.lang.Object r16 = r4.get(r13)     // Catch:{ SQLiteException -> 0x0155 }
            java.util.List r16 = (java.util.List) r16     // Catch:{ SQLiteException -> 0x0155 }
            if (r16 != 0) goto L_0x0125
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x0155 }
            r12.<init>()     // Catch:{ SQLiteException -> 0x0155 }
            r4.put(r13, r12)     // Catch:{ SQLiteException -> 0x0155 }
            goto L_0x0127
        L_0x0125:
            r12 = r16
        L_0x0127:
            r12.add(r0)     // Catch:{ SQLiteException -> 0x0155 }
            goto L_0x013d
        L_0x012b:
            r0 = move-exception
            com.google.android.gms.measurement.internal.h4 r12 = r2.f21269a     // Catch:{ SQLiteException -> 0x0155 }
            com.google.android.gms.measurement.internal.d3 r12 = r12.mo19276j()     // Catch:{ SQLiteException -> 0x0155 }
            com.google.android.gms.measurement.internal.b3 r12 = r12.mo19282q()     // Catch:{ SQLiteException -> 0x0155 }
            java.lang.Object r13 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r3)     // Catch:{ SQLiteException -> 0x0155 }
            r12.mo38858c(r9, r13, r0)     // Catch:{ SQLiteException -> 0x0155 }
        L_0x013d:
            boolean r0 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x0155 }
            if (r0 != 0) goto L_0x0148
            r5.close()
            r12 = r4
            goto L_0x017b
        L_0x0148:
            r12 = 0
            r13 = 1
            goto L_0x00f1
        L_0x014b:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0155 }
        L_0x014f:
            r5.close()
            goto L_0x017a
        L_0x0153:
            r0 = move-exception
            goto L_0x0174
        L_0x0155:
            r0 = move-exception
            goto L_0x015c
        L_0x0157:
            r0 = move-exception
            r5 = 0
            goto L_0x0174
        L_0x015a:
            r0 = move-exception
            r5 = 0
        L_0x015c:
            com.google.android.gms.measurement.internal.h4 r2 = r2.f21269a     // Catch:{ all -> 0x0153 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()     // Catch:{ all -> 0x0153 }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19282q()     // Catch:{ all -> 0x0153 }
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r3)     // Catch:{ all -> 0x0153 }
            r2.mo38858c(r8, r3, r0)     // Catch:{ all -> 0x0153 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0153 }
            if (r5 == 0) goto L_0x017a
            goto L_0x014f
        L_0x0174:
            if (r5 == 0) goto L_0x0179
            r5.close()
        L_0x0179:
            throw r0
        L_0x017a:
            r12 = r0
        L_0x017b:
            com.google.android.gms.measurement.internal.x8 r0 = r10.f46518b
            com.google.android.gms.measurement.internal.i r2 = r0.mo39280V()
            java.lang.String r3 = r10.f46578d
            r2.mo39090d()
            r2.mo19272b()
            com.google.android.gms.common.internal.C4604n.m20094g(r3)
            android.database.sqlite.SQLiteDatabase r16 = r2.mo38987P()
            java.lang.String[] r18 = new java.lang.String[]{r6, r11}     // Catch:{ SQLiteException -> 0x022a, all -> 0x0226 }
            r4 = 1
            java.lang.String[] r0 = new java.lang.String[r4]     // Catch:{ SQLiteException -> 0x022a, all -> 0x0226 }
            r4 = 0
            r0[r4] = r3     // Catch:{ SQLiteException -> 0x022a, all -> 0x0226 }
            java.lang.String r17 = "audience_filter_values"
            java.lang.String r19 = "app_id=?"
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            android.database.Cursor r4 = r16.query(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x022a, all -> 0x0226 }
            boolean r0 = r4.moveToFirst()     // Catch:{ SQLiteException -> 0x0220 }
            if (r0 != 0) goto L_0x01be
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x0220 }
            r4.close()
            r13 = r0
            r18 = r6
            r19 = r7
            goto L_0x024d
        L_0x01be:
            t.a r5 = new t.a     // Catch:{ SQLiteException -> 0x0220 }
            r5.<init>()     // Catch:{ SQLiteException -> 0x0220 }
        L_0x01c3:
            r13 = 0
            int r16 = r4.getInt(r13)     // Catch:{ SQLiteException -> 0x0220 }
            r13 = 1
            byte[] r0 = r4.getBlob(r13)     // Catch:{ SQLiteException -> 0x0220 }
            com.google.android.gms.internal.measurement.u4 r13 = com.google.android.gms.internal.measurement.C9389v4.m43730F()     // Catch:{ IOException -> 0x01eb }
            com.google.android.gms.internal.measurement.v9 r0 = com.google.android.gms.measurement.internal.C9978z8.m45535C(r13, r0)     // Catch:{ IOException -> 0x01eb }
            com.google.android.gms.internal.measurement.u4 r0 = (com.google.android.gms.internal.measurement.C9374u4) r0     // Catch:{ IOException -> 0x01eb }
            com.google.android.gms.internal.measurement.r8 r0 = r0.mo37840w()     // Catch:{ IOException -> 0x01eb }
            com.google.android.gms.internal.measurement.v4 r0 = (com.google.android.gms.internal.measurement.C9389v4) r0     // Catch:{ IOException -> 0x01eb }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x0220 }
            r5.put(r13, r0)     // Catch:{ SQLiteException -> 0x0220 }
            r17 = r5
            r18 = r6
            r19 = r7
            goto L_0x0209
        L_0x01eb:
            r0 = move-exception
            com.google.android.gms.measurement.internal.h4 r13 = r2.f21269a     // Catch:{ SQLiteException -> 0x0220 }
            com.google.android.gms.measurement.internal.d3 r13 = r13.mo19276j()     // Catch:{ SQLiteException -> 0x0220 }
            com.google.android.gms.measurement.internal.b3 r13 = r13.mo19282q()     // Catch:{ SQLiteException -> 0x0220 }
            r17 = r5
            java.lang.String r5 = "Failed to merge filter results. appId, audienceId, error"
            r18 = r6
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r3)     // Catch:{ SQLiteException -> 0x021e }
            r19 = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x021c }
            r13.mo38859d(r5, r6, r7, r0)     // Catch:{ SQLiteException -> 0x021c }
        L_0x0209:
            boolean r0 = r4.moveToNext()     // Catch:{ SQLiteException -> 0x021c }
            if (r0 != 0) goto L_0x0215
            r4.close()
            r13 = r17
            goto L_0x024d
        L_0x0215:
            r5 = r17
            r6 = r18
            r7 = r19
            goto L_0x01c3
        L_0x021c:
            r0 = move-exception
            goto L_0x0230
        L_0x021e:
            r0 = move-exception
            goto L_0x0223
        L_0x0220:
            r0 = move-exception
            r18 = r6
        L_0x0223:
            r19 = r7
            goto L_0x0230
        L_0x0226:
            r0 = move-exception
            r5 = 0
            goto L_0x0af9
        L_0x022a:
            r0 = move-exception
            r18 = r6
            r19 = r7
            r4 = 0
        L_0x0230:
            com.google.android.gms.measurement.internal.h4 r2 = r2.f21269a     // Catch:{ all -> 0x0af7 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()     // Catch:{ all -> 0x0af7 }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19282q()     // Catch:{ all -> 0x0af7 }
            java.lang.String r5 = "Database error querying filter results. appId"
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r3)     // Catch:{ all -> 0x0af7 }
            r2.mo38858c(r5, r3, r0)     // Catch:{ all -> 0x0af7 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0af7 }
            if (r4 == 0) goto L_0x024c
            r4.close()
        L_0x024c:
            r13 = r0
        L_0x024d:
            boolean r0 = r13.isEmpty()
            r7 = 2
            if (r0 == 0) goto L_0x025e
        L_0x0254:
            r12 = r8
            r30 = r9
            r28 = r18
            r29 = r19
            r13 = 0
            goto L_0x0587
        L_0x025e:
            java.util.HashSet r2 = new java.util.HashSet
            java.util.Set r0 = r13.keySet()
            r2.<init>(r0)
            if (r1 == 0) goto L_0x03d4
            java.lang.String r1 = r10.f46578d
            com.google.android.gms.common.internal.C4604n.m20094g(r1)
            com.google.android.gms.common.internal.C4604n.m20098k(r13)
            t.a r3 = new t.a
            r3.<init>()
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L_0x027e
            goto L_0x03cc
        L_0x027e:
            com.google.android.gms.measurement.internal.x8 r0 = r10.f46518b
            com.google.android.gms.measurement.internal.i r4 = r0.mo39280V()
            r4.mo39090d()
            r4.mo19272b()
            com.google.android.gms.common.internal.C4604n.m20094g(r1)
            t.a r0 = new t.a
            r0.<init>()
            android.database.sqlite.SQLiteDatabase r5 = r4.mo38987P()
            java.lang.String[] r6 = new java.lang.String[r7]     // Catch:{ SQLiteException -> 0x02e9, all -> 0x02e5 }
            r16 = 0
            r6[r16] = r1     // Catch:{ SQLiteException -> 0x02e9, all -> 0x02e5 }
            r16 = 1
            r6[r16] = r1     // Catch:{ SQLiteException -> 0x02e9, all -> 0x02e5 }
            java.lang.String r7 = "select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;"
            android.database.Cursor r5 = r5.rawQuery(r7, r6)     // Catch:{ SQLiteException -> 0x02e9, all -> 0x02e5 }
            boolean r6 = r5.moveToFirst()     // Catch:{ SQLiteException -> 0x02e3 }
            if (r6 == 0) goto L_0x02db
        L_0x02ac:
            r6 = 0
            int r7 = r5.getInt(r6)     // Catch:{ SQLiteException -> 0x02e3 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)     // Catch:{ SQLiteException -> 0x02e3 }
            java.lang.Object r7 = r0.get(r6)     // Catch:{ SQLiteException -> 0x02e3 }
            java.util.List r7 = (java.util.List) r7     // Catch:{ SQLiteException -> 0x02e3 }
            if (r7 != 0) goto L_0x02c5
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x02e3 }
            r7.<init>()     // Catch:{ SQLiteException -> 0x02e3 }
            r0.put(r6, r7)     // Catch:{ SQLiteException -> 0x02e3 }
        L_0x02c5:
            r6 = 1
            int r17 = r5.getInt(r6)     // Catch:{ SQLiteException -> 0x02e3 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r17)     // Catch:{ SQLiteException -> 0x02e3 }
            r7.add(r6)     // Catch:{ SQLiteException -> 0x02e3 }
            boolean r6 = r5.moveToNext()     // Catch:{ SQLiteException -> 0x02e3 }
            if (r6 != 0) goto L_0x02ac
        L_0x02d7:
            r5.close()
            goto L_0x0305
        L_0x02db:
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x02e3 }
            goto L_0x02d7
        L_0x02e0:
            r0 = move-exception
            goto L_0x03ce
        L_0x02e3:
            r0 = move-exception
            goto L_0x02eb
        L_0x02e5:
            r0 = move-exception
            r5 = 0
            goto L_0x03ce
        L_0x02e9:
            r0 = move-exception
            r5 = 0
        L_0x02eb:
            com.google.android.gms.measurement.internal.h4 r4 = r4.f21269a     // Catch:{ all -> 0x02e0 }
            com.google.android.gms.measurement.internal.d3 r4 = r4.mo19276j()     // Catch:{ all -> 0x02e0 }
            com.google.android.gms.measurement.internal.b3 r4 = r4.mo19282q()     // Catch:{ all -> 0x02e0 }
            java.lang.String r6 = "Database error querying scoped filters. appId"
            java.lang.Object r1 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r1)     // Catch:{ all -> 0x02e0 }
            r4.mo38858c(r6, r1, r0)     // Catch:{ all -> 0x02e0 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x02e0 }
            if (r5 == 0) goto L_0x0305
            goto L_0x02d7
        L_0x0305:
            java.util.Set r1 = r13.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x030d:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x03cc
            java.lang.Object r4 = r1.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.lang.Object r6 = r13.get(r5)
            com.google.android.gms.internal.measurement.v4 r6 = (com.google.android.gms.internal.measurement.C9389v4) r6
            java.lang.Object r7 = r0.get(r5)
            java.util.List r7 = (java.util.List) r7
            if (r7 == 0) goto L_0x03bf
            boolean r17 = r7.isEmpty()
            if (r17 == 0) goto L_0x0337
            goto L_0x03bf
        L_0x0337:
            com.google.android.gms.measurement.internal.x8 r5 = r10.f46518b
            com.google.android.gms.measurement.internal.z8 r5 = r5.mo39292f0()
            r17 = r0
            java.util.List r0 = r6.mo38109K()
            java.util.List r0 = r5.mo39345G(r0, r7)
            boolean r5 = r0.isEmpty()
            if (r5 != 0) goto L_0x03bb
            com.google.android.gms.internal.measurement.o8 r5 = r6.mo37997q()
            com.google.android.gms.internal.measurement.u4 r5 = (com.google.android.gms.internal.measurement.C9374u4) r5
            r5.mo38091J()
            r5.mo38088C(r0)
            com.google.android.gms.measurement.internal.x8 r0 = r10.f46518b
            com.google.android.gms.measurement.internal.z8 r0 = r0.mo39292f0()
            r20 = r1
            java.util.List r1 = r6.mo38111M()
            java.util.List r0 = r0.mo39345G(r1, r7)
            r5.mo38092K()
            r5.mo38090I(r0)
            r0 = 0
        L_0x0370:
            int r1 = r6.mo38112z()
            if (r0 >= r1) goto L_0x038e
            com.google.android.gms.internal.measurement.d4 r1 = r6.mo38106D(r0)
            int r1 = r1.mo37500z()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r7.contains(r1)
            if (r1 == 0) goto L_0x038b
            r5.mo38093L(r0)
        L_0x038b:
            int r0 = r0 + 1
            goto L_0x0370
        L_0x038e:
            r0 = 0
        L_0x038f:
            int r1 = r6.mo38104B()
            if (r0 >= r1) goto L_0x03ad
            com.google.android.gms.internal.measurement.x4 r1 = r6.mo38107I(r0)
            int r1 = r1.mo38143A()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            boolean r1 = r7.contains(r1)
            if (r1 == 0) goto L_0x03aa
            r5.mo38094M(r0)
        L_0x03aa:
            int r0 = r0 + 1
            goto L_0x038f
        L_0x03ad:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            com.google.android.gms.internal.measurement.r8 r1 = r5.mo37840w()
            com.google.android.gms.internal.measurement.v4 r1 = (com.google.android.gms.internal.measurement.C9389v4) r1
            r3.put(r0, r1)
            goto L_0x03c6
        L_0x03bb:
            r0 = r17
            goto L_0x030d
        L_0x03bf:
            r17 = r0
            r20 = r1
            r3.put(r5, r6)
        L_0x03c6:
            r0 = r17
            r1 = r20
            goto L_0x030d
        L_0x03cc:
            r0 = r3
            goto L_0x03d5
        L_0x03ce:
            if (r5 == 0) goto L_0x03d3
            r5.close()
        L_0x03d3:
            throw r0
        L_0x03d4:
            r0 = r13
        L_0x03d5:
            java.util.Iterator r17 = r2.iterator()
        L_0x03d9:
            boolean r1 = r17.hasNext()
            if (r1 == 0) goto L_0x0254
            java.lang.Object r1 = r17.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r20 = r1.intValue()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r20)
            java.lang.Object r1 = r0.get(r1)
            com.google.android.gms.internal.measurement.v4 r1 = (com.google.android.gms.internal.measurement.C9389v4) r1
            java.util.BitSet r5 = new java.util.BitSet
            r5.<init>()
            java.util.BitSet r6 = new java.util.BitSet
            r6.<init>()
            t.a r7 = new t.a
            r7.<init>()
            if (r1 == 0) goto L_0x0441
            int r2 = r1.mo38112z()
            if (r2 != 0) goto L_0x040b
            goto L_0x0441
        L_0x040b:
            java.util.List r2 = r1.mo38108J()
            java.util.Iterator r2 = r2.iterator()
        L_0x0413:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0441
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.d4 r3 = (com.google.android.gms.internal.measurement.C9112d4) r3
            boolean r4 = r3.mo37499H()
            if (r4 == 0) goto L_0x0413
            int r4 = r3.mo37500z()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r21 = r3.mo37498G()
            if (r21 == 0) goto L_0x043c
            long r21 = r3.mo37497A()
            java.lang.Long r3 = java.lang.Long.valueOf(r21)
            goto L_0x043d
        L_0x043c:
            r3 = 0
        L_0x043d:
            r7.put(r4, r3)
            goto L_0x0413
        L_0x0441:
            t.a r4 = new t.a
            r4.<init>()
            if (r1 == 0) goto L_0x0491
            int r2 = r1.mo38104B()
            if (r2 != 0) goto L_0x044f
            goto L_0x0491
        L_0x044f:
            java.util.List r2 = r1.mo38110L()
            java.util.Iterator r2 = r2.iterator()
        L_0x0457:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0491
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.x4 r3 = (com.google.android.gms.internal.measurement.C9420x4) r3
            boolean r21 = r3.mo38146I()
            if (r21 == 0) goto L_0x0457
            int r21 = r3.mo38147z()
            if (r21 <= 0) goto L_0x0457
            int r21 = r3.mo38143A()
            r22 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)
            int r21 = r3.mo38147z()
            r23 = r2
            int r2 = r21 + -1
            long r2 = r3.mo38144B(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r4.put(r0, r2)
            r0 = r22
            r2 = r23
            goto L_0x0457
        L_0x0491:
            r22 = r0
            if (r1 == 0) goto L_0x04e6
            r0 = 0
        L_0x0496:
            int r2 = r1.mo38105C()
            int r2 = r2 * 64
            if (r0 >= r2) goto L_0x04e6
            java.util.List r2 = r1.mo38111M()
            boolean r2 = com.google.android.gms.measurement.internal.C9978z8.m45537L(r2, r0)
            if (r2 == 0) goto L_0x04d4
            com.google.android.gms.measurement.internal.h4 r2 = r10.f21269a
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19286v()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r20)
            r21 = r8
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r23 = r9
            java.lang.String r9 = "Filter already evaluated. audience ID, filter ID"
            r2.mo38858c(r9, r3, r8)
            r6.set(r0)
            java.util.List r2 = r1.mo38109K()
            boolean r2 = com.google.android.gms.measurement.internal.C9978z8.m45537L(r2, r0)
            if (r2 == 0) goto L_0x04d8
            r5.set(r0)
            goto L_0x04df
        L_0x04d4:
            r21 = r8
            r23 = r9
        L_0x04d8:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r7.remove(r2)
        L_0x04df:
            int r0 = r0 + 1
            r8 = r21
            r9 = r23
            goto L_0x0496
        L_0x04e6:
            r21 = r8
            r23 = r9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r20)
            java.lang.Object r1 = r13.get(r0)
            r8 = r1
            com.google.android.gms.internal.measurement.v4 r8 = (com.google.android.gms.internal.measurement.C9389v4) r8
            if (r15 == 0) goto L_0x0555
            if (r14 == 0) goto L_0x0555
            java.lang.Object r0 = r12.get(r0)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x0555
            java.lang.Long r1 = r10.f46582h
            if (r1 == 0) goto L_0x0555
            java.lang.Long r1 = r10.f46581g
            if (r1 != 0) goto L_0x050a
            goto L_0x0555
        L_0x050a:
            java.util.Iterator r0 = r0.iterator()
        L_0x050e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0555
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.measurement.z2 r1 = (com.google.android.gms.internal.measurement.C9447z2) r1
            int r2 = r1.mo38198A()
            java.lang.Long r3 = r10.f46582h
            long r24 = r3.longValue()
            r26 = 1000(0x3e8, double:4.94E-321)
            long r24 = r24 / r26
            boolean r1 = r1.mo38204L()
            if (r1 == 0) goto L_0x0536
            java.lang.Long r1 = r10.f46581g
            long r24 = r1.longValue()
            long r24 = r24 / r26
        L_0x0536:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            boolean r2 = r7.containsKey(r1)
            if (r2 == 0) goto L_0x0547
            java.lang.Long r2 = java.lang.Long.valueOf(r24)
            r7.put(r1, r2)
        L_0x0547:
            boolean r2 = r4.containsKey(r1)
            if (r2 == 0) goto L_0x050e
            java.lang.Long r2 = java.lang.Long.valueOf(r24)
            r4.put(r1, r2)
            goto L_0x050e
        L_0x0555:
            com.google.android.gms.measurement.internal.k9 r0 = new com.google.android.gms.measurement.internal.k9
            java.lang.String r3 = r10.f46578d
            r9 = 0
            r1 = r0
            r2 = r65
            r24 = r4
            r4 = r8
            r8 = 0
            r28 = r18
            r29 = r19
            r16 = r12
            r66 = r13
            r12 = r21
            r13 = r8
            r8 = r24
            r30 = r23
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            java.util.Map r1 = r10.f46580f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)
            r1.put(r2, r0)
            r13 = r66
            r8 = r12
            r12 = r16
            r0 = r22
            r9 = r30
            goto L_0x03d9
        L_0x0587:
            boolean r0 = r67.isEmpty()
            java.lang.String r1 = "Skipping failed audience ID"
            if (r0 == 0) goto L_0x0593
        L_0x058f:
            r25 = r11
            goto L_0x0813
        L_0x0593:
            com.google.android.gms.measurement.internal.l9 r2 = new com.google.android.gms.measurement.internal.l9
            r2.<init>(r10, r13)
            t.a r3 = new t.a
            r3.<init>()
            java.util.Iterator r4 = r67.iterator()
        L_0x05a1:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x058f
            java.lang.Object r0 = r4.next()
            com.google.android.gms.internal.measurement.f4 r0 = (com.google.android.gms.internal.measurement.C9143f4) r0
            java.lang.String r5 = r10.f46578d
            com.google.android.gms.internal.measurement.f4 r5 = r2.mo39056a(r5, r0)
            if (r5 == 0) goto L_0x0810
            com.google.android.gms.measurement.internal.x8 r6 = r10.f46518b
            com.google.android.gms.measurement.internal.i r6 = r6.mo39280V()
            java.lang.String r7 = r10.f46578d
            java.lang.String r8 = r5.mo37555H()
            java.lang.String r9 = r0.mo37555H()
            com.google.android.gms.measurement.internal.o r9 = r6.mo38993V(r7, r9)
            if (r9 != 0) goto L_0x060a
            com.google.android.gms.measurement.internal.h4 r9 = r6.f21269a
            com.google.android.gms.measurement.internal.d3 r9 = r9.mo19276j()
            com.google.android.gms.measurement.internal.b3 r9 = r9.mo19287w()
            java.lang.Object r14 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r7)
            com.google.android.gms.measurement.internal.h4 r6 = r6.f21269a
            com.google.android.gms.measurement.internal.y2 r6 = r6.mo19363D()
            java.lang.String r6 = r6.mo39320d(r8)
            java.lang.String r8 = "Event aggregate wasn't created during raw event logging. appId, event"
            r9.mo38858c(r8, r14, r6)
            com.google.android.gms.measurement.internal.o r6 = new com.google.android.gms.measurement.internal.o
            r31 = r6
            java.lang.String r33 = r0.mo37555H()
            r34 = 1
            r36 = 1
            r38 = 1
            long r40 = r0.mo37553C()
            r42 = 0
            r44 = 0
            r45 = 0
            r46 = 0
            r47 = 0
            r32 = r7
            r31.<init>(r32, r33, r34, r36, r38, r40, r42, r44, r45, r46, r47)
            goto L_0x063f
        L_0x060a:
            com.google.android.gms.measurement.internal.o r6 = new com.google.android.gms.measurement.internal.o
            r48 = r6
            java.lang.String r0 = r9.f46525a
            r49 = r0
            java.lang.String r0 = r9.f46526b
            r50 = r0
            long r7 = r9.f46527c
            r14 = 1
            long r51 = r7 + r14
            long r7 = r9.f46528d
            long r53 = r7 + r14
            long r7 = r9.f46529e
            long r55 = r7 + r14
            long r7 = r9.f46530f
            r57 = r7
            long r7 = r9.f46531g
            r59 = r7
            java.lang.Long r0 = r9.f46532h
            r61 = r0
            java.lang.Long r0 = r9.f46533i
            r62 = r0
            java.lang.Long r0 = r9.f46534j
            r63 = r0
            java.lang.Boolean r0 = r9.f46535k
            r64 = r0
            r48.<init>(r49, r50, r51, r53, r55, r57, r59, r61, r62, r63, r64)
        L_0x063f:
            com.google.android.gms.measurement.internal.x8 r0 = r10.f46518b
            com.google.android.gms.measurement.internal.i r0 = r0.mo39280V()
            r0.mo39009p(r6)
            long r7 = r6.f46527c
            java.lang.String r9 = r5.mo37555H()
            java.lang.Object r0 = r3.get(r9)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x075f
            com.google.android.gms.measurement.internal.x8 r0 = r10.f46518b
            com.google.android.gms.measurement.internal.i r14 = r0.mo39280V()
            java.lang.String r15 = r10.f46578d
            r14.mo39090d()
            r14.mo19272b()
            com.google.android.gms.common.internal.C4604n.m20094g(r15)
            com.google.android.gms.common.internal.C4604n.m20094g(r9)
            t.a r13 = new t.a
            r13.<init>()
            android.database.sqlite.SQLiteDatabase r16 = r14.mo38987P()
            r24 = r2
            r67 = r4
            r4 = r28
            r2 = r29
            java.lang.String[] r18 = new java.lang.String[]{r4, r2}     // Catch:{ SQLiteException -> 0x0731, all -> 0x072e }
            r25 = r11
            r11 = 2
            java.lang.String[] r0 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x0728, all -> 0x072e }
            r17 = 0
            r0[r17] = r15     // Catch:{ SQLiteException -> 0x0728, all -> 0x072e }
            r17 = 1
            r0[r17] = r9     // Catch:{ SQLiteException -> 0x0728, all -> 0x072e }
            java.lang.String r17 = "event_filters"
            java.lang.String r19 = "app_id=? AND event_name=?"
            r21 = 0
            r22 = 0
            r23 = 0
            r20 = r0
            android.database.Cursor r11 = r16.query(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ SQLiteException -> 0x0728, all -> 0x072e }
            boolean r0 = r11.moveToFirst()     // Catch:{ SQLiteException -> 0x0720 }
            if (r0 == 0) goto L_0x0710
            r29 = r2
        L_0x06a4:
            r2 = 1
            byte[] r0 = r11.getBlob(r2)     // Catch:{ SQLiteException -> 0x070e }
            com.google.android.gms.internal.measurement.y2 r2 = com.google.android.gms.internal.measurement.C9447z2.m43899B()     // Catch:{ IOException -> 0x06e1 }
            com.google.android.gms.internal.measurement.v9 r0 = com.google.android.gms.measurement.internal.C9978z8.m45535C(r2, r0)     // Catch:{ IOException -> 0x06e1 }
            com.google.android.gms.internal.measurement.y2 r0 = (com.google.android.gms.internal.measurement.C9433y2) r0     // Catch:{ IOException -> 0x06e1 }
            com.google.android.gms.internal.measurement.r8 r0 = r0.mo37840w()     // Catch:{ IOException -> 0x06e1 }
            com.google.android.gms.internal.measurement.z2 r0 = (com.google.android.gms.internal.measurement.C9447z2) r0     // Catch:{ IOException -> 0x06e1 }
            r2 = 0
            int r16 = r11.getInt(r2)     // Catch:{ SQLiteException -> 0x070e }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x070e }
            java.lang.Object r16 = r13.get(r2)     // Catch:{ SQLiteException -> 0x070e }
            java.util.List r16 = (java.util.List) r16     // Catch:{ SQLiteException -> 0x070e }
            if (r16 != 0) goto L_0x06d5
            r28 = r4
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x070c }
            r4.<init>()     // Catch:{ SQLiteException -> 0x070c }
            r13.put(r2, r4)     // Catch:{ SQLiteException -> 0x070c }
            goto L_0x06d9
        L_0x06d5:
            r28 = r4
            r4 = r16
        L_0x06d9:
            r4.add(r0)     // Catch:{ SQLiteException -> 0x070c }
            r16 = r13
            r13 = r30
            goto L_0x06f9
        L_0x06e1:
            r0 = move-exception
            r28 = r4
            com.google.android.gms.measurement.internal.h4 r2 = r14.f21269a     // Catch:{ SQLiteException -> 0x070c }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()     // Catch:{ SQLiteException -> 0x070c }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19282q()     // Catch:{ SQLiteException -> 0x070c }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r15)     // Catch:{ SQLiteException -> 0x070c }
            r16 = r13
            r13 = r30
            r2.mo38858c(r13, r4, r0)     // Catch:{ SQLiteException -> 0x071e }
        L_0x06f9:
            boolean r0 = r11.moveToNext()     // Catch:{ SQLiteException -> 0x071e }
            if (r0 != 0) goto L_0x0705
            r11.close()
            r0 = r16
            goto L_0x0753
        L_0x0705:
            r30 = r13
            r13 = r16
            r4 = r28
            goto L_0x06a4
        L_0x070c:
            r0 = move-exception
            goto L_0x0725
        L_0x070e:
            r0 = move-exception
            goto L_0x0723
        L_0x0710:
            r29 = r2
            r28 = r4
            r13 = r30
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x071e }
        L_0x071a:
            r11.close()
            goto L_0x0753
        L_0x071e:
            r0 = move-exception
            goto L_0x073b
        L_0x0720:
            r0 = move-exception
            r29 = r2
        L_0x0723:
            r28 = r4
        L_0x0725:
            r13 = r30
            goto L_0x073b
        L_0x0728:
            r0 = move-exception
            r29 = r2
            r28 = r4
            goto L_0x0738
        L_0x072e:
            r0 = move-exception
            r5 = 0
            goto L_0x0759
        L_0x0731:
            r0 = move-exception
            r29 = r2
            r28 = r4
            r25 = r11
        L_0x0738:
            r13 = r30
            r11 = 0
        L_0x073b:
            com.google.android.gms.measurement.internal.h4 r2 = r14.f21269a     // Catch:{ all -> 0x0757 }
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()     // Catch:{ all -> 0x0757 }
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19282q()     // Catch:{ all -> 0x0757 }
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r15)     // Catch:{ all -> 0x0757 }
            r2.mo38858c(r12, r4, r0)     // Catch:{ all -> 0x0757 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0757 }
            if (r11 == 0) goto L_0x0753
            goto L_0x071a
        L_0x0753:
            r3.put(r9, r0)
            goto L_0x0767
        L_0x0757:
            r0 = move-exception
            r5 = r11
        L_0x0759:
            if (r5 == 0) goto L_0x075e
            r5.close()
        L_0x075e:
            throw r0
        L_0x075f:
            r24 = r2
            r67 = r4
            r25 = r11
            r13 = r30
        L_0x0767:
            java.util.Set r2 = r0.keySet()
            java.util.Iterator r2 = r2.iterator()
        L_0x076f:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x0808
            java.lang.Object r4 = r2.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            java.util.Set r9 = r10.f46579e
            java.lang.Integer r11 = java.lang.Integer.valueOf(r4)
            boolean r9 = r9.contains(r11)
            if (r9 == 0) goto L_0x0799
            com.google.android.gms.measurement.internal.h4 r4 = r10.f21269a
            com.google.android.gms.measurement.internal.d3 r4 = r4.mo19276j()
            com.google.android.gms.measurement.internal.b3 r4 = r4.mo19286v()
            r4.mo38857b(r1, r11)
            goto L_0x076f
        L_0x0799:
            java.lang.Object r9 = r0.get(r11)
            java.util.List r9 = (java.util.List) r9
            java.util.Iterator r9 = r9.iterator()
            r11 = 1
        L_0x07a4:
            boolean r14 = r9.hasNext()
            if (r14 == 0) goto L_0x07f3
            java.lang.Object r11 = r9.next()
            com.google.android.gms.internal.measurement.z2 r11 = (com.google.android.gms.internal.measurement.C9447z2) r11
            com.google.android.gms.measurement.internal.m9 r15 = new com.google.android.gms.measurement.internal.m9
            java.lang.String r14 = r10.f46578d
            r15.<init>(r10, r14, r4, r11)
            java.lang.Long r14 = r10.f46581g
            r22 = r0
            java.lang.Long r0 = r10.f46582h
            int r11 = r11.mo38198A()
            boolean r21 = r10.m45267n(r4, r11)
            r11 = r14
            r14 = r15
            r23 = r2
            r2 = r15
            r15 = r11
            r16 = r0
            r17 = r5
            r18 = r7
            r20 = r6
            boolean r11 = r14.mo39072k(r15, r16, r17, r18, r20, r21)
            if (r11 == 0) goto L_0x07e9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            com.google.android.gms.measurement.internal.k9 r0 = r10.m45266m(r0)
            r0.mo39047c(r2)
            r0 = r22
            r2 = r23
            goto L_0x07a4
        L_0x07e9:
            java.util.Set r0 = r10.f46579e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0.add(r2)
            goto L_0x07f7
        L_0x07f3:
            r22 = r0
            r23 = r2
        L_0x07f7:
            if (r11 != 0) goto L_0x0802
            java.util.Set r0 = r10.f46579e
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            r0.add(r2)
        L_0x0802:
            r0 = r22
            r2 = r23
            goto L_0x076f
        L_0x0808:
            r4 = r67
            r30 = r13
            r2 = r24
            r11 = r25
        L_0x0810:
            r13 = 0
            goto L_0x05a1
        L_0x0813:
            boolean r0 = r68.isEmpty()
            if (r0 == 0) goto L_0x081d
        L_0x0819:
            r11 = r28
            goto L_0x0a4d
        L_0x081d:
            t.a r2 = new t.a
            r2.<init>()
            java.util.Iterator r3 = r68.iterator()
        L_0x0826:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0819
            java.lang.Object r0 = r3.next()
            r4 = r0
            com.google.android.gms.internal.measurement.z4 r4 = (com.google.android.gms.internal.measurement.C9449z4) r4
            java.lang.String r5 = r4.mo38212F()
            java.lang.Object r0 = r2.get(r5)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x0919
            com.google.android.gms.measurement.internal.x8 r0 = r10.f46518b
            com.google.android.gms.measurement.internal.i r6 = r0.mo39280V()
            java.lang.String r7 = r10.f46578d
            r6.mo39090d()
            r6.mo19272b()
            com.google.android.gms.common.internal.C4604n.m20094g(r7)
            com.google.android.gms.common.internal.C4604n.m20094g(r5)
            t.a r8 = new t.a
            r8.<init>()
            android.database.sqlite.SQLiteDatabase r13 = r6.mo38987P()
            r11 = r28
            r9 = r29
            java.lang.String[] r15 = new java.lang.String[]{r11, r9}     // Catch:{ SQLiteException -> 0x08f1, all -> 0x08ee }
            r14 = 2
            java.lang.String[] r0 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x08f1, all -> 0x08ee }
            r14 = 0
            r0[r14] = r7     // Catch:{ SQLiteException -> 0x08f1, all -> 0x08ee }
            r14 = 1
            r0[r14] = r5     // Catch:{ SQLiteException -> 0x08f1, all -> 0x08ee }
            java.lang.String r14 = "property_filters"
            java.lang.String r16 = "app_id=? AND property_name=?"
            r18 = 0
            r19 = 0
            r20 = 0
            r17 = r0
            android.database.Cursor r13 = r13.query(r14, r15, r16, r17, r18, r19, r20)     // Catch:{ SQLiteException -> 0x08f1, all -> 0x08ee }
            boolean r0 = r13.moveToFirst()     // Catch:{ SQLiteException -> 0x08ea }
            if (r0 == 0) goto L_0x08de
        L_0x0883:
            r14 = 1
            byte[] r0 = r13.getBlob(r14)     // Catch:{ SQLiteException -> 0x08ea }
            com.google.android.gms.internal.measurement.h3 r15 = com.google.android.gms.internal.measurement.C9188i3.m43008B()     // Catch:{ IOException -> 0x08ba }
            com.google.android.gms.internal.measurement.v9 r0 = com.google.android.gms.measurement.internal.C9978z8.m45535C(r15, r0)     // Catch:{ IOException -> 0x08ba }
            com.google.android.gms.internal.measurement.h3 r0 = (com.google.android.gms.internal.measurement.C9173h3) r0     // Catch:{ IOException -> 0x08ba }
            com.google.android.gms.internal.measurement.r8 r0 = r0.mo37840w()     // Catch:{ IOException -> 0x08ba }
            com.google.android.gms.internal.measurement.i3 r0 = (com.google.android.gms.internal.measurement.C9188i3) r0     // Catch:{ IOException -> 0x08ba }
            r15 = 0
            int r16 = r13.getInt(r15)     // Catch:{ SQLiteException -> 0x08ea }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r16)     // Catch:{ SQLiteException -> 0x08ea }
            java.lang.Object r16 = r8.get(r14)     // Catch:{ SQLiteException -> 0x08ea }
            java.util.List r16 = (java.util.List) r16     // Catch:{ SQLiteException -> 0x08ea }
            if (r16 != 0) goto L_0x08b2
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ SQLiteException -> 0x08ea }
            r15.<init>()     // Catch:{ SQLiteException -> 0x08ea }
            r8.put(r14, r15)     // Catch:{ SQLiteException -> 0x08ea }
            goto L_0x08b4
        L_0x08b2:
            r15 = r16
        L_0x08b4:
            r15.add(r0)     // Catch:{ SQLiteException -> 0x08ea }
            r67 = r3
            goto L_0x08d0
        L_0x08ba:
            r0 = move-exception
            com.google.android.gms.measurement.internal.h4 r14 = r6.f21269a     // Catch:{ SQLiteException -> 0x08ea }
            com.google.android.gms.measurement.internal.d3 r14 = r14.mo19276j()     // Catch:{ SQLiteException -> 0x08ea }
            com.google.android.gms.measurement.internal.b3 r14 = r14.mo19282q()     // Catch:{ SQLiteException -> 0x08ea }
            java.lang.String r15 = "Failed to merge filter"
            r67 = r3
            java.lang.Object r3 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r7)     // Catch:{ SQLiteException -> 0x08e8 }
            r14.mo38858c(r15, r3, r0)     // Catch:{ SQLiteException -> 0x08e8 }
        L_0x08d0:
            boolean r0 = r13.moveToNext()     // Catch:{ SQLiteException -> 0x08e8 }
            if (r0 != 0) goto L_0x08db
            r13.close()
            r0 = r8
            goto L_0x090d
        L_0x08db:
            r3 = r67
            goto L_0x0883
        L_0x08de:
            r67 = r3
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ SQLiteException -> 0x08e8 }
        L_0x08e4:
            r13.close()
            goto L_0x090d
        L_0x08e8:
            r0 = move-exception
            goto L_0x08f5
        L_0x08ea:
            r0 = move-exception
            r67 = r3
            goto L_0x08f5
        L_0x08ee:
            r0 = move-exception
            r5 = 0
            goto L_0x0913
        L_0x08f1:
            r0 = move-exception
            r67 = r3
            r13 = 0
        L_0x08f5:
            com.google.android.gms.measurement.internal.h4 r3 = r6.f21269a     // Catch:{ all -> 0x0911 }
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo19276j()     // Catch:{ all -> 0x0911 }
            com.google.android.gms.measurement.internal.b3 r3 = r3.mo19282q()     // Catch:{ all -> 0x0911 }
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r7)     // Catch:{ all -> 0x0911 }
            r3.mo38858c(r12, r6, r0)     // Catch:{ all -> 0x0911 }
            java.util.Map r0 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0911 }
            if (r13 == 0) goto L_0x090d
            goto L_0x08e4
        L_0x090d:
            r2.put(r5, r0)
            goto L_0x091f
        L_0x0911:
            r0 = move-exception
            r5 = r13
        L_0x0913:
            if (r5 == 0) goto L_0x0918
            r5.close()
        L_0x0918:
            throw r0
        L_0x0919:
            r67 = r3
            r11 = r28
            r9 = r29
        L_0x091f:
            java.util.Set r3 = r0.keySet()
            java.util.Iterator r3 = r3.iterator()
        L_0x0927:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x0a45
            java.lang.Object r5 = r3.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.util.Set r6 = r10.f46579e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L_0x0952
            com.google.android.gms.measurement.internal.h4 r0 = r10.f21269a
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19286v()
            r0.mo38857b(r1, r7)
            goto L_0x0a45
        L_0x0952:
            java.lang.Object r6 = r0.get(r7)
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r6 = r6.iterator()
            r7 = 1
        L_0x095d:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L_0x0a34
            java.lang.Object r7 = r6.next()
            com.google.android.gms.internal.measurement.i3 r7 = (com.google.android.gms.internal.measurement.C9188i3) r7
            com.google.android.gms.measurement.internal.h4 r8 = r10.f21269a
            com.google.android.gms.measurement.internal.d3 r8 = r8.mo19276j()
            java.lang.String r8 = r8.mo19278C()
            r13 = 2
            boolean r8 = android.util.Log.isLoggable(r8, r13)
            if (r8 == 0) goto L_0x09c7
            com.google.android.gms.measurement.internal.h4 r8 = r10.f21269a
            com.google.android.gms.measurement.internal.d3 r8 = r8.mo19276j()
            com.google.android.gms.measurement.internal.b3 r8 = r8.mo19286v()
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
            boolean r15 = r7.mo37629J()
            if (r15 == 0) goto L_0x0997
            int r15 = r7.mo37631z()
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)
            goto L_0x0998
        L_0x0997:
            r15 = 0
        L_0x0998:
            com.google.android.gms.measurement.internal.h4 r13 = r10.f21269a
            com.google.android.gms.measurement.internal.y2 r13 = r13.mo19363D()
            r68 = r0
            java.lang.String r0 = r7.mo37625D()
            java.lang.String r0 = r13.mo39322f(r0)
            java.lang.String r13 = "Evaluating filter. audience, filter, property"
            r8.mo38859d(r13, r14, r15, r0)
            com.google.android.gms.measurement.internal.h4 r0 = r10.f21269a
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19286v()
            com.google.android.gms.measurement.internal.x8 r8 = r10.f46518b
            com.google.android.gms.measurement.internal.z8 r8 = r8.mo39292f0()
            java.lang.String r8 = r8.mo39344F(r7)
            java.lang.String r13 = "Filter definition"
            r0.mo38857b(r13, r8)
            goto L_0x09c9
        L_0x09c7:
            r68 = r0
        L_0x09c9:
            boolean r0 = r7.mo37629J()
            if (r0 == 0) goto L_0x0a0a
            int r0 = r7.mo37631z()
            r8 = 256(0x100, float:3.59E-43)
            if (r0 <= r8) goto L_0x09d8
            goto L_0x0a0a
        L_0x09d8:
            com.google.android.gms.measurement.internal.o9 r0 = new com.google.android.gms.measurement.internal.o9
            java.lang.String r8 = r10.f46578d
            r0.<init>(r10, r8, r5, r7)
            java.lang.Long r8 = r10.f46581g
            java.lang.Long r13 = r10.f46582h
            int r7 = r7.mo37631z()
            boolean r7 = r10.m45267n(r5, r7)
            boolean r7 = r0.mo39093k(r8, r13, r4, r7)
            if (r7 == 0) goto L_0x0a00
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            com.google.android.gms.measurement.internal.k9 r8 = r10.m45266m(r8)
            r8.mo39047c(r0)
            r0 = r68
            goto L_0x095d
        L_0x0a00:
            java.util.Set r0 = r10.f46579e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            r0.add(r6)
            goto L_0x0a36
        L_0x0a0a:
            com.google.android.gms.measurement.internal.h4 r0 = r10.f21269a
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19287w()
            java.lang.String r6 = r10.f46578d
            java.lang.Object r6 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r6)
            boolean r8 = r7.mo37629J()
            if (r8 == 0) goto L_0x0a29
            int r7 = r7.mo37631z()
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            goto L_0x0a2a
        L_0x0a29:
            r7 = 0
        L_0x0a2a:
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r8 = "Invalid property filter ID. appId, id"
            r0.mo38858c(r8, r6, r7)
            goto L_0x0a38
        L_0x0a34:
            r68 = r0
        L_0x0a36:
            if (r7 != 0) goto L_0x0a41
        L_0x0a38:
            java.util.Set r0 = r10.f46579e
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.add(r5)
        L_0x0a41:
            r0 = r68
            goto L_0x0927
        L_0x0a45:
            r3 = r67
            r29 = r9
            r28 = r11
            goto L_0x0826
        L_0x0a4d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Map r0 = r10.f46580f
            java.util.Set r0 = r0.keySet()
            java.util.Set r2 = r10.f46579e
            r0.removeAll(r2)
            java.util.Iterator r2 = r0.iterator()
        L_0x0a61:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0af6
            java.lang.Object r0 = r2.next()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            java.util.Map r3 = r10.f46580f
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            java.lang.Object r3 = r3.get(r4)
            com.google.android.gms.measurement.internal.k9 r3 = (com.google.android.gms.measurement.internal.C9825k9) r3
            com.google.android.gms.common.internal.C4604n.m20098k(r3)
            com.google.android.gms.internal.measurement.b4 r0 = r3.mo39046a(r0)
            r1.add(r0)
            com.google.android.gms.measurement.internal.x8 r3 = r10.f46518b
            com.google.android.gms.measurement.internal.i r3 = r3.mo39280V()
            java.lang.String r5 = r10.f46578d
            com.google.android.gms.internal.measurement.v4 r0 = r0.mo37394C()
            r3.mo39090d()
            r3.mo19272b()
            com.google.android.gms.common.internal.C4604n.m20094g(r5)
            com.google.android.gms.common.internal.C4604n.m20098k(r0)
            byte[] r0 = r0.mo37404l()
            android.content.ContentValues r6 = new android.content.ContentValues
            r6.<init>()
            java.lang.String r7 = "app_id"
            r6.put(r7, r5)
            r6.put(r11, r4)
            r4 = r25
            r6.put(r4, r0)
            android.database.sqlite.SQLiteDatabase r0 = r3.mo38987P()     // Catch:{ SQLiteException -> 0x0add }
            java.lang.String r7 = "audience_filter_values"
            r8 = 5
            r9 = 0
            long r6 = r0.insertWithOnConflict(r7, r9, r6, r8)     // Catch:{ SQLiteException -> 0x0adb }
            r12 = -1
            int r0 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0af2
            com.google.android.gms.measurement.internal.h4 r0 = r3.f21269a     // Catch:{ SQLiteException -> 0x0adb }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()     // Catch:{ SQLiteException -> 0x0adb }
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19282q()     // Catch:{ SQLiteException -> 0x0adb }
            java.lang.String r6 = "Failed to insert filter results (got -1). appId"
            java.lang.Object r7 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r5)     // Catch:{ SQLiteException -> 0x0adb }
            r0.mo38857b(r6, r7)     // Catch:{ SQLiteException -> 0x0adb }
            goto L_0x0af2
        L_0x0adb:
            r0 = move-exception
            goto L_0x0adf
        L_0x0add:
            r0 = move-exception
            r9 = 0
        L_0x0adf:
            com.google.android.gms.measurement.internal.h4 r3 = r3.f21269a
            com.google.android.gms.measurement.internal.d3 r3 = r3.mo19276j()
            com.google.android.gms.measurement.internal.b3 r3 = r3.mo19282q()
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r5)
            java.lang.String r6 = "Error storing filter results. appId"
            r3.mo38858c(r6, r5, r0)
        L_0x0af2:
            r25 = r4
            goto L_0x0a61
        L_0x0af6:
            return r1
        L_0x0af7:
            r0 = move-exception
            r5 = r4
        L_0x0af9:
            if (r5 == 0) goto L_0x0afe
            r5.close()
        L_0x0afe:
            goto L_0x0b00
        L_0x0aff:
            throw r0
        L_0x0b00:
            goto L_0x0aff
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9880p9.mo39104l(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }
}
