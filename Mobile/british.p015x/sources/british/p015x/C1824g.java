package british.p015x;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.exoplayer2.extractor.p040ts.TsExtractor;

/* renamed from: british.x.g */
/* compiled from: EmojisMenu */
public class C1824g extends Dialog implements View.OnClickListener {

    /* renamed from: b */
    private EditText f7789b;

    /* renamed from: c */
    Context f7790c;

    public C1824g(EditText editText, Context context) {
        super(context);
        this.f7789b = editText;
        this.f7790c = context;
    }

    public void onClick(View view) {
        int intValue = ((Integer) view.getTag()).intValue();
        if (intValue != 0) {
            int max = Math.max(this.f7789b.getSelectionStart(), 0);
            int max2 = Math.max(this.f7789b.getSelectionEnd(), 0);
            String str = new String(Character.toChars(intValue));
            this.f7789b.getText().replace(Math.min(max, max2), Math.max(max, max2), str, 0, str.length());
        }
        dismiss();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        requestWindowFeature(1);
        setContentView(R.layout.emojis);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        int[] iArr = new int[TsExtractor.TS_STREAM_TYPE_AC4];
        // fill-array-data instruction
        iArr[0] = 128512;
        iArr[1] = 128513;
        iArr[2] = 128514;
        iArr[3] = 128515;
        iArr[4] = 128516;
        iArr[5] = 128517;
        iArr[6] = 128518;
        iArr[7] = 128521;
        iArr[8] = 128522;
        iArr[9] = 128523;
        iArr[10] = 128526;
        iArr[11] = 128525;
        iArr[12] = 128536;
        iArr[13] = 128529;
        iArr[14] = 128566;
        iArr[15] = 128547;
        iArr[16] = 128549;
        iArr[17] = 128558;
        iArr[18] = 128559;
        iArr[19] = 128554;
        iArr[20] = 128555;
        iArr[21] = 128564;
        iArr[22] = 128524;
        iArr[23] = 128539;
        iArr[24] = 128540;
        iArr[25] = 128541;
        iArr[26] = 128530;
        iArr[27] = 128533;
        iArr[28] = 128562;
        iArr[29] = 128534;
        iArr[30] = 128542;
        iArr[31] = 128536;
        iArr[32] = 128543;
        iArr[33] = 128548;
        iArr[34] = 128546;
        iArr[35] = 128557;
        iArr[36] = 128550;
        iArr[37] = 128551;
        iArr[38] = 128552;
        iArr[39] = 128553;
        iArr[40] = 128556;
        iArr[41] = 128560;
        iArr[42] = 128561;
        iArr[43] = 128563;
        iArr[44] = 128565;
        iArr[45] = 128545;
        iArr[46] = 128544;
        iArr[47] = 128567;
        iArr[48] = 128519;
        iArr[49] = 128520;
        iArr[50] = 128127;
        iArr[51] = 128121;
        iArr[52] = 128122;
        iArr[53] = 128128;
        iArr[54] = 128123;
        iArr[55] = 128125;
        iArr[56] = 128126;
        iArr[57] = 128586;
        iArr[58] = 128584;
        iArr[59] = 128585;
        iArr[60] = 128116;
        iArr[61] = 128117;
        iArr[62] = 128104;
        iArr[63] = 128105;
        iArr[64] = 128084;
        iArr[65] = 128110;
        iArr[66] = 128130;
        iArr[67] = 128119;
        iArr[68] = 128120;
        iArr[69] = 128112;
        iArr[70] = 128124;
        iArr[71] = 128118;
        iArr[72] = 128694;
        iArr[73] = 127939;
        iArr[74] = 128131;
        iArr[75] = 128111;
        iArr[76] = 128107;
        iArr[77] = 128143;
        iArr[78] = 128106;
        iArr[79] = 127968;
        iArr[80] = 128072;
        iArr[81] = 128073;
        iArr[82] = 128070;
        iArr[83] = 128071;
        iArr[84] = 9757;
        iArr[85] = 9996;
        iArr[86] = 128076;
        iArr[87] = 128170;
        iArr[88] = 128077;
        iArr[89] = 128078;
        iArr[90] = 9994;
        iArr[91] = 128074;
        iArr[92] = 128075;
        iArr[93] = 128079;
        iArr[94] = 128588;
        iArr[95] = 128591;
        iArr[96] = 128066;
        iArr[97] = 128069;
        iArr[98] = 128064;
        iArr[99] = 128139;
        iArr[100] = 128149;
        iArr[101] = 128152;
        iArr[102] = 10084;
        iArr[103] = 128148;
        iArr[104] = 128166;
        iArr[105] = 128168;
        iArr[106] = 127769;
        iArr[107] = 9728;
        iArr[108] = 128054;
        iArr[109] = 128052;
        iArr[110] = 128014;
        iArr[111] = 128055;
        iArr[112] = 128017;
        iArr[113] = 128024;
        iArr[114] = 128048;
        iArr[115] = 128020;
        iArr[116] = 128035;
        iArr[117] = 128056;
        iArr[118] = 128034;
        iArr[119] = 128051;
        iArr[120] = 128044;
        iArr[121] = 128031;
        iArr[122] = 128012;
        iArr[123] = 128029;
        iArr[124] = 127801;
        iArr[125] = 127804;
        iArr[126] = 127796;
        iArr[127] = 127808;
        iArr[128] = 127828;
        iArr[129] = 127831;
        iArr[130] = 127829;
        iArr[131] = 127848;
        iArr[132] = 127849;
        iArr[133] = 127874;
        iArr[134] = 127856;
        iArr[135] = 127853;
        iArr[136] = 128663;
        iArr[137] = 128690;
        iArr[138] = 128674;
        iArr[139] = 9992;
        iArr[140] = 128640;
        iArr[141] = 8986;
        iArr[142] = 9200;
        iArr[143] = 8987;
        iArr[144] = 9924;
        iArr[145] = 127877;
        iArr[146] = 127875;
        iArr[147] = 127876;
        iArr[148] = 127881;
        iArr[149] = 127882;
        iArr[150] = 127886;
        iArr[151] = 127873;
        iArr[152] = 127926;
        iArr[153] = 127908;
        iArr[154] = 127911;
        iArr[155] = 128251;
        iArr[156] = 127942;
        iArr[157] = 128176;
        iArr[158] = 128184;
        iArr[159] = 128179;
        iArr[160] = 9917;
        iArr[161] = 9918;
        iArr[162] = 127936;
        iArr[163] = 127944;
        iArr[164] = 127934;
        iArr[165] = 9971;
        iArr[166] = 127938;
        iArr[167] = 127946;
        iArr[168] = 127927;
        iArr[169] = 127928;
        iArr[170] = 127929;
        iArr[171] = 127930;
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll_emojis);
        int E = C1692config.m8149E(this.f7790c, 10);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        LinearLayout linearLayout2 = null;
        int i = 0;
        for (int i2 = 0; i2 < 172; i2++) {
            int i3 = iArr[i2];
            i++;
            if (i == 1) {
                linearLayout2 = new LinearLayout(this.f7790c);
                linearLayout2.setBackgroundColor(Color.parseColor("#dddddd"));
                linearLayout2.setPadding(E, E, E, E);
                linearLayout2.setLayoutParams(layoutParams);
            }
            TextView textView = new TextView(this.f7790c);
            textView.setLayoutParams(layoutParams2);
            textView.setPadding(E, E, E, E);
            textView.setTextColor(-16777216);
            textView.setTextSize(24.0f);
            textView.setText(new String(Character.toChars(i3)));
            textView.setTag(Integer.valueOf(i3));
            textView.setOnClickListener(this);
            linearLayout2.addView(textView);
            if (i == 4) {
                linearLayout.addView(linearLayout2);
                i = 0;
            }
        }
        if (i > 0) {
            linearLayout.addView(linearLayout2);
        }
    }
}
