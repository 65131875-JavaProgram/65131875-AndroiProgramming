package thigk2.NguyenThiYenLy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class MyAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<ItemData> list;

    public MyAdapter(Context context, int layout, List<ItemData> list) {
        this.context = context;
        this.layout = layout;
        this.list = list;
    }

    @Override
    public int getCount() { return list.size(); }
    @Override
    public Object getItem(int i) { return null; }
    @Override
    public long getItemId(int i) { return 0; }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout, null);
        }
        ImageView img = view.findViewById(R.id.imgHinh);
        TextView txt1 = view.findViewById(R.id.tvTieuDe);
        TextView txt2 = view.findViewById(R.id.tvMoTa);

        ItemData item = list.get(i);
        img.setImageResource(item.getHinhAnh());
        txt1.setText(item.getTieuDe());
        txt2.setText(item.getMoTa());
        return view;
    }
}