package bg.bot.BoardGameBot.processors;

import bg.bot.BoardGameBot.service.KeyboardService;
import bg.bot.BoardGameBot.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class QuestionnaireProcessor implements Processor {

    @Autowired
    KeyboardService keyboardService;

    @Autowired
    MessageService messageService;

    @Override
    public String run() {
        return "Мы подберём тебе настольную игру :)\n" +
                "Бот будет присылать тебе вопросы, на которые можно отвечать кнопками\n" +
                "Ты всегда можешь остановить опрос командой /exitq";
    }


}
