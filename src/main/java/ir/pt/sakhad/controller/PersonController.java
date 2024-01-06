package ir.pt.sakhad.controller;

import ir.pt.sakhad.model.PersonModel;
import ir.pt.sakhad.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

// بخشی که کاربر با آن در ارتباط است

@RestController
@RequestMapping(value = "person")
public class PersonController {

    @Autowired
    PersonService personService;

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public ResponseEntity insert(@RequestBody PersonModel personModel){
        return ResponseEntity.ok(personService.insert(personModel));
    }

    @RequestMapping(value = "/put", method = RequestMethod.PUT)
    public ResponseEntity put(@RequestBody PersonModel personModel){
        return ResponseEntity.ok(personModel);
    }

    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public ResponseEntity get(@RequestParam Integer id){
        return ResponseEntity.ok(personService.findById(id));
    }

    @RequestMapping(value = "/getList", method = RequestMethod.GET)
// هنگام run کردن برنامه، پارامتر ها را با همان اسمی که در ورودی Request param ارسال کردیم فراخوانی میکنیم برای مثال اینجا userVal هست
    public ResponseEntity getList(@RequestParam String userVal){
        return ResponseEntity.ok(personService.findByName(userVal));
    }
}
