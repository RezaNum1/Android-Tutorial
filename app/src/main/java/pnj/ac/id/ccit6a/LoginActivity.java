package pnj.ac.id.ccit6a;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends AppCompatActivity {

    ViewPager viewPager;
    AdapterPager adapterPager;
    ImageView img1, img2, img3, img4;
    Button actionJoin;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1 = findViewById(R.id.img1);
        img2 = findViewById(R.id.img2);
        img3 = findViewById(R.id.img3);
        img4 = findViewById(R.id.img4);
        viewPager = findViewById(R.id.viewPager);

        actionJoin = findViewById(R.id.actionJoin);

        List<Integer> data = new ArrayList<>();
        data.add(R.drawable.bg);
        data.add(R.drawable.bg1);
        data.add(R.drawable.bg2);
        data.add(R.drawable.bg3);

        adapterPager = new AdapterPager(this, data);
        viewPager.setAdapter(adapterPager);
        img1.setImageResource(R.drawable.cirle_indicator_orange);
        img2.setImageResource(R.drawable.cirle_indicator_putih);
        img3.setImageResource(R.drawable.cirle_indicator_putih);
        img4.setImageResource(R.drawable.cirle_indicator_putih);
        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                if (i == 0) {
                    img1.setImageResource(R.drawable.cirle_indicator_orange);
                    img2.setImageResource(R.drawable.cirle_indicator_putih);
                    img3.setImageResource(R.drawable.cirle_indicator_putih);
                    img4.setImageResource(R.drawable.cirle_indicator_putih);
                } else if (i == 1) {
                    img1.setImageResource(R.drawable.cirle_indicator_putih);
                    img2.setImageResource(R.drawable.cirle_indicator_orange);
                    img3.setImageResource(R.drawable.cirle_indicator_putih);
                    img4.setImageResource(R.drawable.cirle_indicator_putih);
                } else if (i == 2) {
                    img1.setImageResource(R.drawable.cirle_indicator_putih);
                    img2.setImageResource(R.drawable.cirle_indicator_putih);
                    img3.setImageResource(R.drawable.cirle_indicator_orange);
                    img4.setImageResource(R.drawable.cirle_indicator_putih);
                } else if (i == 3) {
                    img1.setImageResource(R.drawable.cirle_indicator_putih);
                    img2.setImageResource(R.drawable.cirle_indicator_putih);
                    img3.setImageResource(R.drawable.cirle_indicator_putih);
                    img4.setImageResource(R.drawable.cirle_indicator_orange);
                }
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });

        actionJoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });


    }
}
