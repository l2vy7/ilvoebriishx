package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import p132p7.C10914c;
import p132p7.C10916e;
import p132p7.C10917h;
import p204e7.C10516d;
import p261w6.C12930d;
import p261w6.C12931e;
import p261w6.C12932f;
import p261w6.C12933g;
import p267y6.C11114d;
import p267y6.C11125i;

public class FirebaseCommonRegistrar implements C11125i {
    /* access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ String m47973e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return applicationInfo != null ? String.valueOf(applicationInfo.targetSdkVersion) : "";
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ String m47974f(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return (applicationInfo == null || Build.VERSION.SDK_INT < 24) ? "" : String.valueOf(applicationInfo.minSdkVersion);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ String m47975g(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 16 && context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (i >= 20 && context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (i < 23 || !context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return (i < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) ? "" : "embedded";
        }
        return TtmlNode.TEXT_EMPHASIS_AUTO;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ String m47976h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName != null ? m47977i(installerPackageName) : "";
    }

    /* renamed from: i */
    private static String m47977i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    public List<C11114d<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C10914c.m49125c());
        arrayList.add(C10516d.m48249e());
        arrayList.add(C10917h.m49133b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(C10917h.m49133b("fire-core", "20.0.0"));
        arrayList.add(C10917h.m49133b("device-name", m47977i(Build.PRODUCT)));
        arrayList.add(C10917h.m49133b("device-model", m47977i(Build.DEVICE)));
        arrayList.add(C10917h.m49133b("device-brand", m47977i(Build.BRAND)));
        arrayList.add(C10917h.m49134c("android-target-sdk", C12931e.f55625a));
        arrayList.add(C10917h.m49134c("android-min-sdk", C12932f.f55626a));
        arrayList.add(C10917h.m49134c("android-platform", C12933g.f55627a));
        arrayList.add(C10917h.m49134c("android-installer", C12930d.f55624a));
        String a = C10916e.m49131a();
        if (a != null) {
            arrayList.add(C10917h.m49133b("kotlin", a));
        }
        return arrayList;
    }
}
