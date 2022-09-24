package com.startapp;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import com.google.ads.interactivemedia.p039v3.impl.data.C3791bd;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@TargetApi(14)
/* renamed from: com.startapp.s2 */
/* compiled from: Sta */
public final class C12175s2 {

    /* renamed from: c */
    public static final String[] f54126c = {"/dev/socket/genyd", "/dev/socket/baseband_genyd"};

    /* renamed from: d */
    public static final String[] f54127d = {"goldfish"};

    /* renamed from: e */
    public static final String[] f54128e = {"/dev/socket/qemud", "/dev/qemu_pipe"};

    /* renamed from: f */
    public static final String[] f54129f = {"ueventd.android_x86.rc", "x86.prop", "ueventd.ttVM_x86.rc", "init.ttVM_x86.rc", "fstab.ttVM_x86", "fstab.vbox86", "init.vbox86.rc", "ueventd.vbox86.rc"};

    /* renamed from: g */
    public static final String[] f54130g = {"fstab.andy", "ueventd.andy.rc"};

    /* renamed from: h */
    public static final String[] f54131h = {"fstab.nox", "init.nox.rc", "ueventd.nox.rc", "/BigNoxGameHD", "/YSLauncher"};

    /* renamed from: i */
    public static final C11803b8[] f54132i = {new C11803b8("init.svc.qemud", (String) null), new C11803b8("init.svc.qemu-props", (String) null), new C11803b8("qemu.hw.mainkeys", (String) null), new C11803b8("qemu.sf.fake_camera", (String) null), new C11803b8("qemu.sf.lcd_density", (String) null), new C11803b8("ro.bootloader", C3791bd.UNKNOWN_CONTENT_TYPE), new C11803b8("ro.bootmode", C3791bd.UNKNOWN_CONTENT_TYPE), new C11803b8("ro.hardware", "goldfish"), new C11803b8("ro.kernel.android.qemud", (String) null), new C11803b8("ro.kernel.qemu.gles", (String) null), new C11803b8("ro.kernel.qemu", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE), new C11803b8("ro.product.device", "generic"), new C11803b8("ro.product.model", "sdk"), new C11803b8("ro.product.name", "sdk"), new C11803b8("ro.serialno", (String) null), new C11803b8("ro.build.description", "72656C656173652D6B657973"), new C11803b8("ro.build.fingerprint", "3A757365722F72656C656173652D6B657973"), new C11803b8("net.eth0.dns1", (String) null), new C11803b8("rild.libpath", "2F73797374656D2F6C69622F6C69627265666572656E63652D72696C2E736F"), new C11803b8("ro.radio.use-ppp", (String) null), new C11803b8("gsm.version.baseband", (String) null), new C11803b8("ro.build.tags", "72656C656173652D6B65"), new C11803b8("ro.build.display.id", "746573742D"), new C11803b8("init.svc.console", (String) null)};
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: j */
    public static C12175s2 f54133j;

    /* renamed from: k */
    public static Boolean f54134k;

    /* renamed from: a */
    public final Context f54135a;

    /* renamed from: b */
    public List<String> f54136b;

    public C12175s2(Context context) {
        ArrayList arrayList = new ArrayList();
        this.f54136b = arrayList;
        this.f54135a = context;
        arrayList.add("com.google.android.launcher.layouts.genymotion");
        this.f54136b.add("com.bluestacks");
        this.f54136b.add("com.bignox.app");
        this.f54136b.add("com.vphone.launcher");
    }

    /* renamed from: a */
    public final boolean mo45741a(String[] strArr, String str) {
        File file;
        for (String str2 : strArr) {
            if (!mo45740a(this.f54135a, "android.permission.READ_EXTERNAL_STORAGE") || !str2.contains("/") || !str.equals("Nox")) {
                file = new File(str2);
            } else {
                file = new File(Environment.getExternalStorageDirectory() + str2);
            }
            if (file.exists()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x006d A[SYNTHETIC, Splitter:B:28:0x006d] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0074 A[SYNTHETIC, Splitter:B:34:0x0074] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo45742b() {
        /*
            r12 = this;
            r0 = 2
            java.io.File[] r1 = new java.io.File[r0]
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "/proc/tty/drivers"
            r2.<init>(r3)
            r3 = 0
            r1[r3] = r2
            java.io.File r2 = new java.io.File
            java.lang.String r4 = "/proc/cpuinfo"
            r2.<init>(r4)
            r4 = 1
            r1[r4] = r2
            r2 = 0
        L_0x0018:
            if (r2 >= r0) goto L_0x007b
            r5 = r1[r2]
            boolean r6 = r5.exists()
            if (r6 == 0) goto L_0x0078
            boolean r6 = r5.canRead()
            if (r6 == 0) goto L_0x0078
            r6 = 1024(0x400, float:1.435E-42)
            char[] r6 = new char[r6]
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r8 = 0
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch:{ Exception -> 0x0071, all -> 0x006a }
            java.io.InputStreamReader r10 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x0071, all -> 0x006a }
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch:{ Exception -> 0x0071, all -> 0x006a }
            r11.<init>(r5)     // Catch:{ Exception -> 0x0071, all -> 0x006a }
            r10.<init>(r11)     // Catch:{ Exception -> 0x0071, all -> 0x006a }
            r9.<init>(r10)     // Catch:{ Exception -> 0x0071, all -> 0x006a }
        L_0x0041:
            int r5 = r9.read(r6)     // Catch:{ Exception -> 0x0068, all -> 0x0065 }
            r8 = -1
            if (r5 == r8) goto L_0x004c
            r7.append(r6, r3, r5)     // Catch:{ Exception -> 0x0068, all -> 0x0065 }
            goto L_0x0041
        L_0x004c:
            r9.close()     // Catch:{ IOException -> 0x004f }
        L_0x004f:
            java.lang.String r5 = r7.toString()
            java.lang.String[] r6 = f54127d
            int r7 = r6.length
            r8 = 0
        L_0x0057:
            if (r8 >= r7) goto L_0x0078
            r9 = r6[r8]
            boolean r9 = r5.contains(r9)
            if (r9 == 0) goto L_0x0062
            return r4
        L_0x0062:
            int r8 = r8 + 1
            goto L_0x0057
        L_0x0065:
            r0 = move-exception
            r8 = r9
            goto L_0x006b
        L_0x0068:
            r8 = r9
            goto L_0x0072
        L_0x006a:
            r0 = move-exception
        L_0x006b:
            if (r8 == 0) goto L_0x0070
            r8.close()     // Catch:{ IOException -> 0x0070 }
        L_0x0070:
            throw r0
        L_0x0071:
        L_0x0072:
            if (r8 == 0) goto L_0x0077
            r8.close()     // Catch:{ IOException -> 0x0077 }
        L_0x0077:
            return r3
        L_0x0078:
            int r2 = r2 + 1
            goto L_0x0018
        L_0x007b:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C12175s2.mo45742b():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:108:0x01c5  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0190  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo45743c() {
        /*
            r12 = this;
            java.lang.String r0 = android.os.Build.FINGERPRINT
            java.lang.String r1 = "generic"
            boolean r2 = r0.startsWith(r1)
            java.lang.String r3 = "Andy"
            r4 = 0
            r5 = 1
            if (r2 != 0) goto L_0x00fd
            java.lang.String r2 = android.os.Build.MODEL
            java.lang.String r6 = "google_sdk"
            boolean r7 = r2.contains(r6)
            if (r7 != 0) goto L_0x00fd
            java.lang.String r7 = r2.toLowerCase()
            java.lang.String r8 = "droid4x"
            boolean r7 = r7.contains(r8)
            if (r7 != 0) goto L_0x00fd
            java.lang.String r7 = "Emulator"
            boolean r7 = r2.contains(r7)
            if (r7 != 0) goto L_0x00fd
            java.lang.String r7 = "Android SDK built for"
            boolean r7 = r2.contains(r7)
            if (r7 != 0) goto L_0x00fd
            java.lang.String r7 = android.os.Build.MANUFACTURER
            java.lang.String r8 = "Genymotion"
            boolean r7 = r7.contains(r8)
            if (r7 != 0) goto L_0x00fd
            java.lang.String r7 = android.os.Build.HARDWARE
            java.lang.String r8 = "goldfish"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x00fd
            java.lang.String r8 = "vbox86"
            boolean r8 = r7.equals(r8)
            if (r8 != 0) goto L_0x00fd
            java.lang.String r8 = android.os.Build.PRODUCT
            java.lang.String r9 = "sdk"
            boolean r10 = r8.equals(r9)
            if (r10 != 0) goto L_0x00fd
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L_0x00fd
            java.lang.String r6 = "sdk_x86"
            boolean r6 = r8.equals(r6)
            if (r6 != 0) goto L_0x00fd
            java.lang.String r6 = "vbox86p"
            boolean r10 = r8.equals(r6)
            if (r10 != 0) goto L_0x00fd
            java.lang.String r10 = android.os.Build.BOARD
            java.lang.String r10 = r10.toLowerCase()
            java.lang.String r11 = "nox"
            boolean r10 = r10.contains(r11)
            if (r10 != 0) goto L_0x00fd
            java.lang.String r10 = android.os.Build.BOOTLOADER
            java.lang.String r10 = r10.toLowerCase()
            boolean r10 = r10.contains(r11)
            if (r10 != 0) goto L_0x00fd
            java.lang.String r10 = r7.toLowerCase()
            boolean r10 = r10.contains(r11)
            if (r10 != 0) goto L_0x00fd
            java.lang.String r8 = r8.toLowerCase()
            boolean r8 = r8.contains(r11)
            if (r8 != 0) goto L_0x00fd
            java.lang.String r8 = android.os.Build.SERIAL
            java.lang.String r8 = r8.toLowerCase()
            boolean r8 = r8.contains(r11)
            if (r8 != 0) goto L_0x00fd
            java.lang.String r8 = "unknown"
            boolean r8 = r0.startsWith(r8)
            if (r8 != 0) goto L_0x00fd
            boolean r8 = r0.contains(r3)
            if (r8 != 0) goto L_0x00fd
            java.lang.String r8 = "ttVM_Hdragon"
            boolean r8 = r0.contains(r8)
            if (r8 != 0) goto L_0x00fd
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto L_0x00fd
            java.lang.String r0 = "ttVM_x86"
            boolean r0 = r7.contains(r0)
            if (r0 != 0) goto L_0x00fd
            boolean r0 = r2.equals(r9)
            if (r0 != 0) goto L_0x00fd
            java.lang.String r0 = "Droid4X"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x00fd
            java.lang.String r0 = "TiantianVM"
            boolean r0 = r2.contains(r0)
            if (r0 != 0) goto L_0x00fd
            boolean r0 = r2.contains(r3)
            if (r0 != 0) goto L_0x00fd
            java.lang.String r0 = android.os.Build.BRAND
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x00fb
            java.lang.String r0 = android.os.Build.DEVICE
            boolean r0 = r0.startsWith(r1)
            if (r0 == 0) goto L_0x00fb
            goto L_0x00fd
        L_0x00fb:
            r0 = 0
            goto L_0x00fe
        L_0x00fd:
            r0 = 1
        L_0x00fe:
            if (r0 != 0) goto L_0x018e
            java.lang.String[] r0 = f54126c
            java.lang.String r1 = "Geny"
            boolean r0 = r12.mo45741a((java.lang.String[]) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x018d
            java.lang.String[] r0 = f54130g
            boolean r0 = r12.mo45741a((java.lang.String[]) r0, (java.lang.String) r3)
            if (r0 != 0) goto L_0x018d
            java.lang.String[] r0 = f54131h
            java.lang.String r1 = "Nox"
            boolean r0 = r12.mo45741a((java.lang.String[]) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x018d
            boolean r0 = r12.mo45742b()
            if (r0 != 0) goto L_0x018d
            java.lang.String[] r0 = f54128e
            java.lang.String r1 = "Pipes"
            boolean r0 = r12.mo45741a((java.lang.String[]) r0, (java.lang.String) r1)
            if (r0 != 0) goto L_0x018d
            boolean r0 = r12.mo45739a()
            if (r0 != 0) goto L_0x018d
            com.startapp.b8[] r0 = f54132i
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x0137:
            if (r2 >= r1) goto L_0x0178
            r6 = r0[r2]
            android.content.Context r7 = r12.f54135a
            java.lang.String r8 = r6.f52627a
            java.lang.ClassLoader r7 = r7.getClassLoader()     // Catch:{ Exception -> 0x0160 }
            java.lang.String r9 = "android.os.SystemProperties"
            java.lang.Class r7 = r7.loadClass(r9)     // Catch:{ Exception -> 0x0160 }
            java.lang.String r9 = "get"
            java.lang.Class[] r10 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0160 }
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            r10[r4] = r11     // Catch:{ Exception -> 0x0160 }
            java.lang.reflect.Method r9 = r7.getMethod(r9, r10)     // Catch:{ Exception -> 0x0160 }
            java.lang.Object[] r10 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0160 }
            r10[r4] = r8     // Catch:{ Exception -> 0x0160 }
            java.lang.Object r7 = r9.invoke(r7, r10)     // Catch:{ Exception -> 0x0160 }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x0160 }
            goto L_0x0161
        L_0x0160:
            r7 = 0
        L_0x0161:
            java.lang.String r6 = r6.f52628b
            if (r6 != 0) goto L_0x0169
            if (r7 == 0) goto L_0x0169
            int r3 = r3 + 1
        L_0x0169:
            if (r6 == 0) goto L_0x0175
            if (r7 == 0) goto L_0x0175
            boolean r6 = r7.contains(r6)
            if (r6 == 0) goto L_0x0175
            int r3 = r3 + 1
        L_0x0175:
            int r2 = r2 + 1
            goto L_0x0137
        L_0x0178:
            r0 = 5
            if (r3 < r0) goto L_0x017d
            r0 = 1
            goto L_0x017e
        L_0x017d:
            r0 = 0
        L_0x017e:
            if (r0 == 0) goto L_0x018b
            java.lang.String[] r0 = f54129f
            java.lang.String r1 = "X86"
            boolean r0 = r12.mo45741a((java.lang.String[]) r0, (java.lang.String) r1)
            if (r0 == 0) goto L_0x018b
            goto L_0x018d
        L_0x018b:
            r0 = 0
            goto L_0x018e
        L_0x018d:
            r0 = 1
        L_0x018e:
            if (r0 != 0) goto L_0x01c5
            java.util.List<java.lang.String> r0 = r12.f54136b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0199
            goto L_0x01c6
        L_0x0199:
            android.content.Context r0 = r12.f54135a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            java.util.List<java.lang.String> r1 = r12.f54136b
            java.util.Iterator r1 = r1.iterator()
        L_0x01a5:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x01c6
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            android.content.Intent r2 = r0.getLaunchIntentForPackage(r2)
            if (r2 == 0) goto L_0x01a5
            r3 = 65536(0x10000, float:9.18355E-41)
            java.util.List r2 = r0.queryIntentActivities(r2, r3)
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x01a5
            r4 = 1
            goto L_0x01c6
        L_0x01c5:
            r4 = r0
        L_0x01c6:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.C12175s2.mo45743c():boolean");
    }

    /* renamed from: a */
    public final boolean mo45739a() {
        if (!mo45740a(this.f54135a, "android.permission.INTERNET")) {
            return false;
        }
        String[] strArr = {"/system/bin/netcfg"};
        StringBuilder sb = new StringBuilder();
        try {
            ProcessBuilder processBuilder = new ProcessBuilder(strArr);
            processBuilder.directory(new File("/system/bin/"));
            processBuilder.redirectErrorStream(true);
            InputStream inputStream = processBuilder.start().getInputStream();
            byte[] bArr = new byte[1024];
            while (inputStream.read(bArr) != -1) {
                sb.append(new String(bArr));
            }
            inputStream.close();
        } catch (Exception unused) {
        }
        String sb2 = sb.toString();
        if (TextUtils.isEmpty(sb2)) {
            return false;
        }
        for (String str : sb2.split("\n")) {
            if ((str.contains("wlan0") || str.contains("tunl0") || str.contains("eth0")) && str.contains("10.0.2.15")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo45740a(Context context, String str) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                if (context.checkSelfPermission(str) == 0) {
                    return true;
                }
                return false;
            } else if (context.checkCallingOrSelfPermission(str) == 0) {
                return true;
            } else {
                return false;
            }
        } catch (Throwable unused) {
            return false;
        }
    }
}
