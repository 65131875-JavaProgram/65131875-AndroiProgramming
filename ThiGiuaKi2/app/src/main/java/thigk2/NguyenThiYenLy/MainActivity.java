package thigk2.NguyenThiYenLy;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        android.widget.Button btn1 = findViewById(R.id.btn1);
        android.widget.Button btn2 = findViewById(R.id.btn2);
        android.widget.Button btn3 = findViewById(R.id.btn3);
        android.widget.Button btn4 = findViewById(R.id.btn4);

        btn1.setOnClickListener(v -> startActivity(new android.content.Intent(MainActivity.this, trang1Activity.class)));
        btn2.setOnClickListener(v -> startActivity(new android.content.Intent(MainActivity.this, DanhSachActivity.class))); // Dùng DanhSachActivity cho câu 2
        btn3.setOnClickListener(v -> startActivity(new android.content.Intent(MainActivity.this, trang3Activity.class)));
        btn4.setOnClickListener(v -> startActivity(new android.content.Intent(MainActivity.this, trang4Activity.class)));
    }
}