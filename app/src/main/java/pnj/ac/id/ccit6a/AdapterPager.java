package pnj.ac.id.ccit6a;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class AdapterPager extends PagerAdapter {
    Context context;
    List<Integer> dataImage = new ArrayList<>();

    public AdapterPager(Context context, List<Integer> dataImage) {
        this.dataImage = dataImage;
        this.context = context;
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View item = LayoutInflater.from(context).
                inflate(R.layout.item_pager, container, false);

        ImageView imageView = item.findViewById(R.id.imageItem);
        imageView.setImageResource(dataImage.get(position));

        container.addView(item);

        return item;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout) object);
    }

    @Override
    public int getCount() {
        return dataImage.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == o;
    }
}
