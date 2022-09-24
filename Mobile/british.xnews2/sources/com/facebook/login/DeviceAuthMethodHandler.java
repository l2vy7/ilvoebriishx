package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.C3436c;
import com.facebook.login.LoginClient;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;

class DeviceAuthMethodHandler extends LoginMethodHandler {
    public static final Parcelable.Creator<DeviceAuthMethodHandler> CREATOR = new C3585a();

    /* renamed from: d */
    private static ScheduledThreadPoolExecutor f13330d;

    /* renamed from: com.facebook.login.DeviceAuthMethodHandler$a */
    static class C3585a implements Parcelable.Creator {
        C3585a() {
        }

        /* renamed from: a */
        public DeviceAuthMethodHandler createFromParcel(Parcel parcel) {
            return new DeviceAuthMethodHandler(parcel);
        }

        /* renamed from: b */
        public DeviceAuthMethodHandler[] newArray(int i) {
            return new DeviceAuthMethodHandler[i];
        }
    }

    DeviceAuthMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* renamed from: p */
    public static synchronized ScheduledThreadPoolExecutor m12012p() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceAuthMethodHandler.class) {
            if (f13330d == null) {
                f13330d = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f13330d;
        }
        return scheduledThreadPoolExecutor;
    }

    /* renamed from: t */
    private void m12013t(LoginClient.Request request) {
        FragmentActivity j = this.f13369c.mo12167j();
        if (j != null && !j.isFinishing()) {
            DeviceAuthDialog o = mo12128o();
            o.mo3729e2(j.mo3505r(), "login_with_facebook");
            o.mo12103D2(request);
        }
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo12091g() {
        return "device_auth";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean mo12094n(LoginClient.Request request) {
        m12013t(request);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public DeviceAuthDialog mo12128o() {
        return new DeviceAuthDialog();
    }

    /* renamed from: q */
    public void mo12129q() {
        this.f13369c.mo12166h(LoginClient.Result.m12087a(this.f13369c.mo12172r(), "User canceled log in."));
    }

    /* renamed from: r */
    public void mo12130r(Exception exc) {
        this.f13369c.mo12166h(LoginClient.Result.m12088b(this.f13369c.mo12172r(), (String) null, exc.getMessage()));
    }

    /* renamed from: s */
    public void mo12131s(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, C3436c cVar, Date date, Date date2, Date date3) {
        this.f13369c.mo12166h(LoginClient.Result.m12090e(this.f13369c.mo12172r(), new AccessToken(str, str2, str3, collection, collection2, collection3, cVar, date, date2, date3)));
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    protected DeviceAuthMethodHandler(Parcel parcel) {
        super(parcel);
    }
}
