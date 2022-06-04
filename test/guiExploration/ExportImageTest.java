package guiExploration;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.io.File;

class ExportImageTest {
    RandomGeneration randGen = new RandomGeneration(null);
    ExportImage exportImage = new ExportImage(randGen.getRows(), randGen.getColumns(), randGen.getMazeArray(), null);

    @Test
    void saveImage() {
        File file = new File("c:generatedMaze.jpg");
        assertEquals(true, file.exists());
    }

    @Test
    void getImportedImage1() {
        assertEquals(exportImage.getImportedImage1(), null);
    }

    @Test
    void getImportedImage2() {
        assertEquals(exportImage.getImportedImage2(), null);
    }
}