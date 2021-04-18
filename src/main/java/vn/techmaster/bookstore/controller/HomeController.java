package vn.techmaster.bookstore.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import vn.techmaster.bookstore.model.Car;
@Controller
public class HomeController {
  // Đọc giá trị từ application.properties
  @Value("${spring.application.name}")
  private String appName;
  static final String APP_NAME = "appName";
  static final String BOOKS = "books";

  @GetMapping(value = "/")
  public String getHome(Model model) {
    model.addAttribute(APP_NAME, appName);
    return "home";
  }

  @GetMapping(value = "/about")
  public String getAbout(Model model) {
    model.addAttribute(APP_NAME, appName);
    return "about";
  }

  // Trả về books là mảng của String
  @GetMapping(value = "/car")
  public String getBook(Model model) {
    String[] bookCollection = { "VinFast Fadil", "Hyundai Grand i10", "Mitsubishi Xpander", "Mazda CX-5", "Ford Ranger",
        "Toyota Corolla Cross", "Kia Ceratoo", "Tôi đi code dạo", "Toyota Corolla Cross", "Kia Cerato", "KIA Seltos" };
    model.addAttribute(BOOKS, bookCollection);
    model.addAttribute(APP_NAME, appName);
    return "topcar";
  }

  // Trả về books là mảng của đối tượng kiểu Book
  // @GetMapping(value = "/book2")
  // public String getBook2(Model model) {
  //   Car[] bookCollection = { new Car(1, "VinFast Fadi", "Vinfast", 560, "http:sdsdsd") };

  //   model.addAttribute(BOOKS, bookCollection);
  //   model.addAttribute(APP_NAME, appName);
  //   return "book2";
  // }

  // Trả về books là mảng của đối tượng kiểu Book, thêm ảnh cho từng sách
  // @GetMapping(value = "/book3")
  // public String getBook3(Model model) {
  // Car[] bookCollection = { new Car(1, "Cafe cùng Tony", "Tony"), new Car(2, "Dế
  // Mèn Phiêu Lưu Ký", "Tô Hoài") };

  // model.addAttribute(BOOKS, bookCollection);
  // model.addAttribute(APP_NAME, appName);
  // return "book3";
  // }

  // Trả về books là mảng của đối tượng kiểu Book, thêm ảnh cho từng sách, CSS đẹp
  @GetMapping(value = "/carwithcss")
  public String getBook4(Model model) {
    Car[] bookCollection = {new Car(1, "VinFast Fadi", "Vinfast", 560, "http:sdsdsd"), new Car(2, "VinFast Fadi", "Vinfast", 560, "http:sdsdsd"), new Car(3, "VinFast Fadi", "Vinfast", 560, "http:sdsdsd") };

    model.addAttribute(BOOKS, bookCollection);
    model.addAttribute(APP_NAME, appName);
    return "topcarcss";
  }
}