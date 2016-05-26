package com.dudes.exception;

/**
 * @author Vitaliy Grinyov
 * @since 2016
 */
public class FileUploadException extends RuntimeException {

    private static final long serialVersionUID = -7305496242383581711L;

    public AttachedFileUploadException(String msg) {
        super(msg);
    }

    public AttachedFileUploadException(String msg, Throwable throwable) {
        super(msg, throwable);
    }
}
