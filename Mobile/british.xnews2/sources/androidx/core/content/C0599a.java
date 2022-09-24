package androidx.core.content;

/* renamed from: androidx.core.content.a */
/* compiled from: ContentResolverCompat */
public final class C0599a {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v1, resolved type: android.os.CancellationSignal} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v2, resolved type: android.os.CancellationSignal} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v4, resolved type: android.os.CancellationSignal} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.database.Cursor m3288a(android.content.ContentResolver r7, android.net.Uri r8, java.lang.String[] r9, java.lang.String r10, java.lang.String[] r11, java.lang.String r12, p089i0.C5421b r13) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x0029
            if (r13 == 0) goto L_0x000f
            java.lang.Object r13 = r13.mo21872b()     // Catch:{ Exception -> 0x000d }
            goto L_0x0010
        L_0x000d:
            r7 = move-exception
            goto L_0x001e
        L_0x000f:
            r13 = 0
        L_0x0010:
            r6 = r13
            android.os.CancellationSignal r6 = (android.os.CancellationSignal) r6     // Catch:{ Exception -> 0x000d }
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x000d }
            return r7
        L_0x001e:
            boolean r8 = r7 instanceof android.os.OperationCanceledException
            if (r8 == 0) goto L_0x0028
            i0.j r7 = new i0.j
            r7.<init>()
            throw r7
        L_0x0028:
            throw r7
        L_0x0029:
            if (r13 == 0) goto L_0x002e
            r13.mo21875e()
        L_0x002e:
            android.database.Cursor r7 = r7.query(r8, r9, r10, r11, r12)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.C0599a.m3288a(android.content.ContentResolver, android.net.Uri, java.lang.String[], java.lang.String, java.lang.String[], java.lang.String, i0.b):android.database.Cursor");
    }
}
