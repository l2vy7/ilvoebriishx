package com.startapp;

import android.view.View;
import org.json.JSONObject;

/* renamed from: com.startapp.zd */
/* compiled from: Sta */
public class C12480zd implements C12036ld {

    /* renamed from: a */
    public final C12036ld f55225a;

    public C12480zd(C12036ld ldVar) {
        this.f55225a = ldVar;
    }

    /* renamed from: a */
    public JSONObject mo45338a(View view) {
        return C12377ud.m53544a(0, 0, 0, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0085  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo45339a(android.view.View r9, org.json.JSONObject r10, com.startapp.C12036ld.C12037a r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            com.startapp.gd r12 = com.startapp.C11931gd.f53013c
            if (r12 == 0) goto L_0x00a3
            java.util.ArrayList<com.startapp.id> r12 = r12.f53015b
            java.util.Collection r12 = java.util.Collections.unmodifiableCollection(r12)
            int r0 = r12.size()
            int r0 = r0 * 2
            int r0 = r0 + 3
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>(r0)
            java.util.Iterator r12 = r12.iterator()
        L_0x0020:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00a3
            java.lang.Object r0 = r12.next()
            com.startapp.id r0 = (com.startapp.C11972id) r0
            android.view.View r0 = r0.mo45459b()
            if (r0 == 0) goto L_0x0020
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 19
            r4 = 0
            if (r2 < r3) goto L_0x0040
            boolean r2 = r0.isAttachedToWindow()
            if (r2 != 0) goto L_0x0040
            goto L_0x0052
        L_0x0040:
            boolean r2 = r0.isShown()
            if (r2 != 0) goto L_0x0047
            goto L_0x0052
        L_0x0047:
            r2 = r0
        L_0x0048:
            if (r2 == 0) goto L_0x0061
            float r3 = r2.getAlpha()
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0054
        L_0x0052:
            r2 = 0
            goto L_0x0062
        L_0x0054:
            android.view.ViewParent r2 = r2.getParent()
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L_0x005f
            android.view.View r2 = (android.view.View) r2
            goto L_0x0048
        L_0x005f:
            r2 = 0
            goto L_0x0048
        L_0x0061:
            r2 = 1
        L_0x0062:
            if (r2 == 0) goto L_0x0020
            android.view.View r0 = r0.getRootView()
            if (r0 == 0) goto L_0x0020
            boolean r2 = r1.containsKey(r0)
            if (r2 != 0) goto L_0x0020
            r1.put(r0, r0)
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 21
            if (r2 < r3) goto L_0x007e
            float r2 = r0.getZ()
            goto L_0x007f
        L_0x007e:
            r2 = 0
        L_0x007f:
            int r5 = r9.size()
        L_0x0083:
            if (r5 <= 0) goto L_0x009e
            int r6 = r5 + -1
            java.lang.Object r6 = r9.get(r6)
            android.view.View r6 = (android.view.View) r6
            int r7 = android.os.Build.VERSION.SDK_INT
            if (r7 < r3) goto L_0x0096
            float r6 = r6.getZ()
            goto L_0x0097
        L_0x0096:
            r6 = 0
        L_0x0097:
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x009e
            int r5 = r5 + -1
            goto L_0x0083
        L_0x009e:
            r9.add(r5, r0)
            goto L_0x0020
        L_0x00a3:
            java.util.Iterator r9 = r9.iterator()
        L_0x00a7:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto L_0x00bc
            java.lang.Object r12 = r9.next()
            android.view.View r12 = (android.view.View) r12
            com.startapp.ld r0 = r8.f55225a
            r1 = r11
            com.startapp.za r1 = (com.startapp.C12471za) r1
            r1.mo46862a(r12, r0, r10, r13)
            goto L_0x00a7
        L_0x00bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C12480zd.mo45339a(android.view.View, org.json.JSONObject, com.startapp.ld$a, boolean, boolean):void");
    }
}
