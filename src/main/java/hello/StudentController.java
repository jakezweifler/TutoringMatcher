package hello;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;

@Controller
public class StudentController {

    @GetMapping("/tutoringform")
    public String greetingForm(Model model) {
        model.addAttribute("form", new StudentForm());
        model.addAttribute("subjects", Arrays.stream(Subject.values()).map(Subject::toString).toArray());
        return "form";
    }

    @PostMapping("/tutoringform")
    public String greetingSubmit(@ModelAttribute StudentForm form) {

        Student s = form.toStudent();
        System.out.println(s);


        return "result";

    }

}