package com.startapp.sdk.adsbase.adinformation;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.startapp.C11970ib;
import com.startapp.sdk.adsbase.adinformation.AdInformationObject;
import com.startapp.sdk.adsbase.adinformation.AdInformationPositions;
import com.startapp.sdk.adsbase.model.AdPreferences;

/* compiled from: Sta */
public class AdInformationView extends RelativeLayout {

    /* renamed from: a */
    public ImageView f54515a;

    /* renamed from: b */
    public RelativeLayout f54516b;

    /* renamed from: c */
    public View.OnClickListener f54517c = null;

    /* renamed from: d */
    public AdInformationConfig f54518d;

    /* renamed from: e */
    public ImageResourceConfig f54519e;

    /* renamed from: f */
    public AdPreferences.Placement f54520f;

    /* renamed from: g */
    public AdInformationPositions.Position f54521g;

    /* renamed from: com.startapp.sdk.adsbase.adinformation.AdInformationView$a */
    /* compiled from: Sta */
    public class C12260a implements View.OnClickListener {

        /* renamed from: a */
        public final /* synthetic */ View.OnClickListener f54522a;

        public C12260a(AdInformationView adInformationView, View.OnClickListener onClickListener) {
            this.f54522a = onClickListener;
        }

        public void onClick(View view) {
            this.f54522a.onClick(view);
        }
    }

    public AdInformationView(Context context, AdInformationObject.Size size, AdPreferences.Placement placement, AdInformationOverrides adInformationOverrides, View.OnClickListener onClickListener) {
        super(context);
        this.f54520f = placement;
        this.f54517c = new C12260a(this, onClickListener);
        mo46132a(size, adInformationOverrides);
    }

    /* renamed from: a */
    public void mo46132a(AdInformationObject.Size size, AdInformationOverrides adInformationOverrides) {
        AdInformationConfig a = AdInformationMetaData.f54504a.mo46121a();
        this.f54518d = a;
        if (a == null) {
            this.f54518d = AdInformationConfig.m53140a();
        }
        AdInformationConfig adInformationConfig = this.f54518d;
        this.f54519e = adInformationConfig.f54503a.get(size.mo46128a());
        if (adInformationOverrides == null || !adInformationOverrides.mo21017e()) {
            AdInformationConfig adInformationConfig2 = this.f54518d;
            AdPreferences.Placement placement = this.f54520f;
            AdInformationPositions.Position position = adInformationConfig2.Positions.get(placement);
            if (position == null) {
                position = AdInformationPositions.Position.BOTTOM_LEFT;
                adInformationConfig2.Positions.put(placement, position);
            }
            this.f54521g = position;
        } else {
            this.f54521g = adInformationOverrides.mo21014b();
        }
        ImageView imageView = new ImageView(getContext());
        this.f54515a = imageView;
        imageView.setContentDescription("info");
        this.f54515a.setId(1475346433);
        this.f54515a.setImageBitmap(this.f54519e.mo46135a(getContext()));
        this.f54516b = new RelativeLayout(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C11970ib.m52467a(getContext(), (int) (this.f54518d.mo46116e() * ((float) this.f54519e.mo46141d()))), C11970ib.m52467a(getContext(), (int) (this.f54518d.mo46116e() * ((float) this.f54519e.mo46134a()))));
        this.f54516b.setBackgroundColor(0);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(C11970ib.m52467a(getContext(), this.f54519e.mo46141d()), C11970ib.m52467a(getContext(), this.f54519e.mo46134a()));
        layoutParams2.setMargins(0, 0, 0, 0);
        this.f54515a.setPadding(0, 0, 0, 0);
        this.f54521g.addRules(layoutParams2);
        this.f54516b.addView(this.f54515a, layoutParams2);
        this.f54516b.setOnClickListener(this.f54517c);
        addView(this.f54516b, layoutParams);
    }
}
