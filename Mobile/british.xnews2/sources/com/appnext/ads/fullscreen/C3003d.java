package com.appnext.ads.fullscreen;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.appnext.C2980R;
import com.appnext.base.C3117a;
import com.appnext.core.AppnextAd;
import com.appnext.core.C3202i;
import com.appnext.core.C3204j;
import com.appnext.core.p033a.C3167a;
import java.util.ArrayList;

/* renamed from: com.appnext.ads.fullscreen.d */
public final class C3003d extends Fragment {
    /* access modifiers changed from: private */
    public ArrayList<AppnextAd> ads;
    /* access modifiers changed from: private */
    public boolean clicked = false;

    /* renamed from: x */
    private ImageView f12005x;

    /* renamed from: y */
    private TextView f12006y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public C3029h f12007z;

    /* access modifiers changed from: private */
    public void report(String str) {
        this.f12007z.report(str, "S3");
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f12007z = (C3029h) activity;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            RelativeLayout relativeLayout = (RelativeLayout) layoutInflater.inflate(this.f12007z.getTemplate("S3"), viewGroup, false);
            this.ads = this.f12007z.getPostRollAds();
            ImageView imageView = (ImageView) relativeLayout.findViewById(C2980R.C2982id.privacy);
            ImageView imageView2 = (ImageView) relativeLayout.findViewById(C2980R.C2982id.close);
            View findViewById = relativeLayout.findViewById(C2980R.C2982id.click);
            this.f12005x = (ImageView) relativeLayout.findViewById(C2980R.C2982id.media);
            this.f12006y = (TextView) relativeLayout.findViewById(C2980R.C2982id.install);
            imageView.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C3003d.this.f12007z.privacyClicked();
                }
            });
            if (C3202i.m10805a(this.ads.get(0), this.f12007z.getConfigManager())) {
                C3202i.m10804a((Context) this.f12007z, imageView);
            }
            imageView2.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C3003d.this.f12007z.closeClicked();
                }
            });
            findViewById.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C3003d.this.f12007z.installClicked((AppnextAd) C3003d.this.ads.get(0));
                }
            });
            String ctaText = this.f12007z.getCtaText();
            int parseInt = Integer.parseInt(C3167a.m10684q(getContext()).mo10749a(this.f12007z.getLanguage(), "settings", "len"));
            if (!TextUtils.isEmpty(ctaText) && ctaText.length() > parseInt) {
                ctaText = ctaText.substring(0, parseInt);
            }
            this.f12006y.setText(ctaText);
            this.f12006y.setTextSize(2, (float) Integer.parseInt(C3167a.m10684q(getContext()).mo10749a(this.f12007z.getLanguage(), "settings", "font_size_sp")));
            C3204j.m10808ax().mo10810a(getActivity(), this.f12005x, this.ads.get(0).getWideImageURL(), (C3204j.C3206a) null);
            m10399a(relativeLayout, this.ads.get(0), true);
            View findViewById2 = relativeLayout.findViewById(C2980R.C2982id.extra);
            if (findViewById2 != null) {
                if (this.ads.size() > 1) {
                    m10399a((RelativeLayout) findViewById2.findViewById(C2980R.C2982id.item1), this.ads.get(1), false);
                } else {
                    findViewById2.findViewById(C2980R.C2982id.item1).setVisibility(4);
                }
                if (this.ads.size() > 2) {
                    m10399a((RelativeLayout) findViewById2.findViewById(C2980R.C2982id.item2), this.ads.get(2), false);
                } else {
                    findViewById2.findViewById(C2980R.C2982id.item2).setVisibility(4);
                }
                int i = C2980R.C2982id.item3;
                if (findViewById2.findViewById(i) != null) {
                    if (this.ads.size() > 3) {
                        m10399a((RelativeLayout) findViewById2.findViewById(i), this.ads.get(3), false);
                    } else {
                        findViewById2.findViewById(i).setVisibility(4);
                    }
                }
            }
            report("post_roll_loaded");
            return relativeLayout;
        } catch (Throwable th) {
            C3117a.m10553a("PostRollFragment$onCreateView", th);
            this.f12007z.closeClicked();
            return null;
        }
    }

    public final void onDestroyView() {
        report("post_roll_click_none");
        super.onDestroyView();
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f12007z = (C3029h) context;
    }

    /* renamed from: a */
    private void m10399a(RelativeLayout relativeLayout, final AppnextAd appnextAd, final boolean z) {
        C3204j.m10808ax().mo10810a(getActivity(), (ImageView) relativeLayout.findViewById(C2980R.C2982id.icon), appnextAd.getImageURL(), (C3204j.C3206a) null);
        ((TextView) relativeLayout.findViewById(C2980R.C2982id.title)).setText(appnextAd.getAdTitle());
        ((RatingBar) relativeLayout.findViewById(C2980R.C2982id.rating)).setRating(Float.parseFloat(appnextAd.getStoreRating()));
        relativeLayout.findViewById(C2980R.C2982id.click).setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                FullscreenAd fullscreenAd = new FullscreenAd(appnextAd);
                if (z) {
                    C3003d.this.report("post_roll_click_main");
                } else {
                    C3003d.this.report("post_roll_click_suggested");
                    StringBuilder sb = new StringBuilder();
                    sb.append(fullscreenAd.getAppURL());
                    sb.append("&tem_id=");
                    sb.append(C3003d.this.f12007z.isRewarded() ? "8" : "7");
                    sb.append("05");
                    fullscreenAd.setAppURL(sb.toString());
                }
                C3003d.this.f12007z.installClicked(fullscreenAd);
                boolean unused = C3003d.this.clicked = true;
            }
        });
    }
}
