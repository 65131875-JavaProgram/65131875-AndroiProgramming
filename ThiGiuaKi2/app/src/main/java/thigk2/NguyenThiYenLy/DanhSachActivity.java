package thigk2.NguyenThiYenLy;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;

public class DanhSachActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<ItemData> mangDuLieu;
    MyAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_danh_sach);

        listView = findViewById(R.id.listViewCaKhuc);
        mangDuLieu = new ArrayList<>();

        mangDuLieu.add(new ItemData(R.mipmap.ic_launcher, "1. Tiến quân ca", "Văn Cao"));
        mangDuLieu.add(new ItemData(R.mipmap.ic_launcher, "2. Nguyễn Thị Yến Ly", "Ca khúc đặc biệt của sinh viên"));
        mangDuLieu.add(new ItemData(R.mipmap.ic_launcher, "3. Tiến về Sài Gòn", "Lưu Hữu Phước"));
        mangDuLieu.add(new ItemData(R.mipmap.ic_launcher, "4. Đất nước trọn niềm vui", "Hoàng Hà"));
        mangDuLieu.add(new ItemData(R.mipmap.ic_launcher, "5. Bài ca thống nhất", "Võ Văn Di"));
        mangDuLieu.add(new ItemData(R.mipmap.ic_launcher, "6. Mùa xuân trên Thành phố Hồ Chí Minh", "Xuân Hồng"));
        mangDuLieu.add(new ItemData(R.mipmap.ic_launcher, "7. Chào anh giải phóng quân", "Hoàng Vân"));
        mangDuLieu.add(new ItemData(R.mipmap.ic_launcher, "8. Dáng đứng Bến Tre", "Nguyễn Văn Tý"));
        mangDuLieu.add(new ItemData(R.mipmap.ic_launcher, "9. Sợi nhớ sợi thương", "Phan Huỳnh Điểu"));
        mangDuLieu.add(new ItemData(R.mipmap.ic_launcher, "10. Trường Sơn Đông, Trường Sơn Tây", "Hoàng Hiệp"));

        adapter = new MyAdapter(this, R.layout.item_list, mangDuLieu);
        listView.setAdapter(adapter);
    }
}