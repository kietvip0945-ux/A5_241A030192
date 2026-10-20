# LAB A5 – CHUYỂN MÀN HÌNH VÀ TRUYỀN DỮ LIỆU BẰNG INTENT

## 1. Thông tin sinh viên

- **Họ và tên:** Lê Hoàng Anh Kiệt
- **Mã số sinh viên:** 241A030192
- **Môn học:** Lập trình trên các thiết bị di động
- **Tên bài thực hành:** Lab A5 – Chuyển màn hình và truyền dữ liệu bằng Intent
- **Ngôn ngữ:** Java, XML
- **Công cụ:** Android Studio

## 2. Giới thiệu bài thực hành

Bài Lab A5 xây dựng ứng dụng Danh bạ mini trên Android, cho phép người dùng nhập thông tin liên hệ, chuyển sang màn hình chi tiết để xem và chỉnh sửa thông tin.

Ứng dụng sử dụng Intent để chuyển đổi giữa hai Activity, truyền dữ liệu bằng Parcelable và nhận kết quả trả về bằng Activity Result API.

## 3. Các chức năng chính

- Nhập họ tên, số điện thoại và email.
- Chuyển từ MainActivity sang DetailActivity.
- Truyền đối tượng Contact bằng Parcelable.
- Hiển thị thông tin liên hệ tại màn hình chi tiết.
- Chỉnh sửa họ tên và lưu kết quả về màn hình chính.
- Hủy thao tác và quay lại màn hình trước.
- Mở ứng dụng gọi điện bằng Intent.
- Mở website trường Đại học Văn Hiến.
- Chia sẻ thông tin liên hệ sang ứng dụng khác.
- Ghi Logcat để theo dõi vòng đời Activity.

## 4. Cấu trúc chương trình

**MainActivity.java:** Màn hình chính, nhập thông tin và xử lý các Intent.

**DetailActivity.java:** Nhận thông tin liên hệ, cho phép chỉnh sửa và trả kết quả.

**Contact.java:** Lớp đối tượng lưu họ tên, số điện thoại, email và triển khai Parcelable.

**activity_main.xml:** Giao diện màn hình chính.

**activity_detail.xml:** Giao diện màn hình chi tiết.

**strings.xml:** Lưu các chuỗi văn bản sử dụng trong ứng dụng.

## 5. Kết quả thực hiện

- Chuyển đổi thành công giữa hai màn hình.
- Truyền và nhận dữ liệu liên hệ bằng Intent.
- Cập nhật họ tên sau khi chỉnh sửa.
- Xử lý thao tác Lưu và Hủy.
- Thực hiện các chức năng Gọi, Web và Chia sẻ.
- Theo dõi vòng đời Activity bằng Logcat.

## 6. Lịch sử Commit

**Commit 1:** Create project and activity layouts

Tạo project Android và xây dựng giao diện hai màn hình.

**Commit 2:** Implement intents and contact data transfer

Xây dựng chức năng chuyển màn hình, truyền dữ liệu và nhận kết quả.

**Commit 3:** Add lifecycle testing documentation

Bổ sung ghi Logcat và kiểm thử vòng đời Activity.

## 7. Link GitHub

https://github.com/kietvip0945-ux/A5_241A030192

---

**Sinh viên thực hiện: Lê Hoàng Anh Kiệt – 241A030192**
