package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.C7354c;
import java.util.Locale;
import javax.annotation.concurrent.GuardedBy;
import p006a5.C6487i;
import p089i0.C5423c;
import p149t.C6090g;
import p192c5.C6520c;
import p224k4.C10637c;
import p251t4.C11015e;

/* renamed from: com.google.android.gms.common.internal.y */
/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
public final class C7441y {
    @GuardedBy("sCache")

    /* renamed from: a */
    private static final C6090g<String, String> f29370a = new C6090g<>();
    @GuardedBy("sCache")

    /* renamed from: b */
    private static Locale f29371b;

    /* renamed from: a */
    public static String m30075a(Context context) {
        String packageName = context.getPackageName();
        try {
            return C6520c.m28321a(context).mo24353d(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: b */
    public static String m30076b(Context context) {
        return context.getResources().getString(C10637c.f49198g);
    }

    /* renamed from: c */
    public static String m30077c(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(C10637c.f49195d);
        }
        if (i == 2) {
            return resources.getString(C10637c.f49201j);
        }
        if (i != 3) {
            return resources.getString(17039370);
        }
        return resources.getString(C10637c.f49192a);
    }

    /* renamed from: d */
    public static String m30078d(Context context, int i) {
        Resources resources = context.getResources();
        String a = m30075a(context);
        if (i == 1) {
            return resources.getString(C10637c.f49196e, new Object[]{a});
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(C10637c.f49193b, new Object[]{a});
            } else if (i == 5) {
                return m30082h(context, "common_google_play_services_invalid_account_text", a);
            } else {
                if (i == 7) {
                    return m30082h(context, "common_google_play_services_network_error_text", a);
                }
                if (i == 9) {
                    return resources.getString(C10637c.f49200i, new Object[]{a});
                } else if (i == 20) {
                    return m30082h(context, "common_google_play_services_restricted_profile_text", a);
                } else {
                    switch (i) {
                        case 16:
                            return m30082h(context, "common_google_play_services_api_unavailable_text", a);
                        case 17:
                            return m30082h(context, "common_google_play_services_sign_in_failed_text", a);
                        case 18:
                            return resources.getString(C10637c.f49204m, new Object[]{a});
                        default:
                            return resources.getString(C11015e.f49970a, new Object[]{a});
                    }
                }
            }
        } else if (C6487i.m28268f(context)) {
            return resources.getString(C10637c.f49205n);
        } else {
            return resources.getString(C10637c.f49202k, new Object[]{a});
        }
    }

    /* renamed from: e */
    public static String m30079e(Context context, int i) {
        if (i == 6 || i == 19) {
            return m30082h(context, "common_google_play_services_resolution_required_text", m30075a(context));
        }
        return m30078d(context, i);
    }

    /* renamed from: f */
    public static String m30080f(Context context, int i) {
        String str;
        if (i == 6) {
            str = m30083i(context, "common_google_play_services_resolution_required_title");
        } else {
            str = m30081g(context, i);
        }
        return str == null ? context.getResources().getString(C10637c.f49199h) : str;
    }

    /* renamed from: g */
    public static String m30081g(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C10637c.f49197f);
            case 2:
                return resources.getString(C10637c.f49203l);
            case 3:
                return resources.getString(C10637c.f49194c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m30083i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m30083i(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m30083i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m30083i(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
        }
    }

    /* renamed from: h */
    private static String m30082h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i = m30083i(context, str);
        if (i == null) {
            i = resources.getString(C11015e.f49970a);
        }
        return String.format(resources.getConfiguration().locale, i, new Object[]{str2});
    }

    /* renamed from: i */
    private static String m30083i(Context context, String str) {
        String str2;
        String str3;
        C6090g<String, String> gVar = f29370a;
        synchronized (gVar) {
            Locale c = C5423c.m24376a(context.getResources().getConfiguration()).mo21877c(0);
            if (!c.equals(f29371b)) {
                gVar.clear();
                f29371b = c;
            }
            String str4 = gVar.get(str);
            if (str4 != null) {
                return str4;
            }
            Resources f = C7354c.m29934f(context);
            if (f == null) {
                return null;
            }
            int identifier = f.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                if (str.length() != 0) {
                    str3 = "Missing resource: ".concat(str);
                } else {
                    str3 = new String("Missing resource: ");
                }
                Log.w("GoogleApiAvailability", str3);
                return null;
            }
            String string = f.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                if (str.length() != 0) {
                    str2 = "Got empty resource: ".concat(str);
                } else {
                    str2 = new String("Got empty resource: ");
                }
                Log.w("GoogleApiAvailability", str2);
                return null;
            }
            gVar.put(str, string);
            return string;
        }
    }
}
