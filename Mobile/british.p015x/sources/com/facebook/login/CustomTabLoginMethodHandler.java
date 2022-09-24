package com.facebook.login;

import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.C3436c;
import com.facebook.C3575l;
import com.facebook.C3642m;
import com.facebook.CustomTabMainActivity;
import com.facebook.internal.C3481f0;
import com.facebook.internal.C3489g0;
import com.facebook.login.LoginClient;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class CustomTabLoginMethodHandler extends WebLoginMethodHandler {
    public static final Parcelable.Creator<CustomTabLoginMethodHandler> CREATOR = new C3576a();

    /* renamed from: h */
    private static final String[] f13294h = {"com.android.chrome", "com.chrome.beta", "com.chrome.dev"};

    /* renamed from: e */
    private String f13295e;

    /* renamed from: f */
    private String f13296f;

    /* renamed from: g */
    private String f13297g;

    /* renamed from: com.facebook.login.CustomTabLoginMethodHandler$a */
    static class C3576a implements Parcelable.Creator {
        C3576a() {
        }

        /* renamed from: a */
        public CustomTabLoginMethodHandler createFromParcel(Parcel parcel) {
            return new CustomTabLoginMethodHandler(parcel);
        }

        /* renamed from: b */
        public CustomTabLoginMethodHandler[] newArray(int i) {
            return new CustomTabLoginMethodHandler[i];
        }
    }

    CustomTabLoginMethodHandler(LoginClient loginClient) {
        super(loginClient);
        this.f13297g = "";
        this.f13296f = C3481f0.m11646p(20);
        if (C3489g0.m11682d(C3642m.m12279e(), m11958y())) {
            this.f13297g = m11958y();
        } else if (C3489g0.m11682d(C3642m.m12279e(), m11957x())) {
            this.f13297g = m11957x();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a1  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m11954A(java.lang.String r7, com.facebook.login.LoginClient.Request r8) {
        /*
            r6 = this;
            if (r7 == 0) goto L_0x00bb
            java.lang.String r0 = "fbconnect://cct."
            boolean r0 = r7.startsWith(r0)
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = super.mo12095q()
            boolean r0 = r7.startsWith(r0)
            if (r0 == 0) goto L_0x00bb
        L_0x0014:
            android.net.Uri r7 = android.net.Uri.parse(r7)
            java.lang.String r0 = r7.getQuery()
            android.os.Bundle r0 = com.facebook.internal.C3481f0.m11614Y(r0)
            java.lang.String r7 = r7.getFragment()
            android.os.Bundle r7 = com.facebook.internal.C3481f0.m11614Y(r7)
            r0.putAll(r7)
            boolean r7 = r6.m11955B(r0)
            r1 = 0
            if (r7 != 0) goto L_0x003d
            com.facebook.j r7 = new com.facebook.j
            java.lang.String r0 = "Invalid state parameter"
            r7.<init>((java.lang.String) r0)
            super.mo12221u(r8, r1, r7)
            return
        L_0x003d:
            java.lang.String r7 = "error"
            java.lang.String r7 = r0.getString(r7)
            if (r7 != 0) goto L_0x004b
            java.lang.String r7 = "error_type"
            java.lang.String r7 = r0.getString(r7)
        L_0x004b:
            java.lang.String r2 = "error_msg"
            java.lang.String r2 = r0.getString(r2)
            if (r2 != 0) goto L_0x0059
            java.lang.String r2 = "error_message"
            java.lang.String r2 = r0.getString(r2)
        L_0x0059:
            if (r2 != 0) goto L_0x0061
            java.lang.String r2 = "error_description"
            java.lang.String r2 = r0.getString(r2)
        L_0x0061:
            java.lang.String r3 = "error_code"
            java.lang.String r3 = r0.getString(r3)
            boolean r4 = com.facebook.internal.C3481f0.m11604O(r3)
            r5 = -1
            if (r4 != 0) goto L_0x0073
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x0073 }
            goto L_0x0074
        L_0x0073:
            r3 = -1
        L_0x0074:
            boolean r4 = com.facebook.internal.C3481f0.m11604O(r7)
            if (r4 == 0) goto L_0x0086
            boolean r4 = com.facebook.internal.C3481f0.m11604O(r2)
            if (r4 == 0) goto L_0x0086
            if (r3 != r5) goto L_0x0086
            super.mo12221u(r8, r0, r1)
            goto L_0x00bb
        L_0x0086:
            if (r7 == 0) goto L_0x00a1
            java.lang.String r0 = "access_denied"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0098
            java.lang.String r0 = "OAuthAccessDeniedException"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00a1
        L_0x0098:
            com.facebook.l r7 = new com.facebook.l
            r7.<init>()
            super.mo12221u(r8, r1, r7)
            goto L_0x00bb
        L_0x00a1:
            r0 = 4201(0x1069, float:5.887E-42)
            if (r3 != r0) goto L_0x00ae
            com.facebook.l r7 = new com.facebook.l
            r7.<init>()
            super.mo12221u(r8, r1, r7)
            goto L_0x00bb
        L_0x00ae:
            com.facebook.FacebookRequestError r0 = new com.facebook.FacebookRequestError
            r0.<init>(r3, r7, r2)
            com.facebook.o r7 = new com.facebook.o
            r7.<init>(r0, r2)
            super.mo12221u(r8, r1, r7)
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.CustomTabLoginMethodHandler.m11954A(java.lang.String, com.facebook.login.LoginClient$Request):void");
    }

    /* renamed from: B */
    private boolean m11955B(Bundle bundle) {
        try {
            String string = bundle.getString("state");
            if (string == null) {
                return false;
            }
            return new JSONObject(string).getString("7_challenge").equals(this.f13296f);
        } catch (JSONException unused) {
            return false;
        }
    }

    /* renamed from: w */
    private String m11956w() {
        String str = this.f13295e;
        if (str != null) {
            return str;
        }
        FragmentActivity j = this.f13369c.mo12167j();
        List<ResolveInfo> queryIntentServices = j.getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (queryIntentServices == null) {
            return null;
        }
        HashSet hashSet = new HashSet(Arrays.asList(f13294h));
        for (ResolveInfo resolveInfo : queryIntentServices) {
            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
            if (serviceInfo != null && hashSet.contains(serviceInfo.packageName)) {
                String str2 = serviceInfo.packageName;
                this.f13295e = str2;
                return str2;
            }
        }
        return null;
    }

    /* renamed from: x */
    private String m11957x() {
        return "fbconnect://cct." + C3642m.m12279e().getPackageName();
    }

    /* renamed from: y */
    private String m11958y() {
        return super.mo12095q();
    }

    /* renamed from: z */
    private boolean m11959z() {
        return m11956w() != null && !mo12095q().isEmpty();
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo12091g() {
        return "custom_tab";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public boolean mo12092k(int i, int i2, Intent intent) {
        if (i != 1) {
            return super.mo12092k(i, i2, intent);
        }
        LoginClient.Request r = this.f13369c.mo12172r();
        if (i2 == -1) {
            m11954A(intent.getStringExtra(CustomTabMainActivity.f12728f), r);
            return true;
        }
        super.mo12221u(r, (Bundle) null, new C3575l());
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo12093l(JSONObject jSONObject) throws JSONException {
        jSONObject.put("7_challenge", this.f13296f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo12094n(LoginClient.Request request) {
        if (!m11959z()) {
            return false;
        }
        Bundle o = mo12219o(mo12220p(request), request);
        Intent intent = new Intent(this.f13369c.mo12167j(), CustomTabMainActivity.class);
        intent.putExtra(CustomTabMainActivity.f12726d, o);
        intent.putExtra(CustomTabMainActivity.f12727e, m11956w());
        this.f13369c.mo12169m().startActivityForResult(intent, 1);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public String mo12095q() {
        return this.f13297g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public String mo12096r() {
        return "chrome_custom_tab";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public C3436c mo12097s() {
        return C3436c.CHROME_CUSTOM_TAB;
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.f13296f);
    }

    CustomTabLoginMethodHandler(Parcel parcel) {
        super(parcel);
        this.f13297g = "";
        this.f13296f = parcel.readString();
    }
}
