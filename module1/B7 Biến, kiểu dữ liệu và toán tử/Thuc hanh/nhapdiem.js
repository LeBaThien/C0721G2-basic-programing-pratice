
alert("Đây là chương trình tính điểm trung bình 3 môn");

let inputvatLy;
let inputhoaHoc;
let inputsinhHoc;

inputvatLy = prompt('Nhập điểm môn lý vào đây');
inputhoaHoc = prompt('Nhập điểm môn hóa học vào đây');
inputsinhHoc = prompt('Nhập điểm sinh học vào đây');

let vatLy = parseInt(inputvatLy);
let hoaHoc = parseInt(inputhoaHoc);
let sinhHoc = parseInt(inputsinhHoc);

let averageScore = (vatLy + hoaHoc + sinhHoc)/3;
document.write('Điểm trung bình 3 môn lý, hóa, sinh là: ' + averageScore);
