package com.startapp.sdk.ads.banner.banner3d;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.EmbossMaskFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.startapp.C11970ib;
import com.startapp.C11975j0;
import com.startapp.C12437y;
import com.startapp.sdk.ads.banner.banner3d.Banner3DSize;
import com.startapp.sdk.adsbase.AdsCommonMetaData;
import com.startapp.sdk.json.RatingBar;

/* compiled from: Sta */
public class Banner3DView extends RelativeLayout {

    /* renamed from: a */
    public TextView f54194a;

    /* renamed from: b */
    public TextView f54195b;

    /* renamed from: c */
    public ImageView f54196c;

    /* renamed from: d */
    public RatingBar f54197d;

    /* renamed from: e */
    public TextView f54198e;

    /* renamed from: f */
    public Point f54199f;

    /* compiled from: Sta */
    public enum Template {
        S,
        M,
        L,
        XL
    }

    /* renamed from: com.startapp.sdk.ads.banner.banner3d.Banner3DView$a */
    /* compiled from: Sta */
    public class C12196a extends ShapeDrawable {
        public C12196a(Banner3DView banner3DView, Shape shape) {
            super(shape);
        }

        public void onDraw(Shape shape, Canvas canvas, Paint paint) {
            paint.setColor(-11363070);
            paint.setMaskFilter(new EmbossMaskFilter(new float[]{1.0f, 1.0f, 1.0f}, 0.4f, 5.0f, 3.0f));
            super.onDraw(shape, canvas, paint);
        }
    }

    public Banner3DView(Context context) {
        super(context);
        mo45839a();
    }

    /* renamed from: a */
    public final void mo45839a() {
        Context context = getContext();
        Template template = Template.S;
        int i = this.f54199f.x;
        Banner3DSize.Size size = Banner3DSize.Size.SMALL;
        if (i > size.getSize().f53990a.x || this.f54199f.y > size.getSize().f53990a.y) {
            template = Template.M;
        }
        int i2 = this.f54199f.x;
        Banner3DSize.Size size2 = Banner3DSize.Size.MEDIUM;
        if (i2 > size2.getSize().f53990a.x || this.f54199f.y > size2.getSize().f53990a.y) {
            template = Template.L;
        }
        int i3 = this.f54199f.x;
        Banner3DSize.Size size3 = Banner3DSize.Size.LARGE;
        if (i3 > size3.getSize().f53990a.x || this.f54199f.y > size3.getSize().f53990a.y) {
            template = Template.XL;
        }
        setBackgroundDrawable(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{AdsCommonMetaData.f22242h.mo20903p(), AdsCommonMetaData.f22242h.mo20902o()}));
        setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        int a = C11970ib.m52467a(context, 2);
        int a2 = C11975j0.m52484a(context, 1, (float) 3);
        Math.round(TypedValue.applyDimension(1, (float) 4, context.getResources().getDisplayMetrics()));
        int a3 = C11975j0.m52484a(context, 1, (float) 5);
        int a4 = C11975j0.m52484a(context, 1, (float) 6);
        int a5 = C11975j0.m52484a(context, 1, (float) 8);
        Math.round(TypedValue.applyDimension(1, (float) 10, context.getResources().getDisplayMetrics()));
        int a6 = C11975j0.m52484a(context, 1, (float) 20);
        Math.round(TypedValue.applyDimension(1, (float) 84, context.getResources().getDisplayMetrics()));
        int a7 = C11975j0.m52484a(context, 1, (float) 90);
        setPadding(a3, 0, a3, 0);
        setTag(this);
        ImageView imageView = new ImageView(context);
        this.f54196c = imageView;
        imageView.setId(1);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a7, a7);
        layoutParams.addRule(15);
        this.f54196c.setLayoutParams(layoutParams);
        TextView textView = new TextView(context);
        this.f54194a = textView;
        textView.setId(2);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(C12437y.m53771a(17), 1);
        layoutParams2.addRule(14);
        this.f54194a.setLayoutParams(layoutParams2);
        this.f54194a.setTextColor(AdsCommonMetaData.f22242h.mo20904q().intValue());
        this.f54194a.setGravity(C12437y.m53771a(8388611));
        this.f54194a.setBackgroundColor(0);
        int ordinal = template.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            this.f54194a.setTextSize(17.0f);
            this.f54194a.setPadding(a2, 0, 0, a);
            Context context2 = getContext();
            double d = (double) this.f54199f.x;
            Double.isNaN(d);
            layoutParams2.width = C11970ib.m52467a(context2, (int) (d * 0.55d));
        } else if (ordinal == 2) {
            this.f54194a.setTextSize(17.0f);
            this.f54194a.setPadding(a2, 0, 0, a);
            Context context3 = getContext();
            double d2 = (double) this.f54199f.x;
            Double.isNaN(d2);
            layoutParams2.width = C11970ib.m52467a(context3, (int) (d2 * 0.65d));
        } else if (ordinal == 3 || ordinal == 4) {
            this.f54194a.setTextSize(22.0f);
            this.f54194a.setPadding(a2, 0, 0, a3);
        }
        this.f54194a.setSingleLine(true);
        this.f54194a.setEllipsize(TextUtils.TruncateAt.END);
        C11970ib.m52472a(this.f54194a, AdsCommonMetaData.f22242h.mo20905r());
        TextView textView2 = new TextView(context);
        this.f54195b = textView2;
        textView2.setId(3);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.addRule(C12437y.m53771a(17), 1);
        layoutParams3.addRule(3, 2);
        layoutParams3.setMargins(0, 0, 0, a3);
        this.f54195b.setLayoutParams(layoutParams3);
        this.f54195b.setTextColor(AdsCommonMetaData.f22242h.mo20899l().intValue());
        this.f54195b.setTextSize(18.0f);
        this.f54195b.setMaxLines(2);
        this.f54195b.setLines(2);
        this.f54195b.setSingleLine(false);
        this.f54195b.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        this.f54195b.setHorizontallyScrolling(true);
        this.f54195b.setPadding(a2, 0, 0, 0);
        RatingBar ratingBar = new RatingBar(getContext());
        this.f54197d = ratingBar;
        ratingBar.setId(5);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        int ordinal2 = template.ordinal();
        if (ordinal2 == 0 || ordinal2 == 1 || ordinal2 == 2) {
            layoutParams4.addRule(C12437y.m53771a(17), 1);
            layoutParams4.addRule(8, 1);
        } else if (ordinal2 == 3 || ordinal2 == 4) {
            layoutParams4.addRule(C12437y.m53771a(17), 2);
            Context context4 = getContext();
            double d3 = (double) this.f54199f.x;
            Double.isNaN(d3);
            layoutParams3.width = C11970ib.m52467a(context4, (int) (d3 * 0.6d));
        }
        layoutParams4.setMargins(a2, a5, a2, 0);
        this.f54197d.setLayoutParams(layoutParams4);
        this.f54198e = new TextView(context);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, -2);
        int ordinal3 = template.ordinal();
        if (ordinal3 == 0 || ordinal3 == 1 || ordinal3 == 2) {
            this.f54198e.setTextSize(13.0f);
            layoutParams5.addRule(C12437y.m53771a(17), 2);
            layoutParams5.addRule(15);
        } else if (ordinal3 == 3) {
            layoutParams5.addRule(C12437y.m53771a(17), 3);
            layoutParams5.addRule(15);
            layoutParams5.setMargins(a6, 0, 0, 0);
            this.f54198e.setTextSize(26.0f);
        } else if (ordinal3 == 4) {
            layoutParams5.addRule(C12437y.m53771a(17), 3);
            layoutParams5.addRule(15);
            layoutParams5.setMargins(a6 * 7, 0, 0, 0);
            this.f54198e.setTextSize(26.0f);
        }
        this.f54198e.setPadding(a4, a4, a4, a4);
        this.f54198e.setLayoutParams(layoutParams5);
        setButtonText(false);
        this.f54198e.setTextColor(-1);
        this.f54198e.setTypeface((Typeface) null, 1);
        this.f54198e.setId(4);
        this.f54198e.setShadowLayer(2.5f, -3.0f, 3.0f, -9013642);
        this.f54198e.setBackgroundDrawable(new C12196a(this, new RoundRectShape(new float[]{10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f, 10.0f}, (RectF) null, (float[]) null)));
        addView(this.f54196c);
        addView(this.f54194a);
        int ordinal4 = template.ordinal();
        if (ordinal4 == 0 || ordinal4 == 1 || ordinal4 == 2) {
            addView(this.f54198e);
        } else if (ordinal4 == 3 || ordinal4 == 4) {
            addView(this.f54198e);
            addView(this.f54195b);
        }
        addView(this.f54197d);
    }

    public void setButtonText(boolean z) {
        if (z) {
            this.f54198e.setText("OPEN");
        } else {
            this.f54198e.setText("DOWNLOAD");
        }
    }

    public void setDescription(String str) {
        if (str != null) {
            String str2 = "";
            if (str.compareTo(str2) != 0) {
                String[] a = mo45840a(str);
                String str3 = a[0];
                if (a[1] != null) {
                    str2 = mo45840a(a[1])[0];
                }
                if (str.length() >= 110) {
                    str2 = str2 + "...";
                }
                this.f54195b.setText(str3 + "\n" + str2);
            }
        }
    }

    public void setImage(Bitmap bitmap) {
        this.f54196c.setImageBitmap(bitmap);
    }

    public void setRating(float f) {
        try {
            this.f54197d.setRating(f);
        } catch (NullPointerException unused) {
        }
    }

    public void setText(String str) {
        this.f54194a.setText(str);
    }

    public void setImage(int i, int i2, int i3) {
        this.f54196c.setImageResource(i);
        ViewGroup.LayoutParams layoutParams = this.f54196c.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i3;
        this.f54196c.setLayoutParams(layoutParams);
    }

    public Banner3DView(Context context, Point point) {
        super(context);
        this.f54199f = point;
        mo45839a();
    }

    public Banner3DView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo45839a();
    }

    public void setImage(Bitmap bitmap, int i, int i2) {
        this.f54196c.setImageBitmap(bitmap);
        ViewGroup.LayoutParams layoutParams = this.f54196c.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        this.f54196c.setLayoutParams(layoutParams);
    }

    public Banner3DView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo45839a();
    }

    /* renamed from: a */
    public final String[] mo45840a(String str) {
        boolean z;
        String[] strArr = new String[2];
        int i = 55;
        if (str.length() > 55) {
            char[] charArray = str.substring(0, 55).toCharArray();
            int length = charArray.length - 1;
            int i2 = length - 1;
            while (true) {
                if (i2 <= 0) {
                    z = false;
                    break;
                } else if (charArray[i2] == ' ') {
                    length = i2;
                    z = true;
                    break;
                } else {
                    i2--;
                }
            }
            if (z) {
                i = length;
            }
            strArr[0] = str.substring(0, i);
            strArr[1] = str.substring(i + 1, str.length());
        } else {
            strArr[0] = str;
            strArr[1] = null;
        }
        return strArr;
    }
}
