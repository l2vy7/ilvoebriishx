package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AccountManagerCallback;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.os.Handler;
import androidx.core.content.C0600b;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.measurement.internal.m */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
public final class C9837m extends C9737c5 {

    /* renamed from: c */
    private long f46449c;

    /* renamed from: d */
    private String f46450d;

    /* renamed from: e */
    private AccountManager f46451e;

    /* renamed from: f */
    private Boolean f46452f;

    /* renamed from: g */
    private long f46453g;

    C9837m(C4670h4 h4Var) {
        super(h4Var);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final boolean mo19280h() {
        Calendar instance = Calendar.getInstance();
        this.f46449c = TimeUnit.MINUTES.convert((long) (instance.get(15) + instance.get(16)), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        String lowerCase = language.toLowerCase(locale2);
        String lowerCase2 = locale.getCountry().toLowerCase(locale2);
        StringBuilder sb = new StringBuilder(String.valueOf(lowerCase).length() + 1 + String.valueOf(lowerCase2).length());
        sb.append(lowerCase);
        sb.append("-");
        sb.append(lowerCase2);
        this.f46450d = sb.toString();
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final long mo39057n() {
        mo19272b();
        return this.f46453g;
    }

    /* renamed from: o */
    public final long mo39058o() {
        mo38880i();
        return this.f46449c;
    }

    /* renamed from: p */
    public final String mo39059p() {
        mo38880i();
        return this.f46450d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public final void mo39060q() {
        mo19272b();
        this.f46452f = null;
        this.f46453g = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final boolean mo39061s() {
        mo19272b();
        long currentTimeMillis = this.f21269a.mo19274f().currentTimeMillis();
        if (currentTimeMillis - this.f46453g > 86400000) {
            this.f46452f = null;
        }
        Boolean bool = this.f46452f;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (C0600b.m3289a(this.f21269a.mo19277r(), "android.permission.GET_ACCOUNTS") != 0) {
            this.f21269a.mo19276j().mo19289y().mo38856a("Permission error checking for dasher/unicorn accounts");
            this.f46453g = currentTimeMillis;
            this.f46452f = Boolean.FALSE;
            return false;
        }
        if (this.f46451e == null) {
            this.f46451e = AccountManager.get(this.f21269a.mo19277r());
        }
        try {
            Account[] result = this.f46451e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, (AccountManagerCallback) null, (Handler) null).getResult();
            if (result == null || result.length <= 0) {
                Account[] result2 = this.f46451e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, (AccountManagerCallback) null, (Handler) null).getResult();
                if (result2 != null && result2.length > 0) {
                    this.f46452f = Boolean.TRUE;
                    this.f46453g = currentTimeMillis;
                    return true;
                }
                this.f46453g = currentTimeMillis;
                this.f46452f = Boolean.FALSE;
                return false;
            }
            this.f46452f = Boolean.TRUE;
            this.f46453g = currentTimeMillis;
            return true;
        } catch (AuthenticatorException | OperationCanceledException | IOException e) {
            this.f21269a.mo19276j().mo19284t().mo38857b("Exception checking account types", e);
        }
    }
}
