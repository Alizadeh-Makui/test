package ir.pt.sakhad;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Test1Application.class);
    }

}

/*

برای debug کردن باید break point را هرجاکه مشکوک هستیم بگذاریم سپس برنامه را run میکنیم
روی break point ها، برنامه می ایستد بررسی میکنیم در صورت نبود مشکل f9 را میزنیم تا به مرحله بعدی برود
هرجای برنامه که لازم باشد بررسی صورت گیرد select میکنیم کل line code را، سپس alt + f8 را میزنیم
و بصورت دستی یا اتومات ورودی لازمه را میدهیم و تست میکنیم

*/