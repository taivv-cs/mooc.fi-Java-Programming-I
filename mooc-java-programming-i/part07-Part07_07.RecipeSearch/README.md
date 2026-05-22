# Phân tích đề bài

Kết quả cần đạt: Tạo ra hệ thống tìm kiếm công thức

- Tìm kiếm bằng tên
- Tìm kiếm bằng thời gian nấu ăn
- Tìm kiếm bằng nguyên liệu, nếu công thức có sự giao nhau về nguyên liệu thì cũng phải in ra 2 công thức đó, tương tự với thời gian nấu ăn.

## Ý tưởng

Tôi nghĩ đến việc lưu vào Hash Map, mỗi thành phần sẽ lưu và key, value sẽ là ArrayList sẽ chứa các mảng công thức. và khi cần cần truy xuất, chỉ cần

```txt
for ([nhiều công thức] [công thức]: [value.công thức]) {
  sout(công thức - đã được toString)
}
```

## Thiết kế

Tôi nghĩ đến Module như sau

- `FileIO` sẽ xử lý dữ liệu từ trong File
- `Recipe` lấy dữ liệu từ data và parse để có dữ liệu sạch
- `UserInterface` Lấy API từ các class
- `SearchEngine` như cái tên
- `RecipeSearch` file main
