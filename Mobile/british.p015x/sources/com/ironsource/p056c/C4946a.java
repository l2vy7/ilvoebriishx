package com.ironsource.p056c;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.environment.C4952a;
import com.ironsource.environment.C4961c;
import com.ironsource.environment.C4979h;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C11412m;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.c.a */
public class C4946a {

    /* renamed from: a */
    private C11412m f21958a = new C11412m();

    /* renamed from: a */
    public static String m22688a(Context context) {
        return Build.VERSION.SDK_INT >= 23 ? m22689a(m22691b(context), context) : m22694e(context);
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public static String m22689a(Network network, Context context) {
        String str;
        if (context == null) {
            return "none";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (network == null || connectivityManager == null) {
            return "none";
        }
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities == null) {
                    return m22694e(context);
                }
                if (networkCapabilities.hasTransport(1)) {
                    str = "wifi";
                } else if (!networkCapabilities.hasTransport(0)) {
                    return m22694e(context);
                } else {
                    str = "3g";
                }
            } else {
                str = m22694e(context);
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return "none";
        }
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: a */
    public static JSONObject m22690a(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        if (Build.VERSION.SDK_INT >= 23 && network != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (!(connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) == null)) {
                    jSONObject.put("networkCapabilities", networkCapabilities.toString());
                    jSONObject.put("downloadSpeed", networkCapabilities.getLinkDownstreamBandwidthKbps());
                    jSONObject.put("uploadSpeed", networkCapabilities.getLinkUpstreamBandwidthKbps());
                    jSONObject.put("hasVPN", m22693c(context));
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    public static Network m22691b(Context context) {
        if (context == null) {
            return null;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (Build.VERSION.SDK_INT >= 23 && connectivityManager != null) {
            try {
                return connectivityManager.getActiveNetwork();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: c */
    private static String m22692c(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (!(Build.VERSION.SDK_INT < 23 || network == null || context == null)) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) == null) {
                    return "";
                }
                if (networkCapabilities.hasTransport(1)) {
                    return "wifi";
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "cellular";
                }
                if (networkCapabilities.hasTransport(4)) {
                    return "vpn";
                }
                if (networkCapabilities.hasTransport(3)) {
                    return "ethernet";
                }
                if (networkCapabilities.hasTransport(5)) {
                    return "wifiAware";
                }
                if (networkCapabilities.hasTransport(6)) {
                    return "lowpan";
                }
                if (networkCapabilities.hasTransport(2)) {
                    return "bluetooth";
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    /* renamed from: c */
    public static boolean m22693c(Context context) {
        return m22692c(context, m22691b(context)).equals("vpn");
    }

    /* renamed from: e */
    private static String m22694e(Context context) {
        String a = C4952a.C49531.m22716a(context);
        return TextUtils.isEmpty(a) ? "none" : a;
    }

    /* renamed from: a */
    public void mo20542a(String str) {
        C11412m.m51068a("apky", (Object) str);
    }

    /* renamed from: a */
    public void mo20543a(JSONObject jSONObject) {
        C11412m.m51068a("md", (Object) jSONObject);
    }

    /* renamed from: a */
    public void mo20544a(boolean z) {
        C11412m.m51068a("cnst", (Object) Boolean.valueOf(z));
    }

    /* renamed from: b */
    public void mo20545b(String str) {
        C11412m.m51068a("medv", (Object) str);
    }

    /* renamed from: c */
    public void mo20546c(String str) {
        C11412m.m51068a("sid", (Object) str);
    }

    /* renamed from: d */
    public void mo20547d(Context context) {
        ContextProvider.getInstance().postOnUIThread(new Runnable(context) {

            /* renamed from: b */
            private /* synthetic */ Context f22021b;

            {
                this.f22021b = r2;
            }

            public final void run() {
                try {
                    C4962a aVar = C4962a.this;
                    Context context = this.f22021b;
                    if (context != null && !aVar.f22020c.getAndSet(true)) {
                        aVar.mo20581a("auid", C4979h.m22834z(context));
                        aVar.mo20581a("model", C4979h.m22803g());
                        aVar.mo20581a("make", C4979h.m22804h());
                        aVar.mo20581a("os", C4979h.m22806i());
                        String e = C4979h.m22798e();
                        if (e != null) {
                            aVar.mo20581a("osv", e.replaceAll("[^0-9/.]", ""));
                            aVar.mo20581a("osvf", e);
                        }
                        aVar.mo20581a("apilvl", String.valueOf(C4979h.m22800f()));
                        String j = C4979h.m22808j(context);
                        if (j != null && j.length() > 0) {
                            aVar.mo20581a("carrier", j);
                        }
                        String d = C4961c.m22746d(context);
                        if (!TextUtils.isEmpty(d)) {
                            aVar.mo20581a("instlr", d);
                        }
                        String B = C4979h.m22781B(context);
                        if (!TextUtils.isEmpty(B)) {
                            aVar.mo20581a("dt", B);
                        }
                        aVar.mo20581a("bid", context.getPackageName());
                        aVar.mo20581a("mem", String.valueOf(C4979h.m22797e(context)));
                        aVar.mo20581a("tkv", "2.0");
                        aVar.mo20581a("tsu", Long.valueOf(C4961c.m22742b(context)));
                        aVar.mo20581a("tai", Long.valueOf(C4961c.m22739a(context)));
                        aVar.mo20581a("apv", C4961c.m22744c(context));
                        aVar.mo20581a("ptype", Integer.valueOf(C4952a.C49531.m22733f(context)));
                        aVar.mo20581a("simop", C4952a.C49531.m22732e(context));
                    }
                    C4962a.this.mo20580a(this.f22021b);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        });
    }

    /* renamed from: d */
    public void mo20548d(String str) {
        C11412m.m51068a("plugin", (Object) str);
    }
}
