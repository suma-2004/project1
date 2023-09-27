import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class LoginPageApplication {

    public static void main(String[] args) {
        SpringApplication.run(LoginPageApplication.class, args);
    }

    @GetMapping("/")
    public String loginPage() {
        return "login";
    }

    @PostMapping("/submit")
    public String submitForm(
            @RequestParam("username") String username,
            @RequestParam("password") String password,
            @RequestParam("title") String title,
            @RequestParam("author") String author,
            @RequestParam("price") String price,
            Model model) {
        
        // Here, you can perform actions with the form data, such as storing it in a database.
        // For this example, we'll just display a message.
        
        String message = "Submitted successfully. Username: " + username +
                         ", Title: " + title +
                         ", Author: " + author +
                         ", Price: " + price;
        
        model.addAttribute("message", message);
        
        return "result";
    }
}
