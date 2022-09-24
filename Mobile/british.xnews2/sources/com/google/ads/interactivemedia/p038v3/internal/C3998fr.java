package com.google.ads.interactivemedia.p038v3.internal;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/* renamed from: com.google.ads.interactivemedia.v3.internal.fr */
/* compiled from: IMASDK */
public abstract class C3998fr<K, V> {

    /* renamed from: a */
    private static final String f17078a = "fr";

    /* renamed from: b */
    protected static <K, V> HashMap<K, V> m17206b(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return (HashMap) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str.getBytes(), 0))).readObject();
            }
            return null;
        } catch (IOException | ClassNotFoundException unused) {
            Log.d(f17078a, "decode object failure");
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract HashMap<K, V> mo15857a();

    public final String toString() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(mo15857a());
            objectOutputStream.close();
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (IOException unused) {
            return null;
        }
    }
}
