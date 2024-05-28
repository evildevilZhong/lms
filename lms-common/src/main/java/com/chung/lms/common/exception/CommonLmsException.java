package com.chung.lms.common.exception;

import com.chung.lms.common.api.IErrorCode;

public class CommonLmsException extends RuntimeException {
    private IErrorCode errorCode;

    public CommonLmsException(IErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public CommonLmsException(String message) {
        super(message);
    }

    public CommonLmsException(Throwable cause) {
        super(cause);
    }

    public CommonLmsException(String message, Throwable cause) {
        super(message, cause);
    }

    public IErrorCode getErrorCode() {
        return errorCode;
    }
}
