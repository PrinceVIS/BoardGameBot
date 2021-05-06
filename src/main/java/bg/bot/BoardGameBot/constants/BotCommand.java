package bg.bot.BoardGameBot.constants;

public enum BotCommand{
    START("/start", "Начало, запуск"),
    HELP("/help", "Спавка о командах"),
    QUESTIONNAIRE("/questionnaire", "Опрос"),
    EXITQ("/exitq", "Выход из опроса"),
    RESULT("/result", "Посмотреть результат опроса"),
    SHOWALL("/showall", "Все настолки"),
    SHOWNASTOLKIBY("/shownastolkiby", "В Магазин"),
    NONE("/none", "Неизвестная команда");

    String command;
    String desc;

    BotCommand(String command, String  desc) {
        this.command = command;
        this.desc = desc;
    }

    public String getCommand() {
        return command;
    }

    public String getDesc() {
        return desc;
    }
}
