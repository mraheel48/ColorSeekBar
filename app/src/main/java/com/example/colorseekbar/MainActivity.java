package com.example.colorseekbar;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.rtugeek.android.colorseekbar.ColorSeekBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.text_view);
        ColorSeekBar colorSeekBar = findViewById(R.id.color_seek_bar);

        colorSeekBar.setMaxPosition(100);
        colorSeekBar.setColorSeeds(R.array.material_colors); // material_colors is defalut included in res/color,just use it.
        colorSeekBar.setColorBarPosition(10); //0 - maxValue
        colorSeekBar.setAlphaBarPosition(10); //0 - 255
        colorSeekBar.setPosition(10,10); // An easier way to set ColorBar and AlphaBar

        colorSeekBar.setShowAlphaBar(true);
        colorSeekBar.setBarHeight(5); //5dpi
        colorSeekBar.setThumbHeight(30); //30dpi
        colorSeekBar.setBarMargin(10); //set the margin between colorBar and alphaBar 10dpi

        colorSeekBar.setOnColorChangeListener(new ColorSeekBar.OnColorChangeListener() {
            @Override
            public void onColorChangeListener(int i, int i1, int i2) {
                textView.setTextColor(i2);
            }
        });
    }
}
