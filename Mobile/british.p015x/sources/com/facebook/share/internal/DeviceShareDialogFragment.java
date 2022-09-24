package com.facebook.share.internal;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.C0690c;
import androidx.fragment.app.FragmentActivity;
import com.facebook.AccessToken;
import com.facebook.C3655r;
import com.facebook.C3656s;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.common.C3440d;
import com.facebook.common.C3441e;
import com.facebook.common.C3442f;
import com.facebook.common.C3443g;
import com.facebook.internal.C3489g0;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p103k3.C5628a;

public class DeviceShareDialogFragment extends C0690c {

    /* renamed from: I0 */
    private static ScheduledThreadPoolExecutor f13580I0;

    /* renamed from: C0 */
    private ProgressBar f13581C0;

    /* renamed from: D0 */
    private TextView f13582D0;
    /* access modifiers changed from: private */

    /* renamed from: E0 */
    public Dialog f13583E0;

    /* renamed from: F0 */
    private volatile RequestState f13584F0;

    /* renamed from: G0 */
    private volatile ScheduledFuture f13585G0;

    /* renamed from: H0 */
    private ShareContent f13586H0;

    private static class RequestState implements Parcelable {
        public static final Parcelable.Creator<RequestState> CREATOR = new C3657a();

        /* renamed from: b */
        private String f13587b;

        /* renamed from: c */
        private long f13588c;

        /* renamed from: com.facebook.share.internal.DeviceShareDialogFragment$RequestState$a */
        static class C3657a implements Parcelable.Creator<RequestState> {
            C3657a() {
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
        public long mo12384a() {
            return this.f13588c;
        }

        /* renamed from: b */
        public String mo12385b() {
            return this.f13587b;
        }

        /* renamed from: d */
        public void mo12386d(long j) {
            this.f13588c = j;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public void mo12388e(String str) {
            this.f13587b = str;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f13587b);
            parcel.writeLong(this.f13588c);
        }

        protected RequestState(Parcel parcel) {
            this.f13587b = parcel.readString();
            this.f13588c = parcel.readLong();
        }
    }

    /* renamed from: com.facebook.share.internal.DeviceShareDialogFragment$a */
    class C3658a implements View.OnClickListener {
        C3658a() {
        }

        public void onClick(View view) {
            DeviceShareDialogFragment.this.f13583E0.dismiss();
        }
    }

    /* renamed from: com.facebook.share.internal.DeviceShareDialogFragment$b */
    class C3659b implements GraphRequest.C3360f {
        C3659b() {
        }

        /* renamed from: b */
        public void mo7382b(C3655r rVar) {
            FacebookRequestError g = rVar.mo12380g();
            if (g != null) {
                DeviceShareDialogFragment.this.m12340k2(g);
                return;
            }
            JSONObject h = rVar.mo12381h();
            RequestState requestState = new RequestState();
            try {
                requestState.mo12388e(h.getString("user_code"));
                requestState.mo12386d(h.getLong("expires_in"));
                DeviceShareDialogFragment.this.m12343n2(requestState);
            } catch (JSONException unused) {
                DeviceShareDialogFragment.this.m12340k2(new FacebookRequestError(0, "", "Malformed server response"));
            }
        }
    }

    /* renamed from: com.facebook.share.internal.DeviceShareDialogFragment$c */
    class C3660c implements Runnable {
        C3660c() {
        }

        public void run() {
            DeviceShareDialogFragment.this.f13583E0.dismiss();
        }
    }

    /* renamed from: i2 */
    private void m12338i2() {
        if (mo3406b0()) {
            mo3350D().mo3598m().mo3678n(this).mo3672g();
        }
    }

    /* renamed from: j2 */
    private void m12339j2(int i, Intent intent) {
        if (this.f13584F0 != null) {
            C5628a.m24929a(this.f13584F0.mo12385b());
        }
        FacebookRequestError facebookRequestError = (FacebookRequestError) intent.getParcelableExtra("error");
        if (facebookRequestError != null) {
            Toast.makeText(mo3466w(), facebookRequestError.mo11227e(), 0).show();
        }
        if (mo3406b0()) {
            FragmentActivity p = mo3443p();
            p.setResult(i, intent);
            p.finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public void m12340k2(FacebookRequestError facebookRequestError) {
        m12338i2();
        Intent intent = new Intent();
        intent.putExtra("error", facebookRequestError);
        m12339j2(-1, intent);
    }

    /* renamed from: l2 */
    private static synchronized ScheduledThreadPoolExecutor m12341l2() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceShareDialogFragment.class) {
            if (f13580I0 == null) {
                f13580I0 = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f13580I0;
        }
        return scheduledThreadPoolExecutor;
    }

    /* renamed from: m2 */
    private Bundle m12342m2() {
        ShareContent shareContent = this.f13586H0;
        if (shareContent == null) {
            return null;
        }
        if (shareContent instanceof ShareLinkContent) {
            return C3706i.m12501a((ShareLinkContent) shareContent);
        }
        if (shareContent instanceof ShareOpenGraphContent) {
            return C3706i.m12502b((ShareOpenGraphContent) shareContent);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: n2 */
    public void m12343n2(RequestState requestState) {
        this.f13584F0 = requestState;
        this.f13582D0.setText(requestState.mo12385b());
        this.f13582D0.setVisibility(0);
        this.f13581C0.setVisibility(8);
        this.f13585G0 = m12341l2().schedule(new C3660c(), requestState.mo12384a(), TimeUnit.SECONDS);
    }

    /* renamed from: p2 */
    private void m12344p2() {
        Bundle m2 = m12342m2();
        if (m2 == null || m2.size() == 0) {
            m12340k2(new FacebookRequestError(0, "", "Failed to get share content"));
        }
        m2.putString("access_token", C3489g0.m11680b() + "|" + C3489g0.m11681c());
        m2.putString("device_info", C5628a.m24932d());
        new GraphRequest((AccessToken) null, "device/share", m2, C3656s.POST, new C3659b()).mo11251i();
    }

    /* renamed from: P0 */
    public void mo3385P0(Bundle bundle) {
        super.mo3385P0(bundle);
        if (this.f13584F0 != null) {
            bundle.putParcelable("request_state", this.f13584F0);
        }
    }

    /* renamed from: U1 */
    public Dialog mo3721U1(Bundle bundle) {
        this.f13583E0 = new Dialog(mo3443p(), C3443g.com_facebook_auth_dialog);
        View inflate = mo3443p().getLayoutInflater().inflate(C3441e.com_facebook_device_auth_dialog_fragment, (ViewGroup) null);
        this.f13581C0 = (ProgressBar) inflate.findViewById(C3440d.progress_bar);
        this.f13582D0 = (TextView) inflate.findViewById(C3440d.confirmation_code);
        ((Button) inflate.findViewById(C3440d.f12946a)).setOnClickListener(new C3658a());
        ((TextView) inflate.findViewById(C3440d.com_facebook_device_auth_instructions)).setText(Html.fromHtml(mo3394U(C3442f.com_facebook_device_auth_instructions)));
        this.f13583E0.setContentView(inflate);
        m12344p2();
        return this.f13583E0;
    }

    /* renamed from: o2 */
    public void mo12383o2(ShareContent shareContent) {
        this.f13586H0 = shareContent;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f13585G0 != null) {
            this.f13585G0.cancel(true);
        }
        m12339j2(-1, new Intent());
    }

    /* renamed from: x0 */
    public View mo3468x0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        View x0 = super.mo3468x0(layoutInflater, viewGroup, bundle);
        if (!(bundle == null || (requestState = (RequestState) bundle.getParcelable("request_state")) == null)) {
            m12343n2(requestState);
        }
        return x0;
    }
}
