# Hệ Thống Thông Tin Xe Cộ

## Tổng Quan

Dự án này triển khai một hệ thống thông tin đơn giản về các loại phương tiện giao thông như ô tô, xe đạp, xe tải và thuyền. Mỗi loại phương tiện được đại diện bởi một lớp cụ thể kế thừa từ lớp cơ sở chung (`Vehicle`). Hệ thống cũng tích hợp giao diện `FuelConsumable` để xử lý các phương tiện có thể được đổ nhiên liệu.

## Các Lớp

### 1. Vehicle

Lớp `Vehicle` là lớp cơ sở cho tất cả các phương tiện trong hệ thống. Nó chứa các thuộc tính chung như tốc độ và dung tích và cung cấp phương thức `start()` để mô phỏng việc khởi động phương tiện.

### 2. Car

Lớp `Car` kế thừa từ lớp `Vehicle` và triển khai giao diện `FuelConsumable`. Nó bao gồm các thuộc tính bổ sung cụ thể cho ô tô, như số cửa và loại truyền động. Lớp `Car` cũng ghi đè phương thức `displayUniqueFeatures()` để hiển thị các tính năng đặc biệt của ô tô và triển khai phương thức `refuel()` từ giao diện `FuelConsumable`.

### 3. Bicycle

Lớp `Bicycle` kế thừa từ lớp `Vehicle` và bao gồm các thuộc tính cụ thể cho xe đạp, như số bánh xe và loại đạp. Nó ghi đè phương thức `displayUniqueFeatures()` để hiển thị các tính năng đặc biệt của xe đạp.

### 4. Truck

Lớp `Truck` kế thừa từ lớp `Vehicle` và bao gồm các thuộc tính bổ sung như khả năng chở hàng. Nó ghi đè phương thức `displayUniqueFeatures()` để hiển thị các tính năng đặc biệt của xe tải và triển khai phương thức `refuel()` từ giao diện `FuelConsumable`.

### 5. Boat

Lớp `Boat` kế thừa từ lớp `Vehicle` và bao gồm các thuộc tính cụ thể cho thuyền, như loại động cơ và dung tích nhiên liệu. Nó ghi đè phương thức `displayUniqueFeatures()` để hiển thị các tính năng đặc biệt của thuyền và triển khai phương thức `refuel()` từ giao diện `FuelConsumable`.

## Ứng Dụng Chính (VehicleMain)

Lớp `VehicleMain` được sử dụng như điểm vào cho ứng dụng. Nó tạo các thể hiện của các loại phương tiện khác nhau (Car, Bicycle, Truck, Boat) và thực hiện chức năng của chúng. Mỗi phương tiện được khởi động, và các tính năng cụ thể được hiển thị, bao gồm cả việc đổ nhiên liệu cho các phương tiện triển khai giao diện `FuelConsumable`.

## Sử Dụng

Để sử dụng hệ thống thông tin xe cộ, hãy khởi tạo các loại phương tiện khác nhau và tùy chỉnh các thuộc tính dựa trên loại cụ thể. Chạy phương thức `start()` để mô phỏng việc khởi động mỗi phương tiện và hiển thị các tính năng độc đáo của chúng. Đối với các phương tiện triển khai giao diện `FuelConsumable`, có thể gọi phương thức `refuel()` để mô phỏng việc đổ nhiên liệu.

Có thể mở rộng hệ thống bằng cách thêm nhiều loại phương tiện hoặc giới thiệu các tính năng mới cho các lớp hiện tại. Cấu trúc modul cho phép bảo trì và mở rộng dễ dàng.
