package com.google.ads.interactivemedia.p039v3.internal;

import android.content.Context;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import dalvik.system.DexClassLoader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p252t4.C11013c;
import p252t4.C11014d;

/* renamed from: com.google.ads.interactivemedia.v3.internal.hc */
/* compiled from: IMASDK */
public final class C4037hc {

    /* renamed from: d */
    private static final String f17357d = "hc";

    /* renamed from: a */
    protected final Context f17358a;

    /* renamed from: b */
    protected boolean f17359b;

    /* renamed from: c */
    protected boolean f17360c;

    /* renamed from: e */
    private ExecutorService f17361e;

    /* renamed from: f */
    private DexClassLoader f17362f;

    /* renamed from: g */
    private C4027gt f17363g;

    /* renamed from: h */
    private byte[] f17364h;

    /* renamed from: i */
    private volatile AdvertisingIdClient f17365i = null;

    /* renamed from: j */
    private volatile boolean f17366j;

    /* renamed from: k */
    private Future f17367k;

    /* renamed from: l */
    private final boolean f17368l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public volatile C4385u f17369m;

    /* renamed from: n */
    private Future f17370n;

    /* renamed from: o */
    private C4018gk f17371o;

    /* renamed from: p */
    private final Map<Pair<String, String>, C4067if> f17372p;

    /* renamed from: q */
    private boolean f17373q;

    /* renamed from: r */
    private C4031gx f17374r;

    private C4037hc(Context context) {
        boolean z = false;
        this.f17366j = false;
        this.f17367k = null;
        this.f17369m = null;
        this.f17370n = null;
        this.f17359b = false;
        this.f17360c = false;
        this.f17373q = false;
        Context applicationContext = context.getApplicationContext();
        this.f17368l = applicationContext != null ? true : z;
        context = applicationContext != null ? applicationContext : context;
        this.f17358a = context;
        this.f17372p = new HashMap();
        if (this.f17374r == null) {
            this.f17374r = new C4031gx(context);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(20:0|1|2|(1:4)|5|6|7|8|(1:10)(1:11)|12|(1:14)(1:15)|16|17|18|(2:20|(1:22)(2:23|24))|25|26|27|28|(17:30|(2:32|33)|34|35|36|37|(2:39|(1:41)(2:42|43))|44|(1:46)|47|48|49|50|51|52|53|82)(3:71|72|73)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0050 */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0059 A[Catch:{ gv -> 0x0161 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0082 A[Catch:{ IllegalArgumentException -> 0x0153, gs -> 0x015a }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x014d A[SYNTHETIC, Splitter:B:71:0x014d] */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.ads.interactivemedia.p039v3.internal.C4037hc m17292s(android.content.Context r11, boolean r12) {
        /*
            java.lang.String r0 = "%s/%s.dex"
            java.lang.String r1 = "1616432909849"
            com.google.ads.interactivemedia.v3.internal.hc r2 = new com.google.ads.interactivemedia.v3.internal.hc
            r2.<init>(r11)
            com.google.ads.interactivemedia.v3.internal.gz r11 = new com.google.ads.interactivemedia.v3.internal.gz     // Catch:{ gv -> 0x0161 }
            r11.<init>()     // Catch:{ gv -> 0x0161 }
            java.util.concurrent.ExecutorService r11 = java.util.concurrent.Executors.newCachedThreadPool(r11)     // Catch:{ gv -> 0x0161 }
            r2.f17361e = r11     // Catch:{ gv -> 0x0161 }
            r2.f17366j = r12     // Catch:{ gv -> 0x0161 }
            r11 = 0
            if (r12 == 0) goto L_0x0026
            java.util.concurrent.ExecutorService r12 = r2.f17361e     // Catch:{ gv -> 0x0161 }
            com.google.ads.interactivemedia.v3.internal.hb r3 = new com.google.ads.interactivemedia.v3.internal.hb     // Catch:{ gv -> 0x0161 }
            r3.<init>(r2, r11)     // Catch:{ gv -> 0x0161 }
            java.util.concurrent.Future r12 = r12.submit(r3)     // Catch:{ gv -> 0x0161 }
            r2.f17367k = r12     // Catch:{ gv -> 0x0161 }
        L_0x0026:
            java.util.concurrent.ExecutorService r12 = r2.f17361e     // Catch:{ gv -> 0x0161 }
            com.google.ads.interactivemedia.v3.internal.hb r3 = new com.google.ads.interactivemedia.v3.internal.hb     // Catch:{ gv -> 0x0161 }
            r3.<init>(r2)     // Catch:{ gv -> 0x0161 }
            r12.execute(r3)     // Catch:{ gv -> 0x0161 }
            r12 = 1
            r3 = 0
            com.google.android.gms.common.b r4 = com.google.android.gms.common.C7353b.m29920h()     // Catch:{ all -> 0x0050 }
            android.content.Context r5 = r2.f17358a     // Catch:{ all -> 0x0050 }
            int r5 = r4.mo29973b(r5)     // Catch:{ all -> 0x0050 }
            if (r5 <= 0) goto L_0x0040
            r5 = 1
            goto L_0x0041
        L_0x0040:
            r5 = 0
        L_0x0041:
            r2.f17359b = r5     // Catch:{ all -> 0x0050 }
            android.content.Context r5 = r2.f17358a     // Catch:{ all -> 0x0050 }
            int r4 = r4.mo29708i(r5)     // Catch:{ all -> 0x0050 }
            if (r4 != 0) goto L_0x004d
            r4 = 1
            goto L_0x004e
        L_0x004d:
            r4 = 0
        L_0x004e:
            r2.f17360c = r4     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r2.mo15908r(r3)     // Catch:{ gv -> 0x0161 }
            boolean r4 = com.google.ads.interactivemedia.p039v3.internal.C4040hf.m17336d()     // Catch:{ gv -> 0x0161 }
            if (r4 == 0) goto L_0x0070
            com.google.ads.interactivemedia.v3.internal.aod<java.lang.Boolean> r4 = com.google.ads.interactivemedia.p039v3.internal.aok.f15497m     // Catch:{ gv -> 0x0161 }
            java.lang.Object r4 = r4.mo14149f()     // Catch:{ gv -> 0x0161 }
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch:{ gv -> 0x0161 }
            boolean r4 = r4.booleanValue()     // Catch:{ gv -> 0x0161 }
            if (r4 != 0) goto L_0x0068
            goto L_0x0070
        L_0x0068:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch:{ gv -> 0x0161 }
            java.lang.String r12 = "Task Context initialization must not be called from the UI thread."
            r11.<init>(r12)     // Catch:{ gv -> 0x0161 }
            throw r11     // Catch:{ gv -> 0x0161 }
        L_0x0070:
            com.google.ads.interactivemedia.v3.internal.gt r4 = new com.google.ads.interactivemedia.v3.internal.gt     // Catch:{ gv -> 0x0161 }
            r4.<init>()     // Catch:{ gv -> 0x0161 }
            r2.f17363g = r4     // Catch:{ gv -> 0x0161 }
            java.lang.String r4 = "RV61Zx08QI+r0KCLhOeBrJPnsMi/yhd3p5E5I04HG2U="
            byte[] r4 = com.google.ads.interactivemedia.p039v3.internal.C4038hd.m17317c(r4, r3)     // Catch:{ IllegalArgumentException -> 0x0153 }
            int r5 = r4.length     // Catch:{ IllegalArgumentException -> 0x0153 }
            r6 = 32
            if (r5 != r6) goto L_0x014d
            r5 = 4
            r6 = 16
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x0153 }
            byte[] r5 = new byte[r6]     // Catch:{ IllegalArgumentException -> 0x0153 }
            r4.get(r5)     // Catch:{ IllegalArgumentException -> 0x0153 }
            r4 = 0
        L_0x008f:
            if (r4 >= r6) goto L_0x009b
            byte r7 = r5[r4]     // Catch:{ IllegalArgumentException -> 0x0153 }
            r7 = r7 ^ 68
            byte r7 = (byte) r7     // Catch:{ IllegalArgumentException -> 0x0153 }
            r5[r4] = r7     // Catch:{ IllegalArgumentException -> 0x0153 }
            int r4 = r4 + 1
            goto L_0x008f
        L_0x009b:
            r2.f17364h = r5     // Catch:{ gs -> 0x015a }
            android.content.Context r4 = r2.f17358a     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            java.io.File r4 = r4.getCacheDir()     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            if (r4 != 0) goto L_0x00b6
            android.content.Context r4 = r2.f17358a     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            java.lang.String r5 = "dex"
            java.io.File r4 = r4.getDir(r5, r3)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            if (r4 == 0) goto L_0x00b0
            goto L_0x00b6
        L_0x00b0:
            com.google.ads.interactivemedia.v3.internal.gv r11 = new com.google.ads.interactivemedia.v3.internal.gv     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            r11.<init>()     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            throw r11     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
        L_0x00b6:
            java.lang.String r5 = "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"
            java.io.File r6 = new java.io.File     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            r7 = 2
            java.lang.Object[] r8 = new java.lang.Object[r7]     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            r8[r3] = r4     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            r8[r12] = r1     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            java.lang.String r9 = "%s/%s.jar"
            java.lang.String r8 = java.lang.String.format(r9, r8)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            r6.<init>(r8)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            boolean r8 = r6.exists()     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            if (r8 != 0) goto L_0x00e7
            com.google.ads.interactivemedia.v3.internal.gt r8 = r2.f17363g     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            byte[] r9 = r2.f17364h     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            byte[] r5 = r8.mo15887b(r9, r5)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            r6.createNewFile()     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            r8.<init>(r6)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            int r9 = r5.length     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            r8.write(r5, r3, r9)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            r8.close()     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
        L_0x00e7:
            r2.m17296x(r4)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            dalvik.system.DexClassLoader r5 = new dalvik.system.DexClassLoader     // Catch:{ all -> 0x011c }
            java.lang.String r8 = r6.getAbsolutePath()     // Catch:{ all -> 0x011c }
            java.lang.String r9 = r4.getAbsolutePath()     // Catch:{ all -> 0x011c }
            android.content.Context r10 = r2.f17358a     // Catch:{ all -> 0x011c }
            java.lang.ClassLoader r10 = r10.getClassLoader()     // Catch:{ all -> 0x011c }
            r5.<init>(r8, r9, r11, r10)     // Catch:{ all -> 0x011c }
            r2.f17362f = r5     // Catch:{ all -> 0x011c }
            m17295w(r6)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            r2.m17297y(r4)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            java.lang.Object[] r11 = new java.lang.Object[r7]     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            r11[r3] = r4     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            r11[r12] = r1     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            java.lang.String r11 = java.lang.String.format(r0, r11)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            r2.m17293u(r11)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            com.google.ads.interactivemedia.v3.internal.gk r11 = new com.google.ads.interactivemedia.v3.internal.gk     // Catch:{ gv -> 0x0161 }
            r11.<init>(r2)     // Catch:{ gv -> 0x0161 }
            r2.f17371o = r11     // Catch:{ gv -> 0x0161 }
            r2.f17373q = r12     // Catch:{ gv -> 0x0161 }
            goto L_0x0161
        L_0x011c:
            r11 = move-exception
            m17295w(r6)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            r2.m17297y(r4)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            java.lang.Object[] r5 = new java.lang.Object[r7]     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            r5[r3] = r4     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            r5[r12] = r1     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            java.lang.String r12 = java.lang.String.format(r0, r5)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            r2.m17293u(r12)     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
            throw r11     // Catch:{ FileNotFoundException -> 0x0146, IOException -> 0x013f, gs -> 0x0138, NullPointerException -> 0x0131 }
        L_0x0131:
            r11 = move-exception
            com.google.ads.interactivemedia.v3.internal.gv r12 = new com.google.ads.interactivemedia.v3.internal.gv     // Catch:{ gv -> 0x0161 }
            r12.<init>(r11)     // Catch:{ gv -> 0x0161 }
            throw r12     // Catch:{ gv -> 0x0161 }
        L_0x0138:
            r11 = move-exception
            com.google.ads.interactivemedia.v3.internal.gv r12 = new com.google.ads.interactivemedia.v3.internal.gv     // Catch:{ gv -> 0x0161 }
            r12.<init>(r11)     // Catch:{ gv -> 0x0161 }
            throw r12     // Catch:{ gv -> 0x0161 }
        L_0x013f:
            r11 = move-exception
            com.google.ads.interactivemedia.v3.internal.gv r12 = new com.google.ads.interactivemedia.v3.internal.gv     // Catch:{ gv -> 0x0161 }
            r12.<init>(r11)     // Catch:{ gv -> 0x0161 }
            throw r12     // Catch:{ gv -> 0x0161 }
        L_0x0146:
            r11 = move-exception
            com.google.ads.interactivemedia.v3.internal.gv r12 = new com.google.ads.interactivemedia.v3.internal.gv     // Catch:{ gv -> 0x0161 }
            r12.<init>(r11)     // Catch:{ gv -> 0x0161 }
            throw r12     // Catch:{ gv -> 0x0161 }
        L_0x014d:
            com.google.ads.interactivemedia.v3.internal.gs r11 = new com.google.ads.interactivemedia.v3.internal.gs     // Catch:{ IllegalArgumentException -> 0x0153 }
            r11.<init>()     // Catch:{ IllegalArgumentException -> 0x0153 }
            throw r11     // Catch:{ IllegalArgumentException -> 0x0153 }
        L_0x0153:
            r11 = move-exception
            com.google.ads.interactivemedia.v3.internal.gs r12 = new com.google.ads.interactivemedia.v3.internal.gs     // Catch:{ gs -> 0x015a }
            r12.<init>(r11)     // Catch:{ gs -> 0x015a }
            throw r12     // Catch:{ gs -> 0x015a }
        L_0x015a:
            r11 = move-exception
            com.google.ads.interactivemedia.v3.internal.gv r12 = new com.google.ads.interactivemedia.v3.internal.gv     // Catch:{ gv -> 0x0161 }
            r12.<init>(r11)     // Catch:{ gv -> 0x0161 }
            throw r12     // Catch:{ gv -> 0x0161 }
        L_0x0161:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C4037hc.m17292s(android.content.Context, boolean):com.google.ads.interactivemedia.v3.internal.hc");
    }

    /* renamed from: u */
    private final void m17293u(String str) {
        m17295w(new File(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public final void m17294v() {
        try {
            if (this.f17365i == null && this.f17368l) {
                AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(this.f17358a);
                advertisingIdClient.start();
                this.f17365i = advertisingIdClient;
            }
        } catch (IOException | C11013c | C11014d unused) {
            this.f17365i = null;
        }
    }

    /* renamed from: w */
    private static final void m17295w(File file) {
        if (!file.exists()) {
            Log.d(f17357d, String.format("File %s not found. No need for deletion", new Object[]{file.getAbsolutePath()}));
            return;
        }
        file.delete();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:30|31|32|33|34|35|77) */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00df, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e0, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e3, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:?, code lost:
        r11.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00cd */
    /* JADX WARNING: Missing exception handler attribute for start block: B:44:0x00db */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[ExcHandler: gs | IOException | NoSuchAlgorithmException (unused java.lang.Throwable), SYNTHETIC, Splitter:B:12:0x004b] */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ea A[SYNTHETIC, Splitter:B:57:0x00ea] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f1 A[SYNTHETIC, Splitter:B:61:0x00f1] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00f8 A[SYNTHETIC, Splitter:B:68:0x00f8] */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00ff A[SYNTHETIC, Splitter:B:72:0x00ff] */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* renamed from: x */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m17296x(java.io.File r11) {
        /*
            r10 = this;
            java.io.File r0 = new java.io.File
            r1 = 2
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r11
            r4 = 1
            java.lang.String r5 = "1616432909849"
            r2[r4] = r5
            java.lang.String r6 = "%s/%s.tmp"
            java.lang.String r2 = java.lang.String.format(r6, r2)
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 != 0) goto L_0x001d
            return
        L_0x001d:
            java.io.File r2 = new java.io.File
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r11
            r1[r4] = r5
            java.lang.String r11 = "%s/%s.dex"
            java.lang.String r11 = java.lang.String.format(r11, r1)
            r2.<init>(r11)
            boolean r11 = r2.exists()
            if (r11 != 0) goto L_0x0102
            r11 = 0
            long r6 = r0.length()     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00f5, all -> 0x00e6 }
            r8 = 0
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 > 0) goto L_0x0043
            m17295w(r0)     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00f5, all -> 0x00e6 }
            return
        L_0x0043:
            int r1 = (int) r6     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00f5, all -> 0x00e6 }
            byte[] r1 = new byte[r1]     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00f5, all -> 0x00e6 }
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00f5, all -> 0x00e6 }
            r4.<init>(r0)     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00f5, all -> 0x00e6 }
            int r6 = r4.read(r1)     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            if (r6 > 0) goto L_0x005f
            java.lang.String r1 = f17357d     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            java.lang.String r2 = "Cannot read the cache data."
            android.util.Log.d(r1, r2)     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            m17295w(r0)     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            r4.close()     // Catch:{ IOException -> 0x005e }
        L_0x005e:
            return
        L_0x005f:
            com.google.ads.interactivemedia.v3.internal.bka r6 = com.google.ads.interactivemedia.p039v3.internal.bka.m16275a()     // Catch:{ NullPointerException -> 0x00db, gs | IOException | NoSuchAlgorithmException -> 0x00e3, gs | IOException | NoSuchAlgorithmException -> 0x00e3 }
            com.google.ads.interactivemedia.v3.internal.z r1 = com.google.ads.interactivemedia.p039v3.internal.C4520z.m19614f(r1, r6)     // Catch:{ NullPointerException -> 0x00db, gs | IOException | NoSuchAlgorithmException -> 0x00e3, gs | IOException | NoSuchAlgorithmException -> 0x00e3 }
            java.lang.String r6 = new java.lang.String     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            com.google.ads.interactivemedia.v3.internal.bjq r7 = r1.mo16878d()     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r7 = r7.mo15216q()     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            r6.<init>(r7)     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            boolean r5 = r5.equals(r6)     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            if (r5 == 0) goto L_0x00d4
            com.google.ads.interactivemedia.v3.internal.bjq r5 = r1.mo16877c()     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r5 = r5.mo15216q()     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            com.google.ads.interactivemedia.v3.internal.bjq r6 = r1.mo16876a()     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r6 = r6.mo15216q()     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r6 = com.google.ads.interactivemedia.p039v3.internal.C4001fu.m17212d(r6)     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            boolean r5 = java.util.Arrays.equals(r5, r6)     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            if (r5 == 0) goto L_0x00d4
            com.google.ads.interactivemedia.v3.internal.bjq r5 = r1.mo16879e()     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r5 = r5.mo15216q()     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            java.lang.String r6 = android.os.Build.VERSION.SDK     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r6 = r6.getBytes()     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            boolean r5 = java.util.Arrays.equals(r5, r6)     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            if (r5 != 0) goto L_0x00a9
            goto L_0x00d4
        L_0x00a9:
            com.google.ads.interactivemedia.v3.internal.gt r0 = r10.f17363g     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r5 = r10.f17364h     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            java.lang.String r6 = new java.lang.String     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            com.google.ads.interactivemedia.v3.internal.bjq r1 = r1.mo16876a()     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r1 = r1.mo15216q()     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            r6.<init>(r1)     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            byte[] r0 = r0.mo15887b(r5, r6)     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            r2.createNewFile()     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            r1.<init>(r2)     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            int r11 = r0.length     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e4, all -> 0x00d1 }
            r1.write(r0, r3, r11)     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e4, all -> 0x00d1 }
            r4.close()     // Catch:{ IOException -> 0x00cd }
        L_0x00cd:
            r1.close()     // Catch:{ IOException -> 0x00d0 }
        L_0x00d0:
            return
        L_0x00d1:
            r11 = move-exception
            r0 = r11
            goto L_0x00e1
        L_0x00d4:
            m17295w(r0)     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e3, all -> 0x00df }
            r4.close()     // Catch:{ IOException -> 0x00da }
        L_0x00da:
            return
        L_0x00db:
            r4.close()     // Catch:{ IOException -> 0x00de }
        L_0x00de:
            return
        L_0x00df:
            r0 = move-exception
            r1 = r11
        L_0x00e1:
            r11 = r4
            goto L_0x00e8
        L_0x00e3:
            r1 = r11
        L_0x00e4:
            r11 = r4
            goto L_0x00f6
        L_0x00e6:
            r0 = move-exception
            r1 = r11
        L_0x00e8:
            if (r11 == 0) goto L_0x00ef
            r11.close()     // Catch:{ IOException -> 0x00ee }
            goto L_0x00ef
        L_0x00ee:
        L_0x00ef:
            if (r1 == 0) goto L_0x00f4
            r1.close()     // Catch:{ IOException -> 0x00f4 }
        L_0x00f4:
            throw r0
        L_0x00f5:
            r1 = r11
        L_0x00f6:
            if (r11 == 0) goto L_0x00fd
            r11.close()     // Catch:{ IOException -> 0x00fc }
            goto L_0x00fd
        L_0x00fc:
        L_0x00fd:
            if (r1 == 0) goto L_0x0102
            r1.close()     // Catch:{ IOException -> 0x0102 }
        L_0x0102:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C4037hc.m17296x(java.io.File):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:22|23|24|25|26|27|28|30) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x00bd */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d3 A[SYNTHETIC, Splitter:B:42:0x00d3] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00da A[SYNTHETIC, Splitter:B:46:0x00da] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00e4 A[SYNTHETIC, Splitter:B:54:0x00e4] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00eb A[SYNTHETIC, Splitter:B:58:0x00eb] */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m17297y(java.io.File r12) {
        /*
            r11 = this;
            java.lang.String r0 = "test"
            java.io.File r1 = new java.io.File
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r12
            r5 = 1
            java.lang.String r6 = "1616432909849"
            r3[r5] = r6
            java.lang.String r7 = "%s/%s.tmp"
            java.lang.String r3 = java.lang.String.format(r7, r3)
            r1.<init>(r3)
            boolean r3 = r1.exists()
            if (r3 == 0) goto L_0x001f
            return
        L_0x001f:
            java.io.File r3 = new java.io.File
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r12
            r2[r5] = r6
            java.lang.String r12 = "%s/%s.dex"
            java.lang.String r12 = java.lang.String.format(r12, r2)
            r3.<init>(r12)
            boolean r12 = r3.exists()
            if (r12 != 0) goto L_0x0037
            return
        L_0x0037:
            long r7 = r3.length()
            r9 = 0
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 > 0) goto L_0x0042
            return
        L_0x0042:
            int r12 = (int) r7
            byte[] r12 = new byte[r12]
            r2 = 0
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e1, all -> 0x00ce }
            r5.<init>(r3)     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00e1, all -> 0x00ce }
            int r7 = r5.read(r12)     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            if (r7 > 0) goto L_0x0058
            r5.close()     // Catch:{ IOException -> 0x0054 }
        L_0x0054:
            m17295w(r3)
            return
        L_0x0058:
            java.io.PrintStream r7 = java.lang.System.out     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r7.print(r0)     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            java.io.PrintStream r7 = java.lang.System.out     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r7.print(r0)     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            java.io.PrintStream r7 = java.lang.System.out     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r7.print(r0)     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            com.google.ads.interactivemedia.v3.internal.y r0 = com.google.ads.interactivemedia.p039v3.internal.C4520z.m19615g()     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            java.lang.String r7 = android.os.Build.VERSION.SDK     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            byte[] r7 = r7.getBytes()     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            com.google.ads.interactivemedia.v3.internal.bjq r7 = com.google.ads.interactivemedia.p039v3.internal.bjq.m16051n(r7)     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r0.mo16801c(r7)     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            byte[] r6 = r6.getBytes()     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            com.google.ads.interactivemedia.v3.internal.bjq r6 = com.google.ads.interactivemedia.p039v3.internal.bjq.m16051n(r6)     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r0.mo16802d(r6)     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            com.google.ads.interactivemedia.v3.internal.gt r6 = r11.f17363g     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            byte[] r7 = r11.f17364h     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            java.lang.String r12 = r6.mo15886a(r7, r12)     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            byte[] r12 = r12.getBytes()     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            com.google.ads.interactivemedia.v3.internal.bjq r6 = com.google.ads.interactivemedia.p039v3.internal.bjq.m16051n(r12)     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r0.mo16799a(r6)     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            byte[] r12 = com.google.ads.interactivemedia.p039v3.internal.C4001fu.m17212d(r12)     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            com.google.ads.interactivemedia.v3.internal.bjq r12 = com.google.ads.interactivemedia.p039v3.internal.bjq.m16051n(r12)     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r0.mo16800b(r12)     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r1.createNewFile()     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            java.io.FileOutputStream r12 = new java.io.FileOutputStream     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            r12.<init>(r1)     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cb, all -> 0x00c6 }
            com.google.ads.interactivemedia.v3.internal.bkl r0 = r0.mo15385ae()     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cc, all -> 0x00c4 }
            com.google.ads.interactivemedia.v3.internal.z r0 = (com.google.ads.interactivemedia.p039v3.internal.C4520z) r0     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cc, all -> 0x00c4 }
            byte[] r0 = r0.mo15165aV()     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cc, all -> 0x00c4 }
            int r1 = r0.length     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cc, all -> 0x00c4 }
            r12.write(r0, r4, r1)     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cc, all -> 0x00c4 }
            r12.close()     // Catch:{ gs | IOException | NoSuchAlgorithmException -> 0x00cc, all -> 0x00c4 }
            r5.close()     // Catch:{ IOException -> 0x00bd }
        L_0x00bd:
            r12.close()     // Catch:{ IOException -> 0x00c0 }
        L_0x00c0:
            m17295w(r3)
            return
        L_0x00c4:
            r0 = move-exception
            goto L_0x00c9
        L_0x00c6:
            r12 = move-exception
            r0 = r12
            r12 = r2
        L_0x00c9:
            r2 = r5
            goto L_0x00d1
        L_0x00cb:
            r12 = r2
        L_0x00cc:
            r2 = r5
            goto L_0x00e2
        L_0x00ce:
            r12 = move-exception
            r0 = r12
            r12 = r2
        L_0x00d1:
            if (r2 == 0) goto L_0x00d8
            r2.close()     // Catch:{ IOException -> 0x00d7 }
            goto L_0x00d8
        L_0x00d7:
        L_0x00d8:
            if (r12 == 0) goto L_0x00dd
            r12.close()     // Catch:{ IOException -> 0x00dd }
        L_0x00dd:
            m17295w(r3)
            throw r0
        L_0x00e1:
            r12 = r2
        L_0x00e2:
            if (r2 == 0) goto L_0x00e9
            r2.close()     // Catch:{ IOException -> 0x00e8 }
            goto L_0x00e9
        L_0x00e8:
        L_0x00e9:
            if (r12 == 0) goto L_0x00ee
            r12.close()     // Catch:{ IOException -> 0x00ee }
        L_0x00ee:
            m17295w(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p039v3.internal.C4037hc.m17297y(java.io.File):void");
    }

    /* renamed from: a */
    public final Context mo15893a() {
        return this.f17358a;
    }

    /* renamed from: b */
    public final boolean mo15894b() {
        return this.f17373q;
    }

    /* renamed from: c */
    public final ExecutorService mo15895c() {
        return this.f17361e;
    }

    /* renamed from: d */
    public final DexClassLoader mo15896d() {
        return this.f17362f;
    }

    /* renamed from: e */
    public final C4027gt mo15897e() {
        return this.f17363g;
    }

    /* renamed from: f */
    public final byte[] mo15898f() {
        return this.f17364h;
    }

    /* renamed from: g */
    public final boolean mo15899g() {
        return this.f17359b;
    }

    /* renamed from: h */
    public final C4018gk mo15900h() {
        return this.f17371o;
    }

    /* renamed from: i */
    public final boolean mo15901i() {
        return this.f17360c;
    }

    /* renamed from: j */
    public final boolean mo15902j() {
        return this.f17374r.mo15888a();
    }

    /* renamed from: k */
    public final C4385u mo15903k() {
        return this.f17369m;
    }

    /* renamed from: l */
    public final Future mo15904l() {
        return this.f17370n;
    }

    /* renamed from: m */
    public final Method mo15905m(String str, String str2) {
        C4067if ifVar = this.f17372p.get(new Pair(str, str2));
        if (ifVar == null) {
            return null;
        }
        return ifVar.mo15916a();
    }

    /* renamed from: n */
    public final AdvertisingIdClient mo15906n() {
        if (!this.f17366j) {
            return null;
        }
        if (this.f17365i != null) {
            return this.f17365i;
        }
        Future future = this.f17367k;
        if (future != null) {
            try {
                future.get(SimpleExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS, TimeUnit.MILLISECONDS);
                this.f17367k = null;
            } catch (InterruptedException | ExecutionException unused) {
            } catch (TimeoutException unused2) {
                this.f17367k.cancel(true);
            }
        }
        return this.f17365i;
    }

    /* renamed from: o */
    public final int mo15907o() {
        if (this.f17371o != null) {
            return C4018gk.m17236d();
        }
        return Integer.MIN_VALUE;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final void mo15908r(int i) {
        if (this.f17360c) {
            Future<?> submit = this.f17361e.submit(new C4035ha(this, i));
            if (i == 0) {
                this.f17370n = submit;
            }
        }
    }

    /* renamed from: t */
    public final void mo15909t(String str, String str2, Class<?>... clsArr) {
        if (!this.f17372p.containsKey(new Pair(str, str2))) {
            this.f17372p.put(new Pair(str, str2), new C4067if(this, str, str2, clsArr));
        }
    }
}
