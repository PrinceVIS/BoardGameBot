package bg.bot.BoardGameBot.service;

import bg.bot.BoardGameBot.config.CsvFileToGameLinks;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class GameChooser {

    private int familyPoints;
    private int warPoints;
    private int partyPoints;
    private int economyPoints;

    public GameChooser() {
    }
    public GameChooser(int familyPoints, int warPoints, int partyPoints, int economyPoints) {
        this.familyPoints = familyPoints;
        this.warPoints = warPoints;
        this.partyPoints = partyPoints;
        this.economyPoints = economyPoints;
    }

    public int getFamilyPoints() {
        return familyPoints;
    }
    public void setFamilyPoints(int familyPoints) {
        this.familyPoints = familyPoints;
    }
    public int getWarPoints() {
        return warPoints;
    }
    public void setWarPoints(int warPoints) {
        this.warPoints = warPoints;
    }
    public int getPartyPoints() {
        return partyPoints;
    }
    public void setPartyPoints(int partyPoints) {
        this.partyPoints = partyPoints;
    }
    public int getEconomyPoints() {
        return economyPoints;
    }
    public void setEconomyPoints(int economyPoints) {
        this.economyPoints = economyPoints;
    }

    public void addFamilyPoint() {
        setFamilyPoints(getFamilyPoints() + 1);
    }
    public void addWarPoint() {
        setWarPoints(getWarPoints() + 1);
    }
    public void addPartyPoint() {
        setPartyPoints(getPartyPoints() + 1);
    }
    public void addEconomyPoint() {
        setEconomyPoints(getEconomyPoints() + 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GameChooser that = (GameChooser) o;
        return familyPoints == that.familyPoints && warPoints == that.warPoints && partyPoints == that.partyPoints && economyPoints == that.economyPoints;
    }
    @Override
    public int hashCode() {
        return Objects.hash(familyPoints, warPoints, partyPoints, economyPoints);
    }
    @Override
    public String toString() {
        return "Результаты\n" +
                "familyPoints = " + familyPoints +
                "\nwarPoints = " + warPoints +
                "\npartyPoints = " + partyPoints +
                "\neconomyPoints = " + economyPoints;
    }

    public String chooseGame() {
        StringBuilder message = new StringBuilder();
        message.append("Вам подходит жанр ");
        if (familyPoints >= warPoints && familyPoints >= partyPoints && familyPoints >= economyPoints) {
            message.append(" семейных игр");
        } else if (warPoints >= partyPoints && warPoints >= economyPoints) {
            message.append(" вар геймов" + new CsvFileToGameLinks().getWarGames());
        } else if (partyPoints >= economyPoints) {
            message.append(" игр для вечеринки" + new CsvFileToGameLinks().getPartyGames());

        } else {
            message.append(" экономических игр");
        }
        message.append("\n");
        return String.valueOf(message);
    }

}
