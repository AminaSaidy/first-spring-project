package uzb.aminasaidakhmedova.first_spring_project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import uzb.aminasaidakhmedova.first_spring_project.WeekDay;

import java.util.Arrays;
import java.util.Optional;


@RestController
public class FirstController {
    @GetMapping("/today")
    public String today(@RequestParam(value = "weekDay", defaultValue = "день") String day) {
        Optional<WeekDay> weekDay = Arrays.stream(WeekDay.values())
                .filter(d -> d.name().equalsIgnoreCase(day))
                .findFirst();

        if (weekDay.isPresent()) {
            return String.format("Сегодня %s", weekDay.get().getRussianDay());
        } else if ("день".equalsIgnoreCase(day)) {
            return "Сегодня день";
        } else {
            return "Such day does not exists, try again.";
        }
    }
}
