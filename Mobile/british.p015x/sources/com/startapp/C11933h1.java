package com.startapp;

import android.content.Context;
import com.startapp.sdk.adsbase.C5069e;
import com.startapp.sdk.adsbase.remoteconfig.BluetoothConfig;
import com.startapp.sdk.components.ComponentLocator;

/* renamed from: com.startapp.h1 */
/* compiled from: Sta */
public class C11933h1 extends C12344t7<String> implements C12128p7 {

    /* renamed from: j */
    public final C5069e f53021j;

    /* renamed from: k */
    public final C5001b2 f53022k;

    /* renamed from: l */
    public final C12462z2<BluetoothConfig> f53023l;

    public C11933h1(Context context, C5069e eVar, C5069e eVar2, C5001b2 b2Var, C12071n3 n3Var, C12462z2<BluetoothConfig> z2Var) {
        super(context, eVar2, n3Var, "26787005dc4a1477", "c8ef3e50475fc527");
        this.f53021j = eVar;
        this.f53022k = b2Var;
        this.f53023l = z2Var;
    }

    /* renamed from: a */
    public Object mo45391a(String str) {
        return str;
    }

    /* renamed from: a */
    public void mo45392a(Object obj) {
        mo46638b(obj != null ? obj.toString() : null);
    }

    /* renamed from: c */
    public /* bridge */ /* synthetic */ Object mo45174c() {
        return "";
    }

    /* renamed from: d */
    public long mo45393d() {
        BluetoothConfig call = this.f53023l.call();
        if (call != null) {
            return call.mo46326b();
        }
        return 0;
    }

    /* renamed from: f */
    public boolean mo45394f() {
        BluetoothConfig call;
        if (!this.f53022k.mo20655c() || (call = this.f53023l.call()) == null || !call.mo46328d()) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public void mo45395g() {
        if (C12437y.m53782a(this.f52927a, "android.permission.BLUETOOTH")) {
            Context context = this.f52927a;
            ComponentLocator.m23305a(context).mo21223j().execute(new C11897f3(context, this.f53021j, this).f54866d);
        }
    }
}
