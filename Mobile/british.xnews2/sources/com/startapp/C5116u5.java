package com.startapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.startapp.u5 */
/* compiled from: Sta */
public class C5116u5 {

    /* renamed from: f */
    public static final Object f22506f = new Object();

    /* renamed from: g */
    public static C5116u5 f22507g;

    /* renamed from: a */
    public final Context f22508a;

    /* renamed from: b */
    public final Map<BroadcastReceiver, ArrayList<IntentFilter>> f22509b = new HashMap();

    /* renamed from: c */
    public final HashMap<String, ArrayList<C5119c>> f22510c = new HashMap<>();

    /* renamed from: d */
    public final ArrayList<C5118b> f22511d = new ArrayList<>();

    /* renamed from: e */
    public final Handler f22512e;

    /* renamed from: com.startapp.u5$a */
    /* compiled from: Sta */
    public class C5117a extends Handler {
        public C5117a(Looper looper) {
            super(looper);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
            r3 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (r3 >= r1) goto L_0x000b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
            r4 = r2[r3];
            r5 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
            if (r5 >= r4.f22515b.size()) goto L_0x004a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
            r6 = r4.f22515b.get(r5).f22517b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x003e, code lost:
            if (r6 == null) goto L_0x0047;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
            r6.onReceive(r10.f22508a, r4.f22514a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0047, code lost:
            r5 = r5 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
            r3 = r3 + 1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void handleMessage(android.os.Message r10) {
            /*
                r9 = this;
                int r0 = r10.what
                r1 = 1
                if (r0 == r1) goto L_0x0009
                super.handleMessage(r10)
                goto L_0x0017
            L_0x0009:
                com.startapp.u5 r10 = com.startapp.C5116u5.this
            L_0x000b:
                java.util.Map<android.content.BroadcastReceiver, java.util.ArrayList<android.content.IntentFilter>> r0 = r10.f22509b
                monitor-enter(r0)
                java.util.ArrayList<com.startapp.u5$b> r1 = r10.f22511d     // Catch:{ all -> 0x004d }
                int r1 = r1.size()     // Catch:{ all -> 0x004d }
                if (r1 > 0) goto L_0x0018
                monitor-exit(r0)     // Catch:{ all -> 0x004d }
            L_0x0017:
                return
            L_0x0018:
                com.startapp.u5$b[] r2 = new com.startapp.C5116u5.C5118b[r1]     // Catch:{ all -> 0x004d }
                java.util.ArrayList<com.startapp.u5$b> r3 = r10.f22511d     // Catch:{ all -> 0x004d }
                r3.toArray(r2)     // Catch:{ all -> 0x004d }
                java.util.ArrayList<com.startapp.u5$b> r3 = r10.f22511d     // Catch:{ all -> 0x004d }
                r3.clear()     // Catch:{ all -> 0x004d }
                monitor-exit(r0)     // Catch:{ all -> 0x004d }
                r0 = 0
                r3 = 0
            L_0x0027:
                if (r3 >= r1) goto L_0x000b
                r4 = r2[r3]
                r5 = 0
            L_0x002c:
                java.util.ArrayList<com.startapp.u5$c> r6 = r4.f22515b
                int r6 = r6.size()
                if (r5 >= r6) goto L_0x004a
                java.util.ArrayList<com.startapp.u5$c> r6 = r4.f22515b
                java.lang.Object r6 = r6.get(r5)
                com.startapp.u5$c r6 = (com.startapp.C5116u5.C5119c) r6
                android.content.BroadcastReceiver r6 = r6.f22517b
                if (r6 == 0) goto L_0x0047
                android.content.Context r7 = r10.f22508a
                android.content.Intent r8 = r4.f22514a
                r6.onReceive(r7, r8)
            L_0x0047:
                int r5 = r5 + 1
                goto L_0x002c
            L_0x004a:
                int r3 = r3 + 1
                goto L_0x0027
            L_0x004d:
                r10 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x004d }
                goto L_0x0051
            L_0x0050:
                throw r10
            L_0x0051:
                goto L_0x0050
            */
            throw new UnsupportedOperationException("Method not decompiled: com.startapp.C5116u5.C5117a.handleMessage(android.os.Message):void");
        }
    }

    /* renamed from: com.startapp.u5$b */
    /* compiled from: Sta */
    public static class C5118b {

        /* renamed from: a */
        public final Intent f22514a;

        /* renamed from: b */
        public final ArrayList<C5119c> f22515b;

        public C5118b(Intent intent, ArrayList<C5119c> arrayList) {
            this.f22514a = intent;
            this.f22515b = arrayList;
        }
    }

    /* renamed from: com.startapp.u5$c */
    /* compiled from: Sta */
    public static class C5119c {

        /* renamed from: a */
        public final IntentFilter f22516a;

        /* renamed from: b */
        public final BroadcastReceiver f22517b;

        /* renamed from: c */
        public boolean f22518c;

        public C5119c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.f22516a = intentFilter;
            this.f22517b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(128);
            sb.append("Receiver{");
            sb.append(this.f22517b);
            sb.append(" filter=");
            sb.append(this.f22516a);
            sb.append("}");
            return sb.toString();
        }
    }

    static {
        C12437y.m53774a((Class<?>) C5116u5.class);
    }

    public C5116u5(Context context) {
        this.f22508a = context;
        this.f22512e = new C5117a(context.getMainLooper());
    }

    /* renamed from: a */
    public static C5116u5 m23368a(Context context) {
        C5116u5 u5Var;
        synchronized (f22506f) {
            if (f22507g == null) {
                Context a = C5009h0.m22892a(context);
                if (a != null) {
                    context = a;
                }
                f22507g = new C5116u5(context);
            }
            u5Var = f22507g;
        }
        return u5Var;
    }

    /* renamed from: a */
    public void mo21243a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        synchronized (this.f22509b) {
            C5119c cVar = new C5119c(intentFilter, broadcastReceiver);
            ArrayList arrayList = this.f22509b.get(broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f22509b.put(broadcastReceiver, arrayList);
            }
            arrayList.add(intentFilter);
            for (int i = 0; i < intentFilter.countActions(); i++) {
                String action = intentFilter.getAction(i);
                ArrayList arrayList2 = this.f22510c.get(action);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.f22510c.put(action, arrayList2);
                }
                arrayList2.add(cVar);
            }
        }
    }

    /* renamed from: a */
    public void mo21242a(BroadcastReceiver broadcastReceiver) {
        synchronized (this.f22509b) {
            ArrayList remove = this.f22509b.remove(broadcastReceiver);
            if (remove != null) {
                for (int i = 0; i < remove.size(); i++) {
                    IntentFilter intentFilter = (IntentFilter) remove.get(i);
                    for (int i2 = 0; i2 < intentFilter.countActions(); i2++) {
                        String action = intentFilter.getAction(i2);
                        ArrayList arrayList = this.f22510c.get(action);
                        if (arrayList != null) {
                            int i3 = 0;
                            while (i3 < arrayList.size()) {
                                if (((C5119c) arrayList.get(i3)).f22517b == broadcastReceiver) {
                                    arrayList.remove(i3);
                                    i3--;
                                }
                                i3++;
                            }
                            if (arrayList.size() <= 0) {
                                this.f22510c.remove(action);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00b8, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bc, code lost:
        return r12;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo21244a(android.content.Intent r22) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            java.util.Map<android.content.BroadcastReceiver, java.util.ArrayList<android.content.IntentFilter>> r2 = r1.f22509b
            monitor-enter(r2)
            java.lang.String r10 = r22.getAction()     // Catch:{ all -> 0x00bd }
            android.content.Context r3 = r1.f22508a     // Catch:{ all -> 0x00bd }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ all -> 0x00bd }
            java.lang.String r11 = r0.resolveTypeIfNeeded(r3)     // Catch:{ all -> 0x00bd }
            android.net.Uri r12 = r22.getData()     // Catch:{ all -> 0x00bd }
            java.lang.String r13 = r22.getScheme()     // Catch:{ all -> 0x00bd }
            java.util.Set r14 = r22.getCategories()     // Catch:{ all -> 0x00bd }
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.startapp.u5$c>> r3 = r1.f22510c     // Catch:{ all -> 0x00bd }
            java.lang.String r4 = r22.getAction()     // Catch:{ all -> 0x00bd }
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x00bd }
            r15 = r3
            java.util.ArrayList r15 = (java.util.ArrayList) r15     // Catch:{ all -> 0x00bd }
            r9 = 0
            if (r15 == 0) goto L_0x00ba
            r3 = 0
            r8 = r3
            r7 = 0
        L_0x0034:
            int r3 = r15.size()     // Catch:{ all -> 0x00bd }
            r6 = 1
            if (r7 >= r3) goto L_0x0089
            java.lang.Object r3 = r15.get(r7)     // Catch:{ all -> 0x00bd }
            r5 = r3
            com.startapp.u5$c r5 = (com.startapp.C5116u5.C5119c) r5     // Catch:{ all -> 0x00bd }
            boolean r3 = r5.f22518c     // Catch:{ all -> 0x00bd }
            if (r3 == 0) goto L_0x0051
            r19 = r7
            r17 = r10
            r18 = r11
            r20 = r12
            r12 = 0
            r11 = r8
            goto L_0x007e
        L_0x0051:
            android.content.IntentFilter r3 = r5.f22516a     // Catch:{ all -> 0x00bd }
            java.lang.String r16 = "LocalBroadcastManager"
            r4 = r10
            r17 = r10
            r10 = r5
            r5 = r11
            r18 = r11
            r11 = 1
            r6 = r13
            r19 = r7
            r7 = r12
            r11 = r8
            r8 = r14
            r20 = r12
            r12 = 0
            r9 = r16
            int r3 = r3.match(r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00bd }
            if (r3 < 0) goto L_0x007e
            if (r11 != 0) goto L_0x0076
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x00bd }
            r8.<init>()     // Catch:{ all -> 0x00bd }
            goto L_0x0077
        L_0x0076:
            r8 = r11
        L_0x0077:
            r8.add(r10)     // Catch:{ all -> 0x00bd }
            r3 = 1
            r10.f22518c = r3     // Catch:{ all -> 0x00bd }
            goto L_0x007f
        L_0x007e:
            r8 = r11
        L_0x007f:
            int r7 = r19 + 1
            r10 = r17
            r11 = r18
            r12 = r20
            r9 = 0
            goto L_0x0034
        L_0x0089:
            r11 = r8
            r12 = 0
            if (r11 == 0) goto L_0x00bb
            r9 = 0
        L_0x008e:
            int r3 = r11.size()     // Catch:{ all -> 0x00bd }
            if (r9 >= r3) goto L_0x009f
            java.lang.Object r3 = r11.get(r9)     // Catch:{ all -> 0x00bd }
            com.startapp.u5$c r3 = (com.startapp.C5116u5.C5119c) r3     // Catch:{ all -> 0x00bd }
            r3.f22518c = r12     // Catch:{ all -> 0x00bd }
            int r9 = r9 + 1
            goto L_0x008e
        L_0x009f:
            java.util.ArrayList<com.startapp.u5$b> r3 = r1.f22511d     // Catch:{ all -> 0x00bd }
            com.startapp.u5$b r4 = new com.startapp.u5$b     // Catch:{ all -> 0x00bd }
            r4.<init>(r0, r11)     // Catch:{ all -> 0x00bd }
            r3.add(r4)     // Catch:{ all -> 0x00bd }
            android.os.Handler r0 = r1.f22512e     // Catch:{ all -> 0x00bd }
            r3 = 1
            boolean r0 = r0.hasMessages(r3)     // Catch:{ all -> 0x00bd }
            if (r0 != 0) goto L_0x00b7
            android.os.Handler r0 = r1.f22512e     // Catch:{ all -> 0x00bd }
            r0.sendEmptyMessage(r3)     // Catch:{ all -> 0x00bd }
        L_0x00b7:
            monitor-exit(r2)     // Catch:{ all -> 0x00bd }
            r0 = 1
            return r0
        L_0x00ba:
            r12 = 0
        L_0x00bb:
            monitor-exit(r2)     // Catch:{ all -> 0x00bd }
            return r12
        L_0x00bd:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00bd }
            goto L_0x00c1
        L_0x00c0:
            throw r0
        L_0x00c1:
            goto L_0x00c0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C5116u5.mo21244a(android.content.Intent):boolean");
    }
}
