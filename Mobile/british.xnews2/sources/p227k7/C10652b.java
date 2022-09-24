package p227k7;

import android.content.SharedPreferences;
import android.util.Base64;
import android.util.Log;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import org.json.JSONException;
import org.json.JSONObject;
import p261w6.C11086c;

/* renamed from: k7.b */
/* compiled from: IidStore */
public class C10652b {

    /* renamed from: c */
    private static final String[] f49231c = {"*", "FCM", "GCM", ""};

    /* renamed from: a */
    private final SharedPreferences f49232a;

    /* renamed from: b */
    private final String f49233b;

    public C10652b(C11086c cVar) {
        this.f49232a = cVar.mo43355h().getSharedPreferences("com.google.android.gms.appid", 0);
        this.f49233b = m48435b(cVar);
    }

    /* renamed from: a */
    private String m48434a(String str, String str2) {
        return "|T|" + str + "|" + str2;
    }

    /* renamed from: b */
    private static String m48435b(C11086c cVar) {
        String d = cVar.mo43358k().mo43369d();
        if (d != null) {
            return d;
        }
        String c = cVar.mo43358k().mo43368c();
        if (!c.startsWith("1:") && !c.startsWith("2:")) {
            return c;
        }
        String[] split = c.split(":");
        if (split.length != 4) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: c */
    private static String m48436c(PublicKey publicKey) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(publicKey.getEncoded());
            digest[0] = (byte) (((digest[0] & 15) + 112) & 255);
            return Base64.encodeToString(digest, 0, 8, 11);
        } catch (NoSuchAlgorithmException unused) {
            Log.w("ContentValues", "Unexpected error, device missing required algorithms");
            return null;
        }
    }

    /* renamed from: d */
    private String m48437d(String str) {
        try {
            return new JSONObject(str).getString("token");
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: e */
    private PublicKey m48438e(String str) {
        try {
            return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(str, 8)));
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            Log.w("ContentValues", "Invalid key stored " + e);
            return null;
        }
    }

    /* renamed from: g */
    private String m48439g() {
        String string;
        synchronized (this.f49232a) {
            string = this.f49232a.getString("|S|id", (String) null);
        }
        return string;
    }

    /* renamed from: h */
    private String m48440h() {
        synchronized (this.f49232a) {
            String string = this.f49232a.getString("|S||P|", (String) null);
            if (string == null) {
                return null;
            }
            PublicKey e = m48438e(string);
            if (e == null) {
                return null;
            }
            String c = m48436c(e);
            return c;
        }
    }

    /* renamed from: f */
    public String mo42779f() {
        synchronized (this.f49232a) {
            String g = m48439g();
            if (g != null) {
                return g;
            }
            String h = m48440h();
            return h;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002d, code lost:
        return r4;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo42780i() {
        /*
            r7 = this;
            android.content.SharedPreferences r0 = r7.f49232a
            monitor-enter(r0)
            java.lang.String[] r1 = f49231c     // Catch:{ all -> 0x0033 }
            int r2 = r1.length     // Catch:{ all -> 0x0033 }
            r3 = 0
        L_0x0007:
            r4 = 0
            if (r3 >= r2) goto L_0x0031
            r5 = r1[r3]     // Catch:{ all -> 0x0033 }
            java.lang.String r6 = r7.f49233b     // Catch:{ all -> 0x0033 }
            java.lang.String r5 = r7.m48434a(r6, r5)     // Catch:{ all -> 0x0033 }
            android.content.SharedPreferences r6 = r7.f49232a     // Catch:{ all -> 0x0033 }
            java.lang.String r4 = r6.getString(r5, r4)     // Catch:{ all -> 0x0033 }
            if (r4 == 0) goto L_0x002e
            boolean r5 = r4.isEmpty()     // Catch:{ all -> 0x0033 }
            if (r5 != 0) goto L_0x002e
            java.lang.String r1 = "{"
            boolean r1 = r4.startsWith(r1)     // Catch:{ all -> 0x0033 }
            if (r1 == 0) goto L_0x002c
            java.lang.String r4 = r7.m48437d(r4)     // Catch:{ all -> 0x0033 }
        L_0x002c:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x002e:
            int r3 = r3 + 1
            goto L_0x0007
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return r4
        L_0x0033:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            goto L_0x0037
        L_0x0036:
            throw r1
        L_0x0037:
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: p227k7.C10652b.mo42780i():java.lang.String");
    }
}
