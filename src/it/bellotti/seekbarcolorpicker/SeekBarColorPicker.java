package it.bellotti.seekbarcolorpicker;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.SeekBar;

/**
 * Created with IntelliJ IDEA.
 * User: Simone Bellotti
 * Date: 12/06/2014
 * Time: 13.01
 */
public class SeekBarColorPicker
        extends SeekBar
        implements SeekBar.OnSeekBarChangeListener {

    private int color;
    private OnColorChangedListener listener;

    /**
     * A callback that notifies clients when the color has changed
     */
    public interface OnColorChangedListener {

        /**
         * Notification that the color has changed.
         *
         * @param color the current color level
         */
        public void onColorChanged(int color);
    }

    public SeekBarColorPicker(Context context) {
        super(context);
        init();
    }

    public SeekBarColorPicker(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public SeekBarColorPicker(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    private void init() {

        setMax(256 * 7 - 1);

        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 420f, 0.0f,
                new int[]{0xFF000000, 0xFF0000FF, 0xFF00FF00, 0xFF00FFFF,
                        0xFFFF0000, 0xFFFF00FF, 0xFFFFFF00, 0xFFFFFFFF},
                null, Shader.TileMode.CLAMP
        );

        ShapeDrawable shape = new ShapeDrawable(new RectShape());
        shape.getPaint().setShader(linearGradient);

        setProgressDrawable(shape);
        setOnSeekBarChangeListener(this);
    }

    /**
     * Sets a listener to receiver notifications about color changes to the Seekbar's progress level
     *
     * @param listener The seek bar notification listener
     */
    public void setOnSeekBarColorChangedListener(OnColorChangedListener listener) {
        this.listener = listener;
    }

    public int getColor() {
        return color;
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        if (fromUser) {
//            color = changeColor(progress);
            int color = changeColor(progress);
            if (listener != null) {
                listener.onColorChanged(color);
            }
        }
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    private int changeColor(int progress) {

        int r = 0;
        int g = 0;
        int b = 0;

        Log.d("progress", "progress: " + progress);

        if (progress < 256) {
            b = progress;
        } else if (progress < 256 * 2) {
            g = progress % 256;
            b = 256 - progress % 256;
        } else if (progress < 256 * 3) {
            g = 255;
            b = progress % 256;
        } else if (progress < 256 * 4) {
            r = progress % 256;
            g = 256 - progress % 256;
            b = 256 - progress % 256;
        } else if (progress < 256 * 5) {
            r = 255;
            g = 0;
            b = progress % 256;
        } else if (progress < 256 * 6) {
            r = 255;
            g = progress % 256;
            b = 256 - progress % 256;
        } else if (progress < 256 * 7) {
            r = 255;
            g = 255;
            b = progress % 256;
        }

        return Color.rgb(r, g, b);

    }
}




