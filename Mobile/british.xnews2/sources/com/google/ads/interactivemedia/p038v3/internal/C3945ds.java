package com.google.ads.interactivemedia.p038v3.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import android.widget.ImageView;
import com.google.ads.interactivemedia.p038v3.api.CompanionAdSlot;
import com.google.ads.interactivemedia.p038v3.impl.data.CompanionData;
import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ds */
/* compiled from: IMASDK */
public final class C3945ds extends ImageView implements View.OnClickListener {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final CompanionData f16942a;

    /* renamed from: b */
    private final float f16943b = getResources().getDisplayMetrics().density;

    /* renamed from: c */
    private final C3958ee f16944c;

    /* renamed from: d */
    private final String f16945d;

    /* renamed from: e */
    private final List<CompanionAdSlot.ClickListener> f16946e;

    /* renamed from: f */
    private final C3944dr f16947f;

    public C3945ds(Context context, C3958ee eeVar, CompanionData companionData, String str, List<CompanionAdSlot.ClickListener> list) {
        super(context);
        C3944dr drVar;
        this.f16944c = eeVar;
        this.f16942a = companionData;
        this.f16945d = str;
        this.f16946e = list;
        String size = companionData.size();
        if (size == null) {
            drVar = null;
        } else {
            String[] split = size.split("x", -1);
            if (split.length != 2) {
                drVar = new C3944dr(0, 0);
            } else {
                drVar = new C3944dr(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
            }
        }
        this.f16947f = drVar;
        setOnClickListener(this);
    }

    /* renamed from: c */
    static /* synthetic */ void m16991c(C3945ds dsVar) {
        C3958ee eeVar = dsVar.f16944c;
        String companionId = dsVar.f16942a.companionId();
        String str = dsVar.f16945d;
        if (!aru.m14636b(companionId) && !aru.m14636b(str)) {
            HashMap i = avr.m14967i(1);
            i.put("companionId", companionId);
            eeVar.mo15717o(new C3949dw(C3947du.displayContainer, C3948dv.companionView, str, i));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Bitmap mo15688a(String str) throws IOException {
        Bitmap decodeStream = BitmapFactory.decodeStream(new URL(str).openConnection().getInputStream());
        if (decodeStream == null) {
            return null;
        }
        return (this.f16947f.f16940a == decodeStream.getWidth() && this.f16947f.f16941b == decodeStream.getHeight() && !avw.m14980a((double) this.f16943b)) ? Bitmap.createScaledBitmap(decodeStream, (int) (this.f16943b * ((float) decodeStream.getWidth())), (int) (this.f16943b * ((float) decodeStream.getHeight())), true) : decodeStream;
    }

    public final void onClick(View view) {
        for (CompanionAdSlot.ClickListener onCompanionAdClick : this.f16946e) {
            onCompanionAdClick.onCompanionAdClick();
        }
        this.f16944c.mo15718p(this.f16942a.clickThroughUrl());
    }
}
