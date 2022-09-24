package com.facebook.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.C0690c;
import com.facebook.AccessToken;
import com.facebook.C3436c;
import com.facebook.C3572j;
import com.facebook.C3642m;
import com.facebook.C3651p;
import com.facebook.C3655r;
import com.facebook.C3656s;
import com.facebook.FacebookActivity;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.appevents.C3420m;
import com.facebook.common.C3440d;
import com.facebook.common.C3441e;
import com.facebook.common.C3442f;
import com.facebook.common.C3443g;
import com.facebook.internal.C3477d0;
import com.facebook.internal.C3481f0;
import com.facebook.internal.C3489g0;
import com.facebook.internal.C3522n;
import com.facebook.login.LoginClient;
import com.unity3d.ads.metadata.MediationMetaData;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p102k3.C5628a;

public class DeviceAuthDialog extends C0690c {

    /* renamed from: C0 */
    private View f13298C0;

    /* renamed from: D0 */
    private TextView f13299D0;

    /* renamed from: E0 */
    private TextView f13300E0;

    /* renamed from: F0 */
    private DeviceAuthMethodHandler f13301F0;
    /* access modifiers changed from: private */

    /* renamed from: G0 */
    public AtomicBoolean f13302G0 = new AtomicBoolean();

    /* renamed from: H0 */
    private volatile C3651p f13303H0;

    /* renamed from: I0 */
    private volatile ScheduledFuture f13304I0;
    /* access modifiers changed from: private */

    /* renamed from: J0 */
    public volatile RequestState f13305J0;
    /* access modifiers changed from: private */

    /* renamed from: K0 */
    public Dialog f13306K0;
    /* access modifiers changed from: private */

    /* renamed from: L0 */
    public boolean f13307L0 = false;
    /* access modifiers changed from: private */

    /* renamed from: M0 */
    public boolean f13308M0 = false;
    /* access modifiers changed from: private */

    /* renamed from: N0 */
    public LoginClient.Request f13309N0 = null;

    private static class RequestState implements Parcelable {
        public static final Parcelable.Creator<RequestState> CREATOR = new C3577a();

        /* renamed from: b */
        private String f13310b;

        /* renamed from: c */
        private String f13311c;

        /* renamed from: d */
        private String f13312d;

        /* renamed from: e */
        private long f13313e;

        /* renamed from: f */
        private long f13314f;

        /* renamed from: com.facebook.login.DeviceAuthDialog$RequestState$a */
        static class C3577a implements Parcelable.Creator<RequestState> {
            C3577a() {
            }

            /* renamed from: a */
            public RequestState createFromParcel(Parcel parcel) {
                return new RequestState(parcel);
            }

            /* renamed from: b */
            public RequestState[] newArray(int i) {
                return new RequestState[i];
            }
        }

        RequestState() {
        }

        /* renamed from: a */
        public String mo12108a() {
            return this.f13310b;
        }

        /* renamed from: b */
        public long mo12109b() {
            return this.f13313e;
        }

        /* renamed from: d */
        public String mo12110d() {
            return this.f13312d;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public String mo12112e() {
            return this.f13311c;
        }

        /* renamed from: f */
        public void mo12113f(long j) {
            this.f13313e = j;
        }

        /* renamed from: g */
        public void mo12114g(long j) {
            this.f13314f = j;
        }

        /* renamed from: h */
        public void mo12115h(String str) {
            this.f13312d = str;
        }

        /* renamed from: i */
        public void mo12116i(String str) {
            this.f13311c = str;
            this.f13310b = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", new Object[]{str});
        }

        /* renamed from: j */
        public boolean mo12117j() {
            if (this.f13314f != 0 && (new Date().getTime() - this.f13314f) - (this.f13313e * 1000) < 0) {
                return true;
            }
            return false;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f13310b);
            parcel.writeString(this.f13311c);
            parcel.writeString(this.f13312d);
            parcel.writeLong(this.f13313e);
            parcel.writeLong(this.f13314f);
        }

        protected RequestState(Parcel parcel) {
            this.f13310b = parcel.readString();
            this.f13311c = parcel.readString();
            this.f13312d = parcel.readString();
            this.f13313e = parcel.readLong();
            this.f13314f = parcel.readLong();
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$a */
    class C3578a implements GraphRequest.C3360f {
        C3578a() {
        }

        /* renamed from: b */
        public void mo7382b(C3655r rVar) {
            if (!DeviceAuthDialog.this.f13307L0) {
                if (rVar.mo12380g() != null) {
                    DeviceAuthDialog.this.mo12107x2(rVar.mo12380g().mo11229g());
                    return;
                }
                JSONObject h = rVar.mo12381h();
                RequestState requestState = new RequestState();
                try {
                    requestState.mo12116i(h.getString("user_code"));
                    requestState.mo12115h(h.getString("code"));
                    requestState.mo12113f(h.getLong("interval"));
                    DeviceAuthDialog.this.m11971C2(requestState);
                } catch (JSONException e) {
                    DeviceAuthDialog.this.mo12107x2(new C3572j((Throwable) e));
                }
            }
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$b */
    class C3579b implements View.OnClickListener {
        C3579b() {
        }

        public void onClick(View view) {
            DeviceAuthDialog.this.mo12106w2();
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$c */
    class C3580c implements Runnable {
        C3580c() {
        }

        public void run() {
            DeviceAuthDialog.this.m11988z2();
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$d */
    class C3581d implements GraphRequest.C3360f {
        C3581d() {
        }

        /* renamed from: b */
        public void mo7382b(C3655r rVar) {
            if (!DeviceAuthDialog.this.f13302G0.get()) {
                FacebookRequestError g = rVar.mo12380g();
                if (g != null) {
                    int j = g.mo11232j();
                    if (j != 1349152) {
                        switch (j) {
                            case 1349172:
                            case 1349174:
                                DeviceAuthDialog.this.m11970B2();
                                return;
                            case 1349173:
                                DeviceAuthDialog.this.mo12106w2();
                                return;
                            default:
                                DeviceAuthDialog.this.mo12107x2(rVar.mo12380g().mo11229g());
                                return;
                        }
                    } else {
                        if (DeviceAuthDialog.this.f13305J0 != null) {
                            C5628a.m24929a(DeviceAuthDialog.this.f13305J0.mo12112e());
                        }
                        if (DeviceAuthDialog.this.f13309N0 != null) {
                            DeviceAuthDialog deviceAuthDialog = DeviceAuthDialog.this;
                            deviceAuthDialog.mo12103D2(deviceAuthDialog.f13309N0);
                            return;
                        }
                        DeviceAuthDialog.this.mo12106w2();
                    }
                } else {
                    try {
                        JSONObject h = rVar.mo12381h();
                        DeviceAuthDialog.this.m11987y2(h.getString("access_token"), Long.valueOf(h.getLong("expires_in")), Long.valueOf(h.optLong("data_access_expiration_time")));
                    } catch (JSONException e) {
                        DeviceAuthDialog.this.mo12107x2(new C3572j((Throwable) e));
                    }
                }
            }
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$e */
    class C3582e implements DialogInterface.OnClickListener {
        C3582e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            DeviceAuthDialog.this.f13306K0.setContentView(DeviceAuthDialog.this.mo12105v2(false));
            DeviceAuthDialog deviceAuthDialog = DeviceAuthDialog.this;
            deviceAuthDialog.mo12103D2(deviceAuthDialog.f13309N0);
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$f */
    class C3583f implements DialogInterface.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ String f13320b;

        /* renamed from: c */
        final /* synthetic */ C3481f0.C3485d f13321c;

        /* renamed from: d */
        final /* synthetic */ String f13322d;

        /* renamed from: e */
        final /* synthetic */ Date f13323e;

        /* renamed from: f */
        final /* synthetic */ Date f13324f;

        C3583f(String str, C3481f0.C3485d dVar, String str2, Date date, Date date2) {
            this.f13320b = str;
            this.f13321c = dVar;
            this.f13322d = str2;
            this.f13323e = date;
            this.f13324f = date2;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            DeviceAuthDialog.this.m11985s2(this.f13320b, this.f13321c, this.f13322d, this.f13323e, this.f13324f);
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$g */
    class C3584g implements GraphRequest.C3360f {

        /* renamed from: a */
        final /* synthetic */ String f13326a;

        /* renamed from: b */
        final /* synthetic */ Date f13327b;

        /* renamed from: c */
        final /* synthetic */ Date f13328c;

        C3584g(String str, Date date, Date date2) {
            this.f13326a = str;
            this.f13327b = date;
            this.f13328c = date2;
        }

        /* renamed from: b */
        public void mo7382b(C3655r rVar) {
            if (!DeviceAuthDialog.this.f13302G0.get()) {
                if (rVar.mo12380g() != null) {
                    DeviceAuthDialog.this.mo12107x2(rVar.mo12380g().mo11229g());
                    return;
                }
                try {
                    JSONObject h = rVar.mo12381h();
                    String string = h.getString(TtmlNode.ATTR_ID);
                    C3481f0.C3485d D = C3481f0.m11593D(h);
                    String string2 = h.getString(MediationMetaData.KEY_NAME);
                    C5628a.m24929a(DeviceAuthDialog.this.f13305J0.mo12112e());
                    if (!C3522n.m11804j(C3642m.m12280f()).mo12007l().contains(C3477d0.RequireConfirm) || DeviceAuthDialog.this.f13308M0) {
                        DeviceAuthDialog.this.m11985s2(string, D, this.f13326a, this.f13327b, this.f13328c);
                        return;
                    }
                    boolean unused = DeviceAuthDialog.this.f13308M0 = true;
                    DeviceAuthDialog.this.m11969A2(string, D, this.f13326a, string2, this.f13327b, this.f13328c);
                } catch (JSONException e) {
                    DeviceAuthDialog.this.mo12107x2(new C3572j((Throwable) e));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: A2 */
    public void m11969A2(String str, C3481f0.C3485d dVar, String str2, String str3, Date date, Date date2) {
        String string = mo3380N().getString(C3442f.com_facebook_smart_login_confirmation_title);
        String string2 = mo3380N().getString(C3442f.com_facebook_smart_login_confirmation_continue_as);
        String string3 = mo3380N().getString(C3442f.com_facebook_smart_login_confirmation_cancel);
        String format = String.format(string2, new Object[]{str3});
        AlertDialog.Builder builder = new AlertDialog.Builder(mo3466w());
        builder.setMessage(string).setCancelable(true).setNegativeButton(format, new C3583f(str, dVar, str2, date, date2)).setPositiveButton(string3, new C3582e());
        builder.create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: B2 */
    public void m11970B2() {
        this.f13304I0 = DeviceAuthMethodHandler.m12012p().schedule(new C3580c(), this.f13305J0.mo12109b(), TimeUnit.SECONDS);
    }

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public void m11971C2(RequestState requestState) {
        this.f13305J0 = requestState;
        this.f13299D0.setText(requestState.mo12112e());
        this.f13300E0.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, new BitmapDrawable(mo3380N(), C5628a.m24931c(requestState.mo12108a())), (Drawable) null, (Drawable) null);
        this.f13299D0.setVisibility(0);
        this.f13298C0.setVisibility(8);
        if (!this.f13308M0 && C5628a.m24934f(requestState.mo12112e())) {
            new C3420m(mo3466w()).mo11847h("fb_smart_login_service");
        }
        if (requestState.mo12117j()) {
            m11970B2();
        } else {
            m11988z2();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s2 */
    public void m11985s2(String str, C3481f0.C3485d dVar, String str2, Date date, Date date2) {
        this.f13301F0.mo12131s(str2, C3642m.m12280f(), str, dVar.mo11937c(), dVar.mo11935a(), dVar.mo11936b(), C3436c.DEVICE_AUTH, date, (Date) null, date2);
        this.f13306K0.dismiss();
    }

    /* renamed from: u2 */
    private GraphRequest m11986u2() {
        Bundle bundle = new Bundle();
        bundle.putString("code", this.f13305J0.mo12110d());
        return new GraphRequest((AccessToken) null, "device/login_status", bundle, C3656s.POST, new C3581d());
    }

    /* access modifiers changed from: private */
    /* renamed from: y2 */
    public void m11987y2(String str, Long l, Long l2) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        Date date = null;
        Date date2 = l.longValue() != 0 ? new Date(new Date().getTime() + (l.longValue() * 1000)) : null;
        if (l2.longValue() != 0) {
            date = new Date(l2.longValue() * 1000);
        }
        new GraphRequest(new AccessToken(str, C3642m.m12280f(), SessionDescription.SUPPORTED_SDP_VERSION, (Collection<String>) null, (Collection<String>) null, (Collection<String>) null, (C3436c) null, date2, (Date) null, date), "me", bundle, C3656s.GET, new C3584g(str, date2, date)).mo11251i();
    }

    /* access modifiers changed from: private */
    /* renamed from: z2 */
    public void m11988z2() {
        this.f13305J0.mo12114g(new Date().getTime());
        this.f13303H0 = m11986u2().mo11251i();
    }

    /* renamed from: D2 */
    public void mo12103D2(LoginClient.Request request) {
        this.f13309N0 = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.mo12187i()));
        String g = request.mo12185g();
        if (g != null) {
            bundle.putString("redirect_uri", g);
        }
        String f = request.mo12184f();
        if (f != null) {
            bundle.putString("target_user_id", f);
        }
        bundle.putString("access_token", C3489g0.m11680b() + "|" + C3489g0.m11681c());
        bundle.putString("device_info", C5628a.m24932d());
        new GraphRequest((AccessToken) null, "device/login", bundle, C3656s.POST, new C3578a()).mo11251i();
    }

    /* renamed from: P0 */
    public void mo3385P0(Bundle bundle) {
        super.mo3385P0(bundle);
        if (this.f13305J0 != null) {
            bundle.putParcelable("request_state", this.f13305J0);
        }
    }

    /* renamed from: U1 */
    public Dialog mo3721U1(Bundle bundle) {
        this.f13306K0 = new Dialog(mo3443p(), C3443g.com_facebook_auth_dialog);
        this.f13306K0.setContentView(mo12105v2(C5628a.m24933e() && !this.f13308M0));
        return this.f13306K0;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (!this.f13307L0) {
            mo12106w2();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t2 */
    public int mo12104t2(boolean z) {
        return z ? C3441e.com_facebook_smart_device_dialog_fragment : C3441e.com_facebook_device_auth_dialog_fragment;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v2 */
    public View mo12105v2(boolean z) {
        View inflate = mo3443p().getLayoutInflater().inflate(mo12104t2(z), (ViewGroup) null);
        this.f13298C0 = inflate.findViewById(C3440d.progress_bar);
        this.f13299D0 = (TextView) inflate.findViewById(C3440d.confirmation_code);
        ((Button) inflate.findViewById(C3440d.f12946a)).setOnClickListener(new C3579b());
        TextView textView = (TextView) inflate.findViewById(C3440d.com_facebook_device_auth_instructions);
        this.f13300E0 = textView;
        textView.setText(Html.fromHtml(mo3394U(C3442f.com_facebook_device_auth_instructions)));
        return inflate;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w2 */
    public void mo12106w2() {
        if (this.f13302G0.compareAndSet(false, true)) {
            if (this.f13305J0 != null) {
                C5628a.m24929a(this.f13305J0.mo12112e());
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.f13301F0;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.mo12129q();
            }
            this.f13306K0.dismiss();
        }
    }

    /* renamed from: x0 */
    public View mo3468x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        View x0 = super.mo3468x0(layoutInflater, viewGroup, bundle);
        this.f13301F0 = (DeviceAuthMethodHandler) ((C3604e) ((FacebookActivity) mo3443p()).mo11212B()).mo12244Q1().mo12168k();
        if (!(bundle == null || (requestState = (RequestState) bundle.getParcelable("request_state")) == null)) {
            m11971C2(requestState);
        }
        return x0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x2 */
    public void mo12107x2(C3572j jVar) {
        if (this.f13302G0.compareAndSet(false, true)) {
            if (this.f13305J0 != null) {
                C5628a.m24929a(this.f13305J0.mo12112e());
            }
            this.f13301F0.mo12130r(jVar);
            this.f13306K0.dismiss();
        }
    }

    /* renamed from: y0 */
    public void mo3471y0() {
        this.f13307L0 = true;
        this.f13302G0.set(true);
        super.mo3471y0();
        if (this.f13303H0 != null) {
            this.f13303H0.cancel(true);
        }
        if (this.f13304I0 != null) {
            this.f13304I0.cancel(true);
        }
    }
}
