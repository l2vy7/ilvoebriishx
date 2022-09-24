package com.startapp.sdk.inappbrowser;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.C11970ib;
import com.startapp.C12466z6;
import java.util.Map;

/* compiled from: Sta */
public class NavigationBarLayout extends RelativeLayout {

    /* renamed from: j */
    public static final int f54703j = Color.rgb(78, 86, 101);

    /* renamed from: k */
    public static final int f54704k = Color.rgb(148, 155, 166);

    /* renamed from: a */
    public RelativeLayout f54705a;

    /* renamed from: b */
    public ImageView f54706b;

    /* renamed from: c */
    public ImageView f54707c;

    /* renamed from: d */
    public ImageView f54708d;

    /* renamed from: e */
    public ImageView f54709e;

    /* renamed from: f */
    public TextView f54710f;

    /* renamed from: g */
    public TextView f54711g;

    /* renamed from: h */
    public Boolean f54712h = Boolean.FALSE;

    /* renamed from: i */
    public Map<String, C12466z6> f54713i;

    public NavigationBarLayout(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo46455a(WebView webView) {
        if (this.f54712h.booleanValue()) {
            if (webView.canGoBack()) {
                this.f54709e.setImageBitmap(this.f54713i.get("BACK_DARK").f55197a);
                this.f54709e.setEnabled(true);
            } else {
                this.f54709e.setImageBitmap(this.f54713i.get("BACK").f55197a);
                this.f54709e.setEnabled(false);
            }
            if (webView.canGoForward()) {
                this.f54707c.setImageBitmap(this.f54713i.get("FORWARD_DARK").f55197a);
                this.f54707c.setEnabled(true);
            } else {
                this.f54707c.setImageBitmap(this.f54713i.get("FORWARD").f55197a);
                this.f54707c.setEnabled(false);
            }
            if (webView.getTitle() != null) {
                this.f54710f.setText(webView.getTitle());
            }
        } else if (webView.canGoBack()) {
            this.f54709e.setImageBitmap(this.f54713i.get("BACK_DARK").f55197a);
            addView(this.f54709e, C11970ib.m52469a(getContext(), new int[]{6, 0, 0, 0}, new int[]{15, 9}));
            ImageView imageView = this.f54707c;
            RelativeLayout.LayoutParams a = C11970ib.m52469a(getContext(), new int[]{9, 0, 0, 0}, new int[]{15});
            a.addRule(1, 2105);
            addView(imageView, a);
            removeView(this.f54705a);
            this.f54705a.removeView(this.f54711g);
            this.f54705a.removeView(this.f54710f);
            this.f54705a.addView(this.f54710f, C11970ib.m52469a(getContext(), new int[]{0, 0, 0, 0}, new int[]{14}));
            RelativeLayout relativeLayout = this.f54705a;
            TextView textView = this.f54711g;
            RelativeLayout.LayoutParams a2 = C11970ib.m52469a(getContext(), new int[]{0, 0, 0, 0}, new int[]{14});
            a2.addRule(3, IronSourceConstants.IS_CHECK_READY_FALSE);
            relativeLayout.addView(textView, a2);
            RelativeLayout.LayoutParams a3 = C11970ib.m52469a(getContext(), new int[]{16, 0, 16, 0}, new int[]{15});
            a3.addRule(1, 2106);
            a3.addRule(0, 2104);
            addView(this.f54705a, a3);
            this.f54712h = Boolean.TRUE;
        }
    }

    public void setButtonsListener(View.OnClickListener onClickListener) {
        this.f54706b.setOnClickListener(onClickListener);
        this.f54709e.setOnClickListener(onClickListener);
        this.f54707c.setOnClickListener(onClickListener);
        this.f54708d.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public void mo46454a() {
        if (Build.VERSION.SDK_INT < 11) {
            ((BitmapDrawable) this.f54706b.getDrawable()).getBitmap().recycle();
            ((BitmapDrawable) this.f54708d.getDrawable()).getBitmap().recycle();
            ((BitmapDrawable) this.f54709e.getDrawable()).getBitmap().recycle();
            ((BitmapDrawable) this.f54707c.getDrawable()).getBitmap().recycle();
        }
        this.f54713i = null;
    }
}
