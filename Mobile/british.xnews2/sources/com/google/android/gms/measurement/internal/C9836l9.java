package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.C9143f4;
import p255u5.C11051z;

/* renamed from: com.google.android.gms.measurement.internal.l9 */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
final class C9836l9 {

    /* renamed from: a */
    private C9143f4 f46445a;

    /* renamed from: b */
    private Long f46446b;

    /* renamed from: c */
    private long f46447c;

    /* renamed from: d */
    final /* synthetic */ C9880p9 f46448d;

    /* synthetic */ C9836l9(C9880p9 p9Var, C11051z zVar) {
        this.f46448d = p9Var;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: java.lang.String} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fa, code lost:
        if (r14 == null) goto L_0x00ff;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01e2  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.measurement.C9143f4 mo39056a(java.lang.String r18, com.google.android.gms.internal.measurement.C9143f4 r19) {
        /*
            r17 = this;
            r1 = r17
            r3 = r18
            r8 = r19
            java.lang.String r0 = r19.mo37555H()
            java.util.List r9 = r19.mo37556I()
            com.google.android.gms.measurement.internal.p9 r2 = r1.f46448d
            com.google.android.gms.measurement.internal.x8 r2 = r2.f46518b
            r2.mo39292f0()
            java.lang.String r2 = "_eid"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C9978z8.m45542n(r8, r2)
            java.lang.Long r4 = (java.lang.Long) r4
            if (r4 == 0) goto L_0x0233
            java.lang.String r5 = "_ep"
            boolean r5 = r0.equals(r5)
            r6 = 0
            if (r5 == 0) goto L_0x01e6
            com.google.android.gms.common.internal.C4604n.m20098k(r4)
            com.google.android.gms.measurement.internal.p9 r0 = r1.f46448d
            com.google.android.gms.measurement.internal.x8 r0 = r0.f46518b
            r0.mo39292f0()
            java.lang.String r0 = "_en"
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C9978z8.m45542n(r8, r0)
            r10 = r0
            java.lang.String r10 = (java.lang.String) r10
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            r5 = 0
            if (r0 == 0) goto L_0x0055
            com.google.android.gms.measurement.internal.p9 r0 = r1.f46448d
            com.google.android.gms.measurement.internal.h4 r0 = r0.f21269a
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19284t()
            java.lang.String r2 = "Extra parameter without an event name. eventId"
            r0.mo38857b(r2, r4)
            return r5
        L_0x0055:
            com.google.android.gms.internal.measurement.f4 r0 = r1.f46445a
            r11 = 1
            r12 = 0
            if (r0 == 0) goto L_0x006d
            java.lang.Long r0 = r1.f46446b
            if (r0 == 0) goto L_0x006d
            long r13 = r4.longValue()
            java.lang.Long r0 = r1.f46446b
            long r15 = r0.longValue()
            int r0 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x0127
        L_0x006d:
            com.google.android.gms.measurement.internal.p9 r0 = r1.f46448d
            com.google.android.gms.measurement.internal.x8 r0 = r0.f46518b
            com.google.android.gms.measurement.internal.i r13 = r0.mo39280V()
            r13.mo19272b()
            r13.mo39090d()
            android.database.sqlite.SQLiteDatabase r0 = r13.mo38987P()     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            r14 = 2
            java.lang.String[] r14 = new java.lang.String[r14]     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            r14[r12] = r3     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            java.lang.String r15 = r4.toString()     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            r14[r11] = r15     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            java.lang.String r15 = "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
            android.database.Cursor r14 = r0.rawQuery(r15, r14)     // Catch:{ SQLiteException -> 0x00e9, all -> 0x00e5 }
            boolean r0 = r14.moveToFirst()     // Catch:{ SQLiteException -> 0x00e3 }
            if (r0 != 0) goto L_0x00aa
            com.google.android.gms.measurement.internal.h4 r0 = r13.f21269a     // Catch:{ SQLiteException -> 0x00e3 }
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()     // Catch:{ SQLiteException -> 0x00e3 }
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19286v()     // Catch:{ SQLiteException -> 0x00e3 }
            java.lang.String r15 = "Main event not found"
            r0.mo38856a(r15)     // Catch:{ SQLiteException -> 0x00e3 }
            r14.close()
            r0 = r5
            goto L_0x0100
        L_0x00aa:
            byte[] r0 = r14.getBlob(r12)     // Catch:{ SQLiteException -> 0x00e3 }
            long r15 = r14.getLong(r11)     // Catch:{ SQLiteException -> 0x00e3 }
            java.lang.Long r15 = java.lang.Long.valueOf(r15)     // Catch:{ SQLiteException -> 0x00e3 }
            com.google.android.gms.internal.measurement.e4 r5 = com.google.android.gms.internal.measurement.C9143f4.m42844D()     // Catch:{ IOException -> 0x00ce }
            com.google.android.gms.internal.measurement.v9 r0 = com.google.android.gms.measurement.internal.C9978z8.m45535C(r5, r0)     // Catch:{ IOException -> 0x00ce }
            com.google.android.gms.internal.measurement.e4 r0 = (com.google.android.gms.internal.measurement.C9128e4) r0     // Catch:{ IOException -> 0x00ce }
            com.google.android.gms.internal.measurement.r8 r0 = r0.mo37840w()     // Catch:{ IOException -> 0x00ce }
            com.google.android.gms.internal.measurement.f4 r0 = (com.google.android.gms.internal.measurement.C9143f4) r0     // Catch:{ IOException -> 0x00ce }
            android.util.Pair r0 = android.util.Pair.create(r0, r15)     // Catch:{ SQLiteException -> 0x00e3 }
            r14.close()
            goto L_0x0100
        L_0x00ce:
            r0 = move-exception
            com.google.android.gms.measurement.internal.h4 r5 = r13.f21269a     // Catch:{ SQLiteException -> 0x00e3 }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo19276j()     // Catch:{ SQLiteException -> 0x00e3 }
            com.google.android.gms.measurement.internal.b3 r5 = r5.mo19282q()     // Catch:{ SQLiteException -> 0x00e3 }
            java.lang.String r15 = "Failed to merge main event. appId, eventId"
            java.lang.Object r12 = com.google.android.gms.measurement.internal.C4667d3.m21474z(r18)     // Catch:{ SQLiteException -> 0x00e3 }
            r5.mo38859d(r15, r12, r4, r0)     // Catch:{ SQLiteException -> 0x00e3 }
            goto L_0x00fc
        L_0x00e3:
            r0 = move-exception
            goto L_0x00eb
        L_0x00e5:
            r0 = move-exception
            r5 = 0
            goto L_0x01e0
        L_0x00e9:
            r0 = move-exception
            r14 = 0
        L_0x00eb:
            com.google.android.gms.measurement.internal.h4 r5 = r13.f21269a     // Catch:{ all -> 0x01de }
            com.google.android.gms.measurement.internal.d3 r5 = r5.mo19276j()     // Catch:{ all -> 0x01de }
            com.google.android.gms.measurement.internal.b3 r5 = r5.mo19282q()     // Catch:{ all -> 0x01de }
            java.lang.String r12 = "Error selecting main event"
            r5.mo38857b(r12, r0)     // Catch:{ all -> 0x01de }
            if (r14 == 0) goto L_0x00ff
        L_0x00fc:
            r14.close()
        L_0x00ff:
            r0 = 0
        L_0x0100:
            if (r0 == 0) goto L_0x01cb
            java.lang.Object r5 = r0.first
            if (r5 != 0) goto L_0x0108
            goto L_0x01cb
        L_0x0108:
            com.google.android.gms.internal.measurement.f4 r5 = (com.google.android.gms.internal.measurement.C9143f4) r5
            r1.f46445a = r5
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r12 = r0.longValue()
            r1.f46447c = r12
            com.google.android.gms.measurement.internal.p9 r0 = r1.f46448d
            com.google.android.gms.measurement.internal.x8 r0 = r0.f46518b
            r0.mo39292f0()
            com.google.android.gms.internal.measurement.f4 r0 = r1.f46445a
            java.lang.Object r0 = com.google.android.gms.measurement.internal.C9978z8.m45542n(r0, r2)
            java.lang.Long r0 = (java.lang.Long) r0
            r1.f46446b = r0
        L_0x0127:
            long r12 = r1.f46447c
            r14 = -1
            long r12 = r12 + r14
            r1.f46447c = r12
            int r0 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r0 > 0) goto L_0x016c
            com.google.android.gms.measurement.internal.p9 r0 = r1.f46448d
            com.google.android.gms.measurement.internal.x8 r0 = r0.f46518b
            com.google.android.gms.measurement.internal.i r2 = r0.mo39280V()
            r2.mo19272b()
            com.google.android.gms.measurement.internal.h4 r0 = r2.f21269a
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19286v()
            java.lang.String r4 = "Clearing complex main event info. appId"
            r0.mo38857b(r4, r3)
            android.database.sqlite.SQLiteDatabase r0 = r2.mo38987P()     // Catch:{ SQLiteException -> 0x015b }
            java.lang.String[] r4 = new java.lang.String[r11]     // Catch:{ SQLiteException -> 0x015b }
            r5 = 0
            r4[r5] = r3     // Catch:{ SQLiteException -> 0x015b }
            java.lang.String r3 = "delete from main_event_params where app_id=?"
            r0.execSQL(r3, r4)     // Catch:{ SQLiteException -> 0x015b }
            goto L_0x017d
        L_0x015b:
            r0 = move-exception
            com.google.android.gms.measurement.internal.h4 r2 = r2.f21269a
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19282q()
            java.lang.String r3 = "Error clearing complex main event"
            r2.mo38857b(r3, r0)
            goto L_0x017d
        L_0x016c:
            com.google.android.gms.measurement.internal.p9 r0 = r1.f46448d
            com.google.android.gms.measurement.internal.x8 r0 = r0.f46518b
            com.google.android.gms.measurement.internal.i r2 = r0.mo39280V()
            long r5 = r1.f46447c
            com.google.android.gms.internal.measurement.f4 r7 = r1.f46445a
            r3 = r18
            r2.mo39014v(r3, r4, r5, r7)
        L_0x017d:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.google.android.gms.internal.measurement.f4 r2 = r1.f46445a
            java.util.List r2 = r2.mo37556I()
            java.util.Iterator r2 = r2.iterator()
        L_0x018c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x01ad
            java.lang.Object r3 = r2.next()
            com.google.android.gms.internal.measurement.j4 r3 = (com.google.android.gms.internal.measurement.C9204j4) r3
            com.google.android.gms.measurement.internal.p9 r4 = r1.f46448d
            com.google.android.gms.measurement.internal.x8 r4 = r4.f46518b
            r4.mo39292f0()
            java.lang.String r4 = r3.mo37664G()
            com.google.android.gms.internal.measurement.j4 r4 = com.google.android.gms.measurement.internal.C9978z8.m45541m(r8, r4)
            if (r4 != 0) goto L_0x018c
            r0.add(r3)
            goto L_0x018c
        L_0x01ad:
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x01b8
            r0.addAll(r9)
            r9 = r0
            goto L_0x01c9
        L_0x01b8:
            com.google.android.gms.measurement.internal.p9 r0 = r1.f46448d
            com.google.android.gms.measurement.internal.h4 r0 = r0.f21269a
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19284t()
            java.lang.String r2 = "No unique parameters in main event. eventName"
            r0.mo38857b(r2, r10)
        L_0x01c9:
            r0 = r10
            goto L_0x0233
        L_0x01cb:
            com.google.android.gms.measurement.internal.p9 r0 = r1.f46448d
            com.google.android.gms.measurement.internal.h4 r0 = r0.f21269a
            com.google.android.gms.measurement.internal.d3 r0 = r0.mo19276j()
            com.google.android.gms.measurement.internal.b3 r0 = r0.mo19284t()
            java.lang.String r2 = "Extra parameter without existing main event. eventName, eventId"
            r0.mo38858c(r2, r10, r4)
            r2 = 0
            return r2
        L_0x01de:
            r0 = move-exception
            r5 = r14
        L_0x01e0:
            if (r5 == 0) goto L_0x01e5
            r5.close()
        L_0x01e5:
            throw r0
        L_0x01e6:
            r1.f46446b = r4
            r1.f46445a = r8
            com.google.android.gms.measurement.internal.p9 r2 = r1.f46448d
            com.google.android.gms.measurement.internal.x8 r2 = r2.f46518b
            r2.mo39292f0()
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
            java.lang.String r5 = "_epc"
            java.lang.Object r5 = com.google.android.gms.measurement.internal.C9978z8.m45542n(r8, r5)
            if (r5 == 0) goto L_0x01fe
            r2 = r5
        L_0x01fe:
            java.lang.Long r2 = (java.lang.Long) r2
            long r10 = r2.longValue()
            r1.f46447c = r10
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x021c
            com.google.android.gms.measurement.internal.p9 r2 = r1.f46448d
            com.google.android.gms.measurement.internal.h4 r2 = r2.f21269a
            com.google.android.gms.measurement.internal.d3 r2 = r2.mo19276j()
            com.google.android.gms.measurement.internal.b3 r2 = r2.mo19284t()
            java.lang.String r3 = "Complex event with zero extra param count. eventName"
            r2.mo38857b(r3, r0)
            goto L_0x0233
        L_0x021c:
            com.google.android.gms.measurement.internal.p9 r2 = r1.f46448d
            com.google.android.gms.measurement.internal.x8 r2 = r2.f46518b
            com.google.android.gms.measurement.internal.i r2 = r2.mo39280V()
            java.lang.Object r4 = com.google.android.gms.common.internal.C4604n.m20098k(r4)
            java.lang.Long r4 = (java.lang.Long) r4
            long r5 = r1.f46447c
            r3 = r18
            r7 = r19
            r2.mo39014v(r3, r4, r5, r7)
        L_0x0233:
            com.google.android.gms.internal.measurement.o8 r2 = r19.mo37997q()
            com.google.android.gms.internal.measurement.e4 r2 = (com.google.android.gms.internal.measurement.C9128e4) r2
            r2.mo37529N(r0)
            r2.mo37527L()
            r2.mo37524I(r9)
            com.google.android.gms.internal.measurement.r8 r0 = r2.mo37840w()
            com.google.android.gms.internal.measurement.f4 r0 = (com.google.android.gms.internal.measurement.C9143f4) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C9836l9.mo39056a(java.lang.String, com.google.android.gms.internal.measurement.f4):com.google.android.gms.internal.measurement.f4");
    }
}
