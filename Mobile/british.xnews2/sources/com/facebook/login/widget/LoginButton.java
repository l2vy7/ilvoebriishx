package com.facebook.login.widget;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import com.appnext.core.C3148Ad;
import com.facebook.AccessToken;
import com.facebook.C3445d;
import com.facebook.C3448e;
import com.facebook.C3451g;
import com.facebook.C3453h;
import com.facebook.C3642m;
import com.facebook.Profile;
import com.facebook.appevents.C3420m;
import com.facebook.common.C3437a;
import com.facebook.common.C3439c;
import com.facebook.internal.C3474d;
import com.facebook.internal.C3481f0;
import com.facebook.internal.C3520m;
import com.facebook.internal.C3522n;
import com.facebook.login.C3600a;
import com.facebook.login.C3603d;
import com.facebook.login.C3608g;
import com.facebook.login.C3615h;
import com.facebook.login.C3620m;
import com.facebook.login.C3621n;
import com.facebook.login.C3622o;
import com.facebook.login.widget.C3636a;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p078g.C5264a;

public class LoginButton extends C3451g {

    /* renamed from: v */
    private static final String f13471v = LoginButton.class.getName();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f13472j;

    /* renamed from: k */
    private String f13473k;

    /* renamed from: l */
    private String f13474l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C3630d f13475m = new C3630d();
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f13476n = "fb_login_view_usage";

    /* renamed from: o */
    private boolean f13477o;

    /* renamed from: p */
    private C3636a.C3641e f13478p = C3636a.C3641e.BLUE;

    /* renamed from: q */
    private C3633f f13479q;

    /* renamed from: r */
    private long f13480r = 6000;

    /* renamed from: s */
    private C3636a f13481s;

    /* renamed from: t */
    private C3445d f13482t;

    /* renamed from: u */
    private C3608g f13483u;

    /* renamed from: com.facebook.login.widget.LoginButton$a */
    class C3626a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ String f13484b;

        /* renamed from: com.facebook.login.widget.LoginButton$a$a */
        class C3627a implements Runnable {

            /* renamed from: b */
            final /* synthetic */ C3520m f13486b;

            C3627a(C3520m mVar) {
                this.f13486b = mVar;
            }

            public void run() {
                LoginButton.this.m12212C(this.f13486b);
            }
        }

        C3626a(String str) {
            this.f13484b = str;
        }

        public void run() {
            LoginButton.this.getActivity().runOnUiThread(new C3627a(C3522n.m11809o(this.f13484b, false)));
        }
    }

    /* renamed from: com.facebook.login.widget.LoginButton$b */
    class C3628b extends C3445d {
        C3628b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public void mo11874d(AccessToken accessToken, AccessToken accessToken2) {
            LoginButton.this.m12211B();
        }
    }

    /* renamed from: com.facebook.login.widget.LoginButton$c */
    static /* synthetic */ class C3629c {

        /* renamed from: a */
        static final /* synthetic */ int[] f13489a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.facebook.login.widget.LoginButton$f[] r0 = com.facebook.login.widget.LoginButton.C3633f.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13489a = r0
                com.facebook.login.widget.LoginButton$f r1 = com.facebook.login.widget.LoginButton.C3633f.AUTOMATIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13489a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.facebook.login.widget.LoginButton$f r1 = com.facebook.login.widget.LoginButton.C3633f.DISPLAY_ALWAYS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13489a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.facebook.login.widget.LoginButton$f r1 = com.facebook.login.widget.LoginButton.C3633f.NEVER_DISPLAY     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.login.widget.LoginButton.C3629c.<clinit>():void");
        }
    }

    /* renamed from: com.facebook.login.widget.LoginButton$d */
    static class C3630d {

        /* renamed from: a */
        private C3600a f13490a = C3600a.FRIENDS;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public List<String> f13491b = Collections.emptyList();

        /* renamed from: c */
        private C3603d f13492c = C3603d.NATIVE_WITH_FALLBACK;

        /* renamed from: d */
        private String f13493d = "rerequest";

        C3630d() {
        }

        /* renamed from: b */
        public String mo12304b() {
            return this.f13493d;
        }

        /* renamed from: c */
        public C3600a mo12305c() {
            return this.f13490a;
        }

        /* renamed from: d */
        public C3603d mo12306d() {
            return this.f13492c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public List<String> mo12307e() {
            return this.f13491b;
        }

        /* renamed from: f */
        public void mo12308f(String str) {
            this.f13493d = str;
        }

        /* renamed from: g */
        public void mo12309g(C3600a aVar) {
            this.f13490a = aVar;
        }

        /* renamed from: h */
        public void mo12310h(C3603d dVar) {
            this.f13492c = dVar;
        }

        /* renamed from: i */
        public void mo12311i(List<String> list) {
            this.f13491b = list;
        }
    }

    /* renamed from: com.facebook.login.widget.LoginButton$e */
    protected class C3631e implements View.OnClickListener {

        /* renamed from: com.facebook.login.widget.LoginButton$e$a */
        class C3632a implements DialogInterface.OnClickListener {

            /* renamed from: b */
            final /* synthetic */ C3608g f13495b;

            C3632a(C3608g gVar) {
                this.f13495b = gVar;
            }

            public void onClick(DialogInterface dialogInterface, int i) {
                this.f13495b.mo12258m();
            }
        }

        protected C3631e() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C3608g mo12272a() {
            C3608g e = C3608g.m12179e();
            e.mo12263t(LoginButton.this.getDefaultAudience());
            e.mo12264v(LoginButton.this.getLoginBehavior());
            e.mo12262s(LoginButton.this.getAuthType());
            return e;
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void mo12312b() {
            C3608g a = mo12272a();
            if (LoginButton.this.getFragment() != null) {
                a.mo12256k(LoginButton.this.getFragment(), LoginButton.this.f13475m.f13491b);
            } else if (LoginButton.this.getNativeFragment() != null) {
                a.mo12255j(LoginButton.this.getNativeFragment(), LoginButton.this.f13475m.f13491b);
            } else {
                a.mo12254i(LoginButton.this.getActivity(), LoginButton.this.f13475m.f13491b);
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void mo12313c(Context context) {
            String str;
            C3608g a = mo12272a();
            if (LoginButton.this.f13472j) {
                String string = LoginButton.this.getResources().getString(C3620m.com_facebook_loginview_log_out_action);
                String string2 = LoginButton.this.getResources().getString(C3620m.com_facebook_loginview_cancel_action);
                Profile d = Profile.m11332d();
                if (d == null || d.mo11284e() == null) {
                    str = LoginButton.this.getResources().getString(C3620m.com_facebook_loginview_logged_in_using_facebook);
                } else {
                    str = String.format(LoginButton.this.getResources().getString(C3620m.com_facebook_loginview_logged_in_as), new Object[]{d.mo11284e()});
                }
                AlertDialog.Builder builder = new AlertDialog.Builder(context);
                builder.setMessage(str).setCancelable(true).setPositiveButton(string, new C3632a(a)).setNegativeButton(string2, (DialogInterface.OnClickListener) null);
                builder.create().show();
                return;
            }
            a.mo12258m();
        }

        public void onClick(View view) {
            LoginButton.this.mo11879d(view);
            AccessToken h = AccessToken.m11205h();
            if (AccessToken.m11207t()) {
                mo12313c(LoginButton.this.getContext());
            } else {
                mo12312b();
            }
            C3420m mVar = new C3420m(LoginButton.this.getContext());
            Bundle bundle = new Bundle();
            bundle.putInt("logging_in", h != null ? 0 : 1);
            bundle.putInt("access_token_expired", AccessToken.m11207t() ? 1 : 0);
            mVar.mo11848i(LoginButton.this.f13476n, bundle);
        }
    }

    /* renamed from: com.facebook.login.widget.LoginButton$f */
    public enum C3633f {
        AUTOMATIC(C3148Ad.ORIENTATION_AUTO, 0),
        DISPLAY_ALWAYS("display_always", 1),
        NEVER_DISPLAY("never_display", 2);
        

        /* renamed from: g */
        public static C3633f f13500g;

        /* renamed from: b */
        private String f13502b;

        /* renamed from: c */
        private int f13503c;

        static {
            C3633f fVar;
            f13500g = fVar;
        }

        private C3633f(String str, int i) {
            this.f13502b = str;
            this.f13503c = i;
        }

        /* renamed from: a */
        public static C3633f m12241a(int i) {
            for (C3633f fVar : values()) {
                if (fVar.mo12316d() == i) {
                    return fVar;
                }
            }
            return null;
        }

        /* renamed from: d */
        public int mo12316d() {
            return this.f13503c;
        }

        public String toString() {
            return this.f13502b;
        }
    }

    public LoginButton(Context context) {
        super(context, (AttributeSet) null, 0, 0, "fb_login_button_create", "fb_login_button_did_tap");
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m12211B() {
        Resources resources = getResources();
        if (isInEditMode() || !AccessToken.m11207t()) {
            String str = this.f13473k;
            if (str != null) {
                setText(str);
                return;
            }
            String string = resources.getString(C3620m.com_facebook_loginview_log_in_button_continue);
            int width = getWidth();
            if (width != 0 && m12223y(string) > width) {
                string = resources.getString(C3620m.com_facebook_loginview_log_in_button);
            }
            setText(string);
            return;
        }
        String str2 = this.f13474l;
        if (str2 == null) {
            str2 = resources.getString(C3620m.com_facebook_loginview_log_out_button);
        }
        setText(str2);
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m12212C(C3520m mVar) {
        if (mVar != null && mVar.mo12002g() && getVisibility() == 0) {
            m12222x(mVar.mo12001f());
        }
    }

    /* renamed from: v */
    private void m12221v() {
        int i = C3629c.f13489a[this.f13479q.ordinal()];
        if (i == 1) {
            C3642m.m12288n().execute(new C3626a(C3481f0.m11660y(getContext())));
        } else if (i == 2) {
            m12222x(getResources().getString(C3620m.com_facebook_tooltip_default));
        }
    }

    /* renamed from: x */
    private void m12222x(String str) {
        C3636a aVar = new C3636a(str, this);
        this.f13481s = aVar;
        aVar.mo12335g(this.f13478p);
        this.f13481s.mo12334f(this.f13480r);
        this.f13481s.mo12336h();
    }

    /* renamed from: y */
    private int m12223y(String str) {
        return getCompoundPaddingLeft() + getCompoundDrawablePadding() + mo11889h(str) + getCompoundPaddingRight();
    }

    /* renamed from: z */
    private void m12224z(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f13479q = C3633f.f13500g;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C3622o.f13435K, i, i2);
        try {
            this.f13472j = obtainStyledAttributes.getBoolean(C3622o.f13436L, true);
            this.f13473k = obtainStyledAttributes.getString(C3622o.f13437M);
            this.f13474l = obtainStyledAttributes.getString(C3622o.f13438N);
            this.f13479q = C3633f.m12241a(obtainStyledAttributes.getInt(C3622o.f13439O, C3633f.f13500g.mo12316d()));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: A */
    public void mo12273A(C3448e eVar, C3453h<C3615h> hVar) {
        getLoginManager().mo12261q(eVar, hVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo11880e(Context context, AttributeSet attributeSet, int i, int i2) {
        super.mo11880e(context, attributeSet, i, i2);
        setInternalOnClickListener(getNewLoginClickListener());
        m12224z(context, attributeSet, i, i2);
        if (isInEditMode()) {
            setBackgroundColor(getResources().getColor(C3437a.com_facebook_blue));
            this.f13473k = "Continue with Facebook";
        } else {
            this.f13482t = new C3628b();
        }
        m12211B();
        setCompoundDrawablesWithIntrinsicBounds(C5264a.m23789d(getContext(), C3439c.com_facebook_button_icon), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public String getAuthType() {
        return this.f13475m.mo12304b();
    }

    public C3600a getDefaultAudience() {
        return this.f13475m.mo12305c();
    }

    /* access modifiers changed from: protected */
    public int getDefaultRequestCode() {
        return C3474d.C3476b.Login.mo11931d();
    }

    /* access modifiers changed from: protected */
    public int getDefaultStyleResource() {
        return C3621n.com_facebook_loginview_default_style;
    }

    public C3603d getLoginBehavior() {
        return this.f13475m.mo12306d();
    }

    /* access modifiers changed from: package-private */
    public C3608g getLoginManager() {
        if (this.f13483u == null) {
            this.f13483u = C3608g.m12179e();
        }
        return this.f13483u;
    }

    /* access modifiers changed from: protected */
    public C3631e getNewLoginClickListener() {
        return new C3631e();
    }

    /* access modifiers changed from: package-private */
    public List<String> getPermissions() {
        return this.f13475m.mo12307e();
    }

    public long getToolTipDisplayTime() {
        return this.f13480r;
    }

    public C3633f getToolTipMode() {
        return this.f13479q;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C3445d dVar = this.f13482t;
        if (dVar != null && !dVar.mo11873c()) {
            this.f13482t.mo11875e();
            m12211B();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C3445d dVar = this.f13482t;
        if (dVar != null) {
            dVar.mo11876f();
        }
        mo12301w();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f13477o && !isInEditMode()) {
            this.f13477o = true;
            m12221v();
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m12211B();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        Paint.FontMetrics fontMetrics = getPaint().getFontMetrics();
        int compoundPaddingTop = getCompoundPaddingTop() + ((int) Math.ceil((double) (Math.abs(fontMetrics.top) + Math.abs(fontMetrics.bottom)))) + getCompoundPaddingBottom();
        Resources resources = getResources();
        String str = this.f13473k;
        if (str == null) {
            str = resources.getString(C3620m.com_facebook_loginview_log_in_button_continue);
            int y = m12223y(str);
            if (Button.resolveSize(y, i) < y) {
                str = resources.getString(C3620m.com_facebook_loginview_log_in_button);
            }
        }
        int y2 = m12223y(str);
        String str2 = this.f13474l;
        if (str2 == null) {
            str2 = resources.getString(C3620m.com_facebook_loginview_log_out_button);
        }
        setMeasuredDimension(Button.resolveSize(Math.max(y2, m12223y(str2)), i), compoundPaddingTop);
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            mo12301w();
        }
    }

    public void setAuthType(String str) {
        this.f13475m.mo12308f(str);
    }

    public void setDefaultAudience(C3600a aVar) {
        this.f13475m.mo12309g(aVar);
    }

    public void setLoginBehavior(C3603d dVar) {
        this.f13475m.mo12310h(dVar);
    }

    /* access modifiers changed from: package-private */
    public void setLoginManager(C3608g gVar) {
        this.f13483u = gVar;
    }

    public void setLoginText(String str) {
        this.f13473k = str;
        m12211B();
    }

    public void setLogoutText(String str) {
        this.f13474l = str;
        m12211B();
    }

    public void setPermissions(List<String> list) {
        this.f13475m.mo12311i(list);
    }

    /* access modifiers changed from: package-private */
    public void setProperties(C3630d dVar) {
        this.f13475m = dVar;
    }

    public void setPublishPermissions(List<String> list) {
        this.f13475m.mo12311i(list);
    }

    public void setReadPermissions(List<String> list) {
        this.f13475m.mo12311i(list);
    }

    public void setToolTipDisplayTime(long j) {
        this.f13480r = j;
    }

    public void setToolTipMode(C3633f fVar) {
        this.f13479q = fVar;
    }

    public void setToolTipStyle(C3636a.C3641e eVar) {
        this.f13478p = eVar;
    }

    /* renamed from: w */
    public void mo12301w() {
        C3636a aVar = this.f13481s;
        if (aVar != null) {
            aVar.mo12333d();
            this.f13481s = null;
        }
    }

    public void setPermissions(String... strArr) {
        this.f13475m.mo12311i(Arrays.asList(strArr));
    }

    public void setPublishPermissions(String... strArr) {
        this.f13475m.mo12311i(Arrays.asList(strArr));
    }

    public void setReadPermissions(String... strArr) {
        this.f13475m.mo12311i(Arrays.asList(strArr));
    }

    public LoginButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0, "fb_login_button_create", "fb_login_button_did_tap");
    }

    public LoginButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, "fb_login_button_create", "fb_login_button_did_tap");
    }
}
