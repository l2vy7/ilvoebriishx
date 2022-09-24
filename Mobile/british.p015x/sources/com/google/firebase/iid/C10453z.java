package com.google.firebase.iid;

import com.google.android.gms.tasks.Task;

/* renamed from: com.google.firebase.iid.z */
final /* synthetic */ class C10453z implements C10428f {

    /* renamed from: a */
    private final FirebaseInstanceId f48927a;

    /* renamed from: b */
    private final String f48928b;

    /* renamed from: c */
    private final String f48929c;

    /* renamed from: d */
    private final String f48930d;

    /* renamed from: e */
    private final String f48931e;

    C10453z(FirebaseInstanceId firebaseInstanceId, String str, String str2, String str3, String str4) {
        this.f48927a = firebaseInstanceId;
        this.f48928b = str;
        this.f48929c = str2;
        this.f48930d = str3;
        this.f48931e = str4;
    }

    public final Task zzs() {
        return this.f48927a.mo41859f(this.f48928b, this.f48929c, this.f48930d, this.f48931e);
    }
}
