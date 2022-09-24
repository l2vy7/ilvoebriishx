package com.facebook.internal;

import com.google.android.exoplayer2.C6540C;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.UUID;

/* renamed from: com.facebook.internal.y */
/* compiled from: NativeAppCallAttachmentStore */
public final class C3562y {

    /* renamed from: a */
    private static File f13281a;

    /* renamed from: a */
    static File m11904a(UUID uuid, String str, boolean z) throws IOException {
        File b = m11905b(uuid, z);
        if (b == null) {
            return null;
        }
        try {
            return new File(b, URLEncoder.encode(str, C6540C.UTF8_NAME));
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* renamed from: b */
    static File m11905b(UUID uuid, boolean z) {
        if (f13281a == null) {
            return null;
        }
        File file = new File(f13281a, uuid.toString());
        if (z && !file.exists()) {
            file.mkdirs();
        }
        return file;
    }

    /* renamed from: c */
    public static File m11906c(UUID uuid, String str) throws FileNotFoundException {
        if (C3481f0.m11604O(str) || uuid == null) {
            throw new FileNotFoundException();
        }
        try {
            return m11904a(uuid, str, false);
        } catch (IOException unused) {
            throw new FileNotFoundException();
        }
    }
}
