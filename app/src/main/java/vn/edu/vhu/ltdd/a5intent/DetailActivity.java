package vn.edu.vhu.ltdd.a5intent;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.IntentCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailActivity extends AppCompatActivity {

    private static final String TAG = "A5_241A030192";

    private Contact contact;
    private EditText edtHoTenMoi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "B.onCreate");
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);
        int contentPadding = findViewById(R.id.main).getPaddingLeft();
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(contentPadding + systemBars.left, contentPadding + systemBars.top,
                    contentPadding + systemBars.right, contentPadding + systemBars.bottom);
            return insets;
        });

        TextView tvThongTin = findViewById(R.id.tvThongTin);
        TextView tvNguoiGui = findViewById(R.id.tvNguoiGui);
        edtHoTenMoi = findViewById(R.id.edtHoTenMoi);
        Button btnLuu = findViewById(R.id.btnLuu);
        Button btnHuy = findViewById(R.id.btnHuy);

        btnHuy.setOnClickListener(v -> {
            setResult(RESULT_CANCELED);
            finish();
        });

        contact = IntentCompat.getParcelableExtra(
                getIntent(), MainActivity.EXTRA_CONTACT, Contact.class);
        String nguoiGui = getIntent().getStringExtra(MainActivity.EXTRA_NGUOI_GUI);

        if (contact == null) {
            tvThongTin.setText(R.string.no_data);
            edtHoTenMoi.setEnabled(false);
            btnLuu.setEnabled(false);
            Log.w(TAG, "B: Khong nhan duoc Contact tu Intent");
            return;
        }

        tvThongTin.setText(getString(R.string.detail_format,
                contact.getHoTen(), contact.getDienThoai(), contact.getEmail()));
        tvNguoiGui.setText(getString(R.string.sent_by, nguoiGui));
        edtHoTenMoi.setText(contact.getHoTen());
        btnLuu.setOnClickListener(v -> luuVaQuayLai());
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "B.onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "B.onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "B.onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "B.onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "B.onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "B.onDestroy");
    }

    private void luuVaQuayLai() {
        String hoTenMoi = edtHoTenMoi.getText().toString().trim();
        if (hoTenMoi.isEmpty()) {
            edtHoTenMoi.setError(getString(R.string.err_empty));
            return;
        }

        contact.setHoTen(hoTenMoi);
        Intent ketQua = new Intent();
        ketQua.putExtra(MainActivity.EXTRA_CONTACT, contact);
        setResult(RESULT_OK, ketQua);
        Log.d(TAG, "B: Tra ket qua " + hoTenMoi);
        finish();
    }
}
