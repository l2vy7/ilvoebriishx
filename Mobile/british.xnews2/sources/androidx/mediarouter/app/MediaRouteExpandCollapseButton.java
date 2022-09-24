package androidx.mediarouter.app;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.content.C0600b;
import p011b1.C1537e;
import p011b1.C1542j;

class MediaRouteExpandCollapseButton extends AppCompatImageButton {

    /* renamed from: d */
    final AnimationDrawable f4028d;

    /* renamed from: e */
    final AnimationDrawable f4029e;

    /* renamed from: f */
    final String f4030f;

    /* renamed from: g */
    final String f4031g;

    /* renamed from: h */
    boolean f4032h;

    /* renamed from: i */
    View.OnClickListener f4033i;

    /* renamed from: androidx.mediarouter.app.MediaRouteExpandCollapseButton$a */
    class C0849a implements View.OnClickListener {
        C0849a() {
        }

        public void onClick(View view) {
            MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton = MediaRouteExpandCollapseButton.this;
            boolean z = !mediaRouteExpandCollapseButton.f4032h;
            mediaRouteExpandCollapseButton.f4032h = z;
            if (z) {
                mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.f4028d);
                MediaRouteExpandCollapseButton.this.f4028d.start();
                MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton2 = MediaRouteExpandCollapseButton.this;
                mediaRouteExpandCollapseButton2.setContentDescription(mediaRouteExpandCollapseButton2.f4031g);
            } else {
                mediaRouteExpandCollapseButton.setImageDrawable(mediaRouteExpandCollapseButton.f4029e);
                MediaRouteExpandCollapseButton.this.f4029e.start();
                MediaRouteExpandCollapseButton mediaRouteExpandCollapseButton3 = MediaRouteExpandCollapseButton.this;
                mediaRouteExpandCollapseButton3.setContentDescription(mediaRouteExpandCollapseButton3.f4030f);
            }
            View.OnClickListener onClickListener = MediaRouteExpandCollapseButton.this.f4033i;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f4033i = onClickListener;
    }

    public MediaRouteExpandCollapseButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnimationDrawable animationDrawable = (AnimationDrawable) C0600b.m3294f(context, C1537e.mr_group_expand);
        this.f4028d = animationDrawable;
        AnimationDrawable animationDrawable2 = (AnimationDrawable) C0600b.m3294f(context, C1537e.mr_group_collapse);
        this.f4029e = animationDrawable2;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(C0912i.m4667f(context, i), PorterDuff.Mode.SRC_IN);
        animationDrawable.setColorFilter(porterDuffColorFilter);
        animationDrawable2.setColorFilter(porterDuffColorFilter);
        String string = context.getString(C1542j.mr_controller_expand_group);
        this.f4030f = string;
        this.f4031g = context.getString(C1542j.mr_controller_collapse_group);
        setImageDrawable(animationDrawable.getFrame(0));
        setContentDescription(string);
        super.setOnClickListener(new C0849a());
    }
}
