package tiil.edu.listview1;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // Khai báo các biến
    ListView lvVatLieu;
    ArrayList<String> dsVatLieu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvVatLieu = findViewById(R.id.lvVatLieu);


        dsVatLieu = new ArrayList<>();
        dsVatLieu.add("Xi măng PC40");
        dsVatLieu.add("Gạch ống 8x18");
        dsVatLieu.add("Sắt phi 10");
        dsVatLieu.add("Cát xây tô");
        dsVatLieu.add("Đá 1x2");
        dsVatLieu.add("Sơn nước chống thấm");

    }
}