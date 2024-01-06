package ir.pt.sakhad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test1Application {

    public static void main(String[] args) {

        SpringApplication.run(Test1Application.class, args);

    }

}

/*
برای افزودن یا تغییر دادن هر دستوری داخل دیتابیس باید از کد دستوری spring.jpa.hibernate.ddl-auto=update
 استفاده شود - اگر از create drop استفاده کنیم هر تغییراتی که در سطح دیتابیس انجام شود به کل پاک شده و سپس ایجاد می شود.
معمولا موقع کد نویسی در حالت none میگذارند، همچنین هرجاکه لازم شد تغییراتی اعمال شود به update تغییر داده میشود.
 */

/*
برای clone کردن از کلید ctrl + k  استفاده می شود.
همچنین برای push کردن از ctrl + shift + k استفاده میکنیم.
 */