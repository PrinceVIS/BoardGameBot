package bg.bot.BoardGameBot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.ApiContextInitializer;

@SpringBootApplication
public class BoardGameBotApplication {

    public static void main(String[] args) {
        ApiContextInitializer.init();
        SpringApplication.run(BoardGameBotApplication.class, args);
    }

}
