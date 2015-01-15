package it.bellotti.seekbarcolorpicker;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import it.bellotti.SeekBarColorPicker.R;


public class MainActivity
        extends Activity {

//    private SeekBarColorPicker seekBarColor;
//    private LinearLayout linearLayout;
//    private ShapeDrawable shape;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        SeekBarColorPicker seekBarColor = (SeekBarColorPicker) findViewById(R.id.seekbar_color);
        final LinearLayout linearLayout = (LinearLayout) findViewById(R.id.layout);
        seekBarColor.setOnSeekBarColorChangedListener(new SeekBarColorPicker.OnColorChangedListener() {

            @Override
            public void onProgressColorChanged(int color) {
                Log.d("it.bellotti.seekbarcolorpicker.MainActivity", "onProgressColorChanged (line 27): " + Integer.toHexString(Math.abs(color)));
                linearLayout.setBackgroundColor(color);
            }

            @Override
            public void onStartColorChanged(int color) {

            }

            @Override
            public void onStopColorChanged(int color) {

            }
        });


    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);

//        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, linearLayout.getWidth(), 0.0f,
//
//                new int[] { 0xFF000000, 0xFF0000FF, 0xFF00FF00, 0xFF00FFFF,
//                        0xFFFF0000, 0xFFFF00FF, 0xFFFFFF00, 0xFFFFFFFF},
//                null, Shader.TileMode.CLAMP);
//
//        shape = new ShapeDrawable(new RectShape());
//        shape.getPaint().setShader(linearGradient);
//
//        seekBarFont.setProgressDrawable(shape);

    }
}
