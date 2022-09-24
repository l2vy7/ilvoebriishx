package androidx.transition;

import android.content.Context;
import android.util.AttributeSet;

public class AutoTransition extends TransitionSet {
    public AutoTransition() {
        m6768J0();
    }

    /* renamed from: J0 */
    private void m6768J0() {
        mo6276G0(1);
        mo6280y0(new Fade(2)).mo6280y0(new ChangeBounds()).mo6280y0(new Fade(1));
    }

    public AutoTransition(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6768J0();
    }
}
