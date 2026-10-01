package com.felipysantsss.javastudy.introducao.projects.ordersProject.exceptions;

public class DontExistOrderException extends RuntimeException {
    public DontExistOrderException(String message) {
        super(message);
    }
}
