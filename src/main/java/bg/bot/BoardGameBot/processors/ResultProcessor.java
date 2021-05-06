package bg.bot.BoardGameBot.processors;

import bg.bot.BoardGameBot.service.GameChooser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResultProcessor implements Processor {
    @Autowired
    GameChooser gameChooser;

    @Override
    public String run() {
        return gameChooser.chooseGame();
    }
}
