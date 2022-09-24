package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import p006a5.C0114k;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class y13 {
    /* renamed from: a */
    public static File m39724a(File file, boolean z) {
        if (z && file.exists() && !file.isDirectory()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: b */
    public static File m39725b(String str, String str2, File file) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        return new File(m39726c(str, file), str2);
    }

    /* renamed from: c */
    public static File m39726c(String str, File file) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file2 = new File(file, str);
        m39724a(file2, false);
        return file2;
    }

    /* renamed from: d */
    public static boolean m39727d(File file) {
        boolean z;
        if (!file.exists()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            int length = listFiles.length;
            z = true;
            for (int i = 0; i < length; i++) {
                File file2 = listFiles[i];
                z = file2 != null && m39727d(file2) && z;
            }
        } else {
            z = true;
        }
        if (!file.delete() || !z) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m39728e(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = null;
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.flush();
                C0114k.m409a(fileOutputStream2);
                return true;
            } catch (IOException unused) {
                fileOutputStream = fileOutputStream2;
                C0114k.m409a(fileOutputStream);
                return false;
            } catch (Throwable th) {
                th = th;
                fileOutputStream = fileOutputStream2;
                C0114k.m409a(fileOutputStream);
                throw th;
            }
        } catch (IOException unused2) {
            C0114k.m409a(fileOutputStream);
            return false;
        } catch (Throwable th2) {
            th = th2;
            C0114k.m409a(fileOutputStream);
            throw th;
        }
    }
}
