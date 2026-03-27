package tiil.edu.appmonan;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        ListView lvDSMonAn = (ListView)  findViewById(R.id.lvDSMonAn);
        ArrayList<MonAn> dsMonAn = new ArrayList<>();
        MonAn m1 = (new MonAn("Phở bò tái",30000,"Nổi tiếng của Việt Nam",R.drawable.phobo));
        MonAn m2 = (new MonAn("Phở chiên phồng",30000,"thơm ngon mới lạ",R.drawable.phochien));
        MonAn m3 = (new MonAn("Bún chả",30000,"Lựa chọn hàng đầu của thực khách ",R.drawable.buncha));
        MonAn m4 = (new MonAn("Cốm xanh",30000,"Đặc sản của người dân Hà Nội",R.drawable.com));
        MonAn m5 = (new MonAn("Bún đậu mắm tôm",30000,"Món ăn nổi tiếng",R.drawable.bundau));

        dsMonAn.add(m1);
        dsMonAn.add(m2);
        dsMonAn.add(m3);
        dsMonAn.add(m4);
        dsMonAn.add(m5);


        MonAnAdapter adapter = new MonAnAdapter(this, dsMonAn);
        lvDSMonAn.setAdapter(adapter);
        lvDSMonAn.setOnItemClickListener((parent, view, position, id) -> {
            MonAn monAnChon = dsMonAn.get(position);

            Toast.makeText(MainActivity.this, "Bạn chọn: " + monAnChon.getTenMonAn(), Toast.LENGTH_LONG).show();
        });
    }
}