package com.appnext.ads.fullscreen;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
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
import java.util.ArrayList;

/* renamed from: com.appnext.ads.fullscreen.e */
public final class C3008e extends Fragment {
    /* access modifiers changed from: private */

    /* renamed from: D */
    public C3030i f12014D;
    /* access modifiers changed from: private */

    /* renamed from: E */
    public TextView f12015E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public int f12016F = 0;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public ArrayList<AppnextAd> f12017G;
    /* access modifiers changed from: private */
    public Handler handler;
    Runnable tick = new Runnable() {
        public final void run() {
            try {
                C3008e.this.handler.removeCallbacks(this);
                if (C3008e.m10407c(C3008e.this) == 0) {
                    C3008e.this.f12014D.videoSelected((AppnextAd) C3008e.this.f12017G.get(0));
                    C3008e.this.report("pre_roll_noclick");
                    return;
                }
                if (C3008e.this.f12015E != null) {
                    TextView e = C3008e.this.f12015E;
                    e.setText(C3008e.this.f12016F + " sec");
                }
                C3008e.this.handler.postDelayed(C3008e.this.tick, 1000);
            } catch (Throwable th) {
                C3117a.m10553a("PreRollFragment$onDestroyView", th);
            }
        }
    };

    /* renamed from: c */
    static /* synthetic */ int m10407c(C3008e eVar) {
        int i = eVar.f12016F - 1;
        eVar.f12016F = i;
        return i;
    }

    /* access modifiers changed from: private */
    public void report(String str) {
        try {
            this.f12014D.report(str, "S1");
        } catch (Throwable th) {
            C3117a.m10553a("PreRollFragment$report", th);
        }
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.f12014D = (C3030i) activity;
        this.handler = new Handler();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null && getArguments().containsKey("time")) {
            this.f12016F = getArguments().getInt("time");
        }
        if (bundle != null) {
            this.f12016F = bundle.getInt("time");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            RelativeLayout relativeLayout = (RelativeLayout) layoutInflater.inflate(this.f12014D.getTemplate("S1"), viewGroup, false);
            View findViewById = relativeLayout.findViewById(C2980R.C2982id.item1);
            View findViewById2 = relativeLayout.findViewById(C2980R.C2982id.item2);
            ((TextView) relativeLayout.findViewById(C2980R.C2982id.title)).setText(this.f12014D.getConfigManager().mo10732y("pre_title_string1"));
            ((TextView) relativeLayout.findViewById(C2980R.C2982id.secondTile)).setText(this.f12014D.getConfigManager().mo10732y("pre_title_string2"));
            this.f12015E = (TextView) relativeLayout.findViewById(C2980R.C2982id.timer);
            ArrayList<AppnextAd> preRollAds = this.f12014D.getPreRollAds();
            this.f12017G = preRollAds;
            if (preRollAds.size() < 2) {
                this.f12014D.videoSelected(this.f12017G.get(0));
                return null;
            }
            m10404a((ViewGroup) findViewById, this.f12017G.get(0), 0);
            m10404a((ViewGroup) findViewById2, this.f12017G.get(1), 1);
            int i = C2980R.C2982id.privacy;
            relativeLayout.findViewById(i).setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C3008e.this.f12014D.privacyClicked();
                }
            });
            if (C3202i.m10805a(this.f12017G.get(0), this.f12014D.getConfigManager())) {
                C3202i.m10804a((Context) this.f12014D, (ImageView) relativeLayout.findViewById(i));
            }
            TextView textView = this.f12015E;
            textView.setText(this.f12016F + " sec");
            report("pre_roll_loaded");
            return relativeLayout;
        } catch (Throwable th) {
            C3117a.m10553a("PreRollFragment$onCreateView", th);
            this.f12014D.closeClicked();
            return null;
        }
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.handler.removeCallbacksAndMessages((Object) null);
    }

    public final void onPause() {
        super.onPause();
        this.handler.removeCallbacks(this.tick);
    }

    public final void onResume() {
        super.onResume();
        try {
            this.handler.postDelayed(this.tick, 1000);
        } catch (Throwable th) {
            C3117a.m10553a("PreRollFragment$onResume", th);
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("time", this.f12016F);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: a */
    private void m10404a(ViewGroup viewGroup, final AppnextAd appnextAd, final int i) {
        try {
            TextView textView = (TextView) viewGroup.findViewById(C2980R.C2982id.title);
            ImageView imageView = (ImageView) viewGroup.findViewById(C2980R.C2982id.icon);
            ImageView imageView2 = (ImageView) viewGroup.findViewById(C2980R.C2982id.background_image);
            RatingBar ratingBar = (RatingBar) viewGroup.findViewById(C2980R.C2982id.ratingBar);
            int i2 = C2980R.C2982id.playGameTextView;
            if (viewGroup.findViewById(i2) != null) {
                ((TextView) viewGroup.findViewById(i2)).setText(this.f12014D.getConfigManager().mo10732y("pre_cta_string"));
            }
            textView.setText(appnextAd.getAdTitle());
            ratingBar.setRating(Float.parseFloat(appnextAd.getStoreRating()));
            viewGroup.findViewById(C2980R.C2982id.click).setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    C3008e.this.f12014D.videoSelected(appnextAd);
                    int i = i;
                    if (i == 0) {
                        C3008e.this.report("pre_roll_left_click");
                    } else if (i == 1) {
                        C3008e.this.report("pre_roll_right_click");
                    }
                }
            });
            if (imageView2 != null) {
                C3204j.m10808ax().mo10810a(getActivity(), imageView2, appnextAd.getWideImageURL(), (C3204j.C3206a) null);
                C3204j.m10808ax().mo10810a(getActivity(), imageView, appnextAd.getImageURL(), (C3204j.C3206a) null);
            }
        } catch (Throwable th) {
            C3117a.m10553a("PreRollFragment$initItem", th);
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        this.f12014D = (C3030i) context;
        this.handler = new Handler();
    }
}
