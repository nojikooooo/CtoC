package solekia.CtoC.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import solekia.CtoC.model.FurimaPageModel;
import solekia.CtoC.repository.FurimaMapper;


/** */

@Controller
@RequestMapping("furima")

public class FurimaController {

  // Customerテーブルのアクセス用クラスを追加
    @Autowired
    FurimaMapper furimaMapper;


    // 登録画面
    @GetMapping("insert")

    public String insert(Model model) {
        // ページインスタンスを作ってタイトルを設定
        FurimaPageModel page = new FurimaPageModel();
        page.title = "購入画面";

        // モデルにページインスタンスを設定
        model.addAttribute("page", page);

        // テンプレートファイルを指定
        return "furima/insert";
    }

     // 登録処理
     @PostMapping("insert")
     public String insert(@ModelAttribute FurimaPageModel page, Model model) {

         // タイトルを設定
         page.title = "購入画面";

         // 画面で入力した購入者情報をパラメータに設定
         furimaMapper.insert(page.customer_name, page.customer_mail);

         // 更新後のデータを取得登録
         page.list = furimaMapper.findAll();

         // モデルにページインスタンスを設定
         model.addAttribute("page", page);

         // テンプレートファイルを指定
         return "furima/thanks";
     }

}