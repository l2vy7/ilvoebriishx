package com.adcolony.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.adcolony.sdk.C2978z;

/* renamed from: com.adcolony.sdk.g0 */
class C2786g0 {
    C2786g0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo9664a() {
        if (mo9666c()) {
            return "wifi";
        }
        return mo9665b() ? "cell" : "none";
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    public boolean mo9665b() {
        NetworkInfo networkInfo;
        Context b = C2684a.m9407b();
        if (b == null) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) b.getApplicationContext().getSystemService("connectivity");
            if (connectivityManager == null) {
                networkInfo = null;
            } else {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            }
            if (networkInfo == null) {
                return false;
            }
            int type = networkInfo.getType();
            if (type == 0 || type >= 2) {
                return true;
            }
            return false;
        } catch (SecurityException e) {
            new C2978z.C2979a().mo10088a("SecurityException - please ensure you added the ").mo10088a("ACCESS_NETWORK_STATE permission: ").mo10088a(e.toString()).mo10090a(C2978z.f11949i);
            return false;
        } catch (Exception e2) {
            new C2978z.C2979a().mo10088a("Exception occurred when retrieving activeNetworkInfo in ").mo10088a("ADCNetwork.using_mobile(): ").mo10088a(e2.toString()).mo10090a(C2978z.f11950j);
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    @SuppressLint({"MissingPermission"})
    /* renamed from: c */
    public boolean mo9666c() {
        NetworkInfo networkInfo;
        Context b = C2684a.m9407b();
        if (b == null) {
            return false;
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) b.getApplicationContext().getSystemService("connectivity");
            if (connectivityManager == null) {
                networkInfo = null;
            } else {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            }
            if (networkInfo != null && networkInfo.getType() == 1) {
                return true;
            }
            return false;
        } catch (SecurityException e) {
            new C2978z.C2979a().mo10088a("SecurityException - please ensure you added the ").mo10088a("ACCESS_NETWORK_STATE permission: ").mo10088a(e.toString()).mo10090a(C2978z.f11949i);
            return false;
        } catch (Exception e2) {
            new C2978z.C2979a().mo10088a("Exception occurred when retrieving activeNetworkInfo in ").mo10088a("ADCNetwork.using_wifi(): ").mo10088a(e2.toString()).mo10090a(C2978z.f11950j);
            return false;
        }
    }
}
