package p099k0;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import p104l0.C5643c;

/* renamed from: k0.c */
/* compiled from: PrecomputedTextCompat */
public class C5539c implements Spannable {

    /* renamed from: e */
    private static final Object f24051e = new Object();

    /* renamed from: b */
    private final Spannable f24052b;

    /* renamed from: c */
    private final C5540a f24053c;

    /* renamed from: d */
    private final PrecomputedText f24054d;

    /* renamed from: a */
    public C5540a mo22085a() {
        return this.f24053c;
    }

    /* renamed from: b */
    public PrecomputedText mo22086b() {
        Spannable spannable = this.f24052b;
        if (spannable instanceof PrecomputedText) {
            return (PrecomputedText) spannable;
        }
        return null;
    }

    public char charAt(int i) {
        return this.f24052b.charAt(i);
    }

    public int getSpanEnd(Object obj) {
        return this.f24052b.getSpanEnd(obj);
    }

    public int getSpanFlags(Object obj) {
        return this.f24052b.getSpanFlags(obj);
    }

    public int getSpanStart(Object obj) {
        return this.f24052b.getSpanStart(obj);
    }

    @SuppressLint({"NewApi"})
    public <T> T[] getSpans(int i, int i2, Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.f24054d.getSpans(i, i2, cls);
        }
        return this.f24052b.getSpans(i, i2, cls);
    }

    public int length() {
        return this.f24052b.length();
    }

    public int nextSpanTransition(int i, int i2, Class cls) {
        return this.f24052b.nextSpanTransition(i, i2, cls);
    }

    @SuppressLint({"NewApi"})
    public void removeSpan(Object obj) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f24054d.removeSpan(obj);
        } else {
            this.f24052b.removeSpan(obj);
        }
    }

    @SuppressLint({"NewApi"})
    public void setSpan(Object obj, int i, int i2, int i3) {
        if (obj instanceof MetricAffectingSpan) {
            throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
        } else if (Build.VERSION.SDK_INT >= 29) {
            this.f24054d.setSpan(obj, i, i2, i3);
        } else {
            this.f24052b.setSpan(obj, i, i2, i3);
        }
    }

    public CharSequence subSequence(int i, int i2) {
        return this.f24052b.subSequence(i, i2);
    }

    public String toString() {
        return this.f24052b.toString();
    }

    /* renamed from: k0.c$a */
    /* compiled from: PrecomputedTextCompat */
    public static final class C5540a {

        /* renamed from: a */
        private final TextPaint f24055a;

        /* renamed from: b */
        private final TextDirectionHeuristic f24056b;

        /* renamed from: c */
        private final int f24057c;

        /* renamed from: d */
        private final int f24058d;

        /* renamed from: e */
        final PrecomputedText.Params f24059e;

        /* renamed from: k0.c$a$a */
        /* compiled from: PrecomputedTextCompat */
        public static class C5541a {

            /* renamed from: a */
            private final TextPaint f24060a;

            /* renamed from: b */
            private TextDirectionHeuristic f24061b;

            /* renamed from: c */
            private int f24062c;

            /* renamed from: d */
            private int f24063d;

            public C5541a(TextPaint textPaint) {
                this.f24060a = textPaint;
                int i = Build.VERSION.SDK_INT;
                if (i >= 23) {
                    this.f24062c = 1;
                    this.f24063d = 1;
                } else {
                    this.f24063d = 0;
                    this.f24062c = 0;
                }
                if (i >= 18) {
                    this.f24061b = TextDirectionHeuristics.FIRSTSTRONG_LTR;
                } else {
                    this.f24061b = null;
                }
            }

            /* renamed from: a */
            public C5540a mo22106a() {
                return new C5540a(this.f24060a, this.f24061b, this.f24062c, this.f24063d);
            }

            /* renamed from: b */
            public C5541a mo22107b(int i) {
                this.f24062c = i;
                return this;
            }

            /* renamed from: c */
            public C5541a mo22108c(int i) {
                this.f24063d = i;
                return this;
            }

            /* renamed from: d */
            public C5541a mo22109d(TextDirectionHeuristic textDirectionHeuristic) {
                this.f24061b = textDirectionHeuristic;
                return this;
            }
        }

        @SuppressLint({"NewApi"})
        C5540a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
            if (Build.VERSION.SDK_INT >= 29) {
                this.f24059e = new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
            } else {
                this.f24059e = null;
            }
            this.f24055a = textPaint;
            this.f24056b = textDirectionHeuristic;
            this.f24057c = i;
            this.f24058d = i2;
        }

        /* renamed from: a */
        public boolean mo22098a(C5540a aVar) {
            int i = Build.VERSION.SDK_INT;
            if ((i >= 23 && (this.f24057c != aVar.mo22099b() || this.f24058d != aVar.mo22100c())) || this.f24055a.getTextSize() != aVar.mo22102e().getTextSize() || this.f24055a.getTextScaleX() != aVar.mo22102e().getTextScaleX() || this.f24055a.getTextSkewX() != aVar.mo22102e().getTextSkewX()) {
                return false;
            }
            if ((i >= 21 && (this.f24055a.getLetterSpacing() != aVar.mo22102e().getLetterSpacing() || !TextUtils.equals(this.f24055a.getFontFeatureSettings(), aVar.mo22102e().getFontFeatureSettings()))) || this.f24055a.getFlags() != aVar.mo22102e().getFlags()) {
                return false;
            }
            if (i >= 24) {
                if (!this.f24055a.getTextLocales().equals(aVar.mo22102e().getTextLocales())) {
                    return false;
                }
            } else if (i >= 17 && !this.f24055a.getTextLocale().equals(aVar.mo22102e().getTextLocale())) {
                return false;
            }
            if (this.f24055a.getTypeface() == null) {
                if (aVar.mo22102e().getTypeface() != null) {
                    return false;
                }
                return true;
            } else if (!this.f24055a.getTypeface().equals(aVar.mo22102e().getTypeface())) {
                return false;
            } else {
                return true;
            }
        }

        /* renamed from: b */
        public int mo22099b() {
            return this.f24057c;
        }

        /* renamed from: c */
        public int mo22100c() {
            return this.f24058d;
        }

        /* renamed from: d */
        public TextDirectionHeuristic mo22101d() {
            return this.f24056b;
        }

        /* renamed from: e */
        public TextPaint mo22102e() {
            return this.f24055a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C5540a)) {
                return false;
            }
            C5540a aVar = (C5540a) obj;
            if (!mo22098a(aVar)) {
                return false;
            }
            return Build.VERSION.SDK_INT < 18 || this.f24056b == aVar.mo22101d();
        }

        public int hashCode() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 24) {
                return C5643c.m24955b(Float.valueOf(this.f24055a.getTextSize()), Float.valueOf(this.f24055a.getTextScaleX()), Float.valueOf(this.f24055a.getTextSkewX()), Float.valueOf(this.f24055a.getLetterSpacing()), Integer.valueOf(this.f24055a.getFlags()), this.f24055a.getTextLocales(), this.f24055a.getTypeface(), Boolean.valueOf(this.f24055a.isElegantTextHeight()), this.f24056b, Integer.valueOf(this.f24057c), Integer.valueOf(this.f24058d));
            } else if (i >= 21) {
                return C5643c.m24955b(Float.valueOf(this.f24055a.getTextSize()), Float.valueOf(this.f24055a.getTextScaleX()), Float.valueOf(this.f24055a.getTextSkewX()), Float.valueOf(this.f24055a.getLetterSpacing()), Integer.valueOf(this.f24055a.getFlags()), this.f24055a.getTextLocale(), this.f24055a.getTypeface(), Boolean.valueOf(this.f24055a.isElegantTextHeight()), this.f24056b, Integer.valueOf(this.f24057c), Integer.valueOf(this.f24058d));
            } else if (i >= 18) {
                return C5643c.m24955b(Float.valueOf(this.f24055a.getTextSize()), Float.valueOf(this.f24055a.getTextScaleX()), Float.valueOf(this.f24055a.getTextSkewX()), Integer.valueOf(this.f24055a.getFlags()), this.f24055a.getTextLocale(), this.f24055a.getTypeface(), this.f24056b, Integer.valueOf(this.f24057c), Integer.valueOf(this.f24058d));
            } else if (i >= 17) {
                return C5643c.m24955b(Float.valueOf(this.f24055a.getTextSize()), Float.valueOf(this.f24055a.getTextScaleX()), Float.valueOf(this.f24055a.getTextSkewX()), Integer.valueOf(this.f24055a.getFlags()), this.f24055a.getTextLocale(), this.f24055a.getTypeface(), this.f24056b, Integer.valueOf(this.f24057c), Integer.valueOf(this.f24058d));
            } else {
                return C5643c.m24955b(Float.valueOf(this.f24055a.getTextSize()), Float.valueOf(this.f24055a.getTextScaleX()), Float.valueOf(this.f24055a.getTextSkewX()), Integer.valueOf(this.f24055a.getFlags()), this.f24055a.getTypeface(), this.f24056b, Integer.valueOf(this.f24057c), Integer.valueOf(this.f24058d));
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("{");
            sb.append("textSize=" + this.f24055a.getTextSize());
            sb.append(", textScaleX=" + this.f24055a.getTextScaleX());
            sb.append(", textSkewX=" + this.f24055a.getTextSkewX());
            int i = Build.VERSION.SDK_INT;
            if (i >= 21) {
                sb.append(", letterSpacing=" + this.f24055a.getLetterSpacing());
                sb.append(", elegantTextHeight=" + this.f24055a.isElegantTextHeight());
            }
            if (i >= 24) {
                sb.append(", textLocale=" + this.f24055a.getTextLocales());
            } else if (i >= 17) {
                sb.append(", textLocale=" + this.f24055a.getTextLocale());
            }
            sb.append(", typeface=" + this.f24055a.getTypeface());
            if (i >= 26) {
                sb.append(", variationSettings=" + this.f24055a.getFontVariationSettings());
            }
            sb.append(", textDir=" + this.f24056b);
            sb.append(", breakStrategy=" + this.f24057c);
            sb.append(", hyphenationFrequency=" + this.f24058d);
            sb.append("}");
            return sb.toString();
        }

        public C5540a(PrecomputedText.Params params) {
            this.f24055a = params.getTextPaint();
            this.f24056b = params.getTextDirection();
            this.f24057c = params.getBreakStrategy();
            this.f24058d = params.getHyphenationFrequency();
            this.f24059e = Build.VERSION.SDK_INT < 29 ? null : params;
        }
    }
}
