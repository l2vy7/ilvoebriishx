package com.startapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.startapp.c1 */
/* compiled from: Sta */
public class C11812c1 {

    /* renamed from: a */
    public static final Map<String, Bitmap> f52641a = new ConcurrentHashMap();

    /* renamed from: a */
    public static Bitmap m52082a(Context context, String str) {
        Bitmap b = m52084b(context, str);
        return b == null ? m52084b(context, str) : b;
    }

    /* renamed from: b */
    public static Bitmap m52084b(Context context, String str) {
        FileInputStream fileInputStream;
        Map<String, Bitmap> map = f52641a;
        Bitmap bitmap = (Bitmap) ((ConcurrentHashMap) map).get(str);
        if (bitmap != null) {
            return bitmap;
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream(context.getFilesDir().getPath() + "/" + str);
            try {
                Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream);
                decodeStream.setDensity(context.getResources() != null ? context.getResources().getDisplayMetrics().densityDpi : 160);
                ((ConcurrentHashMap) map).put(str, decodeStream);
                C5015nb.m22917a((Closeable) fileInputStream);
                return decodeStream;
            } catch (Exception unused) {
                C5015nb.m22917a((Closeable) fileInputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                fileInputStream2 = fileInputStream;
                C5015nb.m22917a((Closeable) fileInputStream2);
                throw th;
            }
        } catch (Exception unused2) {
            fileInputStream = null;
            C5015nb.m22917a((Closeable) fileInputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C5015nb.m22917a((Closeable) fileInputStream2);
            throw th;
        }
    }

    /* renamed from: a */
    public static boolean m52083a(Context context, String str, String str2) {
        if (!str.endsWith(str2)) {
            str = str + str2;
        }
        if (!((ConcurrentHashMap) f52641a).containsKey(str)) {
            if (!new File(context.getFilesDir().getPath() + "/" + str).exists()) {
                return false;
            }
        }
        return true;
    }
}
