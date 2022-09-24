package com.facebook.login.widget;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.login.C3617j;
import com.facebook.login.C3618k;
import com.facebook.login.C3619l;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.login.widget.a */
/* compiled from: ToolTipPopup */
public class C3636a {

    /* renamed from: a */
    private final String f13516a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final WeakReference<View> f13517b;

    /* renamed from: c */
    private final Context f13518c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C3640d f13519d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public PopupWindow f13520e;

    /* renamed from: f */
    private C3641e f13521f = C3641e.BLUE;

    /* renamed from: g */
    private long f13522g = 6000;

    /* renamed from: h */
    private final ViewTreeObserver.OnScrollChangedListener f13523h = new C3637a();

    /* renamed from: com.facebook.login.widget.a$a */
    /* compiled from: ToolTipPopup */
    class C3637a implements ViewTreeObserver.OnScrollChangedListener {
        C3637a() {
        }

        public void onScrollChanged() {
            if (C3636a.this.f13517b.get() != null && C3636a.this.f13520e != null && C3636a.this.f13520e.isShowing()) {
                if (C3636a.this.f13520e.isAboveAnchor()) {
                    C3636a.this.f13519d.mo12340f();
                } else {
                    C3636a.this.f13519d.mo12341g();
                }
            }
        }
    }

    /* renamed from: com.facebook.login.widget.a$b */
    /* compiled from: ToolTipPopup */
    class C3638b implements Runnable {
        C3638b() {
        }

        public void run() {
            C3636a.this.mo12333d();
        }
    }

    /* renamed from: com.facebook.login.widget.a$c */
    /* compiled from: ToolTipPopup */
    class C3639c implements View.OnClickListener {
        C3639c() {
        }

        public void onClick(View view) {
            C3636a.this.mo12333d();
        }
    }

    /* renamed from: com.facebook.login.widget.a$d */
    /* compiled from: ToolTipPopup */
    private class C3640d extends FrameLayout {
        /* access modifiers changed from: private */

        /* renamed from: b */
        public ImageView f13527b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public ImageView f13528c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public View f13529d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public ImageView f13530e;

        public C3640d(Context context) {
            super(context);
            m12269e();
        }

        /* renamed from: e */
        private void m12269e() {
            LayoutInflater.from(getContext()).inflate(C3619l.com_facebook_tooltip_bubble, this);
            this.f13527b = (ImageView) findViewById(C3618k.com_facebook_tooltip_bubble_view_top_pointer);
            this.f13528c = (ImageView) findViewById(C3618k.com_facebook_tooltip_bubble_view_bottom_pointer);
            this.f13529d = findViewById(C3618k.com_facebook_body_frame);
            this.f13530e = (ImageView) findViewById(C3618k.com_facebook_button_xout);
        }

        /* renamed from: f */
        public void mo12340f() {
            this.f13527b.setVisibility(4);
            this.f13528c.setVisibility(0);
        }

        /* renamed from: g */
        public void mo12341g() {
            this.f13527b.setVisibility(0);
            this.f13528c.setVisibility(4);
        }
    }

    /* renamed from: com.facebook.login.widget.a$e */
    /* compiled from: ToolTipPopup */
    public enum C3641e {
        BLUE,
        BLACK
    }

    public C3636a(String str, View view) {
        this.f13516a = str;
        this.f13517b = new WeakReference<>(view);
        this.f13518c = view.getContext();
    }

    /* renamed from: e */
    private void m12258e() {
        m12259i();
        if (this.f13517b.get() != null) {
            ((View) this.f13517b.get()).getViewTreeObserver().addOnScrollChangedListener(this.f13523h);
        }
    }

    /* renamed from: i */
    private void m12259i() {
        if (this.f13517b.get() != null) {
            ((View) this.f13517b.get()).getViewTreeObserver().removeOnScrollChangedListener(this.f13523h);
        }
    }

    /* renamed from: j */
    private void m12260j() {
        PopupWindow popupWindow = this.f13520e;
        if (popupWindow != null && popupWindow.isShowing()) {
            if (this.f13520e.isAboveAnchor()) {
                this.f13519d.mo12340f();
            } else {
                this.f13519d.mo12341g();
            }
        }
    }

    /* renamed from: d */
    public void mo12333d() {
        m12259i();
        PopupWindow popupWindow = this.f13520e;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    /* renamed from: f */
    public void mo12334f(long j) {
        this.f13522g = j;
    }

    /* renamed from: g */
    public void mo12335g(C3641e eVar) {
        this.f13521f = eVar;
    }

    /* renamed from: h */
    public void mo12336h() {
        if (this.f13517b.get() != null) {
            C3640d dVar = new C3640d(this.f13518c);
            this.f13519d = dVar;
            ((TextView) dVar.findViewById(C3618k.com_facebook_tooltip_bubble_view_text_body)).setText(this.f13516a);
            if (this.f13521f == C3641e.BLUE) {
                this.f13519d.f13529d.setBackgroundResource(C3617j.com_facebook_tooltip_blue_background);
                this.f13519d.f13528c.setImageResource(C3617j.com_facebook_tooltip_blue_bottomnub);
                this.f13519d.f13527b.setImageResource(C3617j.com_facebook_tooltip_blue_topnub);
                this.f13519d.f13530e.setImageResource(C3617j.com_facebook_tooltip_blue_xout);
            } else {
                this.f13519d.f13529d.setBackgroundResource(C3617j.com_facebook_tooltip_black_background);
                this.f13519d.f13528c.setImageResource(C3617j.com_facebook_tooltip_black_bottomnub);
                this.f13519d.f13527b.setImageResource(C3617j.com_facebook_tooltip_black_topnub);
                this.f13519d.f13530e.setImageResource(C3617j.com_facebook_tooltip_black_xout);
            }
            View decorView = ((Activity) this.f13518c).getWindow().getDecorView();
            int width = decorView.getWidth();
            int height = decorView.getHeight();
            m12258e();
            this.f13519d.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
            C3640d dVar2 = this.f13519d;
            PopupWindow popupWindow = new PopupWindow(dVar2, dVar2.getMeasuredWidth(), this.f13519d.getMeasuredHeight());
            this.f13520e = popupWindow;
            popupWindow.showAsDropDown((View) this.f13517b.get());
            m12260j();
            if (this.f13522g > 0) {
                this.f13519d.postDelayed(new C3638b(), this.f13522g);
            }
            this.f13520e.setTouchable(true);
            this.f13519d.setOnClickListener(new C3639c());
        }
    }
}
