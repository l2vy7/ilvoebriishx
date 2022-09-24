package p006a5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p193c5.C6520c;

/* renamed from: a5.a */
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class C6479a {
    @Deprecated
    /* renamed from: a */
    public static byte[] m28234a(Context context, String str) throws PackageManager.NameNotFoundException {
        MessageDigest b;
        PackageInfo f = C6520c.m28321a(context).mo24355f(str, 64);
        Signature[] signatureArr = f.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (b = m28235b("SHA1")) == null) {
            return null;
        }
        return b.digest(f.signatures[0].toByteArray());
    }

    /* renamed from: b */
    public static MessageDigest m28235b(String str) {
        int i = 0;
        while (i < 2) {
            try {
                MessageDigest instance = MessageDigest.getInstance(str);
                if (instance != null) {
                    return instance;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }
}
