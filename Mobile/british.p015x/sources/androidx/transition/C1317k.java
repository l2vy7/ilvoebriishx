package androidx.transition;

import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: androidx.transition.k */
/* compiled from: MatrixUtils */
class C1317k {

    /* renamed from: a */
    static final Matrix f5908a = new C1318a();

    /* renamed from: androidx.transition.k$a */
    /* compiled from: MatrixUtils */
    static class C1318a extends Matrix {
        C1318a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo6335a() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        public boolean postConcat(Matrix matrix) {
            mo6335a();
            return false;
        }

        public boolean postRotate(float f, float f2, float f3) {
            mo6335a();
            return false;
        }

        public boolean postScale(float f, float f2, float f3, float f4) {
            mo6335a();
            return false;
        }

        public boolean postSkew(float f, float f2, float f3, float f4) {
            mo6335a();
            return false;
        }

        public boolean postTranslate(float f, float f2) {
            mo6335a();
            return false;
        }

        public boolean preConcat(Matrix matrix) {
            mo6335a();
            return false;
        }

        public boolean preRotate(float f, float f2, float f3) {
            mo6335a();
            return false;
        }

        public boolean preScale(float f, float f2, float f3, float f4) {
            mo6335a();
            return false;
        }

        public boolean preSkew(float f, float f2, float f3, float f4) {
            mo6335a();
            return false;
        }

        public boolean preTranslate(float f, float f2) {
            mo6335a();
            return false;
        }

        public void reset() {
            mo6335a();
        }

        public void set(Matrix matrix) {
            mo6335a();
        }

        public boolean setConcat(Matrix matrix, Matrix matrix2) {
            mo6335a();
            return false;
        }

        public boolean setPolyToPoly(float[] fArr, int i, float[] fArr2, int i2, int i3) {
            mo6335a();
            return false;
        }

        public boolean setRectToRect(RectF rectF, RectF rectF2, Matrix.ScaleToFit scaleToFit) {
            mo6335a();
            return false;
        }

        public void setRotate(float f, float f2, float f3) {
            mo6335a();
        }

        public void setScale(float f, float f2, float f3, float f4) {
            mo6335a();
        }

        public void setSinCos(float f, float f2, float f3, float f4) {
            mo6335a();
        }

        public void setSkew(float f, float f2, float f3, float f4) {
            mo6335a();
        }

        public void setTranslate(float f, float f2) {
            mo6335a();
        }

        public void setValues(float[] fArr) {
            mo6335a();
        }

        public boolean postRotate(float f) {
            mo6335a();
            return false;
        }

        public boolean postScale(float f, float f2) {
            mo6335a();
            return false;
        }

        public boolean postSkew(float f, float f2) {
            mo6335a();
            return false;
        }

        public boolean preRotate(float f) {
            mo6335a();
            return false;
        }

        public boolean preScale(float f, float f2) {
            mo6335a();
            return false;
        }

        public boolean preSkew(float f, float f2) {
            mo6335a();
            return false;
        }

        public void setRotate(float f) {
            mo6335a();
        }

        public void setScale(float f, float f2) {
            mo6335a();
        }

        public void setSinCos(float f, float f2) {
            mo6335a();
        }

        public void setSkew(float f, float f2) {
            mo6335a();
        }
    }
}
