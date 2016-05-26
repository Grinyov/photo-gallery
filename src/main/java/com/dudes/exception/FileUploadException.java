package com.dudes.exception;

/**
 * @author Vitaliy Grinyov
 * @since 2016
 */
public class FileUploadException extends RuntimeException {

    private static final long serialVersionUID = -7305496242383581711L;

    public FileUploadException(String msg) {
        super(msg);
    }

    public FileUploadException(String msg, Throwable throwable) {
        super(msg, throwable);
    }
}
