import java.time.LocalDate;

public class BdayCalendar {

    public static void findBirthday() {
        try {
            String name = "Artiom";
            LocalDate today = LocalDate.now();
            int cur_month = today.getMonthValue();
            int cur_day = today.getDayOfMonth();
            LocalDate birthdate = LocalDate.of(1993, 03, 27);
            int birthdayMonth = birthdate.getMonthValue();
            int birthDay = birthdate.getDayOfMonth();
            int birthday_age = today.getYear() - birthdate.getYear();

            if (cur_month == birthdayMonth && cur_day == birthDay) {
                System.out.println("Today is " + name + " birthday!\n" + name + " is " + birthday_age + " years old.");
            }
            else {
                System.out.println("Just a regular day.");
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }

}