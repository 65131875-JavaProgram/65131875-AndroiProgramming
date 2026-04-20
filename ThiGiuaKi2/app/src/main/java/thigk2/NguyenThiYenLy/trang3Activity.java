package thigk2.NguyenThiYenLy;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class trang3Activity extends AppCompatActivity {

    ListView listView;
    ArrayList<ItemData> mangDuLieu;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang3);

        listView = findViewById(R.id.listViewDanhNhan);
        mangDuLieu = new ArrayList<>();

        mangDuLieu.add(new ItemData(R.drawable.hcm, "1. Chủ tịch Hồ Chí Minh", "Quê quán: Nam Đàn, Nghệ An"));
        mangDuLieu.add(new ItemData(R.drawable.vonguyengiap, "2. Đại tướng Võ Nguyên Giáp", "Quê quán: Lệ Thủy, Quảng Bình"));
        mangDuLieu.add(new ItemData(R.drawable.huongdaovuong, "3. Hưng Đạo Vương Trần Quốc Tuấn", "Quê quán: Tức Mặc, Nam Định"));
        mangDuLieu.add(new ItemData(R.drawable.nguyentrai, "4. Nguyễn Trãi", "Quê quán: Thường Tín, Hà Nội"));
        mangDuLieu.add(new ItemData(R.drawable.quangtrung, "5. Quang Trung - Nguyễn Huệ", "Quê quán: Tây Sơn, Bình Định"));

        adapter = new MyAdapter(this, R.layout.item_list, mangDuLieu);
        listView.setAdapter(adapter);
    }
}