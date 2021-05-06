package bg.bot.BoardGameBot.processors;

import org.springframework.stereotype.Service;

@Service
public class NoneProcessor implements Processor {
    @Override
    public String run() {
        return "Неизвестная команда";
    }
}
