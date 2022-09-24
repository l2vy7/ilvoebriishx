package com.startapp;

import android.content.Context;
import android.content.SharedPreferences;
import com.startapp.sdk.adsbase.remoteconfig.NetworkDiagnosticConfig;
import java.util.concurrent.Executor;

/* renamed from: com.startapp.a7 */
/* compiled from: Sta */
public class C11781a7 {

    /* renamed from: a */
    public final SharedPreferences f52573a;

    /* renamed from: b */
    public final C11824c7 f52574b;

    /* renamed from: c */
    public final Executor f52575c;

    /* renamed from: d */
    public final C12462z2<NetworkDiagnosticConfig> f52576d;

    /* renamed from: e */
    public final Runnable f52577e = new C11782a();

    /* renamed from: f */
    public final C11956i4 f52578f = new C11783b();

    /* renamed from: com.startapp.a7$a */
    /* compiled from: Sta */
    public class C11782a implements Runnable {
        public C11782a() {
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: long} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: com.startapp.a7} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v14, resolved type: com.startapp.a7} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: com.startapp.a7} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0127 A[Catch:{ all -> 0x0130 }] */
        /* JADX WARNING: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r25 = this;
                java.lang.String r0 = ";"
                r1 = r25
                com.startapp.a7 r2 = com.startapp.C11781a7.this
                com.startapp.sdk.adsbase.remoteconfig.NetworkDiagnosticConfig r3 = r2.mo45135a()
                if (r3 != 0) goto L_0x000e
                goto L_0x0137
            L_0x000e:
                android.content.SharedPreferences r4 = r2.f52573a
                r5 = 0
                java.lang.String r7 = "181bb7005f9db75a"
                long r4 = r4.getLong(r7, r5)
                int r6 = r3.mo46372c()
                r8 = 60000(0xea60, float:8.4078E-41)
                int r6 = r6 * r8
                long r8 = (long) r6
                long r4 = r4 + r8
                long r8 = java.lang.System.currentTimeMillis()
                int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r6 > 0) goto L_0x0137
                r4 = 0
                r5 = 2
                com.startapp.c7 r6 = r2.f52574b     // Catch:{ all -> 0x011e }
                android.database.sqlite.SQLiteDatabase r6 = r6.mo45465a()     // Catch:{ all -> 0x011e }
                r10 = 1
                java.lang.String[] r11 = new java.lang.String[r10]     // Catch:{ all -> 0x011e }
                java.lang.String r12 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x011e }
                r13 = 0
                r11[r13] = r12     // Catch:{ all -> 0x011e }
                java.lang.String r12 = "SELECT requestId, statusId, requests.value AS request, statuses.value AS status, COUNT(*), MIN(durationNanos), MAX(durationNanos), AVG(durationNanos), MIN(timeMillis) FROM traces JOIN requests ON requests.id = traces.requestId JOIN statuses ON statuses.id = traces.statusId WHERE timeMillis < ? GROUP BY requestId, statusId"
                android.database.Cursor r4 = r6.rawQuery(r12, r11)     // Catch:{ all -> 0x011e }
                if (r4 == 0) goto L_0x011b
            L_0x0045:
                boolean r6 = r4.moveToNext()     // Catch:{ all -> 0x011e }
                if (r6 == 0) goto L_0x0105
                long r11 = r4.getLong(r13)     // Catch:{ all -> 0x011e }
                long r14 = r4.getLong(r10)     // Catch:{ all -> 0x011e }
                java.lang.String r6 = r4.getString(r5)     // Catch:{ all -> 0x011e }
                r10 = 3
                java.lang.String r10 = r4.getString(r10)     // Catch:{ all -> 0x011e }
                r13 = 4
                r16 = r6
                long r5 = r4.getLong(r13)     // Catch:{ all -> 0x011e }
                int r13 = r3.mo46371b()     // Catch:{ all -> 0x011e }
                r17 = r2
                long r1 = (long) r13
                int r13 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r13 >= 0) goto L_0x0076
                r1 = r25
                r2 = r17
                r5 = 2
                r10 = 1
                r13 = 0
                goto L_0x0045
            L_0x0076:
                r1 = 5
                long r1 = r4.getLong(r1)     // Catch:{ all -> 0x0101 }
                r13 = 6
                r18 = r14
                long r13 = r4.getLong(r13)     // Catch:{ all -> 0x0101 }
                r15 = 7
                r20 = r11
                r12 = r10
                long r10 = r4.getLong(r15)     // Catch:{ all -> 0x0101 }
                r15 = 8
                r22 = r7
                r23 = r8
                long r7 = r4.getLong(r15)     // Catch:{ all -> 0x0101 }
                java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x0101 }
                r9.<init>()     // Catch:{ all -> 0x0101 }
                r9.append(r5)     // Catch:{ all -> 0x0101 }
                r9.append(r0)     // Catch:{ all -> 0x0101 }
                r9.append(r1)     // Catch:{ all -> 0x0101 }
                r9.append(r0)     // Catch:{ all -> 0x0101 }
                r9.append(r13)     // Catch:{ all -> 0x0101 }
                r9.append(r0)     // Catch:{ all -> 0x0101 }
                r9.append(r10)     // Catch:{ all -> 0x0101 }
                r9.append(r0)     // Catch:{ all -> 0x0101 }
                r9.append(r7)     // Catch:{ all -> 0x0101 }
                r9.append(r0)     // Catch:{ all -> 0x0101 }
                r1 = r23
                r9.append(r1)     // Catch:{ all -> 0x0101 }
                java.lang.String r5 = r9.toString()     // Catch:{ all -> 0x0101 }
                com.startapp.d4 r6 = new com.startapp.d4     // Catch:{ all -> 0x0101 }
                com.startapp.e4 r7 = com.startapp.C11882e4.f52891j     // Catch:{ all -> 0x0101 }
                r6.<init>((com.startapp.C11882e4) r7)     // Catch:{ all -> 0x0101 }
                java.lang.Long r7 = java.lang.Long.valueOf(r1)     // Catch:{ all -> 0x0101 }
                r6.f22130h = r7     // Catch:{ all -> 0x0101 }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x0101 }
                r7.<init>()     // Catch:{ all -> 0x0101 }
                r8 = r20
                r7.append(r8)     // Catch:{ all -> 0x0101 }
                java.lang.String r8 = ","
                r7.append(r8)     // Catch:{ all -> 0x0101 }
                r8 = r18
                r7.append(r8)     // Catch:{ all -> 0x0101 }
                java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x0101 }
                r6.f22133k = r7     // Catch:{ all -> 0x0101 }
                r7 = r16
                r6.f22131i = r7     // Catch:{ all -> 0x0101 }
                r6.f22126d = r12     // Catch:{ all -> 0x0101 }
                r6.f22127e = r5     // Catch:{ all -> 0x0101 }
                r5 = r17
                com.startapp.i4 r7 = r5.f52578f     // Catch:{ all -> 0x0119 }
                r6.mo20662a((com.startapp.C11956i4) r7)     // Catch:{ all -> 0x0119 }
                r8 = r1
                r2 = r5
                r7 = r22
                r5 = 2
                r10 = 1
                r13 = 0
                r1 = r25
                goto L_0x0045
            L_0x0101:
                r0 = move-exception
                r5 = r17
                goto L_0x0120
            L_0x0105:
                r5 = r2
                r22 = r7
                r1 = r8
                android.content.SharedPreferences r0 = r5.f52573a     // Catch:{ all -> 0x0119 }
                android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0119 }
                r3 = r22
                android.content.SharedPreferences$Editor r0 = r0.putLong(r3, r1)     // Catch:{ all -> 0x0119 }
                r0.commit()     // Catch:{ all -> 0x0119 }
                goto L_0x011b
            L_0x0119:
                r0 = move-exception
                goto L_0x0120
            L_0x011b:
                if (r4 == 0) goto L_0x0137
                goto L_0x012c
            L_0x011e:
                r0 = move-exception
                r5 = r2
            L_0x0120:
                r1 = 2
                boolean r1 = r5.mo45136a(r1)     // Catch:{ all -> 0x0130 }
                if (r1 == 0) goto L_0x012a
                com.startapp.C5004d4.m22887a((java.lang.Throwable) r0)     // Catch:{ all -> 0x0130 }
            L_0x012a:
                if (r4 == 0) goto L_0x0137
            L_0x012c:
                r4.close()
                goto L_0x0137
            L_0x0130:
                r0 = move-exception
                if (r4 == 0) goto L_0x0136
                r4.close()
            L_0x0136:
                throw r0
            L_0x0137:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.C11781a7.C11782a.run():void");
        }
    }

    /* renamed from: com.startapp.a7$b */
    /* compiled from: Sta */
    public class C11783b implements C11956i4 {

        /* renamed from: com.startapp.a7$b$a */
        /* compiled from: Sta */
        public class C11784a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C5004d4 f52581a;

            public C11784a(C5004d4 d4Var) {
                this.f52581a = d4Var;
            }

            public void run() {
                C11785c cVar;
                C11781a7 a7Var = C11781a7.this;
                C5004d4 d4Var = this.f52581a;
                a7Var.getClass();
                Long l = d4Var.f22130h;
                String str = d4Var.f22133k;
                if (str != null) {
                    String[] split = str.split(",");
                    if (!(split.length != 2 || split[0] == null || split[1] == null)) {
                        try {
                            cVar = new C11785c(Long.parseLong(split[0]), Long.parseLong(split[1]));
                        } catch (NumberFormatException unused) {
                        }
                        if (l != null && cVar != null) {
                            try {
                                C11824c7 c7Var = a7Var.f52574b;
                                long j = cVar.f52583a;
                                long j2 = cVar.f52584b;
                                long longValue = l.longValue();
                                c7Var.mo45465a().delete("traces", "requestId = ? AND statusId = ? AND timeMillis < ?", new String[]{String.valueOf(j), String.valueOf(j2), String.valueOf(longValue)});
                                return;
                            } catch (Throwable th) {
                                if (a7Var.mo45136a(4)) {
                                    C5004d4.m22887a(th);
                                    return;
                                }
                                return;
                            }
                        }
                    }
                }
                cVar = null;
                if (l != null) {
                }
            }
        }

        public C11783b() {
        }

        /* renamed from: a */
        public void mo45138a(C5004d4 d4Var, int i) {
            if (i == 1) {
                C11781a7.this.f52575c.execute(new C11784a(d4Var));
            }
        }
    }

    /* renamed from: com.startapp.a7$c */
    /* compiled from: Sta */
    public static class C11785c {

        /* renamed from: a */
        public final long f52583a;

        /* renamed from: b */
        public final long f52584b;

        public C11785c(long j, long j2) {
            this.f52583a = j;
            this.f52584b = j2;
        }
    }

    public C11781a7(Context context, SharedPreferences sharedPreferences, C11824c7 c7Var, Executor executor, C12462z2<NetworkDiagnosticConfig> z2Var) {
        this.f52573a = sharedPreferences;
        this.f52574b = c7Var;
        this.f52575c = executor;
        this.f52576d = z2Var;
    }

    /* renamed from: a */
    public final NetworkDiagnosticConfig mo45135a() {
        NetworkDiagnosticConfig call = this.f52576d.call();
        if (call == null || !call.mo46374e()) {
            return null;
        }
        return call;
    }

    /* renamed from: a */
    public boolean mo45136a(int i) {
        NetworkDiagnosticConfig a = mo45135a();
        return a != null && (a.mo46370a() & i) == i;
    }
}
