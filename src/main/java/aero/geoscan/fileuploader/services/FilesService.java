package aero.geoscan.fileuploader.services;

import java.nio.file.Path;
import java.util.List;


public interface FilesService {

    Path getRoot();

    void addFile(Path file);

    List<Path> getFilesList();
}
