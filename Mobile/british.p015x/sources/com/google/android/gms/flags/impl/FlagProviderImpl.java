package com.google.android.gms.flags.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import p199d5.C10487a;
import p199d5.C10489b;
import p207f5.C10536g;
import p210g5.C10557b;
import p210g5.C10559d;
import p210g5.C10561f;
import p210g5.C10563h;
import p210g5.C10565j;

@DynamiteApi
public class FlagProviderImpl extends C10536g {

    /* renamed from: b */
    private boolean f29476b = false;

    /* renamed from: c */
    private SharedPreferences f29477c;

    public boolean getBooleanFlagValue(String str, boolean z, int i) {
        if (!this.f29476b) {
            return z;
        }
        return C10557b.m48309a(this.f29477c, str, Boolean.valueOf(z)).booleanValue();
    }

    public int getIntFlagValue(String str, int i, int i2) {
        if (!this.f29476b) {
            return i;
        }
        return C10559d.m48310a(this.f29477c, str, Integer.valueOf(i)).intValue();
    }

    public long getLongFlagValue(String str, long j, int i) {
        if (!this.f29476b) {
            return j;
        }
        return C10561f.m48311a(this.f29477c, str, Long.valueOf(j)).longValue();
    }

    public String getStringFlagValue(String str, String str2, int i) {
        if (!this.f29476b) {
            return str2;
        }
        return C10563h.m48312a(this.f29477c, str, str2);
    }

    public void init(C10487a aVar) {
        Context context = (Context) C10489b.m48194f3(aVar);
        if (!this.f29476b) {
            try {
                this.f29477c = C10565j.m48313a(context.createPackageContext("com.google.android.gms", 0));
                this.f29476b = true;
            } catch (PackageManager.NameNotFoundException unused) {
            } catch (Exception e) {
                String valueOf = String.valueOf(e.getMessage());
                Log.w("FlagProviderImpl", valueOf.length() != 0 ? "Could not retrieve sdk flags, continuing with defaults: ".concat(valueOf) : new String("Could not retrieve sdk flags, continuing with defaults: "));
            }
        }
    }
}
