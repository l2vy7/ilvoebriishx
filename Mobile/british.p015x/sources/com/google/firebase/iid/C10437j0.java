package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.core.content.C0600b;
import com.google.android.exoplayer2.C6540C;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;
import p078f7.C10540c;
import p236n5.C10831b;

/* renamed from: com.google.firebase.iid.j0 */
final class C10437j0 {
    C10437j0() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009c, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009d, code lost:
        if (r9 != null) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        m48084i(r11, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a2, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a5, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
        m48083h(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a9, code lost:
        throw r11;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.firebase.iid.C10439k0 m48076a(android.content.Context r9, java.lang.String r10, com.google.firebase.iid.C10439k0 r11, boolean r12) {
        /*
            r8 = this;
            java.lang.String r0 = "FirebaseInstanceId"
            r1 = 3
            boolean r2 = android.util.Log.isLoggable(r0, r1)
            if (r2 == 0) goto L_0x000e
            java.lang.String r2 = "Writing key to properties file"
            android.util.Log.d(r0, r2)
        L_0x000e:
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            java.lang.String r3 = r11.m48100e()
            java.lang.String r4 = "pub"
            r2.setProperty(r4, r3)
            java.lang.String r3 = r11.m48101f()
            java.lang.String r4 = "pri"
            r2.setProperty(r4, r3)
            long r3 = r11.f48892b
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "cre"
            r2.setProperty(r4, r3)
            java.io.File r9 = m48090q(r9, r10)
            r10 = 0
            r9.createNewFile()     // Catch:{ IOException -> 0x00aa }
            java.io.RandomAccessFile r3 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x00aa }
            java.lang.String r4 = "rw"
            r3.<init>(r9, r4)     // Catch:{ IOException -> 0x00aa }
            java.nio.channels.FileChannel r9 = r3.getChannel()     // Catch:{ all -> 0x00a3 }
            r9.lock()     // Catch:{ all -> 0x009a }
            r4 = 0
            if (r12 == 0) goto L_0x0089
            long r6 = r9.size()     // Catch:{ all -> 0x009a }
            int r12 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r12 <= 0) goto L_0x0089
            r9.position(r4)     // Catch:{ IOException -> 0x0064, a -> 0x0062 }
            com.google.firebase.iid.k0 r11 = m48079d(r9)     // Catch:{ IOException -> 0x0064, a -> 0x0062 }
            m48084i(r10, r9)     // Catch:{ all -> 0x00a3 }
            m48083h(r10, r3)     // Catch:{ IOException -> 0x00aa }
            return r11
        L_0x0062:
            r12 = move-exception
            goto L_0x0065
        L_0x0064:
            r12 = move-exception
        L_0x0065:
            boolean r1 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x009a }
            if (r1 == 0) goto L_0x0089
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x009a }
            int r1 = r12.length()     // Catch:{ all -> 0x009a }
            int r1 = r1 + 64
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x009a }
            r6.<init>(r1)     // Catch:{ all -> 0x009a }
            java.lang.String r1 = "Tried reading key pair before writing new one, but failed with: "
            r6.append(r1)     // Catch:{ all -> 0x009a }
            r6.append(r12)     // Catch:{ all -> 0x009a }
            java.lang.String r12 = r6.toString()     // Catch:{ all -> 0x009a }
            android.util.Log.d(r0, r12)     // Catch:{ all -> 0x009a }
        L_0x0089:
            r9.position(r4)     // Catch:{ all -> 0x009a }
            java.io.OutputStream r12 = java.nio.channels.Channels.newOutputStream(r9)     // Catch:{ all -> 0x009a }
            r2.store(r12, r10)     // Catch:{ all -> 0x009a }
            m48084i(r10, r9)     // Catch:{ all -> 0x00a3 }
            m48083h(r10, r3)     // Catch:{ IOException -> 0x00aa }
            return r11
        L_0x009a:
            r11 = move-exception
            throw r11     // Catch:{ all -> 0x009c }
        L_0x009c:
            r12 = move-exception
            if (r9 == 0) goto L_0x00a2
            m48084i(r11, r9)     // Catch:{ all -> 0x00a3 }
        L_0x00a2:
            throw r12     // Catch:{ all -> 0x00a3 }
        L_0x00a3:
            r9 = move-exception
            throw r9     // Catch:{ all -> 0x00a5 }
        L_0x00a5:
            r11 = move-exception
            m48083h(r9, r3)     // Catch:{ IOException -> 0x00aa }
            throw r11     // Catch:{ IOException -> 0x00aa }
        L_0x00aa:
            r9 = move-exception
            java.lang.String r9 = java.lang.String.valueOf(r9)
            int r11 = r9.length()
            int r11 = r11 + 21
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>(r11)
            java.lang.String r11 = "Failed to write key: "
            r12.append(r11)
            r12.append(r9)
            java.lang.String r9 = r12.toString()
            android.util.Log.w(r0, r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C10437j0.m48076a(android.content.Context, java.lang.String, com.google.firebase.iid.k0, boolean):com.google.firebase.iid.k0");
    }

    /* renamed from: b */
    private static C10439k0 m48077b(SharedPreferences sharedPreferences, String str) throws C10418a {
        String string = sharedPreferences.getString(C10436j.m48068g(str, "|P|"), (String) null);
        String string2 = sharedPreferences.getString(C10436j.m48068g(str, "|K|"), (String) null);
        if (string == null || string2 == null) {
            return null;
        }
        return new C10439k0(m48087n(string, string2), m48085j(sharedPreferences, str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0023, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
        if (r8 != null) goto L_0x0026;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        m48084i(r1, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002c, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002d, code lost:
        m48082g(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0030, code lost:
        throw r1;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.firebase.iid.C10439k0 m48078c(java.io.File r8) throws com.google.firebase.iid.C10418a, java.io.IOException {
        /*
            r7 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r8)
            java.nio.channels.FileChannel r8 = r0.getChannel()     // Catch:{ all -> 0x002a }
            r2 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 1
            r1 = r8
            r1.lock(r2, r4, r6)     // Catch:{ all -> 0x0021 }
            com.google.firebase.iid.k0 r1 = m48079d(r8)     // Catch:{ all -> 0x0021 }
            r2 = 0
            m48084i(r2, r8)     // Catch:{ all -> 0x002a }
            m48082g(r2, r0)
            return r1
        L_0x0021:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0023 }
        L_0x0023:
            r2 = move-exception
            if (r8 == 0) goto L_0x0029
            m48084i(r1, r8)     // Catch:{ all -> 0x002a }
        L_0x0029:
            throw r2     // Catch:{ all -> 0x002a }
        L_0x002a:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x002c }
        L_0x002c:
            r1 = move-exception
            m48082g(r8, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.C10437j0.m48078c(java.io.File):com.google.firebase.iid.k0");
    }

    /* renamed from: d */
    private static C10439k0 m48079d(FileChannel fileChannel) throws C10418a, IOException {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        String property = properties.getProperty("pub");
        String property2 = properties.getProperty("pri");
        if (property == null || property2 == null) {
            throw new C10418a("Invalid properties file");
        }
        try {
            return new C10439k0(m48087n(property, property2), Long.parseLong(properties.getProperty("cre")));
        } catch (NumberFormatException e) {
            throw new C10418a((Exception) e);
        }
    }

    /* renamed from: e */
    static void m48080e(Context context) {
        for (File file : m48086l(context).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
    }

    /* renamed from: f */
    private final void m48081f(Context context, String str, C10439k0 k0Var) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (k0Var.equals(m48077b(sharedPreferences, str))) {
                return;
            }
        } catch (C10418a unused) {
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Writing key to shared preferences");
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(C10436j.m48068g(str, "|P|"), k0Var.m48100e());
        edit.putString(C10436j.m48068g(str, "|K|"), k0Var.m48101f());
        edit.putString(C10436j.m48068g(str, "cre"), String.valueOf(k0Var.f48892b));
        edit.commit();
    }

    /* renamed from: g */
    private static /* synthetic */ void m48082g(Throwable th, FileInputStream fileInputStream) {
        if (th != null) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                C10831b.m48822b(th, th2);
            }
        } else {
            fileInputStream.close();
        }
    }

    /* renamed from: h */
    private static /* synthetic */ void m48083h(Throwable th, RandomAccessFile randomAccessFile) {
        if (th != null) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                C10831b.m48822b(th, th2);
            }
        } else {
            randomAccessFile.close();
        }
    }

    /* renamed from: i */
    private static /* synthetic */ void m48084i(Throwable th, FileChannel fileChannel) {
        if (th != null) {
            try {
                fileChannel.close();
            } catch (Throwable th2) {
                C10831b.m48822b(th, th2);
            }
        } else {
            fileChannel.close();
        }
    }

    /* renamed from: j */
    private static long m48085j(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(C10436j.m48068g(str, "cre"), (String) null);
        if (string == null) {
            return 0;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    /* renamed from: l */
    private static File m48086l(Context context) {
        File j = C0600b.m3298j(context);
        if (j != null && j.isDirectory()) {
            return j;
        }
        Log.w("FirebaseInstanceId", "noBackupFilesDir doesn't exist, using regular files directory instead");
        return context.getFilesDir();
    }

    /* renamed from: n */
    private static KeyPair m48087n(String str, String str2) throws C10418a {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory instance = KeyFactory.getInstance("RSA");
                return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 19);
                sb.append("Invalid key stored ");
                sb.append(valueOf);
                Log.w("FirebaseInstanceId", sb.toString());
                throw new C10418a((Exception) e);
            }
        } catch (IllegalArgumentException e2) {
            throw new C10418a((Exception) e2);
        }
    }

    /* renamed from: o */
    private final C10439k0 m48088o(Context context, String str) throws C10418a {
        try {
            C10439k0 p = m48089p(context, str);
            if (p != null) {
                m48081f(context, str, p);
                return p;
            }
            e = null;
            try {
                C10439k0 b = m48077b(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
                if (b != null) {
                    m48076a(context, str, b, false);
                    return b;
                }
            } catch (C10418a e) {
                e = e;
            }
            if (e == null) {
                return null;
            }
            throw e;
        } catch (C10418a e2) {
            e = e2;
        }
    }

    /* renamed from: p */
    private final C10439k0 m48089p(Context context, String str) throws C10418a {
        File q = m48090q(context, str);
        if (!q.exists()) {
            return null;
        }
        try {
            return m48078c(q);
        } catch (C10418a | IOException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(valueOf.length() + 40);
                sb.append("Failed to read key from file, retrying: ");
                sb.append(valueOf);
                Log.d("FirebaseInstanceId", sb.toString());
            }
            try {
                return m48078c(q);
            } catch (IOException e2) {
                String valueOf2 = String.valueOf(e2);
                StringBuilder sb2 = new StringBuilder(valueOf2.length() + 45);
                sb2.append("IID file exists, but failed to read from it: ");
                sb2.append(valueOf2);
                Log.w("FirebaseInstanceId", sb2.toString());
                throw new C10418a((Exception) e2);
            }
        }
    }

    /* renamed from: q */
    private static File m48090q(Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "com.google.InstanceId.properties";
        } else {
            try {
                String encodeToString = Base64.encodeToString(str.getBytes(C6540C.UTF8_NAME), 11);
                StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 33);
                sb.append("com.google.InstanceId_");
                sb.append(encodeToString);
                sb.append(".properties");
                str2 = sb.toString();
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        return new File(m48086l(context), str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final C10439k0 mo41895k(Context context, String str) throws C10418a {
        C10439k0 o = m48088o(context, str);
        if (o != null) {
            return o;
        }
        return mo41896m(context, str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final C10439k0 mo41896m(Context context, String str) {
        C10439k0 k0Var = new C10439k0(C10540c.m48276a(), System.currentTimeMillis());
        C10439k0 a = m48076a(context, str, k0Var, true);
        if (a == null || a.equals(k0Var)) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                Log.d("FirebaseInstanceId", "Generated new key");
            }
            m48081f(context, str, k0Var);
            return k0Var;
        }
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            Log.d("FirebaseInstanceId", "Loaded key after generating new one, using loaded one");
        }
        return a;
    }
}
