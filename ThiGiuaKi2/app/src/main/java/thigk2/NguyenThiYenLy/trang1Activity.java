package thigk2.NguyenThiYenLy; // Giữ nguyên dòng package này của bạn nhé

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class trang1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trang1);

        EditText edtSoTien = findViewById(R.id.edtSoTien);
        EditText edtTiGia = findViewById(R.id.edtTiGia);
        Button btnDoiTien = findViewById(R.id.btnDoiTien);
        TextView tvKetQua = findViewById(R.id.tvKetQua);

        btnDoiTien.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String tienStr = edtSoTien.getText().toString();
                String tiGiaStr = edtTiGia.getText().toString();

                if (!tienStr.isEmpty() && !tiGiaStr.isEmpty()) {
                    double tien = Double.parseDouble(tienStr);
                    double tigia = Double.parseDouble(tiGiaStr);
                    double ketqua = tien * tigia;
                    tvKetQua.setText("Kết quả: " + ketqua + " VNĐ");
                } else {
                    tvKetQua.setText("Vui lòng nhập đủ thông tin!");
                }
            }
        });
    }
}