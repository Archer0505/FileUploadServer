package aero.geoscan.fileuploader.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import aero.geoscan.fileuploader.services.FilesService;


@Controller
public class FileUploadController {

    @Autowired
    private FilesService filesService;
}
