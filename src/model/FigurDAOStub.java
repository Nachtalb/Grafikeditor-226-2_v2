package model;

/**
 * Created by nicko on 02.06.2016.
 */
public class FigurDAOStub implements FigurDAO {
    private String[] testFiguren = {
            "Rechteck,500,100,200,99",
            "Kreis,200,100,199",
            "Linie,200,500,300,101"
    };
    private int currentFigur = 0;

    @Override
    public String[] readNextFigurData() {
        if (currentFigur < testFiguren.length) {
            String[] figurData = testFiguren[currentFigur].split(",");
            currentFigur++;
            return figurData;
        }
        return null;
    }
}
