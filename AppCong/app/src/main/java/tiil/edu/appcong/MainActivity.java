package tiil.edu.appcong;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

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
    }
    //day la bo lang nghe va xu li su kien click len nut tinh tong,maming sang java file
    public void XulyCong(View view){
        //Tim, tham chieu den dieu khien tren tep XML
        EditText editTextSoA =   findViewById(R.id.edtA);
        EditText editTextSoB =   findViewById(R.id.edtB);
        EditText editTextKetQua =   findViewById(R.id.edtKQ);
        //lay du lieu ve o dk so a
        String strA  =  editTextSoA.getText().toString();   //strA="2"
        //lay du lieu ve o dk so b
        String strB  =  editTextSoB.getText().toString();   //strB="4"

        //chuyen du lieu ve dang so
        int so_A =  Integer.parseInt(strA);     //2
        int so_B =  Integer.parseInt(strB);     //4

        //Tinh toan theo yeu cau
        int  tong = so_A + so_B;       //6
        String strTong = String.valueOf(tong);   //Chuyen sang dang chuoi "6"
        //Hien ra man hinh
        editTextKetQua.setText(strTong);
    }
}