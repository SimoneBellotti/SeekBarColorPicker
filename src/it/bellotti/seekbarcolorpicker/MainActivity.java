package it.bellotti.seekbarcolorpicker;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import it.bellotti.SeekBarColorPicker.R;


public class MainActivity
        extends Activity {

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
}
