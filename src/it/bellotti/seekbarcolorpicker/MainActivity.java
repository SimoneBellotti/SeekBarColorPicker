package it.bellotti.seekbarcolorpicker;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;

import it.bellotti.SeekBarColorPicker.R;

public class MainActivity
        extends Activity {

    private SeekBarColorPicker seekBarColor;
    private LinearLayout linearLayout;
//    private ShapeDrawable shape;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        seekBarColor = (SeekBarColorPicker) findViewById(R.id.seekbar_color);
        linearLayout = (LinearLayout) findViewById(R.id.layout);
        seekBarColor.setOnSeekBarColorChangedListener(new SeekBarColorPicker.OnColorChangedListener() {
            @Override
            public void onColorChanged(int color) {
                linearLayout.setBackgroundColor(color);
                ///////
            }
        });

//
//        seekBarFont.setMax(256*7-1);
//
//
//        Log.d("width", "width: " +  linearLayout.getWidth());
//
//        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 420f, 0.0f,
//
//        new int[] { 0xFF000000, 0xFF0000FF, 0xFF00FF00, 0xFF00FFFF,
//                0xFFFF0000, 0xFFFF00FF, 0xFFFFFF00, 0xFFFFFFFF},
//                null, Shader.TileMode.CLAMP);
//
//        shape = new ShapeDrawable(new RectShape());
//        shape.getPaint().setShader(linearGradient);
//
//        seekBarFont.setProgressDrawable(shape);
//
//        seekBarFont.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                if(fromUser){
//                    int r = 0;
//                    int g = 0;
//                    int b = 0;
//
//                    if(progress < 256){
//                        b = progress;
//                    } else if(progress < 256*2) {
//                        g = progress%256;
//                        b = 256 - progress%256;
//                    } else if(progress < 256*3) {
//                        g = 255;
//                        b = progress%256;
//                    } else if(progress < 256*4) {
//                        r = progress%256;
//                        g = 256 - progress%256;
//                        b = 256 - progress%256;
//                    } else if(progress < 256*5) {
//                        r = 255;
//                        g = 0;
//                        b = progress%256;
//                    } else if(progress < 256*6) {
//                        r = 255;
//                        g = progress%256;
//                        b = 256 - progress%256;
//                    } else if(progress < 256*7) {
//                        r = 255;
//                        g = 255;
//                        b = progress%256;
//                    }
//
////                    linearLayout.setBackgroundColor(Color.argb(255, r, g, b));
//                    linearLayout.setBackgroundColor(Color.rgb(r, g, b));
//
//                }
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//
//            }
//        });

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        //Here you can get the size!

        Log.d("width", "width: " +  linearLayout.getWidth());

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
