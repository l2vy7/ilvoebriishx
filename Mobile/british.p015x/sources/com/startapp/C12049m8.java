package com.startapp;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Pair;
import java.util.Arrays;
import java.util.Map;

/* renamed from: com.startapp.m8 */
/* compiled from: Sta */
public class C12049m8 extends C12129p8 {

    /* renamed from: c */
    public BroadcastReceiver f53278c;

    /* renamed from: com.startapp.m8$a */
    /* compiled from: Sta */
    public class C12050a extends BroadcastReceiver {

        /* renamed from: a */
        public final /* synthetic */ C12165r8 f53279a;

        public C12050a(C12165r8 r8Var) {
            this.f53279a = r8Var;
        }

        public void onReceive(Context context, Intent intent) {
            this.f53279a.mo45716a((Object) new Pair(C12049m8.this, intent));
        }
    }

    public C12049m8(String str, Map<String, String> map) {
        super(str, map);
    }

    /* renamed from: a */
    public void mo45537a(Context context, C12165r8 r8Var) throws Exception {
        if (this.f53278c == null) {
            C12050a aVar = new C12050a(r8Var);
            this.f53278c = aVar;
            context.registerReceiver(aVar, new IntentFilter(this.f54009a));
            return;
        }
        throw new IllegalStateException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C12049m8.class != obj.getClass()) {
            return false;
        }
        return C5015nb.m22922a(this.f53278c, ((C12049m8) obj).f53278c);
    }

    public int hashCode() {
        Object[] objArr = {this.f53278c};
        Map<Activity, Integer> map = C5015nb.f22145a;
        return Arrays.deepHashCode(objArr);
    }

    /* renamed from: a */
    public void mo45536a(Context context) throws Exception {
        BroadcastReceiver broadcastReceiver = this.f53278c;
        if (broadcastReceiver != null) {
            context.unregisterReceiver(broadcastReceiver);
            this.f53278c = null;
            return;
        }
        throw new IllegalStateException();
    }
}
