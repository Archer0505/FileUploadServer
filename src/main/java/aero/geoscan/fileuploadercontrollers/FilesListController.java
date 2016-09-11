package aero.geoscan.fileuploadercontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import aero.geoscan.fileuploader.services.FilesService;


@Controller
public class FilesListController {

    @Autowired
    private FilesService filesService;
}
