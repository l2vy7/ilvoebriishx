package com.facebook.login;

import android.net.Uri;
import com.facebook.login.LoginClient;
import java.util.Collection;

/* renamed from: com.facebook.login.b */
/* compiled from: DeviceLoginManager */
public class C3601b extends C3608g {

    /* renamed from: i */
    private static volatile C3601b f13384i;

    /* renamed from: g */
    private Uri f13385g;

    /* renamed from: h */
    private String f13386h;

    /* renamed from: A */
    public static C3601b m12140A() {
        if (f13384i == null) {
            synchronized (C3601b.class) {
                if (f13384i == null) {
                    f13384i = new C3601b();
                }
            }
        }
        return f13384i;
    }

    /* renamed from: B */
    public void mo12232B(Uri uri) {
        this.f13385g = uri;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public LoginClient.Request mo12233b(Collection<String> collection) {
        LoginClient.Request b = super.mo12233b(collection);
        Uri z = mo12235z();
        if (z != null) {
            b.mo12191m(z.toString());
        }
        String y = mo12234y();
        if (y != null) {
            b.mo12190l(y);
        }
        return b;
    }

    /* renamed from: y */
    public String mo12234y() {
        return this.f13386h;
    }

    /* renamed from: z */
    public Uri mo12235z() {
        return this.f13385g;
    }
}
