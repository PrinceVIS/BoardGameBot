package bg.bot.BoardGameBot.processors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExitqProcessor implements Processor {
    @Autowired

    @Override
    public String run() {
        return "Завершение опроса";
    }
}
