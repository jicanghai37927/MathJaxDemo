package com.haiyunshan.mathjaxdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.haiyunshan.mathjax.MathJaxView;
import com.haiyunshan.mathjax.OnMathJaxRenderListener;

public class MainActivity extends AppCompatActivity {

    MathJaxView mMathJaxView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mMathJaxView = findViewById(R.id.mjv_view);
        mMathJaxView.setRenderListener(new OnMathJaxRenderListener() {
            @Override
            public void onRendered(MathJaxView view) {
                Toast.makeText(view.getContext(), "Render complete", Toast.LENGTH_SHORT).show();
            }
        });
        String text = this.getText();
        mMathJaxView.setText(text);
    }

    String getText() {
        String text = "${3Fe+2O _{2}   \\mathop{\\substack{=\\!=\\!=\\!=\\!=\\!=}}^{点燃} Fe _{3} O _{4}}$";

        text = "<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>\n" +
                "<!DOCTYPE math PUBLIC \"-//W3C//DTD MathML 2.0//EN\"\n" +
                "      \"http://www.w3.org/TR/MathML2/dtd/mathml2.dtd\">\n" +
                "<!-- Created by amaya 11.4.7, see http://www.w3.org/Amaya/ -->\n" +
                "<math xmlns=\"http://www.w3.org/1998/Math/MathML\">\n" +
                "  <msup>\n" +
                "    <mi>a</mi>\n" +
                "    <mn>2</mn>\n" +
                "  </msup>\n" +
                "  <mo>+</mo>\n" +
                "  <msup>\n" +
                "    <mi>b</mi>\n" +
                "    <mn>2</mn>\n" +
                "  </msup>\n" +
                "  <mo>=</mo>\n" +
                "  <msup>\n" +
                "    <mi>c</mi>\n" +
                "    <mn>2</mn>\n" +
                "  </msup>\n" +
                "</math>";

        text = "<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>\n" +
                "<!DOCTYPE math PUBLIC \"-//W3C//DTD MathML 2.0//EN\"\n" +
                "      \"http://www.w3.org/TR/MathML2/dtd/mathml2.dtd\">\n" +
                "<!-- Created by amaya 11.4.7, see http://www.w3.org/Amaya/ -->\n" +
                "<math xmlns=\"http://www.w3.org/1998/Math/MathML\">\n" +
                "  <msup>\n" +
                "    <mi>e</mi>\n" +
                "    <mi>i&pi;</mi>\n" +
                "  </msup>\n" +
                "  <mo>+</mo>\n" +
                "  <mn>1</mn>\n" +
                "  <mo>=</mo>\n" +
                "  <mn>0</mn>\n" +
                "</math>";

        text = "<?xml version=\"1.0\" encoding=\"iso-8859-1\"?>\n" +
                "<!DOCTYPE math PUBLIC \"-//W3C//DTD MathML 2.0//EN\"\n" +
                "      \"http://www.w3.org/TR/MathML2/dtd/mathml2.dtd\">\n" +
                "<!-- Created by amaya 11.4.7, see http://www.w3.org/Amaya/ -->\n" +
                "<math xmlns=\"http://www.w3.org/1998/Math/MathML\">\n" +
                "  <msub>\n" +
                "    <mi>a</mi>\n" +
                "    <mi>n</mi>\n" +
                "  </msub>\n" +
                "  <mo>=</mo>\n" +
                "  <mfrac>\n" +
                "    <mn>1</mn>\n" +
                "    <mi>&pi;</mi>\n" +
                "  </mfrac>\n" +
                "  <mrow>\n" +
                "    <msubsup>\n" +
                "      <mo>&int;</mo>\n" +
                "      <mrow>\n" +
                "        <mo>&minus;</mo>\n" +
                "        <mi>&pi;</mi>\n" +
                "      </mrow>\n" +
                "      <mi>&pi;</mi>\n" +
                "    </msubsup>\n" +
                "    <mrow>\n" +
                "      <mi>f</mi>\n" +
                "      <mo>(</mo>\n" +
                "      <mi>x</mi>\n" +
                "      <mo>)</mo>\n" +
                "    </mrow>\n" +
                "  </mrow>\n" +
                "  <mrow>\n" +
                "    <mi>cos</mi>\n" +
                "    <mo>\u2061</mo>\n" +
                "    <mrow>\n" +
                "      <mi>n</mi>\n" +
                "      <mi>x</mi>\n" +
                "    </mrow>\n" +
                "  </mrow>\n" +
                "  <mrow>\n" +
                "    <mo>ⅆ</mo>\n" +
                "    <mi>x</mi>\n" +
                "    <mo>,</mo>\n" +
                "    <msub>\n" +
                "      <mi>b</mi>\n" +
                "      <mi>n</mi>\n" +
                "    </msub>\n" +
                "  </mrow>\n" +
                "  <mo>=</mo>\n" +
                "  <mfrac>\n" +
                "    <mn>1</mn>\n" +
                "    <mi>&pi;</mi>\n" +
                "  </mfrac>\n" +
                "  <mrow>\n" +
                "    <msubsup>\n" +
                "      <mo>&int;</mo>\n" +
                "      <mrow>\n" +
                "        <mo>&minus;</mo>\n" +
                "        <mi>&pi;</mi>\n" +
                "      </mrow>\n" +
                "      <mi>&pi;</mi>\n" +
                "    </msubsup>\n" +
                "    <mrow>\n" +
                "      <mi>f</mi>\n" +
                "      <mo>(</mo>\n" +
                "      <mi>x</mi>\n" +
                "      <mo>)</mo>\n" +
                "    </mrow>\n" +
                "  </mrow>\n" +
                "  <mrow>\n" +
                "    <mi>sin</mi>\n" +
                "    <mo>\u2061</mo>\n" +
                "    <mrow>\n" +
                "      <mi>n</mi>\n" +
                "      <mi>x</mi>\n" +
                "    </mrow>\n" +
                "  </mrow>\n" +
                "  <mrow>\n" +
                "    <mo>ⅆ</mo>\n" +
                "    <mi>x</mi>\n" +
                "    <mo>.</mo>\n" +
                "  </mrow>\n" +
                "</math>";

//        text = "${3Fe+2O _{2}   \\mathop{\\substack{=\\!=\\!=\\!=\\!=\\!=}}^{点燃} Fe _{3} O _{4}}$";
        return text;
    }
}
